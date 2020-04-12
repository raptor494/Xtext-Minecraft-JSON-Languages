/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.ui;

import com.google.inject.Injector;
import com.raptor.mcmodel.ui.internal.McmodelActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class McmodelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(McmodelActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		McmodelActivator activator = McmodelActivator.getInstance();
		return activator != null ? activator.getInjector(McmodelActivator.COM_RAPTOR_MCMODEL_MCMODEL) : null;
	}

}
