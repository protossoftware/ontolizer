package de.protos.ontolizer.generator

import com.google.common.collect.Multimap
import com.google.common.collect.Multimaps
import de.protos.ontolizer.ontolizer.Edge
import de.protos.ontolizer.ontolizer.EdgeList
import de.protos.ontolizer.ontolizer.Model
import de.protos.ontolizer.ontolizer.Node
import de.protos.ontolizer.ontolizer.View
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Delegate
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.xbase.lib.Functions.Function2
import java.util.Map

class DotGenerator extends AbstractGenerator {
	
	static val NEWLINE = System.lineSeparator // os line separator
	/**
	 * Default value in emf model.
	 */
	static val DEPTH_DEFAULT_VALUE = 0
	
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
		val baseFileNames = <String>newArrayList
		
		val model = new ExpandedModel(resource.contents.head as Model)
		baseFileNames += model.views.map[generateView(model, it, fsa)].flatten

		generateAntBuildfile(baseFileNames, fsa)
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
	
	def List<String> generateView(ExpandedModel model, View view, IFileSystemAccess2 fsa){
		val List<String> baseFileNames = newArrayList
		
		val (Node) => boolean nodeFilter = [node | view.nodeTypes.empty || view.nodeTypes.contains(node.nodeType)]
		val (Edge) => boolean edgeFilter = [edge | view.edgeTypes.empty || view.edgeTypes.contains(edge.eContainer)]
		val contextNodes = model.nodes.filter[nodeFilter.apply(it)]
		
		if(view.depth == null || view.depth.start == 0){
			// generate single graph without clickMap
			val graphDepth = if(view.depth == null) 1 else view.depth.start
			val graphNodes = newArrayList
			val graphEdges = newArrayList
			contextNodes.bfs[node, depth |
				graphNodes += node
				if(depth >= graphDepth) return emptyList
				
				val forwardEdges = model.forwardEdges.get(node).filter[edgeFilter.apply(it)]
				val backwardEdges = model.backwardEdges.get(node).filter[edgeFilter.apply(it)]
				graphEdges += (forwardEdges + backwardEdges).toSet
				return (forwardEdges.map[targetNode] + backwardEdges.map[eContainer.eContainer as Node]).filter[nodeFilter.apply(it)]
			]
			
			fsa.generateFile('''«view.name».dot''', generateDotFile(graphNodes, graphEdges, null))
			baseFileNames += view.name
			
		} else {
			// generate graphs with context nodes per depth and with clickMap
			contextNodes.forEach[contextNode |
				val depthEnd = if(view.depth.end == DEPTH_DEFAULT_VALUE) view.depth.start else view.depth.end
				val (Integer) => String filePrefixComputer = [graphDepth| '''«view.name»_«graphDepth»_''']
				
				// depth links
				val depthToc = newLinkedHashMap
				for (graphDepth : view.depth.start .. depthEnd)
					depthToc.put(graphDepth, filePrefixComputer.apply(graphDepth) + contextNode.name + '.html')
				
				var lastEdgeCount = 0
				for (graphDepth : view.depth.start .. depthEnd) {
					val graphNodes = newArrayList
					val graphEdges = newArrayList
					#[contextNode].bfs[node, depth | 
						graphNodes += node
						if(depth >= graphDepth) return emptyList
						
						val forwardEdges = model.forwardEdges.get(node).filter[edgeFilter.apply(it)]
						val backwardEdges = model.backwardEdges.get(node).filter[edgeFilter.apply(it)]
						graphEdges += (forwardEdges + backwardEdges).toSet
						return (forwardEdges.map[targetNode] + backwardEdges.map[eContainer.eContainer as Node]).filter[nodeFilter.apply(it)]
					]
					
					val filePrefix = filePrefixComputer.apply(graphDepth)
					val (Node)=>String urlComputer = [node|filePrefix + node.name + '.svg']
					fsa.generateFile(filePrefix + contextNode.name + '.dot', generateDotFile(graphNodes, graphEdges, urlComputer))
					fsa.generateFile(filePrefix + contextNode.name + '.html', generateGraphHTML(urlComputer.apply(contextNode), depthToc))
					baseFileNames += filePrefix + contextNode.name
					
					// check if max depth has been reached
					if(lastEdgeCount >= graphEdges.size)
						return;
					lastEdgeCount = graphEdges.size
				}
			]
		}
		
		return baseFileNames
	}
	
	def generateDotFile(Iterable<Node> nodes, Iterable<Edge> edges, (Node) => String urlComputer) {
		val dotEntries = newArrayList
		dotEntries += nodes.map[genDot(urlComputer?.apply(it))]
		dotEntries += edges.map[genDot]
		
		'''
			digraph {
				«dotEntries.join(NEWLINE)»
			}
		'''
	}
	

	def CharSequence genDot(Node it, String url){
		val entries = newArrayList
		entries += dotFormatAttributes
		if(!summary.nullOrEmpty)
			entries += '''label="«name»\n«summary»"'''
		if(!url.nullOrEmpty)
			entries += '''URL="«url»"'''
		
		'''«name» [«entries.join(', ')»];'''
	}
	
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

	def getDotFormatAttributes(Node node) {

		val formatList = newArrayList()
		if (!node.nodeType.shape.nullOrEmpty)
			formatList += 'shape=' + node.nodeType.shape

		if (!node.nodeType.color.nullOrEmpty)
			formatList += 'fillcolor=' + node.nodeType.color

		if (!node.nodeType.style.nullOrEmpty)
			formatList += 'style=' + node.nodeType.style

		formatList.filter[s|!s.empty].join(',')
	}

	def private generateAntBuildfile(List<String> baseFileNames, IFileSystemAccess2 fsa) {
		fsa.generateFile("build.xml", generateDotBuildfileContent(baseFileNames))
	}

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
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
			<script src="http://code.jquery.com/jquery-3.0.0.min.js"></script>
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