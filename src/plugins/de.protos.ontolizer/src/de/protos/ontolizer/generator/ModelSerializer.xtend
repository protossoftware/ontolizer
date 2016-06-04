package de.protos.ontolizer.generator

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI

class ModelSerializer extends AbstractGenerator {

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val resourceSet = new XtextResourceSet
		val resource = resourceSet.getResource(input.URI, true)
		
		val xmiOutputStream = new ByteArrayOutputStream
		resourceSet.createResource(URI.createURI('dummy://tmp.xmi')) => [
			contents += resource.contents
			save(xmiOutputStream, null)
		]
		
		val inputStream = new ByteArrayInputStream(xmiOutputStream.toByteArray)
		fsa.generateFile(input.URI.trimFileExtension.lastSegment + '.xmi', inputStream)
	}

}
