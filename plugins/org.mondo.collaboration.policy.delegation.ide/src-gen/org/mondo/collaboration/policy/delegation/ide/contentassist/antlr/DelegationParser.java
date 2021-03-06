/*
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.policy.delegation.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.mondo.collaboration.policy.delegation.ide.contentassist.antlr.internal.InternalDelegationParser;
import org.mondo.collaboration.policy.delegation.services.DelegationGrammarAccess;

public class DelegationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DelegationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DelegationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRoleAccess().getAlternatives(), "rule__Role__Alternatives");
			builder.put(grammarAccess.getModelFactAccess().getAlternatives(), "rule__ModelFact__Alternatives");
			builder.put(grammarAccess.getBindAccess().getAlternatives(), "rule__Bind__Alternatives");
			builder.put(grammarAccess.getAccessibilityLevelAccess().getAlternatives(), "rule__AccessibilityLevel__Alternatives");
			builder.put(grammarAccess.getOperationTypeAccess().getAlternatives(), "rule__OperationType__Alternatives");
			builder.put(grammarAccess.getResolutionTypeAccess().getAlternatives(), "rule__ResolutionType__Alternatives");
			builder.put(grammarAccess.getDelegationModelAccess().getGroup(), "rule__DelegationModel__Group__0");
			builder.put(grammarAccess.getDelegationAccess().getGroup(), "rule__Delegation__Group__0");
			builder.put(grammarAccess.getDelegationAccess().getGroup_8(), "rule__Delegation__Group_8__0");
			builder.put(grammarAccess.getAccessControlModelAccess().getGroup(), "rule__AccessControlModel__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4(), "rule__Group__Group_4__0");
			builder.put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_6(), "rule__Rule__Group_6__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_15(), "rule__Rule__Group_15__0");
			builder.put(grammarAccess.getObjectFactAccess().getGroup(), "rule__ObjectFact__Group__0");
			builder.put(grammarAccess.getReferenceFactAccess().getGroup(), "rule__ReferenceFact__Group__0");
			builder.put(grammarAccess.getAttributeFactAccess().getGroup(), "rule__AttributeFact__Group__0");
			builder.put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
			builder.put(grammarAccess.getEnumValueAccess().getGroup(), "rule__EnumValue__Group__0");
			builder.put(grammarAccess.getDelegationModelAccess().getImportAssignment_0(), "rule__DelegationModel__ImportAssignment_0");
			builder.put(grammarAccess.getDelegationModelAccess().getDelegationsAssignment_1(), "rule__DelegationModel__DelegationsAssignment_1");
			builder.put(grammarAccess.getDelegationAccess().getNameAssignment_1(), "rule__Delegation__NameAssignment_1");
			builder.put(grammarAccess.getDelegationAccess().getSourceAssignment_3(), "rule__Delegation__SourceAssignment_3");
			builder.put(grammarAccess.getDelegationAccess().getAccessAssignment_4(), "rule__Delegation__AccessAssignment_4");
			builder.put(grammarAccess.getDelegationAccess().getOperationAssignment_5(), "rule__Delegation__OperationAssignment_5");
			builder.put(grammarAccess.getDelegationAccess().getTargetsAssignment_7(), "rule__Delegation__TargetsAssignment_7");
			builder.put(grammarAccess.getDelegationAccess().getTargetsAssignment_8_1(), "rule__Delegation__TargetsAssignment_8_1");
			builder.put(grammarAccess.getDelegationAccess().getPatternAssignment_12(), "rule__Delegation__PatternAssignment_12");
			builder.put(grammarAccess.getDelegationAccess().getAssetAssignment_14(), "rule__Delegation__AssetAssignment_14");
			builder.put(grammarAccess.getDelegationAccess().getBindingsAssignment_15(), "rule__Delegation__BindingsAssignment_15");
			builder.put(grammarAccess.getAccessControlModelAccess().getImportsAssignment_0(), "rule__AccessControlModel__ImportsAssignment_0");
			builder.put(grammarAccess.getAccessControlModelAccess().getRolesAssignment_1(), "rule__AccessControlModel__RolesAssignment_1");
			builder.put(grammarAccess.getAccessControlModelAccess().getPolicyAssignment_2(), "rule__AccessControlModel__PolicyAssignment_2");
			builder.put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
			builder.put(grammarAccess.getUserAccess().getNameAssignment_1(), "rule__User__NameAssignment_1");
			builder.put(grammarAccess.getGroupAccess().getNameAssignment_1(), "rule__Group__NameAssignment_1");
			builder.put(grammarAccess.getGroupAccess().getRolesAssignment_3(), "rule__Group__RolesAssignment_3");
			builder.put(grammarAccess.getGroupAccess().getRolesAssignment_4_1(), "rule__Group__RolesAssignment_4_1");
			builder.put(grammarAccess.getPolicyAccess().getNameAssignment_1(), "rule__Policy__NameAssignment_1");
			builder.put(grammarAccess.getPolicyAccess().getAccessAssignment_2(), "rule__Policy__AccessAssignment_2");
			builder.put(grammarAccess.getPolicyAccess().getRulesAssignment_6(), "rule__Policy__RulesAssignment_6");
			builder.put(grammarAccess.getPolicyAccess().getResolutionAssignment_9(), "rule__Policy__ResolutionAssignment_9");
			builder.put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
			builder.put(grammarAccess.getRuleAccess().getAccessAssignment_2(), "rule__Rule__AccessAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getOperationAssignment_3(), "rule__Rule__OperationAssignment_3");
			builder.put(grammarAccess.getRuleAccess().getRolesAssignment_5(), "rule__Rule__RolesAssignment_5");
			builder.put(grammarAccess.getRuleAccess().getRolesAssignment_6_1(), "rule__Rule__RolesAssignment_6_1");
			builder.put(grammarAccess.getRuleAccess().getPatternAssignment_10(), "rule__Rule__PatternAssignment_10");
			builder.put(grammarAccess.getRuleAccess().getAssetAssignment_12(), "rule__Rule__AssetAssignment_12");
			builder.put(grammarAccess.getRuleAccess().getBindingsAssignment_13(), "rule__Rule__BindingsAssignment_13");
			builder.put(grammarAccess.getRuleAccess().getPriorityAssignment_15_1(), "rule__Rule__PriorityAssignment_15_1");
			builder.put(grammarAccess.getObjectFactAccess().getVariableAssignment_2(), "rule__ObjectFact__VariableAssignment_2");
			builder.put(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2(), "rule__ReferenceFact__SourceVarAssignment_2");
			builder.put(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4(), "rule__ReferenceFact__TargetVarAssignment_4");
			builder.put(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6(), "rule__ReferenceFact__ReferenceAssignment_6");
			builder.put(grammarAccess.getAttributeFactAccess().getVariableAssignment_2(), "rule__AttributeFact__VariableAssignment_2");
			builder.put(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4(), "rule__AttributeFact__AttributeAssignment_4");
			builder.put(grammarAccess.getBindingAccess().getVariableAssignment_1(), "rule__Binding__VariableAssignment_1");
			builder.put(grammarAccess.getBindingAccess().getBindAssignment_5(), "rule__Binding__BindAssignment_5");
			builder.put(grammarAccess.getBindAccess().getValueStringAssignment_0(), "rule__Bind__ValueStringAssignment_0");
			builder.put(grammarAccess.getBindAccess().getValueIntegerAssignment_1(), "rule__Bind__ValueIntegerAssignment_1");
			builder.put(grammarAccess.getBindAccess().getValueEnumLiteralAssignment_2(), "rule__Bind__ValueEnumLiteralAssignment_2");
			builder.put(grammarAccess.getEnumValueAccess().getLiteralAssignment_1(), "rule__EnumValue__LiteralAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DelegationGrammarAccess grammarAccess;

	@Override
	protected InternalDelegationParser createParser() {
		InternalDelegationParser result = new InternalDelegationParser(null);
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

	public DelegationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DelegationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
