/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity;

import com.raptor.mcentity.AbstractMCEntityRuntimeModule;
import com.raptor.mcentity.mcentity.McentityFactory;
import com.raptor.mcentity.mcentity.impl.McentityFactoryImpl;
import com.raptor.mcentity.services.MCEntityTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class MCEntityRuntimeModule extends AbstractMCEntityRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return MCEntityTerminalConverters.class;
  }
  
  public Class<? extends McentityFactory> bindMcentityFactory() {
    return McentityFactoryImpl.class;
  }
}
