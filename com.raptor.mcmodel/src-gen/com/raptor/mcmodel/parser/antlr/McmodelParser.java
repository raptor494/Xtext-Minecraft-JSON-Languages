/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.parser.antlr;

import com.google.inject.Inject;
import com.raptor.mcmodel.parser.antlr.internal.InternalMcmodelParser;
import com.raptor.mcmodel.services.McmodelGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class McmodelParser extends AbstractAntlrParser {

	@Inject
	private McmodelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMcmodelParser createParser(XtextTokenStream stream) {
		return new InternalMcmodelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public McmodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(McmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
