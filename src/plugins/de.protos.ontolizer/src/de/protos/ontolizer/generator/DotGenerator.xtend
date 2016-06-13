package de.protos.ontolizer.generator

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap
import com.google.common.collect.Multimaps
import de.protos.ontolizer.ontolizer.Edge
import de.protos.ontolizer.ontolizer.EdgeList
import de.protos.ontolizer.ontolizer.Model
import de.protos.ontolizer.ontolizer.Node
import de.protos.ontolizer.ontolizer.View
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Delegate
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.xbase.lib.Functions.Function2

class DotGenerator extends AbstractGenerator {
	
	/**
	 * Default value in emf model.
	 */
	static val DEPTH_DEFAULT_VALUE = 0
	
	static class GenerationResults {
		val dotBaseFileNames = <String>newArrayList
		val globalViewLinks = <View, String>newLinkedHashMap
		val depthViewLinks = <View, Multimap<Node, Pair<Integer, String>>>newLinkedHashMap
	}
	
	@Accessors
	static class ExpandedModel implements Model {
		@Delegate val Model model
		val Multimap<Node, Edge> forwardEdges
		val Multimap<Node, Edge> backwardEdges 
		
		new(Model model){
			this.model = model
			forwardEdges = Multimaps.index(model.eAllContents.filter(Edge), [eContainer.eContainer as Node])
			backwardEdges = Multimaps.index(model.eAllContents.filter(EdgeList).map[edges].toIterable.flatten, [targetNode])
		}
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val results = new GenerationResults
		
		val model = new ExpandedModel(resource.contents.head as Model)
		model.views.forEach[generateView(model, it, fsa, results)]
		
		fsa.generateFile("build.xml", generateDotBuildfileContent(results.dotBaseFileNames))
		fsa.generateFile('''!«resource.URI.lastSegment».html''', generateTocFileContents(results.globalViewLinks, results.depthViewLinks))	
	}
	
	def static <T> void bfs(Iterable<T> iterable, Function2<? super T, ? super Integer, Iterable<? extends T>> visitFunction) {
		val visted = <T>newHashSet
		val stack = <T>newLinkedList(iterable)
		
		var currentDepth = 0
		var lastElementInDepth = if(!stack.empty) stack.last
		while(!stack.empty){
			val current = stack.pop
			visitFunction.apply(current, currentDepth).forEach[toVisit | if (visted += toVisit) stack.addLast(toVisit)]
			if(current == lastElementInDepth){
				lastElementInDepth = if(!stack.empty) stack.last
				currentDepth += 1
			}
		}
	}
	
	def void generateView(ExpandedModel model, View view, IFileSystemAccess2 fsa, GenerationResults results){		
		val (Node) => boolean nodeFilter = [node | view.nodeTypes.empty || view.nodeTypes.contains(node.nodeType)]
		val (Edge) => boolean edgeFilter = [edge | view.edgeTypes.empty || view.edgeTypes.contains((edge.eContainer as EdgeList).edgeType)]
		val contextNodes = model.nodes.filter[nodeFilter.apply(it)]
		
		if(view.depth == null || view.depth.start == 0){
			// generate single graph without clickMap
			val graphDepth = if(view.depth == null) 1 else view.depth.start
			val graphNodes = newArrayList
			val graphEdges = newHashSet
			contextNodes.bfs[node, depth |
				graphNodes += node
				if(depth >= graphDepth) return emptyList
				
				val forwardEdges = model.forwardEdges.get(node).filter[edgeFilter.apply(it)]
				val backwardEdges = model.backwardEdges.get(node).filter[edgeFilter.apply(it)]
				graphEdges += (forwardEdges + backwardEdges).toSet
				return (forwardEdges.map[targetNode] + backwardEdges.map[eContainer.eContainer as Node]).filter[nodeFilter.apply(it)]
			]
			
			fsa.generateFile('''«view.name».dot''', generateDotFile(graphNodes, graphEdges, [node| node.getDotFormatAttributes(false)]))
			results.dotBaseFileNames += view.name
			results.globalViewLinks.put(view, view.name + '.svg')
			
		} else {
			results.depthViewLinks.put(view, ArrayListMultimap.create)
			// generate graphs with context nodes per depth and with clickMap
			contextNodes.forEach[contextNode |
				val depthEnd = if(view.depth.end == DEPTH_DEFAULT_VALUE) view.depth.start else view.depth.end
				val (Integer) => String filePrefixComputer = [graphDepth| '''«view.name»_«graphDepth»_''']
				
				// depth links
				val depthToc = newLinkedHashMap
				for (graphDepth : view.depth.start .. depthEnd)
					depthToc.put(graphDepth, filePrefixComputer.apply(graphDepth) + contextNode.name + '.html')
				
				for (graphDepth : view.depth.start .. depthEnd) {
					val graphNodes = newArrayList
					val graphEdges = newHashSet
					#[contextNode].bfs[node, depth | 
						graphNodes += node
						if(depth >= graphDepth) return emptyList
						
						val forwardEdges = model.forwardEdges.get(node).filter[edgeFilter.apply(it)]
						val backwardEdges = model.backwardEdges.get(node).filter[edgeFilter.apply(it)]
						graphEdges += (forwardEdges + backwardEdges).toSet
						return (forwardEdges.map[targetNode] + backwardEdges.map[eContainer.eContainer as Node]).filter[nodeFilter.apply(it)]
					]
					
					val filePrefix = filePrefixComputer.apply(graphDepth)
					val contextNodeBaseFileName = filePrefix + contextNode.name
					val (Node)=>Iterable<String> propComputer = [node| node.getDotFormatAttributes(node == contextNode) + #['URL="' + filePrefix + node.name + '.svg"']]
					fsa.generateFile(contextNodeBaseFileName + '.dot', generateDotFile(graphNodes, graphEdges, propComputer))
					fsa.generateFile(contextNodeBaseFileName + '.html', generateGraphHTML(contextNodeBaseFileName + '.svg', depthToc))
					results.dotBaseFileNames += contextNodeBaseFileName
					results.depthViewLinks.get(view).put(contextNode, graphDepth -> contextNodeBaseFileName + '.html')
				}
			]
		}
	}
	
	def generateDotFile(Iterable<Node> nodes, Iterable<Edge> edges, (Node) => Iterable<String> propComputer)'''
		digraph {
			«FOR node : nodes»
				«node.name» [«propComputer.apply(node).join(', ')»];
			«ENDFOR»
			«FOR edge : edges»
				«edge.genDot»
			«ENDFOR»
		}
	'''

	
	def CharSequence genDot(Edge it){
		val entries = newArrayList
		entries += '''label = "«(eContainer as EdgeList).edgeType.name»"'''
		
		'''«(eContainer.eContainer as Node).name» -> «targetNode.name» [ «entries.join(', ')» ];'''
	}
	
//	def generateDotFileContent(Model model, View view) '''
//
//			digraph {
//				«FOR node : filterNodesForNodeTypes(model.nodes, view.nodeTypes)»
//					«node.name» [«if(node.summary.nullOrEmpty) "" else 'label=\"'+node.name+"\\n"+node.summary+'\" '»«node.getNodeFormatString»];				
//					«FOR edgeList : node.edgeLists.filterEdgeListsForEdgeTypes(view.edgeTypes)»
//						«FOR edge : edgeList.edges.filterEdgesForNodeTypes(view.nodeTypes)»
//							«node.name» -> «edge.targetNode.name» [ label = "«edgeList.edgeType.name»" ];
//						«ENDFOR» 
//					«ENDFOR» 
//				«ENDFOR» 			
//			}
//	'''

	def getDotFormatAttributes(Node it, boolean highlight) {
		val formatList = newArrayList()
		
		if(!summary.nullOrEmpty)
			formatList += '''label="«name»\n«summary»"'''
		
		if (!nodeType.shape.nullOrEmpty)
			formatList += 'shape=' + nodeType.shape

		if (highlight)
			formatList += 'fillcolor=red'
		else if (!nodeType.color.nullOrEmpty)
			formatList += 'fillcolor=' + nodeType.color

		if (!nodeType.style.nullOrEmpty)
			formatList += 'style=' + nodeType.style

		return formatList.filter[s|!s.empty]
	}
	
	def private generateTocFileContents(Map<View, String> globalViewLinks, Map<View, Multimap<Node, Pair<Integer, String>>> depthViewLinks)'''
		<head>
		    <meta charset="utf-8">
		    <meta http-equiv="X-UA-Compatible" content="IE=edge">
		    <meta name="viewport" content="width=device-width, initial-scale=1">
		
			<!-- stylesheet -->
		    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">-->
		    <link href="../lib/bootstrap.css" rel="stylesheet">
		    <style> a:visited{color:#666633 !important;}</style>
		</head>
		<body>
			<h2>Views</h2>
			<ul>
			«FOR viewEntry : globalViewLinks.entrySet»
				<li><a href="«viewEntry.value»">«viewEntry.key.name»</a></li>
			«ENDFOR»
			«FOR viewEntry : depthViewLinks.entrySet»
				<li>«viewEntry.key.name»
					<ul>
					«FOR contextNode: viewEntry.value.keySet»
						<li>«contextNode.name»: «FOR depthLink : viewEntry.value.get(contextNode) SEPARATOR ', '»<a href="«depthLink.value»">«depthLink.key»</a>«ENDFOR»</li>
					«ENDFOR»
					</ul>
				</li>
			«ENDFOR»
			</ul>
			</body>
		</html>
	'''

	// ant buildfile generator for dot	
	def private generateDotBuildfileContent(List<String> baseFileNames) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<!-- ====================================================================== 
		     Generates bitmap images from DOT files for process documentation
		     ====================================================================== -->
		<project name="builddotfiles" default="build">
			<description>
			   	Generates bitmap images from DOT files for process documentation
			   </description>
		
			<target name="build" description="description" depends="init-dot.binpath">
				«FOR fileName : baseFileNames»
					<compileDot mapFile="«fileName».map" svgFile="«fileName».svg" dotFile="«fileName».dot"/>
				«ENDFOR»
			</target>
			
			<macrodef name="compileDot">
				<attribute name="mapFile"/>
				<attribute name="svgFile"/>
				<attribute name="dotFile"/>
				<sequential>
					<exec executable="${dot.binpath}">
						<arg value="-Tsvg"/>
						<arg value="-o@{svgFile}" />
«««						<arg value="-Tcmapx"/>
«««						<arg value="-o@{mapFile}" />
«««						<arg value="-Tgif" />
«««						<arg value="-o@{gifFile}" />
						<arg value="@{dotFile}" />
					</exec>
				</sequential>
			</macrodef>
		
			<target name="init-dot.binpath" unless="dot.binpath">
				<property environment="env" />
				<condition property="dot.binpath" value="${env.DOT_PATH}/dot" else="dot">
					<isset property="env.DOT_PATH" />
				</condition>
			</target>
		
		</project>
	'''
	
	def private generateGraphHTML(String svgFilePath, Map<Integer, String> depthFilePaths)'''
		<head>
		    <meta charset="utf-8">
		    <meta http-equiv="X-UA-Compatible" content="IE=edge">
		    <meta name="viewport" content="width=device-width, initial-scale=1">

			<!-- stylesheet -->
			<!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">-->
		    <link href="../lib/bootstrap.css" rel="stylesheet">
		    <style> a:visited{color:#666633 !important;}</style>
		    
		    <!-- javascript -->
			<!--<script src="http://code.jquery.com/jquery-3.0.0.min.js"></script>-->
			<script src="../lib/jquery-3.0.0.min.js"></script>
			
			<script>
			 $(function(){
			      $("#includedContent").load("«svgFilePath»", function() {
				      var aList = document.getElementsByTagName("a");
				      for(var i=0;i<aList.length;i++){
				    	  var origLink = aList[i].getAttributeNS('http://www.w3.org/1999/xlink', 'href');
				    	  if(origLink != null){
				    	  	aList[i].setAttributeNS('http://www.w3.org/1999/xlink', 'href', origLink.replace('.svg', '.html'));
				    	  }
				      }
			      });
			    });
			</script>
		</head>
		<body>
			<div class="depthLinks">«FOR entry : depthFilePaths.entrySet BEFORE 'Depths: ' SEPARATOR ', '»<a href="«entry.value»">«entry.key»</a>«ENDFOR»</div>
			<div id="includedContent"></div>
		</body>
		</html>
	'''

	

//	def filterNodesForNodeTypes(EList<Node> nodes, EList<NodeType> nodeTypes) {
//		if (nodeTypes.empty)
//			nodes
//		else
//			nodes.filter[e|nodeTypes.contains(e.nodeType)]
//	}
//
//	def filterEdgeListsForEdgeTypes(Iterable<EdgeList> edgeLists, EList<EdgeType> edgeTypes) {
//		if (edgeTypes.empty)
//			edgeLists
//		else
//			edgeLists.filter[e|edgeTypes.contains(e.edgeType)]
//	}
//
//	def filterEdgesForNodeTypes(Iterable<Edge> edges, EList<NodeType> nodeTypes) {
//		if (nodeTypes.empty)
//			edges
//		else
//			edges.filter[e|nodeTypes.contains(e.targetNode.nodeType)]
//	}

//	def generateViewFileContent(Model model, View view) {
//		generateDotFileContent(model, view)
//	}
}