package de.protos.ontolizer.generator;

import de.protos.ontolizer.ontolizer.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class HTMLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = input.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model model = ((Model) _head);
    URI _uRI = input.getURI();
    String _lastSegment = _uRI.lastSegment();
    URI _uRI_1 = input.getURI();
    String _fileExtension = _uRI_1.fileExtension();
    String _plus = ("." + _fileExtension);
    String _replace = _lastSegment.replace(_plus, "");
    final String fileName = (_replace + ".json");
  }
}
