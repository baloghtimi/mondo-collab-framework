/*
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.security.mpbl.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MondoPropertyBasedLockingGrammarAccess extends AbstractGrammarElementFinder {
	
	public class PropertyBasedLockingModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.PropertyBasedLockingModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPropertyBasedLockingModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRolesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRolesRoleParserRuleCall_1_0 = (RuleCall)cRolesAssignment_1.eContents().get(0);
		private final Keyword cLocksKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLocksAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLocksLockParserRuleCall_4_0 = (RuleCall)cLocksAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//PropertyBasedLockingModel:
		//	{PropertyBasedLockingModel} roles+=Role*
		//	'locks' '{' locks+=Lock* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{PropertyBasedLockingModel} roles+=Role* 'locks' '{' locks+=Lock* '}'
		public Group getGroup() { return cGroup; }
		
		//{PropertyBasedLockingModel}
		public Action getPropertyBasedLockingModelAction_0() { return cPropertyBasedLockingModelAction_0; }
		
		//roles+=Role*
		public Assignment getRolesAssignment_1() { return cRolesAssignment_1; }
		
		//Role
		public RuleCall getRolesRoleParserRuleCall_1_0() { return cRolesRoleParserRuleCall_1_0; }
		
		//'locks'
		public Keyword getLocksKeyword_2() { return cLocksKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//locks+=Lock*
		public Assignment getLocksAssignment_4() { return cLocksAssignment_4; }
		
		//Lock
		public RuleCall getLocksLockParserRuleCall_4_0() { return cLocksLockParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class RoleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Role");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cUserParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGroupParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Role:
		//	User | Group;
		@Override public ParserRule getRule() { return rule; }
		
		//User | Group
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//User
		public RuleCall getUserParserRuleCall_0() { return cUserParserRuleCall_0; }
		
		//Group
		public RuleCall getGroupParserRuleCall_1() { return cGroupParserRuleCall_1; }
	}
	public class UserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.User");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUserKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//User:
		//	'user' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'user' name=ID
		public Group getGroup() { return cGroup; }
		
		//'user'
		public Keyword getUserKeyword_0() { return cUserKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class GroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGroupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUsersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cUsersUserCrossReference_3_0 = (CrossReference)cUsersAssignment_3.eContents().get(0);
		private final RuleCall cUsersUserIDTerminalRuleCall_3_0_1 = (RuleCall)cUsersUserCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cUsersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cUsersUserCrossReference_4_1_0 = (CrossReference)cUsersAssignment_4_1.eContents().get(0);
		private final RuleCall cUsersUserIDTerminalRuleCall_4_1_0_1 = (RuleCall)cUsersUserCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Group:
		//	'group' name=ID '{' users+=[User] (',' users+=[User])* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'group' name=ID '{' users+=[User] (',' users+=[User])* '}'
		public Group getGroup() { return cGroup; }
		
		//'group'
		public Keyword getGroupKeyword_0() { return cGroupKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//users+=[User]
		public Assignment getUsersAssignment_3() { return cUsersAssignment_3; }
		
		//[User]
		public CrossReference getUsersUserCrossReference_3_0() { return cUsersUserCrossReference_3_0; }
		
		//ID
		public RuleCall getUsersUserIDTerminalRuleCall_3_0_1() { return cUsersUserIDTerminalRuleCall_3_0_1; }
		
		//(',' users+=[User])*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//users+=[User]
		public Assignment getUsersAssignment_4_1() { return cUsersAssignment_4_1; }
		
		//[User]
		public CrossReference getUsersUserCrossReference_4_1_0() { return cUsersUserCrossReference_4_1_0; }
		
		//ID
		public RuleCall getUsersUserIDTerminalRuleCall_4_1_0_1() { return cUsersUserIDTerminalRuleCall_4_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class LockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Lock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOwnerAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cOwnerRoleCrossReference_0_0 = (CrossReference)cOwnerAssignment_0.eContents().get(0);
		private final RuleCall cOwnerRoleIDTerminalRuleCall_0_0_1 = (RuleCall)cOwnerRoleCrossReference_0_0.eContents().get(1);
		private final Keyword cLockKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cQueryKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPatternAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cPatternPatternCrossReference_4_0 = (CrossReference)cPatternAssignment_4.eContents().get(0);
		private final RuleCall cPatternPatternSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cPatternPatternCrossReference_4_0.eContents().get(1);
		private final Assignment cBindingsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBindingsBindingParserRuleCall_5_0 = (RuleCall)cBindingsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Lock:
		//	owner=[Role] 'lock' '{' 'query' pattern=[vql::Pattern|STRING] bindings+=Binding* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//owner=[Role] 'lock' '{' 'query' pattern=[vql::Pattern|STRING] bindings+=Binding* '}'
		public Group getGroup() { return cGroup; }
		
		//owner=[Role]
		public Assignment getOwnerAssignment_0() { return cOwnerAssignment_0; }
		
		//[Role]
		public CrossReference getOwnerRoleCrossReference_0_0() { return cOwnerRoleCrossReference_0_0; }
		
		//ID
		public RuleCall getOwnerRoleIDTerminalRuleCall_0_0_1() { return cOwnerRoleIDTerminalRuleCall_0_0_1; }
		
		//'lock'
		public Keyword getLockKeyword_1() { return cLockKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'query'
		public Keyword getQueryKeyword_3() { return cQueryKeyword_3; }
		
		//pattern=[vql::Pattern|STRING]
		public Assignment getPatternAssignment_4() { return cPatternAssignment_4; }
		
		//[vql::Pattern|STRING]
		public CrossReference getPatternPatternCrossReference_4_0() { return cPatternPatternCrossReference_4_0; }
		
		//STRING
		public RuleCall getPatternPatternSTRINGTerminalRuleCall_4_0_1() { return cPatternPatternSTRINGTerminalRuleCall_4_0_1; }
		
		//bindings+=Binding*
		public Assignment getBindingsAssignment_5() { return cBindingsAssignment_5; }
		
		//Binding
		public RuleCall getBindingsBindingParserRuleCall_5_0() { return cBindingsBindingParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Binding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParamAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParamVariableCrossReference_1_0 = (CrossReference)cParamAssignment_1.eContents().get(0);
		private final RuleCall cParamVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cParamVariableCrossReference_1_0.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueBindParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Binding:
		//	'bind' param=[vql::Variable] value=Bind;
		@Override public ParserRule getRule() { return rule; }
		
		//'bind' param=[vql::Variable] value=Bind
		public Group getGroup() { return cGroup; }
		
		//'bind'
		public Keyword getBindKeyword_0() { return cBindKeyword_0; }
		
		//param=[vql::Variable]
		public Assignment getParamAssignment_1() { return cParamAssignment_1; }
		
		//[vql::Variable]
		public CrossReference getParamVariableCrossReference_1_0() { return cParamVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getParamVariableIDTerminalRuleCall_1_0_1() { return cParamVariableIDTerminalRuleCall_1_0_1; }
		
		//value=Bind
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Bind
		public RuleCall getValueBindParserRuleCall_2_0() { return cValueBindParserRuleCall_2_0; }
	}
	public class BindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Bind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cObjectBindParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cValueBindParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRoleBindParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Bind:
		//	ObjectBind | ValueBind | RoleBind;
		@Override public ParserRule getRule() { return rule; }
		
		//ObjectBind | ValueBind | RoleBind
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ObjectBind
		public RuleCall getObjectBindParserRuleCall_0() { return cObjectBindParserRuleCall_0; }
		
		//ValueBind
		public RuleCall getValueBindParserRuleCall_1() { return cValueBindParserRuleCall_1; }
		
		//RoleBind
		public RuleCall getRoleBindParserRuleCall_2() { return cRoleBindParserRuleCall_2; }
	}
	public class RoleBindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.RoleBind");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRoleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRoleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRoleRoleCrossReference_1_0 = (CrossReference)cRoleAssignment_1.eContents().get(0);
		private final RuleCall cRoleRoleIDTerminalRuleCall_1_0_1 = (RuleCall)cRoleRoleCrossReference_1_0.eContents().get(1);
		
		//RoleBind:
		//	'role' role=[Role];
		@Override public ParserRule getRule() { return rule; }
		
		//'role' role=[Role]
		public Group getGroup() { return cGroup; }
		
		//'role'
		public Keyword getRoleKeyword_0() { return cRoleKeyword_0; }
		
		//role=[Role]
		public Assignment getRoleAssignment_1() { return cRoleAssignment_1; }
		
		//[Role]
		public CrossReference getRoleRoleCrossReference_1_0() { return cRoleRoleCrossReference_1_0; }
		
		//ID
		public RuleCall getRoleRoleIDTerminalRuleCall_1_0_1() { return cRoleRoleIDTerminalRuleCall_1_0_1; }
	}
	public class ValueBindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.ValueBind");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cValueKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//ValueBind:
		//	'value' value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'value' value=STRING
		public Group getGroup() { return cGroup; }
		
		//'value'
		public Keyword getValueKeyword_0() { return cValueKeyword_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	public class ObjectBindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.ObjectBind");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cObjectAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cObjectEObjectCrossReference_1_0 = (CrossReference)cObjectAssignment_1.eContents().get(0);
		private final RuleCall cObjectEObjectIDTerminalRuleCall_1_0_1 = (RuleCall)cObjectEObjectCrossReference_1_0.eContents().get(1);
		
		//ObjectBind:
		//	'object' object=[ecore::EObject];
		@Override public ParserRule getRule() { return rule; }
		
		//'object' object=[ecore::EObject]
		public Group getGroup() { return cGroup; }
		
		//'object'
		public Keyword getObjectKeyword_0() { return cObjectKeyword_0; }
		
		//object=[ecore::EObject]
		public Assignment getObjectAssignment_1() { return cObjectAssignment_1; }
		
		//[ecore::EObject]
		public CrossReference getObjectEObjectCrossReference_1_0() { return cObjectEObjectCrossReference_1_0; }
		
		//ID
		public RuleCall getObjectEObjectIDTerminalRuleCall_1_0_1() { return cObjectEObjectIDTerminalRuleCall_1_0_1; }
	}
	
	
	private final PropertyBasedLockingModelElements pPropertyBasedLockingModel;
	private final RoleElements pRole;
	private final UserElements pUser;
	private final GroupElements pGroup;
	private final LockElements pLock;
	private final BindingElements pBinding;
	private final BindElements pBind;
	private final RoleBindElements pRoleBind;
	private final ValueBindElements pValueBind;
	private final ObjectBindElements pObjectBind;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MondoPropertyBasedLockingGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPropertyBasedLockingModel = new PropertyBasedLockingModelElements();
		this.pRole = new RoleElements();
		this.pUser = new UserElements();
		this.pGroup = new GroupElements();
		this.pLock = new LockElements();
		this.pBinding = new BindingElements();
		this.pBind = new BindElements();
		this.pRoleBind = new RoleBindElements();
		this.pValueBind = new ValueBindElements();
		this.pObjectBind = new ObjectBindElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PropertyBasedLockingModel:
	//	{PropertyBasedLockingModel} roles+=Role*
	//	'locks' '{' locks+=Lock* '}';
	public PropertyBasedLockingModelElements getPropertyBasedLockingModelAccess() {
		return pPropertyBasedLockingModel;
	}
	
	public ParserRule getPropertyBasedLockingModelRule() {
		return getPropertyBasedLockingModelAccess().getRule();
	}
	
	//Role:
	//	User | Group;
	public RoleElements getRoleAccess() {
		return pRole;
	}
	
	public ParserRule getRoleRule() {
		return getRoleAccess().getRule();
	}
	
	//User:
	//	'user' name=ID;
	public UserElements getUserAccess() {
		return pUser;
	}
	
	public ParserRule getUserRule() {
		return getUserAccess().getRule();
	}
	
	//Group:
	//	'group' name=ID '{' users+=[User] (',' users+=[User])* '}';
	public GroupElements getGroupAccess() {
		return pGroup;
	}
	
	public ParserRule getGroupRule() {
		return getGroupAccess().getRule();
	}
	
	//Lock:
	//	owner=[Role] 'lock' '{' 'query' pattern=[vql::Pattern|STRING] bindings+=Binding* '}';
	public LockElements getLockAccess() {
		return pLock;
	}
	
	public ParserRule getLockRule() {
		return getLockAccess().getRule();
	}
	
	//Binding:
	//	'bind' param=[vql::Variable] value=Bind;
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//Bind:
	//	ObjectBind | ValueBind | RoleBind;
	public BindElements getBindAccess() {
		return pBind;
	}
	
	public ParserRule getBindRule() {
		return getBindAccess().getRule();
	}
	
	//RoleBind:
	//	'role' role=[Role];
	public RoleBindElements getRoleBindAccess() {
		return pRoleBind;
	}
	
	public ParserRule getRoleBindRule() {
		return getRoleBindAccess().getRule();
	}
	
	//ValueBind:
	//	'value' value=STRING;
	public ValueBindElements getValueBindAccess() {
		return pValueBind;
	}
	
	public ParserRule getValueBindRule() {
		return getValueBindAccess().getRule();
	}
	
	//ObjectBind:
	//	'object' object=[ecore::EObject];
	public ObjectBindElements getObjectBindAccess() {
		return pObjectBind;
	}
	
	public ParserRule getObjectBindRule() {
		return getObjectBindAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
