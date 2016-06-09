package de.protos.ontolizer.generator

import com.fasterxml.jackson.databind.ObjectMapper
import de.protos.ontolizer.ontolizer.EdgeList
import de.protos.ontolizer.ontolizer.Model
import de.protos.ontolizer.ontolizer.Node
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class JSONGenerator extends AbstractGenerator {

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = input.contents.head as Model

		val nodes = model.generate
		val mapper = new ObjectMapper();
		val fileName = input.URI.lastSegment.replace('.' + input.URI.fileExtension, '') + '.js'
		fsa.generateFile(fileName, "jsonData = '" + mapper.writeValueAsString(nodes) + "';")
	}

	def List<JNode> generate(Model model) {
		val genContext = new GenContext

		newArrayList() => [it += model.nodes.map[createNode(genContext)] sortInplaceBy[id]]
	}

	def create new JNode createNode(Node node, GenContext context) {
		id = context.popId
		name = node.name
//		summary = node.summary.join
		type = node.nodeType.name
		edgeList += node.edgeLists.map[createEdgeList(context)]
	}

	def create new JEdgeList createEdgeList(EdgeList edgeList, GenContext context) {
		type = edgeList.edgeType.name
		edges += edgeList.edges.map[targetNode.createNode(context).id]
	}

	@Accessors
	private static class JNode {
		var int id
		var String name
		var String summary
		var String type
		val List<JEdgeList> edgeList = newArrayList
	}

	@Accessors
	private static class JEdgeList {
		var String type
		val List<Integer> edges = newArrayList
	}

	private static class GenContext {
		private var lastId = 0

		def int popId() { return lastId++ }
	}

}
