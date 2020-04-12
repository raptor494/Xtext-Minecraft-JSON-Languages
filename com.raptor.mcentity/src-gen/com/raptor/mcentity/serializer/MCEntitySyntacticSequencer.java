/*
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.serializer;

import com.google.inject.Inject;
import com.raptor.mcentity.services.MCEntityGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MCEntitySyntacticSequencer extends AbstractSyntacticSequencer {

	protected MCEntityGrammarAccess grammarAccess;
	protected AbstractElementAlias match_JSONArray_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_JSONObject_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_NBTArray_CommaKeyword_2_1_q;
	protected AbstractElementAlias match_NBTByteArray_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_NBTCompound_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_NBTIntArray_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_NBTJSONTextComponentArray_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_NBTJSONTextComponentObject_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_NBTLongArray_CommaKeyword_2_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MCEntityGrammarAccess) access;
		match_JSONArray_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getJSONArrayAccess().getCommaKeyword_2_2());
		match_JSONObject_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getJSONObjectAccess().getCommaKeyword_2_2());
		match_NBTArray_CommaKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_1());
		match_NBTByteArray_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getNBTByteArrayAccess().getCommaKeyword_2_2());
		match_NBTCompound_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getNBTCompoundAccess().getCommaKeyword_2_2());
		match_NBTIntArray_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getNBTIntArrayAccess().getCommaKeyword_2_2());
		match_NBTJSONTextComponentArray_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getNBTJSONTextComponentArrayAccess().getCommaKeyword_1_2());
		match_NBTJSONTextComponentObject_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getNBTJSONTextComponentObjectAccess().getCommaKeyword_1_2());
		match_NBTLongArray_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getNBTLongArrayAccess().getCommaKeyword_2_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getJSON_TEXT_BEGIN_ARRAYRule())
			return getJSON_TEXT_BEGIN_ARRAYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getJSON_TEXT_BEGIN_OBJRule())
			return getJSON_TEXT_BEGIN_OBJToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getJSON_TEXT_BEGIN_STRRule())
			return getJSON_TEXT_BEGIN_STRToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getJSON_TEXT_END_ARRAYRule())
			return getJSON_TEXT_END_ARRAYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getJSON_TEXT_END_OBJRule())
			return getJSON_TEXT_END_OBJToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getJSON_TEXT_END_STRRule())
			return getJSON_TEXT_END_STRToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNBT_BYTE_ARRAY_STARTRule())
			return getNBT_BYTE_ARRAY_STARTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNBT_INT_ARRAY_STARTRule())
			return getNBT_INT_ARRAY_STARTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNBT_LONG_ARRAY_STARTRule())
			return getNBT_LONG_ARRAY_STARTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal JSON_TEXT_BEGIN_ARRAY: "'[";
	 */
	protected String getJSON_TEXT_BEGIN_ARRAYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'[";
	}
	
	/**
	 * terminal JSON_TEXT_BEGIN_OBJ: "'{";
	 */
	protected String getJSON_TEXT_BEGIN_OBJToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'{";
	}
	
	/**
	 * terminal JSON_TEXT_BEGIN_STR: "'\"";
	 */
	protected String getJSON_TEXT_BEGIN_STRToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'\"";
	}
	
	/**
	 * terminal JSON_TEXT_END_ARRAY: "]'";
	 */
	protected String getJSON_TEXT_END_ARRAYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]\'";
	}
	
	/**
	 * terminal JSON_TEXT_END_OBJ: "}'";
	 */
	protected String getJSON_TEXT_END_OBJToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}\'";
	}
	
	/**
	 * terminal JSON_TEXT_END_STR: "\"'";
	 */
	protected String getJSON_TEXT_END_STRToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\'";
	}
	
	/**
	 * terminal NBT_BYTE_ARRAY_START: '[B;';
	 */
	protected String getNBT_BYTE_ARRAY_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[B;";
	}
	
	/**
	 * terminal NBT_INT_ARRAY_START: '[I;';
	 */
	protected String getNBT_INT_ARRAY_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[I;";
	}
	
	/**
	 * terminal NBT_LONG_ARRAY_START: '[L;';
	 */
	protected String getNBT_LONG_ARRAY_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[L;";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_JSONArray_CommaKeyword_2_2_q.equals(syntax))
				emit_JSONArray_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_JSONObject_CommaKeyword_2_2_q.equals(syntax))
				emit_JSONObject_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NBTArray_CommaKeyword_2_1_q.equals(syntax))
				emit_NBTArray_CommaKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NBTByteArray_CommaKeyword_2_2_q.equals(syntax))
				emit_NBTByteArray_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NBTCompound_CommaKeyword_2_2_q.equals(syntax))
				emit_NBTCompound_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NBTIntArray_CommaKeyword_2_2_q.equals(syntax))
				emit_NBTIntArray_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NBTJSONTextComponentArray_CommaKeyword_1_2_q.equals(syntax))
				emit_NBTJSONTextComponentArray_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NBTJSONTextComponentObject_CommaKeyword_1_2_q.equals(syntax))
				emit_NBTJSONTextComponentObject_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NBTLongArray_CommaKeyword_2_2_q.equals(syntax))
				emit_NBTLongArray_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     entries+=JSONValue (ambiguity) ']' (rule end)
	 */
	protected void emit_JSONArray_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     entries+=JSONEntry (ambiguity) '}' (rule end)
	 */
	protected void emit_JSONObject_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=NBTArray (ambiguity) ']' (rule end)
	 *     elements+=NBTBool (ambiguity) ']' (rule end)
	 *     elements+=NBTByteArray (ambiguity) ']' (rule end)
	 *     elements+=NBTCompound (ambiguity) ']' (rule end)
	 *     elements+=NBTIntArray (ambiguity) ']' (rule end)
	 *     elements+=NBTJSONTextComponent (ambiguity) ']' (rule end)
	 *     elements+=NBTLongArray (ambiguity) ']' (rule end)
	 *     elements+=NBTNumber (ambiguity) ']' (rule end)
	 *     elements+=NBTString (ambiguity) ']' (rule end)
	 */
	protected void emit_NBTArray_CommaKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=BYTE (ambiguity) ']' (rule end)
	 */
	protected void emit_NBTByteArray_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     entries+=NBTEntry (ambiguity) '}' (rule end)
	 */
	protected void emit_NBTCompound_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=INT (ambiguity) ']' (rule end)
	 */
	protected void emit_NBTIntArray_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     entries+=JSONValue (ambiguity) (rule end)
	 */
	protected void emit_NBTJSONTextComponentArray_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     entries+=JSONEntry (ambiguity) (rule end)
	 */
	protected void emit_NBTJSONTextComponentObject_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=LONG (ambiguity) ']' (rule end)
	 */
	protected void emit_NBTLongArray_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
