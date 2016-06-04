/*
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ui;

import com.google.inject.Injector;
import de.protos.ontolizer.ui.internal.OntolizerActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OntolizerExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return OntolizerActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return OntolizerActivator.getInstance().getInjector(OntolizerActivator.DE_PROTOS_ONTOLIZER_ONTOLIZER);
	}
	
}
