/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.ui;

import com.raptor.mcblockstate.ui.AbstractMcblockstateUiModule;
import com.raptor.mcblockstate.ui.editor.syntaxcoloring.McblockstateAntlrTokenToAttributeIdMapper;
import com.raptor.mcblockstate.ui.editor.syntaxcoloring.McblockstateHighlightingConfiguration;
import com.raptor.mcblockstate.ui.editor.syntaxcoloring.McblockstateSemanticHighlightingCalculator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@SuppressWarnings("all")
public class McblockstateUiModule extends AbstractMcblockstateUiModule {
  public McblockstateUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return McblockstateSemanticHighlightingCalculator.class;
  }
  
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return McblockstateHighlightingConfiguration.class;
  }
  
  public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
    return McblockstateAntlrTokenToAttributeIdMapper.class;
  }
}
