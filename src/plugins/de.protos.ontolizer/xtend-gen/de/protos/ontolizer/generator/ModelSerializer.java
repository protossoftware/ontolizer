package de.protos.ontolizer.generator;

import com.google.common.collect.Iterables;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelSerializer extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final XtextResourceSet resourceSet = new XtextResourceSet();
    URI _uRI = input.getURI();
    final Resource resource = resourceSet.getResource(_uRI, true);
    final ByteArrayOutputStream xmiOutputStream = new ByteArrayOutputStream();
    URI _createURI = URI.createURI("dummy://tmp.xmi");
    Resource _createResource = resourceSet.createResource(_createURI);
    final Procedure1<Resource> _function = (Resource it) -> {
      try {
        EList<EObject> _contents = it.getContents();
        EList<EObject> _contents_1 = resource.getContents();
        Iterables.<EObject>addAll(_contents, _contents_1);
        it.save(xmiOutputStream, null);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<Resource>operator_doubleArrow(_createResource, _function);
    byte[] _byteArray = xmiOutputStream.toByteArray();
    final ByteArrayInputStream inputStream = new ByteArrayInputStream(_byteArray);
    URI _uRI_1 = input.getURI();
    URI _trimFileExtension = _uRI_1.trimFileExtension();
    String _lastSegment = _trimFileExtension.lastSegment();
    String _plus = (_lastSegment + ".xmi");
    fsa.generateFile(_plus, inputStream);
  }
}
