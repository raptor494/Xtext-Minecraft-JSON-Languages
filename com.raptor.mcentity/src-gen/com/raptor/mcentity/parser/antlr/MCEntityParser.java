/*
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.parser.antlr;

import com.google.inject.Inject;
import com.raptor.mcentity.parser.antlr.internal.InternalMCEntityParser;
import com.raptor.mcentity.services.MCEntityGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MCEntityParser extends AbstractAntlrParser {

	@Inject
	private MCEntityGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMCEntityParser createParser(XtextTokenStream stream) {
		return new InternalMCEntityParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "EntityData";
	}

	public MCEntityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MCEntityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
