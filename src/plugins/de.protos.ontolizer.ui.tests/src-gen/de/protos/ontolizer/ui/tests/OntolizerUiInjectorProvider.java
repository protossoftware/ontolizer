/*
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ui.tests;

import com.google.inject.Injector;
import de.protos.ontolizer.ui.internal.OntolizerActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class OntolizerUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return OntolizerActivator.getInstance().getInjector("de.protos.ontolizer.Ontolizer");
	}

}
