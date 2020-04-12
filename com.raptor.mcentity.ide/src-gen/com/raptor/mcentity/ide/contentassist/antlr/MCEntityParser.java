/*
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.raptor.mcentity.ide.contentassist.antlr.internal.InternalMCEntityParser;
import com.raptor.mcentity.services.MCEntityGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MCEntityParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MCEntityGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MCEntityGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getNBTValueAccess().getAlternatives(), "rule__NBTValue__Alternatives");
			builder.put(grammarAccess.getNBTEntryAccess().getKeyAlternatives_0_0(), "rule__NBTEntry__KeyAlternatives_0_0");
			builder.put(grammarAccess.getNBTArrayAccess().getAlternatives_2_0(), "rule__NBTArray__Alternatives_2_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAlternatives_2_0_5_0_0(), "rule__NBTArray__ElementsAlternatives_2_0_5_0_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAlternatives_2_0_5_1_1_0(), "rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0");
			builder.put(grammarAccess.getNBTBoolAccess().getAlternatives(), "rule__NBTBool__Alternatives");
			builder.put(grammarAccess.getNBTNumberAccess().getAlternatives(), "rule__NBTNumber__Alternatives");
			builder.put(grammarAccess.getNBTStringAccess().getValueAlternatives_0(), "rule__NBTString__ValueAlternatives_0");
			builder.put(grammarAccess.getNBTJSONTextComponentAccess().getAlternatives(), "rule__NBTJSONTextComponent__Alternatives");
			builder.put(grammarAccess.getJSONTextComponentAccess().getAlternatives(), "rule__JSONTextComponent__Alternatives");
			builder.put(grammarAccess.getJSONValueAccess().getAlternatives(), "rule__JSONValue__Alternatives");
			builder.put(grammarAccess.getJSONBoolAccess().getAlternatives(), "rule__JSONBool__Alternatives");
			builder.put(grammarAccess.getJSONNumberAccess().getAlternatives(), "rule__JSONNumber__Alternatives");
			builder.put(grammarAccess.getSelectorValueAccess().getAlternatives(), "rule__SelectorValue__Alternatives");
			builder.put(grammarAccess.getIntRangeAccess().getAlternatives(), "rule__IntRange__Alternatives");
			builder.put(grammarAccess.getDoubleRangeAccess().getAlternatives(), "rule__DoubleRange__Alternatives");
			builder.put(grammarAccess.getDoubleRangeAccess().getAlternatives_0_1(), "rule__DoubleRange__Alternatives_0_1");
			builder.put(grammarAccess.getDOUBLEorINTAccess().getAlternatives(), "rule__DOUBLEorINT__Alternatives");
			builder.put(grammarAccess.getBoolSelectorValueAccess().getAlternatives(), "rule__BoolSelectorValue__Alternatives");
			builder.put(grammarAccess.getStringSelectorValueAccess().getValueAlternatives_0(), "rule__StringSelectorValue__ValueAlternatives_0");
			builder.put(grammarAccess.getUnquotedStringAccess().getAlternatives_0(), "rule__UnquotedString__Alternatives_0");
			builder.put(grammarAccess.getUnquotedStringAccess().getAlternatives_1(), "rule__UnquotedString__Alternatives_1");
			builder.put(grammarAccess.getSelectorTypeAccess().getAlternatives(), "rule__SelectorType__Alternatives");
			builder.put(grammarAccess.getNBTCompoundAccess().getGroup(), "rule__NBTCompound__Group__0");
			builder.put(grammarAccess.getNBTCompoundAccess().getGroup_2(), "rule__NBTCompound__Group_2__0");
			builder.put(grammarAccess.getNBTCompoundAccess().getGroup_2_1(), "rule__NBTCompound__Group_2_1__0");
			builder.put(grammarAccess.getNBTEntryAccess().getGroup(), "rule__NBTEntry__Group__0");
			builder.put(grammarAccess.getNBTByteArrayAccess().getGroup(), "rule__NBTByteArray__Group__0");
			builder.put(grammarAccess.getNBTByteArrayAccess().getGroup_2(), "rule__NBTByteArray__Group_2__0");
			builder.put(grammarAccess.getNBTByteArrayAccess().getGroup_2_1(), "rule__NBTByteArray__Group_2_1__0");
			builder.put(grammarAccess.getNBTLongArrayAccess().getGroup(), "rule__NBTLongArray__Group__0");
			builder.put(grammarAccess.getNBTLongArrayAccess().getGroup_2(), "rule__NBTLongArray__Group_2__0");
			builder.put(grammarAccess.getNBTLongArrayAccess().getGroup_2_1(), "rule__NBTLongArray__Group_2_1__0");
			builder.put(grammarAccess.getNBTIntArrayAccess().getGroup(), "rule__NBTIntArray__Group__0");
			builder.put(grammarAccess.getNBTIntArrayAccess().getGroup_2(), "rule__NBTIntArray__Group_2__0");
			builder.put(grammarAccess.getNBTIntArrayAccess().getGroup_2_1(), "rule__NBTIntArray__Group_2_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup(), "rule__NBTArray__Group__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2(), "rule__NBTArray__Group_2__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_0(), "rule__NBTArray__Group_2_0_0__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_0_1(), "rule__NBTArray__Group_2_0_0_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_1(), "rule__NBTArray__Group_2_0_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_1_1(), "rule__NBTArray__Group_2_0_1_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_2(), "rule__NBTArray__Group_2_0_2__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_2_1(), "rule__NBTArray__Group_2_0_2_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_3(), "rule__NBTArray__Group_2_0_3__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_3_1(), "rule__NBTArray__Group_2_0_3_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_4(), "rule__NBTArray__Group_2_0_4__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_4_1(), "rule__NBTArray__Group_2_0_4_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_5(), "rule__NBTArray__Group_2_0_5__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_5_1(), "rule__NBTArray__Group_2_0_5_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_6(), "rule__NBTArray__Group_2_0_6__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_6_1(), "rule__NBTArray__Group_2_0_6_1__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_7(), "rule__NBTArray__Group_2_0_7__0");
			builder.put(grammarAccess.getNBTArrayAccess().getGroup_2_0_7_1(), "rule__NBTArray__Group_2_0_7_1__0");
			builder.put(grammarAccess.getNBTBoolAccess().getGroup_1(), "rule__NBTBool__Group_1__0");
			builder.put(grammarAccess.getNBTJSONTextComponentAccess().getGroup_0(), "rule__NBTJSONTextComponent__Group_0__0");
			builder.put(grammarAccess.getNBTJSONTextComponentAccess().getGroup_1(), "rule__NBTJSONTextComponent__Group_1__0");
			builder.put(grammarAccess.getNBTJSONTextComponentAccess().getGroup_2(), "rule__NBTJSONTextComponent__Group_2__0");
			builder.put(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup(), "rule__NBTJSONTextComponentObject__Group__0");
			builder.put(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup_1(), "rule__NBTJSONTextComponentObject__Group_1__0");
			builder.put(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup_1_1(), "rule__NBTJSONTextComponentObject__Group_1_1__0");
			builder.put(grammarAccess.getNBTJSONTextComponentStringAccess().getGroup(), "rule__NBTJSONTextComponentString__Group__0");
			builder.put(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup(), "rule__NBTJSONTextComponentArray__Group__0");
			builder.put(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup_1(), "rule__NBTJSONTextComponentArray__Group_1__0");
			builder.put(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup_1_1(), "rule__NBTJSONTextComponentArray__Group_1_1__0");
			builder.put(grammarAccess.getJSONBoolAccess().getGroup_1(), "rule__JSONBool__Group_1__0");
			builder.put(grammarAccess.getJSONObjectAccess().getGroup(), "rule__JSONObject__Group__0");
			builder.put(grammarAccess.getJSONObjectAccess().getGroup_2(), "rule__JSONObject__Group_2__0");
			builder.put(grammarAccess.getJSONObjectAccess().getGroup_2_1(), "rule__JSONObject__Group_2_1__0");
			builder.put(grammarAccess.getJSONEntryAccess().getGroup(), "rule__JSONEntry__Group__0");
			builder.put(grammarAccess.getJSONArrayAccess().getGroup(), "rule__JSONArray__Group__0");
			builder.put(grammarAccess.getJSONArrayAccess().getGroup_2(), "rule__JSONArray__Group_2__0");
			builder.put(grammarAccess.getJSONArrayAccess().getGroup_2_1(), "rule__JSONArray__Group_2_1__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_1(), "rule__Selector__Group_1__0");
			builder.put(grammarAccess.getSelectorArgumentsAccess().getGroup(), "rule__SelectorArguments__Group__0");
			builder.put(grammarAccess.getSelectorArgumentsAccess().getGroup_1(), "rule__SelectorArguments__Group_1__0");
			builder.put(grammarAccess.getSelectorFilterAccess().getGroup(), "rule__SelectorFilter__Group__0");
			builder.put(grammarAccess.getIntRangeAccess().getGroup_0(), "rule__IntRange__Group_0__0");
			builder.put(grammarAccess.getIntRangeAccess().getGroup_1(), "rule__IntRange__Group_1__0");
			builder.put(grammarAccess.getIntRangeAccess().getGroup_2(), "rule__IntRange__Group_2__0");
			builder.put(grammarAccess.getDoubleRangeAccess().getGroup_0(), "rule__DoubleRange__Group_0__0");
			builder.put(grammarAccess.getDoubleRangeAccess().getGroup_0_1_0(), "rule__DoubleRange__Group_0_1_0__0");
			builder.put(grammarAccess.getDoubleRangeAccess().getGroup_0_1_1(), "rule__DoubleRange__Group_0_1_1__0");
			builder.put(grammarAccess.getDoubleRangeAccess().getGroup_1(), "rule__DoubleRange__Group_1__0");
			builder.put(grammarAccess.getDoubleRangeAccess().getGroup_2(), "rule__DoubleRange__Group_2__0");
			builder.put(grammarAccess.getBoolSelectorValueAccess().getGroup_1(), "rule__BoolSelectorValue__Group_1__0");
			builder.put(grammarAccess.getNamespacedKeyAccess().getGroup(), "rule__NamespacedKey__Group__0");
			builder.put(grammarAccess.getNamespacedKeyKeyAccess().getGroup(), "rule__NamespacedKeyKey__Group__0");
			builder.put(grammarAccess.getNamespacedKeyKeyAccess().getGroup_1(), "rule__NamespacedKeyKey__Group_1__0");
			builder.put(grammarAccess.getNamespacedKeyKey2Access().getGroup(), "rule__NamespacedKeyKey2__Group__0");
			builder.put(grammarAccess.getNamespacedKeyKey2Access().getGroup_1(), "rule__NamespacedKeyKey2__Group_1__0");
			builder.put(grammarAccess.getUnquotedStringAccess().getGroup(), "rule__UnquotedString__Group__0");
			builder.put(grammarAccess.getEntityDataAccess().getNbtAssignment(), "rule__EntityData__NbtAssignment");
			builder.put(grammarAccess.getNBTCompoundAccess().getEntriesAssignment_2_0(), "rule__NBTCompound__EntriesAssignment_2_0");
			builder.put(grammarAccess.getNBTCompoundAccess().getEntriesAssignment_2_1_1(), "rule__NBTCompound__EntriesAssignment_2_1_1");
			builder.put(grammarAccess.getNBTEntryAccess().getKeyAssignment_0(), "rule__NBTEntry__KeyAssignment_0");
			builder.put(grammarAccess.getNBTEntryAccess().getValueAssignment_2(), "rule__NBTEntry__ValueAssignment_2");
			builder.put(grammarAccess.getNBTByteArrayAccess().getElementsAssignment_2_0(), "rule__NBTByteArray__ElementsAssignment_2_0");
			builder.put(grammarAccess.getNBTByteArrayAccess().getElementsAssignment_2_1_1(), "rule__NBTByteArray__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getNBTLongArrayAccess().getElementsAssignment_2_0(), "rule__NBTLongArray__ElementsAssignment_2_0");
			builder.put(grammarAccess.getNBTLongArrayAccess().getElementsAssignment_2_1_1(), "rule__NBTLongArray__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getNBTIntArrayAccess().getElementsAssignment_2_0(), "rule__NBTIntArray__ElementsAssignment_2_0");
			builder.put(grammarAccess.getNBTIntArrayAccess().getElementsAssignment_2_1_1(), "rule__NBTIntArray__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_0_0(), "rule__NBTArray__ElementsAssignment_2_0_0_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_0_1_1(), "rule__NBTArray__ElementsAssignment_2_0_0_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_1_0(), "rule__NBTArray__ElementsAssignment_2_0_1_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_1_1_1(), "rule__NBTArray__ElementsAssignment_2_0_1_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_2_0(), "rule__NBTArray__ElementsAssignment_2_0_2_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_2_1_1(), "rule__NBTArray__ElementsAssignment_2_0_2_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_3_0(), "rule__NBTArray__ElementsAssignment_2_0_3_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_3_1_1(), "rule__NBTArray__ElementsAssignment_2_0_3_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_4_0(), "rule__NBTArray__ElementsAssignment_2_0_4_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_4_1_1(), "rule__NBTArray__ElementsAssignment_2_0_4_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_5_0(), "rule__NBTArray__ElementsAssignment_2_0_5_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_5_1_1(), "rule__NBTArray__ElementsAssignment_2_0_5_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_6_0(), "rule__NBTArray__ElementsAssignment_2_0_6_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_6_1_1(), "rule__NBTArray__ElementsAssignment_2_0_6_1_1");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_7_0(), "rule__NBTArray__ElementsAssignment_2_0_7_0");
			builder.put(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_7_1_1(), "rule__NBTArray__ElementsAssignment_2_0_7_1_1");
			builder.put(grammarAccess.getNBTBoolAccess().getValueAssignment_0(), "rule__NBTBool__ValueAssignment_0");
			builder.put(grammarAccess.getNBTFloatAccess().getValueAssignment(), "rule__NBTFloat__ValueAssignment");
			builder.put(grammarAccess.getNBTDoubleAccess().getValueAssignment(), "rule__NBTDouble__ValueAssignment");
			builder.put(grammarAccess.getNBTLongAccess().getValueAssignment(), "rule__NBTLong__ValueAssignment");
			builder.put(grammarAccess.getNBTShortAccess().getValueAssignment(), "rule__NBTShort__ValueAssignment");
			builder.put(grammarAccess.getNBTByteAccess().getValueAssignment(), "rule__NBTByte__ValueAssignment");
			builder.put(grammarAccess.getNBTIntAccess().getValueAssignment(), "rule__NBTInt__ValueAssignment");
			builder.put(grammarAccess.getNBTStringAccess().getValueAssignment(), "rule__NBTString__ValueAssignment");
			builder.put(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_0_1(), "rule__NBTJSONTextComponent__ValueAssignment_0_1");
			builder.put(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_1_1(), "rule__NBTJSONTextComponent__ValueAssignment_1_1");
			builder.put(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_2_1(), "rule__NBTJSONTextComponent__ValueAssignment_2_1");
			builder.put(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesAssignment_1_0(), "rule__NBTJSONTextComponentObject__EntriesAssignment_1_0");
			builder.put(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesAssignment_1_1_1(), "rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1");
			builder.put(grammarAccess.getNBTJSONTextComponentStringAccess().getValueAssignment_1(), "rule__NBTJSONTextComponentString__ValueAssignment_1");
			builder.put(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesAssignment_1_0(), "rule__NBTJSONTextComponentArray__EntriesAssignment_1_0");
			builder.put(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesAssignment_1_1_1(), "rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1");
			builder.put(grammarAccess.getJSONBoolAccess().getValueAssignment_0(), "rule__JSONBool__ValueAssignment_0");
			builder.put(grammarAccess.getJSONDoubleAccess().getValueAssignment(), "rule__JSONDouble__ValueAssignment");
			builder.put(grammarAccess.getJSONLongAccess().getValueAssignment(), "rule__JSONLong__ValueAssignment");
			builder.put(grammarAccess.getJSONObjectAccess().getEntriesAssignment_2_0(), "rule__JSONObject__EntriesAssignment_2_0");
			builder.put(grammarAccess.getJSONObjectAccess().getEntriesAssignment_2_1_1(), "rule__JSONObject__EntriesAssignment_2_1_1");
			builder.put(grammarAccess.getJSONEntryAccess().getKeyAssignment_0(), "rule__JSONEntry__KeyAssignment_0");
			builder.put(grammarAccess.getJSONEntryAccess().getValueAssignment_2(), "rule__JSONEntry__ValueAssignment_2");
			builder.put(grammarAccess.getJSONArrayAccess().getEntriesAssignment_2_0(), "rule__JSONArray__EntriesAssignment_2_0");
			builder.put(grammarAccess.getJSONArrayAccess().getEntriesAssignment_2_1_1(), "rule__JSONArray__EntriesAssignment_2_1_1");
			builder.put(grammarAccess.getJSONStringAccess().getValueAssignment(), "rule__JSONString__ValueAssignment");
			builder.put(grammarAccess.getSelectorAccess().getTypeAssignment_0(), "rule__Selector__TypeAssignment_0");
			builder.put(grammarAccess.getSelectorAccess().getArgumentsAssignment_1_1(), "rule__Selector__ArgumentsAssignment_1_1");
			builder.put(grammarAccess.getSelectorArgumentsAccess().getFiltersAssignment_0(), "rule__SelectorArguments__FiltersAssignment_0");
			builder.put(grammarAccess.getSelectorArgumentsAccess().getFiltersAssignment_1_1(), "rule__SelectorArguments__FiltersAssignment_1_1");
			builder.put(grammarAccess.getSelectorFilterAccess().getNameAssignment_0(), "rule__SelectorFilter__NameAssignment_0");
			builder.put(grammarAccess.getSelectorFilterAccess().getInvertedAssignment_2(), "rule__SelectorFilter__InvertedAssignment_2");
			builder.put(grammarAccess.getSelectorFilterAccess().getValueAssignment_3(), "rule__SelectorFilter__ValueAssignment_3");
			builder.put(grammarAccess.getIntRangeAccess().getBeginAssignment_0_1(), "rule__IntRange__BeginAssignment_0_1");
			builder.put(grammarAccess.getIntRangeAccess().getEndAssignment_0_3(), "rule__IntRange__EndAssignment_0_3");
			builder.put(grammarAccess.getIntRangeAccess().getBeginAssignment_1_1(), "rule__IntRange__BeginAssignment_1_1");
			builder.put(grammarAccess.getIntRangeAccess().getEndAssignment_2_2(), "rule__IntRange__EndAssignment_2_2");
			builder.put(grammarAccess.getDoubleRangeAccess().getBeginAssignment_0_1_0_0(), "rule__DoubleRange__BeginAssignment_0_1_0_0");
			builder.put(grammarAccess.getDoubleRangeAccess().getEndAssignment_0_1_0_2(), "rule__DoubleRange__EndAssignment_0_1_0_2");
			builder.put(grammarAccess.getDoubleRangeAccess().getBeginAssignment_0_1_1_0(), "rule__DoubleRange__BeginAssignment_0_1_1_0");
			builder.put(grammarAccess.getDoubleRangeAccess().getEndAssignment_0_1_1_2(), "rule__DoubleRange__EndAssignment_0_1_1_2");
			builder.put(grammarAccess.getDoubleRangeAccess().getBeginAssignment_1_1(), "rule__DoubleRange__BeginAssignment_1_1");
			builder.put(grammarAccess.getDoubleRangeAccess().getEndAssignment_2_2(), "rule__DoubleRange__EndAssignment_2_2");
			builder.put(grammarAccess.getIntSelectorValueAccess().getValueAssignment(), "rule__IntSelectorValue__ValueAssignment");
			builder.put(grammarAccess.getDoubleSelectorValueAccess().getValueAssignment(), "rule__DoubleSelectorValue__ValueAssignment");
			builder.put(grammarAccess.getBoolSelectorValueAccess().getValueAssignment_0(), "rule__BoolSelectorValue__ValueAssignment_0");
			builder.put(grammarAccess.getStringSelectorValueAccess().getValueAssignment(), "rule__StringSelectorValue__ValueAssignment");
			builder.put(grammarAccess.getNamespacedKeyAccess().getNamespaceAssignment_0(), "rule__NamespacedKey__NamespaceAssignment_0");
			builder.put(grammarAccess.getNamespacedKeyAccess().getKeyAssignment_2(), "rule__NamespacedKey__KeyAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MCEntityGrammarAccess grammarAccess;

	@Override
	protected InternalMCEntityParser createParser() {
		InternalMCEntityParser result = new InternalMCEntityParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MCEntityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MCEntityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
