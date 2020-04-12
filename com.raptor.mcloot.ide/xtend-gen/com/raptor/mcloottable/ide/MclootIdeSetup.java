/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.raptor.mcloottable.MclootRuntimeModule;
import com.raptor.mcloottable.MclootStandaloneSetup;
import com.raptor.mcloottable.ide.MclootIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MclootIdeSetup extends MclootStandaloneSetup {
  @Override
  public Injector createInjector() {
    MclootRuntimeModule _mclootRuntimeModule = new MclootRuntimeModule();
    MclootIdeModule _mclootIdeModule = new MclootIdeModule();
    return Guice.createInjector(Modules2.mixin(_mclootRuntimeModule, _mclootIdeModule));
  }
}
