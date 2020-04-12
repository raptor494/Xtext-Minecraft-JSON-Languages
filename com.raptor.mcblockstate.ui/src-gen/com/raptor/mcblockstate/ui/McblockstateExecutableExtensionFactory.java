/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.ui;

import com.google.inject.Injector;
import com.raptor.mcblockstate.ui.internal.McblockstateActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class McblockstateExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(McblockstateActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		McblockstateActivator activator = McblockstateActivator.getInstance();
		return activator != null ? activator.getInjector(McblockstateActivator.COM_RAPTOR_MCBLOCKSTATE_MCBLOCKSTATE) : null;
	}

}
