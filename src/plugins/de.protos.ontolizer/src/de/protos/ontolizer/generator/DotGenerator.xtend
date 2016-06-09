package de.protos.ontolizer.generator

import de.protos.ontolizer.ontolizer.Edge
import de.protos.ontolizer.ontolizer.EdgeList
import de.protos.ontolizer.ontolizer.EdgeType
import de.protos.ontolizer.ontolizer.Model
import de.protos.ontolizer.ontolizer.Node
import de.protos.ontolizer.ontolizer.NodeType
import de.protos.ontolizer.ontolizer.View
import java.util.HashSet
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.List

class DotGenerator extends AbstractGenerator {
	
	static val NEWLINE = System.lineSeparator // os line separator
	static val MAX_DEPTH = 0 // equals default of DepthRange
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val baseFileNames = <String>newArrayList
		
		val model = resource.contents.head as Model
		baseFileNames += model.views.map[generateView(model, it, fsa)].flatten

		generateAntBuildfile(baseFileNames, fsa)
	}
	
	def List<String> generateView(Model model, View view, IFileSystemAccess2 fsa){
		val List<String> baseFileNames = newArrayList
		
		val depthStart = if(view.depth != null) view.depth.start else MAX_DEPTH
		val depthEnd = if(view.depth != null) view.depth.end else MAX_DEPTH
		
		val (Node) => boolean nodeFilter = [node | view.nodeTypes.empty || view.nodeTypes.contains(node.nodeType)]
		val (EdgeList) => boolean edgeListFilter = [list | true]
		val (Edge) => boolean edgeFilter = [edge | true ]
		
		model.nodes.filter[nodeFilter.apply(it)].forEach[contextNode |
			for (graphDepth : depthStart .. depthEnd) {
				val allNodes = newHashSet
				val allEdges = newHashSet
				val stack = newLinkedList(contextNode)
				
				var currentDepth = 1
				var lastElementInDepth = contextNode
				while(!stack.empty){
					val node = stack.pop
					val edges = node.edgeLists.filter[edgeListFilter.apply(it)].map[edges].flatten.filter[edgeFilter.apply(it)]
					allEdges += edges
					edges.map[targetNode].filter[nodeFilter.apply(it)].forEach[if(allNodes += it) stack.addLast(it)]
					if(node == lastElementInDepth){
						currentDepth++
						lastElementInDepth = if(!stack.empty) stack.last
						if(graphDepth != MAX_DEPTH && currentDepth >= graphDepth)
							stack.clear
					}
				}
				
				val filePrefix = '''«view.name»_«IF graphDepth != MAX_DEPTH»«graphDepth»_«ENDIF»'''
				val (Node)=>String urlComputer = [node|filePrefix + node.name + '.svg']
				fsa.generateFile(filePrefix + contextNode.name + '.dot', generateDotFile(allNodes, allEdges, urlComputer))
				baseFileNames += filePrefix + contextNode.name
			}
		]
		
		return baseFileNames
	}
	
	def generateDotFile(HashSet<Node> nodes, HashSet<Edge> edges, (Node) => String urlComputer) {
		val dotEntries = newArrayList
		dotEntries += nodes.map[genDot(urlComputer.apply(it))]
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

	

	def filterNodesForNodeTypes(EList<Node> nodes, EList<NodeType> nodeTypes) {
		if (nodeTypes.empty)
			nodes
		else
			nodes.filter[e|nodeTypes.contains(e.nodeType)]
	}

	def filterEdgeListsForEdgeTypes(Iterable<EdgeList> edgeLists, EList<EdgeType> edgeTypes) {
		if (edgeTypes.empty)
			edgeLists
		else
			edgeLists.filter[e|edgeTypes.contains(e.edgeType)]
	}

	def filterEdgesForNodeTypes(Iterable<Edge> edges, EList<NodeType> nodeTypes) {
		if (nodeTypes.empty)
			edges
		else
			edges.filter[e|nodeTypes.contains(e.targetNode.nodeType)]
	}

//	def generateViewFileContent(Model model, View view) {
//		generateDotFileContent(model, view)
//	}
}