package de.protos.ontolizer.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.protos.ontolizer.ontolizer.Model

class HTMLGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = input.contents.head as Model

		val fileName = input.URI.lastSegment.replace('.'+input.URI.fileExtension, '') + '.json'
		
	}
	
}