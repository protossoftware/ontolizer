/**
 * generated by Xtext 2.9.2
 */
package de.protos.ontolizer.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class OntolizerLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public OntolizerLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}