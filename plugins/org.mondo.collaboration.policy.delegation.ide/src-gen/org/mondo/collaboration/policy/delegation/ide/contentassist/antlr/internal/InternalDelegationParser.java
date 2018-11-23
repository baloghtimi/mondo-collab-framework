package org.mondo.collaboration.policy.delegation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mondo.collaboration.policy.delegation.services.DelegationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDelegationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'deny'", "'obfuscate'", "'allow'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'", "'delegation'", "'from'", "'to'", "'{'", "'query'", "'select'", "'}'", "','", "'import'", "'user'", "'group'", "'policy'", "'by'", "'default'", "'with'", "'resolution'", "'rule'", "'priority'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'", "'::'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDelegationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDelegationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDelegationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDelegation.g"; }


    	private DelegationGrammarAccess grammarAccess;

    	public void setGrammarAccess(DelegationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDelegationModel"
    // InternalDelegation.g:53:1: entryRuleDelegationModel : ruleDelegationModel EOF ;
    public final void entryRuleDelegationModel() throws RecognitionException {
        try {
            // InternalDelegation.g:54:1: ( ruleDelegationModel EOF )
            // InternalDelegation.g:55:1: ruleDelegationModel EOF
            {
             before(grammarAccess.getDelegationModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDelegationModel();

            state._fsp--;

             after(grammarAccess.getDelegationModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelegationModel"


    // $ANTLR start "ruleDelegationModel"
    // InternalDelegation.g:62:1: ruleDelegationModel : ( ( rule__DelegationModel__Group__0 ) ) ;
    public final void ruleDelegationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:66:2: ( ( ( rule__DelegationModel__Group__0 ) ) )
            // InternalDelegation.g:67:2: ( ( rule__DelegationModel__Group__0 ) )
            {
            // InternalDelegation.g:67:2: ( ( rule__DelegationModel__Group__0 ) )
            // InternalDelegation.g:68:3: ( rule__DelegationModel__Group__0 )
            {
             before(grammarAccess.getDelegationModelAccess().getGroup()); 
            // InternalDelegation.g:69:3: ( rule__DelegationModel__Group__0 )
            // InternalDelegation.g:69:4: rule__DelegationModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelegationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegationModel"


    // $ANTLR start "entryRuleDelegation"
    // InternalDelegation.g:78:1: entryRuleDelegation : ruleDelegation EOF ;
    public final void entryRuleDelegation() throws RecognitionException {
        try {
            // InternalDelegation.g:79:1: ( ruleDelegation EOF )
            // InternalDelegation.g:80:1: ruleDelegation EOF
            {
             before(grammarAccess.getDelegationRule()); 
            pushFollow(FOLLOW_1);
            ruleDelegation();

            state._fsp--;

             after(grammarAccess.getDelegationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelegation"


    // $ANTLR start "ruleDelegation"
    // InternalDelegation.g:87:1: ruleDelegation : ( ( rule__Delegation__Group__0 ) ) ;
    public final void ruleDelegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:91:2: ( ( ( rule__Delegation__Group__0 ) ) )
            // InternalDelegation.g:92:2: ( ( rule__Delegation__Group__0 ) )
            {
            // InternalDelegation.g:92:2: ( ( rule__Delegation__Group__0 ) )
            // InternalDelegation.g:93:3: ( rule__Delegation__Group__0 )
            {
             before(grammarAccess.getDelegationAccess().getGroup()); 
            // InternalDelegation.g:94:3: ( rule__Delegation__Group__0 )
            // InternalDelegation.g:94:4: rule__Delegation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegation"


    // $ANTLR start "entryRuleImport"
    // InternalDelegation.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDelegation.g:104:1: ( ruleImport EOF )
            // InternalDelegation.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDelegation.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDelegation.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalDelegation.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalDelegation.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDelegation.g:119:3: ( rule__Import__Group__0 )
            // InternalDelegation.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRole"
    // InternalDelegation.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalDelegation.g:129:1: ( ruleRole EOF )
            // InternalDelegation.g:130:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDelegation.g:137:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:141:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalDelegation.g:142:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalDelegation.g:142:2: ( ( rule__Role__Alternatives ) )
            // InternalDelegation.g:143:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalDelegation.g:144:3: ( rule__Role__Alternatives )
            // InternalDelegation.g:144:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // InternalDelegation.g:153:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalDelegation.g:154:1: ( ruleUser EOF )
            // InternalDelegation.g:155:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalDelegation.g:162:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:166:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalDelegation.g:167:2: ( ( rule__User__Group__0 ) )
            {
            // InternalDelegation.g:167:2: ( ( rule__User__Group__0 ) )
            // InternalDelegation.g:168:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalDelegation.g:169:3: ( rule__User__Group__0 )
            // InternalDelegation.g:169:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleGroup"
    // InternalDelegation.g:178:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalDelegation.g:179:1: ( ruleGroup EOF )
            // InternalDelegation.g:180:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalDelegation.g:187:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:191:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalDelegation.g:192:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalDelegation.g:192:2: ( ( rule__Group__Group__0 ) )
            // InternalDelegation.g:193:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalDelegation.g:194:3: ( rule__Group__Group__0 )
            // InternalDelegation.g:194:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePolicy"
    // InternalDelegation.g:203:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalDelegation.g:204:1: ( rulePolicy EOF )
            // InternalDelegation.g:205:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalDelegation.g:212:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:216:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalDelegation.g:217:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalDelegation.g:217:2: ( ( rule__Policy__Group__0 ) )
            // InternalDelegation.g:218:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalDelegation.g:219:3: ( rule__Policy__Group__0 )
            // InternalDelegation.g:219:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleRule"
    // InternalDelegation.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDelegation.g:229:1: ( ruleRule EOF )
            // InternalDelegation.g:230:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDelegation.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDelegation.g:242:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDelegation.g:242:2: ( ( rule__Rule__Group__0 ) )
            // InternalDelegation.g:243:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDelegation.g:244:3: ( rule__Rule__Group__0 )
            // InternalDelegation.g:244:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleModelFact"
    // InternalDelegation.g:253:1: entryRuleModelFact : ruleModelFact EOF ;
    public final void entryRuleModelFact() throws RecognitionException {
        try {
            // InternalDelegation.g:254:1: ( ruleModelFact EOF )
            // InternalDelegation.g:255:1: ruleModelFact EOF
            {
             before(grammarAccess.getModelFactRule()); 
            pushFollow(FOLLOW_1);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getModelFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelFact"


    // $ANTLR start "ruleModelFact"
    // InternalDelegation.g:262:1: ruleModelFact : ( ( rule__ModelFact__Alternatives ) ) ;
    public final void ruleModelFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:266:2: ( ( ( rule__ModelFact__Alternatives ) ) )
            // InternalDelegation.g:267:2: ( ( rule__ModelFact__Alternatives ) )
            {
            // InternalDelegation.g:267:2: ( ( rule__ModelFact__Alternatives ) )
            // InternalDelegation.g:268:3: ( rule__ModelFact__Alternatives )
            {
             before(grammarAccess.getModelFactAccess().getAlternatives()); 
            // InternalDelegation.g:269:3: ( rule__ModelFact__Alternatives )
            // InternalDelegation.g:269:4: rule__ModelFact__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelFact__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelFactAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelFact"


    // $ANTLR start "entryRuleObjectFact"
    // InternalDelegation.g:278:1: entryRuleObjectFact : ruleObjectFact EOF ;
    public final void entryRuleObjectFact() throws RecognitionException {
        try {
            // InternalDelegation.g:279:1: ( ruleObjectFact EOF )
            // InternalDelegation.g:280:1: ruleObjectFact EOF
            {
             before(grammarAccess.getObjectFactRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectFact();

            state._fsp--;

             after(grammarAccess.getObjectFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectFact"


    // $ANTLR start "ruleObjectFact"
    // InternalDelegation.g:287:1: ruleObjectFact : ( ( rule__ObjectFact__Group__0 ) ) ;
    public final void ruleObjectFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:291:2: ( ( ( rule__ObjectFact__Group__0 ) ) )
            // InternalDelegation.g:292:2: ( ( rule__ObjectFact__Group__0 ) )
            {
            // InternalDelegation.g:292:2: ( ( rule__ObjectFact__Group__0 ) )
            // InternalDelegation.g:293:3: ( rule__ObjectFact__Group__0 )
            {
             before(grammarAccess.getObjectFactAccess().getGroup()); 
            // InternalDelegation.g:294:3: ( rule__ObjectFact__Group__0 )
            // InternalDelegation.g:294:4: rule__ObjectFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectFact"


    // $ANTLR start "entryRuleReferenceFact"
    // InternalDelegation.g:303:1: entryRuleReferenceFact : ruleReferenceFact EOF ;
    public final void entryRuleReferenceFact() throws RecognitionException {
        try {
            // InternalDelegation.g:304:1: ( ruleReferenceFact EOF )
            // InternalDelegation.g:305:1: ruleReferenceFact EOF
            {
             before(grammarAccess.getReferenceFactRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceFact();

            state._fsp--;

             after(grammarAccess.getReferenceFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceFact"


    // $ANTLR start "ruleReferenceFact"
    // InternalDelegation.g:312:1: ruleReferenceFact : ( ( rule__ReferenceFact__Group__0 ) ) ;
    public final void ruleReferenceFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:316:2: ( ( ( rule__ReferenceFact__Group__0 ) ) )
            // InternalDelegation.g:317:2: ( ( rule__ReferenceFact__Group__0 ) )
            {
            // InternalDelegation.g:317:2: ( ( rule__ReferenceFact__Group__0 ) )
            // InternalDelegation.g:318:3: ( rule__ReferenceFact__Group__0 )
            {
             before(grammarAccess.getReferenceFactAccess().getGroup()); 
            // InternalDelegation.g:319:3: ( rule__ReferenceFact__Group__0 )
            // InternalDelegation.g:319:4: rule__ReferenceFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceFact"


    // $ANTLR start "entryRuleAttributeFact"
    // InternalDelegation.g:328:1: entryRuleAttributeFact : ruleAttributeFact EOF ;
    public final void entryRuleAttributeFact() throws RecognitionException {
        try {
            // InternalDelegation.g:329:1: ( ruleAttributeFact EOF )
            // InternalDelegation.g:330:1: ruleAttributeFact EOF
            {
             before(grammarAccess.getAttributeFactRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeFact();

            state._fsp--;

             after(grammarAccess.getAttributeFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeFact"


    // $ANTLR start "ruleAttributeFact"
    // InternalDelegation.g:337:1: ruleAttributeFact : ( ( rule__AttributeFact__Group__0 ) ) ;
    public final void ruleAttributeFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:341:2: ( ( ( rule__AttributeFact__Group__0 ) ) )
            // InternalDelegation.g:342:2: ( ( rule__AttributeFact__Group__0 ) )
            {
            // InternalDelegation.g:342:2: ( ( rule__AttributeFact__Group__0 ) )
            // InternalDelegation.g:343:3: ( rule__AttributeFact__Group__0 )
            {
             before(grammarAccess.getAttributeFactAccess().getGroup()); 
            // InternalDelegation.g:344:3: ( rule__AttributeFact__Group__0 )
            // InternalDelegation.g:344:4: rule__AttributeFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeFact"


    // $ANTLR start "entryRuleBinding"
    // InternalDelegation.g:353:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalDelegation.g:354:1: ( ruleBinding EOF )
            // InternalDelegation.g:355:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalDelegation.g:362:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:366:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalDelegation.g:367:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalDelegation.g:367:2: ( ( rule__Binding__Group__0 ) )
            // InternalDelegation.g:368:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalDelegation.g:369:3: ( rule__Binding__Group__0 )
            // InternalDelegation.g:369:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBind"
    // InternalDelegation.g:378:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalDelegation.g:379:1: ( ruleBind EOF )
            // InternalDelegation.g:380:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalDelegation.g:387:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:391:2: ( ( ( rule__Bind__Alternatives ) ) )
            // InternalDelegation.g:392:2: ( ( rule__Bind__Alternatives ) )
            {
            // InternalDelegation.g:392:2: ( ( rule__Bind__Alternatives ) )
            // InternalDelegation.g:393:3: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // InternalDelegation.g:394:3: ( rule__Bind__Alternatives )
            // InternalDelegation.g:394:4: rule__Bind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleEnumValue"
    // InternalDelegation.g:403:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // InternalDelegation.g:404:1: ( ruleEnumValue EOF )
            // InternalDelegation.g:405:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalDelegation.g:412:1: ruleEnumValue : ( ( rule__EnumValue__Group__0 ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:416:2: ( ( ( rule__EnumValue__Group__0 ) ) )
            // InternalDelegation.g:417:2: ( ( rule__EnumValue__Group__0 ) )
            {
            // InternalDelegation.g:417:2: ( ( rule__EnumValue__Group__0 ) )
            // InternalDelegation.g:418:3: ( rule__EnumValue__Group__0 )
            {
             before(grammarAccess.getEnumValueAccess().getGroup()); 
            // InternalDelegation.g:419:3: ( rule__EnumValue__Group__0 )
            // InternalDelegation.g:419:4: rule__EnumValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalDelegation.g:428:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:432:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalDelegation.g:433:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalDelegation.g:433:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalDelegation.g:434:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalDelegation.g:435:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalDelegation.g:435:4: rule__AccessibilityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessibilityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessibilityLevel"


    // $ANTLR start "ruleOperationType"
    // InternalDelegation.g:444:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:448:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalDelegation.g:449:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalDelegation.g:449:2: ( ( rule__OperationType__Alternatives ) )
            // InternalDelegation.g:450:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalDelegation.g:451:3: ( rule__OperationType__Alternatives )
            // InternalDelegation.g:451:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleResolutionType"
    // InternalDelegation.g:460:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:464:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalDelegation.g:465:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalDelegation.g:465:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalDelegation.g:466:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalDelegation.g:467:3: ( rule__ResolutionType__Alternatives )
            // InternalDelegation.g:467:4: rule__ResolutionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResolutionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResolutionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResolutionType"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalDelegation.g:475:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:479:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDelegation.g:480:2: ( ruleUser )
                    {
                    // InternalDelegation.g:480:2: ( ruleUser )
                    // InternalDelegation.g:481:3: ruleUser
                    {
                     before(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:486:2: ( ruleGroup )
                    {
                    // InternalDelegation.g:486:2: ( ruleGroup )
                    // InternalDelegation.g:487:3: ruleGroup
                    {
                     before(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__ModelFact__Alternatives"
    // InternalDelegation.g:496:1: rule__ModelFact__Alternatives : ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) );
    public final void rule__ModelFact__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:500:1: ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 44:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDelegation.g:501:2: ( ruleObjectFact )
                    {
                    // InternalDelegation.g:501:2: ( ruleObjectFact )
                    // InternalDelegation.g:502:3: ruleObjectFact
                    {
                     before(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:507:2: ( ruleReferenceFact )
                    {
                    // InternalDelegation.g:507:2: ( ruleReferenceFact )
                    // InternalDelegation.g:508:3: ruleReferenceFact
                    {
                     before(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:513:2: ( ruleAttributeFact )
                    {
                    // InternalDelegation.g:513:2: ( ruleAttributeFact )
                    // InternalDelegation.g:514:3: ruleAttributeFact
                    {
                     before(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFact__Alternatives"


    // $ANTLR start "rule__Bind__Alternatives"
    // InternalDelegation.g:523:1: rule__Bind__Alternatives : ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) | ( ( rule__Bind__ValueEnumLiteralAssignment_2 ) ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:527:1: ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) | ( ( rule__Bind__ValueEnumLiteralAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case 48:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDelegation.g:528:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    {
                    // InternalDelegation.g:528:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    // InternalDelegation.g:529:3: ( rule__Bind__ValueStringAssignment_0 )
                    {
                     before(grammarAccess.getBindAccess().getValueStringAssignment_0()); 
                    // InternalDelegation.g:530:3: ( rule__Bind__ValueStringAssignment_0 )
                    // InternalDelegation.g:530:4: rule__Bind__ValueStringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__ValueStringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindAccess().getValueStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:534:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    {
                    // InternalDelegation.g:534:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    // InternalDelegation.g:535:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    {
                     before(grammarAccess.getBindAccess().getValueIntegerAssignment_1()); 
                    // InternalDelegation.g:536:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    // InternalDelegation.g:536:4: rule__Bind__ValueIntegerAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__ValueIntegerAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindAccess().getValueIntegerAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:540:2: ( ( rule__Bind__ValueEnumLiteralAssignment_2 ) )
                    {
                    // InternalDelegation.g:540:2: ( ( rule__Bind__ValueEnumLiteralAssignment_2 ) )
                    // InternalDelegation.g:541:3: ( rule__Bind__ValueEnumLiteralAssignment_2 )
                    {
                     before(grammarAccess.getBindAccess().getValueEnumLiteralAssignment_2()); 
                    // InternalDelegation.g:542:3: ( rule__Bind__ValueEnumLiteralAssignment_2 )
                    // InternalDelegation.g:542:4: rule__Bind__ValueEnumLiteralAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__ValueEnumLiteralAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindAccess().getValueEnumLiteralAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Alternatives"


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalDelegation.g:550:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'deny' ) ) | ( ( 'obfuscate' ) ) | ( ( 'allow' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:554:1: ( ( ( 'deny' ) ) | ( ( 'obfuscate' ) ) | ( ( 'allow' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDelegation.g:555:2: ( ( 'deny' ) )
                    {
                    // InternalDelegation.g:555:2: ( ( 'deny' ) )
                    // InternalDelegation.g:556:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_0()); 
                    // InternalDelegation.g:557:3: ( 'deny' )
                    // InternalDelegation.g:557:4: 'deny'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:561:2: ( ( 'obfuscate' ) )
                    {
                    // InternalDelegation.g:561:2: ( ( 'obfuscate' ) )
                    // InternalDelegation.g:562:3: ( 'obfuscate' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 
                    // InternalDelegation.g:563:3: ( 'obfuscate' )
                    // InternalDelegation.g:563:4: 'obfuscate'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:567:2: ( ( 'allow' ) )
                    {
                    // InternalDelegation.g:567:2: ( ( 'allow' ) )
                    // InternalDelegation.g:568:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_2()); 
                    // InternalDelegation.g:569:3: ( 'allow' )
                    // InternalDelegation.g:569:4: 'allow'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessibilityLevel__Alternatives"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalDelegation.g:577:1: rule__OperationType__Alternatives : ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:581:1: ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDelegation.g:582:2: ( ( 'unset' ) )
                    {
                    // InternalDelegation.g:582:2: ( ( 'unset' ) )
                    // InternalDelegation.g:583:3: ( 'unset' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 
                    // InternalDelegation.g:584:3: ( 'unset' )
                    // InternalDelegation.g:584:4: 'unset'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:588:2: ( ( 'R' ) )
                    {
                    // InternalDelegation.g:588:2: ( ( 'R' ) )
                    // InternalDelegation.g:589:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 
                    // InternalDelegation.g:590:3: ( 'R' )
                    // InternalDelegation.g:590:4: 'R'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:594:2: ( ( 'W' ) )
                    {
                    // InternalDelegation.g:594:2: ( ( 'W' ) )
                    // InternalDelegation.g:595:3: ( 'W' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 
                    // InternalDelegation.g:596:3: ( 'W' )
                    // InternalDelegation.g:596:4: 'W'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDelegation.g:600:2: ( ( 'RW' ) )
                    {
                    // InternalDelegation.g:600:2: ( ( 'RW' ) )
                    // InternalDelegation.g:601:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3()); 
                    // InternalDelegation.g:602:3: ( 'RW' )
                    // InternalDelegation.g:602:4: 'RW'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__ResolutionType__Alternatives"
    // InternalDelegation.g:610:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:614:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDelegation.g:615:2: ( ( 'restrictive' ) )
                    {
                    // InternalDelegation.g:615:2: ( ( 'restrictive' ) )
                    // InternalDelegation.g:616:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalDelegation.g:617:3: ( 'restrictive' )
                    // InternalDelegation.g:617:4: 'restrictive'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:621:2: ( ( 'permissive' ) )
                    {
                    // InternalDelegation.g:621:2: ( ( 'permissive' ) )
                    // InternalDelegation.g:622:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalDelegation.g:623:3: ( 'permissive' )
                    // InternalDelegation.g:623:4: 'permissive'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResolutionType__Alternatives"


    // $ANTLR start "rule__DelegationModel__Group__0"
    // InternalDelegation.g:631:1: rule__DelegationModel__Group__0 : rule__DelegationModel__Group__0__Impl rule__DelegationModel__Group__1 ;
    public final void rule__DelegationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:635:1: ( rule__DelegationModel__Group__0__Impl rule__DelegationModel__Group__1 )
            // InternalDelegation.g:636:2: rule__DelegationModel__Group__0__Impl rule__DelegationModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DelegationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__0"


    // $ANTLR start "rule__DelegationModel__Group__0__Impl"
    // InternalDelegation.g:643:1: rule__DelegationModel__Group__0__Impl : ( ( rule__DelegationModel__ImportAssignment_0 ) ) ;
    public final void rule__DelegationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:647:1: ( ( ( rule__DelegationModel__ImportAssignment_0 ) ) )
            // InternalDelegation.g:648:1: ( ( rule__DelegationModel__ImportAssignment_0 ) )
            {
            // InternalDelegation.g:648:1: ( ( rule__DelegationModel__ImportAssignment_0 ) )
            // InternalDelegation.g:649:2: ( rule__DelegationModel__ImportAssignment_0 )
            {
             before(grammarAccess.getDelegationModelAccess().getImportAssignment_0()); 
            // InternalDelegation.g:650:2: ( rule__DelegationModel__ImportAssignment_0 )
            // InternalDelegation.g:650:3: rule__DelegationModel__ImportAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DelegationModel__ImportAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationModelAccess().getImportAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__0__Impl"


    // $ANTLR start "rule__DelegationModel__Group__1"
    // InternalDelegation.g:658:1: rule__DelegationModel__Group__1 : rule__DelegationModel__Group__1__Impl ;
    public final void rule__DelegationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:662:1: ( rule__DelegationModel__Group__1__Impl )
            // InternalDelegation.g:663:2: rule__DelegationModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__1"


    // $ANTLR start "rule__DelegationModel__Group__1__Impl"
    // InternalDelegation.g:669:1: rule__DelegationModel__Group__1__Impl : ( ( rule__DelegationModel__DelegationsAssignment_1 )* ) ;
    public final void rule__DelegationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:673:1: ( ( ( rule__DelegationModel__DelegationsAssignment_1 )* ) )
            // InternalDelegation.g:674:1: ( ( rule__DelegationModel__DelegationsAssignment_1 )* )
            {
            // InternalDelegation.g:674:1: ( ( rule__DelegationModel__DelegationsAssignment_1 )* )
            // InternalDelegation.g:675:2: ( rule__DelegationModel__DelegationsAssignment_1 )*
            {
             before(grammarAccess.getDelegationModelAccess().getDelegationsAssignment_1()); 
            // InternalDelegation.g:676:2: ( rule__DelegationModel__DelegationsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDelegation.g:676:3: rule__DelegationModel__DelegationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DelegationModel__DelegationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDelegationModelAccess().getDelegationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__1__Impl"


    // $ANTLR start "rule__Delegation__Group__0"
    // InternalDelegation.g:685:1: rule__Delegation__Group__0 : rule__Delegation__Group__0__Impl rule__Delegation__Group__1 ;
    public final void rule__Delegation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:689:1: ( rule__Delegation__Group__0__Impl rule__Delegation__Group__1 )
            // InternalDelegation.g:690:2: rule__Delegation__Group__0__Impl rule__Delegation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Delegation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__0"


    // $ANTLR start "rule__Delegation__Group__0__Impl"
    // InternalDelegation.g:697:1: rule__Delegation__Group__0__Impl : ( 'delegation' ) ;
    public final void rule__Delegation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:701:1: ( ( 'delegation' ) )
            // InternalDelegation.g:702:1: ( 'delegation' )
            {
            // InternalDelegation.g:702:1: ( 'delegation' )
            // InternalDelegation.g:703:2: 'delegation'
            {
             before(grammarAccess.getDelegationAccess().getDelegationKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getDelegationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__0__Impl"


    // $ANTLR start "rule__Delegation__Group__1"
    // InternalDelegation.g:712:1: rule__Delegation__Group__1 : rule__Delegation__Group__1__Impl rule__Delegation__Group__2 ;
    public final void rule__Delegation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:716:1: ( rule__Delegation__Group__1__Impl rule__Delegation__Group__2 )
            // InternalDelegation.g:717:2: rule__Delegation__Group__1__Impl rule__Delegation__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Delegation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__1"


    // $ANTLR start "rule__Delegation__Group__1__Impl"
    // InternalDelegation.g:724:1: rule__Delegation__Group__1__Impl : ( ( rule__Delegation__NameAssignment_1 ) ) ;
    public final void rule__Delegation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:728:1: ( ( ( rule__Delegation__NameAssignment_1 ) ) )
            // InternalDelegation.g:729:1: ( ( rule__Delegation__NameAssignment_1 ) )
            {
            // InternalDelegation.g:729:1: ( ( rule__Delegation__NameAssignment_1 ) )
            // InternalDelegation.g:730:2: ( rule__Delegation__NameAssignment_1 )
            {
             before(grammarAccess.getDelegationAccess().getNameAssignment_1()); 
            // InternalDelegation.g:731:2: ( rule__Delegation__NameAssignment_1 )
            // InternalDelegation.g:731:3: rule__Delegation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__1__Impl"


    // $ANTLR start "rule__Delegation__Group__2"
    // InternalDelegation.g:739:1: rule__Delegation__Group__2 : rule__Delegation__Group__2__Impl rule__Delegation__Group__3 ;
    public final void rule__Delegation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:743:1: ( rule__Delegation__Group__2__Impl rule__Delegation__Group__3 )
            // InternalDelegation.g:744:2: rule__Delegation__Group__2__Impl rule__Delegation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Delegation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__2"


    // $ANTLR start "rule__Delegation__Group__2__Impl"
    // InternalDelegation.g:751:1: rule__Delegation__Group__2__Impl : ( 'from' ) ;
    public final void rule__Delegation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:755:1: ( ( 'from' ) )
            // InternalDelegation.g:756:1: ( 'from' )
            {
            // InternalDelegation.g:756:1: ( 'from' )
            // InternalDelegation.g:757:2: 'from'
            {
             before(grammarAccess.getDelegationAccess().getFromKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__2__Impl"


    // $ANTLR start "rule__Delegation__Group__3"
    // InternalDelegation.g:766:1: rule__Delegation__Group__3 : rule__Delegation__Group__3__Impl rule__Delegation__Group__4 ;
    public final void rule__Delegation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:770:1: ( rule__Delegation__Group__3__Impl rule__Delegation__Group__4 )
            // InternalDelegation.g:771:2: rule__Delegation__Group__3__Impl rule__Delegation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Delegation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__3"


    // $ANTLR start "rule__Delegation__Group__3__Impl"
    // InternalDelegation.g:778:1: rule__Delegation__Group__3__Impl : ( ( rule__Delegation__SourceAssignment_3 ) ) ;
    public final void rule__Delegation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:782:1: ( ( ( rule__Delegation__SourceAssignment_3 ) ) )
            // InternalDelegation.g:783:1: ( ( rule__Delegation__SourceAssignment_3 ) )
            {
            // InternalDelegation.g:783:1: ( ( rule__Delegation__SourceAssignment_3 ) )
            // InternalDelegation.g:784:2: ( rule__Delegation__SourceAssignment_3 )
            {
             before(grammarAccess.getDelegationAccess().getSourceAssignment_3()); 
            // InternalDelegation.g:785:2: ( rule__Delegation__SourceAssignment_3 )
            // InternalDelegation.g:785:3: rule__Delegation__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__3__Impl"


    // $ANTLR start "rule__Delegation__Group__4"
    // InternalDelegation.g:793:1: rule__Delegation__Group__4 : rule__Delegation__Group__4__Impl rule__Delegation__Group__5 ;
    public final void rule__Delegation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:797:1: ( rule__Delegation__Group__4__Impl rule__Delegation__Group__5 )
            // InternalDelegation.g:798:2: rule__Delegation__Group__4__Impl rule__Delegation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Delegation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__4"


    // $ANTLR start "rule__Delegation__Group__4__Impl"
    // InternalDelegation.g:805:1: rule__Delegation__Group__4__Impl : ( ( rule__Delegation__AccessAssignment_4 ) ) ;
    public final void rule__Delegation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:809:1: ( ( ( rule__Delegation__AccessAssignment_4 ) ) )
            // InternalDelegation.g:810:1: ( ( rule__Delegation__AccessAssignment_4 ) )
            {
            // InternalDelegation.g:810:1: ( ( rule__Delegation__AccessAssignment_4 ) )
            // InternalDelegation.g:811:2: ( rule__Delegation__AccessAssignment_4 )
            {
             before(grammarAccess.getDelegationAccess().getAccessAssignment_4()); 
            // InternalDelegation.g:812:2: ( rule__Delegation__AccessAssignment_4 )
            // InternalDelegation.g:812:3: rule__Delegation__AccessAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__AccessAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getAccessAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__4__Impl"


    // $ANTLR start "rule__Delegation__Group__5"
    // InternalDelegation.g:820:1: rule__Delegation__Group__5 : rule__Delegation__Group__5__Impl rule__Delegation__Group__6 ;
    public final void rule__Delegation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:824:1: ( rule__Delegation__Group__5__Impl rule__Delegation__Group__6 )
            // InternalDelegation.g:825:2: rule__Delegation__Group__5__Impl rule__Delegation__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Delegation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__5"


    // $ANTLR start "rule__Delegation__Group__5__Impl"
    // InternalDelegation.g:832:1: rule__Delegation__Group__5__Impl : ( ( rule__Delegation__OperationAssignment_5 )? ) ;
    public final void rule__Delegation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:836:1: ( ( ( rule__Delegation__OperationAssignment_5 )? ) )
            // InternalDelegation.g:837:1: ( ( rule__Delegation__OperationAssignment_5 )? )
            {
            // InternalDelegation.g:837:1: ( ( rule__Delegation__OperationAssignment_5 )? )
            // InternalDelegation.g:838:2: ( rule__Delegation__OperationAssignment_5 )?
            {
             before(grammarAccess.getDelegationAccess().getOperationAssignment_5()); 
            // InternalDelegation.g:839:2: ( rule__Delegation__OperationAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=17)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDelegation.g:839:3: rule__Delegation__OperationAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Delegation__OperationAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelegationAccess().getOperationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__5__Impl"


    // $ANTLR start "rule__Delegation__Group__6"
    // InternalDelegation.g:847:1: rule__Delegation__Group__6 : rule__Delegation__Group__6__Impl rule__Delegation__Group__7 ;
    public final void rule__Delegation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:851:1: ( rule__Delegation__Group__6__Impl rule__Delegation__Group__7 )
            // InternalDelegation.g:852:2: rule__Delegation__Group__6__Impl rule__Delegation__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Delegation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__6"


    // $ANTLR start "rule__Delegation__Group__6__Impl"
    // InternalDelegation.g:859:1: rule__Delegation__Group__6__Impl : ( 'to' ) ;
    public final void rule__Delegation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:863:1: ( ( 'to' ) )
            // InternalDelegation.g:864:1: ( 'to' )
            {
            // InternalDelegation.g:864:1: ( 'to' )
            // InternalDelegation.g:865:2: 'to'
            {
             before(grammarAccess.getDelegationAccess().getToKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__6__Impl"


    // $ANTLR start "rule__Delegation__Group__7"
    // InternalDelegation.g:874:1: rule__Delegation__Group__7 : rule__Delegation__Group__7__Impl rule__Delegation__Group__8 ;
    public final void rule__Delegation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:878:1: ( rule__Delegation__Group__7__Impl rule__Delegation__Group__8 )
            // InternalDelegation.g:879:2: rule__Delegation__Group__7__Impl rule__Delegation__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Delegation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__7"


    // $ANTLR start "rule__Delegation__Group__7__Impl"
    // InternalDelegation.g:886:1: rule__Delegation__Group__7__Impl : ( ( rule__Delegation__TargetsAssignment_7 ) ) ;
    public final void rule__Delegation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:890:1: ( ( ( rule__Delegation__TargetsAssignment_7 ) ) )
            // InternalDelegation.g:891:1: ( ( rule__Delegation__TargetsAssignment_7 ) )
            {
            // InternalDelegation.g:891:1: ( ( rule__Delegation__TargetsAssignment_7 ) )
            // InternalDelegation.g:892:2: ( rule__Delegation__TargetsAssignment_7 )
            {
             before(grammarAccess.getDelegationAccess().getTargetsAssignment_7()); 
            // InternalDelegation.g:893:2: ( rule__Delegation__TargetsAssignment_7 )
            // InternalDelegation.g:893:3: rule__Delegation__TargetsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__TargetsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getTargetsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__7__Impl"


    // $ANTLR start "rule__Delegation__Group__8"
    // InternalDelegation.g:901:1: rule__Delegation__Group__8 : rule__Delegation__Group__8__Impl rule__Delegation__Group__9 ;
    public final void rule__Delegation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:905:1: ( rule__Delegation__Group__8__Impl rule__Delegation__Group__9 )
            // InternalDelegation.g:906:2: rule__Delegation__Group__8__Impl rule__Delegation__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Delegation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__8"


    // $ANTLR start "rule__Delegation__Group__8__Impl"
    // InternalDelegation.g:913:1: rule__Delegation__Group__8__Impl : ( ( rule__Delegation__Group_8__0 )* ) ;
    public final void rule__Delegation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:917:1: ( ( ( rule__Delegation__Group_8__0 )* ) )
            // InternalDelegation.g:918:1: ( ( rule__Delegation__Group_8__0 )* )
            {
            // InternalDelegation.g:918:1: ( ( rule__Delegation__Group_8__0 )* )
            // InternalDelegation.g:919:2: ( rule__Delegation__Group_8__0 )*
            {
             before(grammarAccess.getDelegationAccess().getGroup_8()); 
            // InternalDelegation.g:920:2: ( rule__Delegation__Group_8__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDelegation.g:920:3: rule__Delegation__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Delegation__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDelegationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__8__Impl"


    // $ANTLR start "rule__Delegation__Group__9"
    // InternalDelegation.g:928:1: rule__Delegation__Group__9 : rule__Delegation__Group__9__Impl rule__Delegation__Group__10 ;
    public final void rule__Delegation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:932:1: ( rule__Delegation__Group__9__Impl rule__Delegation__Group__10 )
            // InternalDelegation.g:933:2: rule__Delegation__Group__9__Impl rule__Delegation__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Delegation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__9"


    // $ANTLR start "rule__Delegation__Group__9__Impl"
    // InternalDelegation.g:940:1: rule__Delegation__Group__9__Impl : ( '{' ) ;
    public final void rule__Delegation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:944:1: ( ( '{' ) )
            // InternalDelegation.g:945:1: ( '{' )
            {
            // InternalDelegation.g:945:1: ( '{' )
            // InternalDelegation.g:946:2: '{'
            {
             before(grammarAccess.getDelegationAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__9__Impl"


    // $ANTLR start "rule__Delegation__Group__10"
    // InternalDelegation.g:955:1: rule__Delegation__Group__10 : rule__Delegation__Group__10__Impl rule__Delegation__Group__11 ;
    public final void rule__Delegation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:959:1: ( rule__Delegation__Group__10__Impl rule__Delegation__Group__11 )
            // InternalDelegation.g:960:2: rule__Delegation__Group__10__Impl rule__Delegation__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Delegation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__10"


    // $ANTLR start "rule__Delegation__Group__10__Impl"
    // InternalDelegation.g:967:1: rule__Delegation__Group__10__Impl : ( 'from' ) ;
    public final void rule__Delegation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:971:1: ( ( 'from' ) )
            // InternalDelegation.g:972:1: ( 'from' )
            {
            // InternalDelegation.g:972:1: ( 'from' )
            // InternalDelegation.g:973:2: 'from'
            {
             before(grammarAccess.getDelegationAccess().getFromKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getFromKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__10__Impl"


    // $ANTLR start "rule__Delegation__Group__11"
    // InternalDelegation.g:982:1: rule__Delegation__Group__11 : rule__Delegation__Group__11__Impl rule__Delegation__Group__12 ;
    public final void rule__Delegation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:986:1: ( rule__Delegation__Group__11__Impl rule__Delegation__Group__12 )
            // InternalDelegation.g:987:2: rule__Delegation__Group__11__Impl rule__Delegation__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Delegation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__11"


    // $ANTLR start "rule__Delegation__Group__11__Impl"
    // InternalDelegation.g:994:1: rule__Delegation__Group__11__Impl : ( 'query' ) ;
    public final void rule__Delegation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:998:1: ( ( 'query' ) )
            // InternalDelegation.g:999:1: ( 'query' )
            {
            // InternalDelegation.g:999:1: ( 'query' )
            // InternalDelegation.g:1000:2: 'query'
            {
             before(grammarAccess.getDelegationAccess().getQueryKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getQueryKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__11__Impl"


    // $ANTLR start "rule__Delegation__Group__12"
    // InternalDelegation.g:1009:1: rule__Delegation__Group__12 : rule__Delegation__Group__12__Impl rule__Delegation__Group__13 ;
    public final void rule__Delegation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1013:1: ( rule__Delegation__Group__12__Impl rule__Delegation__Group__13 )
            // InternalDelegation.g:1014:2: rule__Delegation__Group__12__Impl rule__Delegation__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Delegation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__12"


    // $ANTLR start "rule__Delegation__Group__12__Impl"
    // InternalDelegation.g:1021:1: rule__Delegation__Group__12__Impl : ( ( rule__Delegation__PatternAssignment_12 ) ) ;
    public final void rule__Delegation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1025:1: ( ( ( rule__Delegation__PatternAssignment_12 ) ) )
            // InternalDelegation.g:1026:1: ( ( rule__Delegation__PatternAssignment_12 ) )
            {
            // InternalDelegation.g:1026:1: ( ( rule__Delegation__PatternAssignment_12 ) )
            // InternalDelegation.g:1027:2: ( rule__Delegation__PatternAssignment_12 )
            {
             before(grammarAccess.getDelegationAccess().getPatternAssignment_12()); 
            // InternalDelegation.g:1028:2: ( rule__Delegation__PatternAssignment_12 )
            // InternalDelegation.g:1028:3: rule__Delegation__PatternAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__PatternAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getPatternAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__12__Impl"


    // $ANTLR start "rule__Delegation__Group__13"
    // InternalDelegation.g:1036:1: rule__Delegation__Group__13 : rule__Delegation__Group__13__Impl rule__Delegation__Group__14 ;
    public final void rule__Delegation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1040:1: ( rule__Delegation__Group__13__Impl rule__Delegation__Group__14 )
            // InternalDelegation.g:1041:2: rule__Delegation__Group__13__Impl rule__Delegation__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Delegation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__13"


    // $ANTLR start "rule__Delegation__Group__13__Impl"
    // InternalDelegation.g:1048:1: rule__Delegation__Group__13__Impl : ( 'select' ) ;
    public final void rule__Delegation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1052:1: ( ( 'select' ) )
            // InternalDelegation.g:1053:1: ( 'select' )
            {
            // InternalDelegation.g:1053:1: ( 'select' )
            // InternalDelegation.g:1054:2: 'select'
            {
             before(grammarAccess.getDelegationAccess().getSelectKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getSelectKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__13__Impl"


    // $ANTLR start "rule__Delegation__Group__14"
    // InternalDelegation.g:1063:1: rule__Delegation__Group__14 : rule__Delegation__Group__14__Impl rule__Delegation__Group__15 ;
    public final void rule__Delegation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1067:1: ( rule__Delegation__Group__14__Impl rule__Delegation__Group__15 )
            // InternalDelegation.g:1068:2: rule__Delegation__Group__14__Impl rule__Delegation__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Delegation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__14"


    // $ANTLR start "rule__Delegation__Group__14__Impl"
    // InternalDelegation.g:1075:1: rule__Delegation__Group__14__Impl : ( ( rule__Delegation__AssetAssignment_14 ) ) ;
    public final void rule__Delegation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1079:1: ( ( ( rule__Delegation__AssetAssignment_14 ) ) )
            // InternalDelegation.g:1080:1: ( ( rule__Delegation__AssetAssignment_14 ) )
            {
            // InternalDelegation.g:1080:1: ( ( rule__Delegation__AssetAssignment_14 ) )
            // InternalDelegation.g:1081:2: ( rule__Delegation__AssetAssignment_14 )
            {
             before(grammarAccess.getDelegationAccess().getAssetAssignment_14()); 
            // InternalDelegation.g:1082:2: ( rule__Delegation__AssetAssignment_14 )
            // InternalDelegation.g:1082:3: rule__Delegation__AssetAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__AssetAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getAssetAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__14__Impl"


    // $ANTLR start "rule__Delegation__Group__15"
    // InternalDelegation.g:1090:1: rule__Delegation__Group__15 : rule__Delegation__Group__15__Impl rule__Delegation__Group__16 ;
    public final void rule__Delegation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1094:1: ( rule__Delegation__Group__15__Impl rule__Delegation__Group__16 )
            // InternalDelegation.g:1095:2: rule__Delegation__Group__15__Impl rule__Delegation__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Delegation__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__15"


    // $ANTLR start "rule__Delegation__Group__15__Impl"
    // InternalDelegation.g:1102:1: rule__Delegation__Group__15__Impl : ( ( rule__Delegation__BindingsAssignment_15 )* ) ;
    public final void rule__Delegation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1106:1: ( ( ( rule__Delegation__BindingsAssignment_15 )* ) )
            // InternalDelegation.g:1107:1: ( ( rule__Delegation__BindingsAssignment_15 )* )
            {
            // InternalDelegation.g:1107:1: ( ( rule__Delegation__BindingsAssignment_15 )* )
            // InternalDelegation.g:1108:2: ( rule__Delegation__BindingsAssignment_15 )*
            {
             before(grammarAccess.getDelegationAccess().getBindingsAssignment_15()); 
            // InternalDelegation.g:1109:2: ( rule__Delegation__BindingsAssignment_15 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==45) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDelegation.g:1109:3: rule__Delegation__BindingsAssignment_15
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Delegation__BindingsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDelegationAccess().getBindingsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__15__Impl"


    // $ANTLR start "rule__Delegation__Group__16"
    // InternalDelegation.g:1117:1: rule__Delegation__Group__16 : rule__Delegation__Group__16__Impl ;
    public final void rule__Delegation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1121:1: ( rule__Delegation__Group__16__Impl )
            // InternalDelegation.g:1122:2: rule__Delegation__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__16"


    // $ANTLR start "rule__Delegation__Group__16__Impl"
    // InternalDelegation.g:1128:1: rule__Delegation__Group__16__Impl : ( '}' ) ;
    public final void rule__Delegation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1132:1: ( ( '}' ) )
            // InternalDelegation.g:1133:1: ( '}' )
            {
            // InternalDelegation.g:1133:1: ( '}' )
            // InternalDelegation.g:1134:2: '}'
            {
             before(grammarAccess.getDelegationAccess().getRightCurlyBracketKeyword_16()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group__16__Impl"


    // $ANTLR start "rule__Delegation__Group_8__0"
    // InternalDelegation.g:1144:1: rule__Delegation__Group_8__0 : rule__Delegation__Group_8__0__Impl rule__Delegation__Group_8__1 ;
    public final void rule__Delegation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1148:1: ( rule__Delegation__Group_8__0__Impl rule__Delegation__Group_8__1 )
            // InternalDelegation.g:1149:2: rule__Delegation__Group_8__0__Impl rule__Delegation__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Delegation__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delegation__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group_8__0"


    // $ANTLR start "rule__Delegation__Group_8__0__Impl"
    // InternalDelegation.g:1156:1: rule__Delegation__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Delegation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1160:1: ( ( ',' ) )
            // InternalDelegation.g:1161:1: ( ',' )
            {
            // InternalDelegation.g:1161:1: ( ',' )
            // InternalDelegation.g:1162:2: ','
            {
             before(grammarAccess.getDelegationAccess().getCommaKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group_8__0__Impl"


    // $ANTLR start "rule__Delegation__Group_8__1"
    // InternalDelegation.g:1171:1: rule__Delegation__Group_8__1 : rule__Delegation__Group_8__1__Impl ;
    public final void rule__Delegation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1175:1: ( rule__Delegation__Group_8__1__Impl )
            // InternalDelegation.g:1176:2: rule__Delegation__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group_8__1"


    // $ANTLR start "rule__Delegation__Group_8__1__Impl"
    // InternalDelegation.g:1182:1: rule__Delegation__Group_8__1__Impl : ( ( rule__Delegation__TargetsAssignment_8_1 ) ) ;
    public final void rule__Delegation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1186:1: ( ( ( rule__Delegation__TargetsAssignment_8_1 ) ) )
            // InternalDelegation.g:1187:1: ( ( rule__Delegation__TargetsAssignment_8_1 ) )
            {
            // InternalDelegation.g:1187:1: ( ( rule__Delegation__TargetsAssignment_8_1 ) )
            // InternalDelegation.g:1188:2: ( rule__Delegation__TargetsAssignment_8_1 )
            {
             before(grammarAccess.getDelegationAccess().getTargetsAssignment_8_1()); 
            // InternalDelegation.g:1189:2: ( rule__Delegation__TargetsAssignment_8_1 )
            // InternalDelegation.g:1189:3: rule__Delegation__TargetsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Delegation__TargetsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationAccess().getTargetsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__Group_8__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDelegation.g:1198:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1202:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDelegation.g:1203:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalDelegation.g:1210:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1214:1: ( ( 'import' ) )
            // InternalDelegation.g:1215:1: ( 'import' )
            {
            // InternalDelegation.g:1215:1: ( 'import' )
            // InternalDelegation.g:1216:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalDelegation.g:1225:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1229:1: ( rule__Import__Group__1__Impl )
            // InternalDelegation.g:1230:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalDelegation.g:1236:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1240:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalDelegation.g:1241:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalDelegation.g:1241:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalDelegation.g:1242:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalDelegation.g:1243:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalDelegation.g:1243:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalDelegation.g:1252:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1256:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalDelegation.g:1257:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalDelegation.g:1264:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1268:1: ( ( 'user' ) )
            // InternalDelegation.g:1269:1: ( 'user' )
            {
            // InternalDelegation.g:1269:1: ( 'user' )
            // InternalDelegation.g:1270:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalDelegation.g:1279:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1283:1: ( rule__User__Group__1__Impl )
            // InternalDelegation.g:1284:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalDelegation.g:1290:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1294:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalDelegation.g:1295:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalDelegation.g:1295:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalDelegation.g:1296:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalDelegation.g:1297:2: ( rule__User__NameAssignment_1 )
            // InternalDelegation.g:1297:3: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalDelegation.g:1306:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1310:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalDelegation.g:1311:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalDelegation.g:1318:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1322:1: ( ( 'group' ) )
            // InternalDelegation.g:1323:1: ( 'group' )
            {
            // InternalDelegation.g:1323:1: ( 'group' )
            // InternalDelegation.g:1324:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalDelegation.g:1333:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1337:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalDelegation.g:1338:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalDelegation.g:1345:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1349:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalDelegation.g:1350:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalDelegation.g:1350:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalDelegation.g:1351:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalDelegation.g:1352:2: ( rule__Group__NameAssignment_1 )
            // InternalDelegation.g:1352:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalDelegation.g:1360:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1364:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalDelegation.g:1365:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalDelegation.g:1372:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1376:1: ( ( '{' ) )
            // InternalDelegation.g:1377:1: ( '{' )
            {
            // InternalDelegation.g:1377:1: ( '{' )
            // InternalDelegation.g:1378:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalDelegation.g:1387:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1391:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalDelegation.g:1392:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalDelegation.g:1399:1: rule__Group__Group__3__Impl : ( ( rule__Group__RolesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1403:1: ( ( ( rule__Group__RolesAssignment_3 ) ) )
            // InternalDelegation.g:1404:1: ( ( rule__Group__RolesAssignment_3 ) )
            {
            // InternalDelegation.g:1404:1: ( ( rule__Group__RolesAssignment_3 ) )
            // InternalDelegation.g:1405:2: ( rule__Group__RolesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_3()); 
            // InternalDelegation.g:1406:2: ( rule__Group__RolesAssignment_3 )
            // InternalDelegation.g:1406:3: rule__Group__RolesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Group__RolesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRolesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalDelegation.g:1414:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1418:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalDelegation.g:1419:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalDelegation.g:1426:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1430:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // InternalDelegation.g:1431:1: ( ( rule__Group__Group_4__0 )* )
            {
            // InternalDelegation.g:1431:1: ( ( rule__Group__Group_4__0 )* )
            // InternalDelegation.g:1432:2: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // InternalDelegation.g:1433:2: ( rule__Group__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDelegation.g:1433:3: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalDelegation.g:1441:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1445:1: ( rule__Group__Group__5__Impl )
            // InternalDelegation.g:1446:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalDelegation.g:1452:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1456:1: ( ( '}' ) )
            // InternalDelegation.g:1457:1: ( '}' )
            {
            // InternalDelegation.g:1457:1: ( '}' )
            // InternalDelegation.g:1458:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // InternalDelegation.g:1468:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1472:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // InternalDelegation.g:1473:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // InternalDelegation.g:1480:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1484:1: ( ( ',' ) )
            // InternalDelegation.g:1485:1: ( ',' )
            {
            // InternalDelegation.g:1485:1: ( ',' )
            // InternalDelegation.g:1486:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // InternalDelegation.g:1495:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1499:1: ( rule__Group__Group_4__1__Impl )
            // InternalDelegation.g:1500:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // InternalDelegation.g:1506:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__RolesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1510:1: ( ( ( rule__Group__RolesAssignment_4_1 ) ) )
            // InternalDelegation.g:1511:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            {
            // InternalDelegation.g:1511:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            // InternalDelegation.g:1512:2: ( rule__Group__RolesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_4_1()); 
            // InternalDelegation.g:1513:2: ( rule__Group__RolesAssignment_4_1 )
            // InternalDelegation.g:1513:3: rule__Group__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__RolesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRolesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalDelegation.g:1522:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1526:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalDelegation.g:1527:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalDelegation.g:1534:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1538:1: ( ( 'policy' ) )
            // InternalDelegation.g:1539:1: ( 'policy' )
            {
            // InternalDelegation.g:1539:1: ( 'policy' )
            // InternalDelegation.g:1540:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalDelegation.g:1549:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1553:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalDelegation.g:1554:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalDelegation.g:1561:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1565:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalDelegation.g:1566:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalDelegation.g:1566:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalDelegation.g:1567:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalDelegation.g:1568:2: ( rule__Policy__NameAssignment_1 )
            // InternalDelegation.g:1568:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalDelegation.g:1576:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1580:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalDelegation.g:1581:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalDelegation.g:1588:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__AccessAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1592:1: ( ( ( rule__Policy__AccessAssignment_2 ) ) )
            // InternalDelegation.g:1593:1: ( ( rule__Policy__AccessAssignment_2 ) )
            {
            // InternalDelegation.g:1593:1: ( ( rule__Policy__AccessAssignment_2 ) )
            // InternalDelegation.g:1594:2: ( rule__Policy__AccessAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 
            // InternalDelegation.g:1595:2: ( rule__Policy__AccessAssignment_2 )
            // InternalDelegation.g:1595:3: rule__Policy__AccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Policy__AccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalDelegation.g:1603:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1607:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalDelegation.g:1608:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalDelegation.g:1615:1: rule__Policy__Group__3__Impl : ( 'by' ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1619:1: ( ( 'by' ) )
            // InternalDelegation.g:1620:1: ( 'by' )
            {
            // InternalDelegation.g:1620:1: ( 'by' )
            // InternalDelegation.g:1621:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getByKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalDelegation.g:1630:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1634:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalDelegation.g:1635:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalDelegation.g:1642:1: rule__Policy__Group__4__Impl : ( 'default' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1646:1: ( ( 'default' ) )
            // InternalDelegation.g:1647:1: ( 'default' )
            {
            // InternalDelegation.g:1647:1: ( 'default' )
            // InternalDelegation.g:1648:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getDefaultKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__5"
    // InternalDelegation.g:1657:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1661:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalDelegation.g:1662:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5"


    // $ANTLR start "rule__Policy__Group__5__Impl"
    // InternalDelegation.g:1669:1: rule__Policy__Group__5__Impl : ( '{' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1673:1: ( ( '{' ) )
            // InternalDelegation.g:1674:1: ( '{' )
            {
            // InternalDelegation.g:1674:1: ( '{' )
            // InternalDelegation.g:1675:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5__Impl"


    // $ANTLR start "rule__Policy__Group__6"
    // InternalDelegation.g:1684:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1688:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalDelegation.g:1689:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Policy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6"


    // $ANTLR start "rule__Policy__Group__6__Impl"
    // InternalDelegation.g:1696:1: rule__Policy__Group__6__Impl : ( ( rule__Policy__RulesAssignment_6 )* ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1700:1: ( ( ( rule__Policy__RulesAssignment_6 )* ) )
            // InternalDelegation.g:1701:1: ( ( rule__Policy__RulesAssignment_6 )* )
            {
            // InternalDelegation.g:1701:1: ( ( rule__Policy__RulesAssignment_6 )* )
            // InternalDelegation.g:1702:2: ( rule__Policy__RulesAssignment_6 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_6()); 
            // InternalDelegation.g:1703:2: ( rule__Policy__RulesAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDelegation.g:1703:3: rule__Policy__RulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Policy__RulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6__Impl"


    // $ANTLR start "rule__Policy__Group__7"
    // InternalDelegation.g:1711:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1715:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalDelegation.g:1716:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Policy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7"


    // $ANTLR start "rule__Policy__Group__7__Impl"
    // InternalDelegation.g:1723:1: rule__Policy__Group__7__Impl : ( '}' ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1727:1: ( ( '}' ) )
            // InternalDelegation.g:1728:1: ( '}' )
            {
            // InternalDelegation.g:1728:1: ( '}' )
            // InternalDelegation.g:1729:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7__Impl"


    // $ANTLR start "rule__Policy__Group__8"
    // InternalDelegation.g:1738:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl rule__Policy__Group__9 ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1742:1: ( rule__Policy__Group__8__Impl rule__Policy__Group__9 )
            // InternalDelegation.g:1743:2: rule__Policy__Group__8__Impl rule__Policy__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Policy__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__8"


    // $ANTLR start "rule__Policy__Group__8__Impl"
    // InternalDelegation.g:1750:1: rule__Policy__Group__8__Impl : ( 'with' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1754:1: ( ( 'with' ) )
            // InternalDelegation.g:1755:1: ( 'with' )
            {
            // InternalDelegation.g:1755:1: ( 'with' )
            // InternalDelegation.g:1756:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getWithKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__8__Impl"


    // $ANTLR start "rule__Policy__Group__9"
    // InternalDelegation.g:1765:1: rule__Policy__Group__9 : rule__Policy__Group__9__Impl rule__Policy__Group__10 ;
    public final void rule__Policy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1769:1: ( rule__Policy__Group__9__Impl rule__Policy__Group__10 )
            // InternalDelegation.g:1770:2: rule__Policy__Group__9__Impl rule__Policy__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Policy__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__9"


    // $ANTLR start "rule__Policy__Group__9__Impl"
    // InternalDelegation.g:1777:1: rule__Policy__Group__9__Impl : ( ( rule__Policy__ResolutionAssignment_9 ) ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1781:1: ( ( ( rule__Policy__ResolutionAssignment_9 ) ) )
            // InternalDelegation.g:1782:1: ( ( rule__Policy__ResolutionAssignment_9 ) )
            {
            // InternalDelegation.g:1782:1: ( ( rule__Policy__ResolutionAssignment_9 ) )
            // InternalDelegation.g:1783:2: ( rule__Policy__ResolutionAssignment_9 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_9()); 
            // InternalDelegation.g:1784:2: ( rule__Policy__ResolutionAssignment_9 )
            // InternalDelegation.g:1784:3: rule__Policy__ResolutionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ResolutionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getResolutionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__9__Impl"


    // $ANTLR start "rule__Policy__Group__10"
    // InternalDelegation.g:1792:1: rule__Policy__Group__10 : rule__Policy__Group__10__Impl ;
    public final void rule__Policy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1796:1: ( rule__Policy__Group__10__Impl )
            // InternalDelegation.g:1797:2: rule__Policy__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__10"


    // $ANTLR start "rule__Policy__Group__10__Impl"
    // InternalDelegation.g:1803:1: rule__Policy__Group__10__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1807:1: ( ( 'resolution' ) )
            // InternalDelegation.g:1808:1: ( 'resolution' )
            {
            // InternalDelegation.g:1808:1: ( 'resolution' )
            // InternalDelegation.g:1809:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getResolutionKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__10__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalDelegation.g:1819:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1823:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDelegation.g:1824:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalDelegation.g:1831:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1835:1: ( ( 'rule' ) )
            // InternalDelegation.g:1836:1: ( 'rule' )
            {
            // InternalDelegation.g:1836:1: ( 'rule' )
            // InternalDelegation.g:1837:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalDelegation.g:1846:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1850:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDelegation.g:1851:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalDelegation.g:1858:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1862:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalDelegation.g:1863:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalDelegation.g:1863:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalDelegation.g:1864:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalDelegation.g:1865:2: ( rule__Rule__NameAssignment_1 )
            // InternalDelegation.g:1865:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalDelegation.g:1873:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1877:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDelegation.g:1878:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalDelegation.g:1885:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AccessAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1889:1: ( ( ( rule__Rule__AccessAssignment_2 ) ) )
            // InternalDelegation.g:1890:1: ( ( rule__Rule__AccessAssignment_2 ) )
            {
            // InternalDelegation.g:1890:1: ( ( rule__Rule__AccessAssignment_2 ) )
            // InternalDelegation.g:1891:2: ( rule__Rule__AccessAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAccessAssignment_2()); 
            // InternalDelegation.g:1892:2: ( rule__Rule__AccessAssignment_2 )
            // InternalDelegation.g:1892:3: rule__Rule__AccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAccessAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalDelegation.g:1900:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1904:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDelegation.g:1905:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalDelegation.g:1912:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__OperationAssignment_3 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1916:1: ( ( ( rule__Rule__OperationAssignment_3 )? ) )
            // InternalDelegation.g:1917:1: ( ( rule__Rule__OperationAssignment_3 )? )
            {
            // InternalDelegation.g:1917:1: ( ( rule__Rule__OperationAssignment_3 )? )
            // InternalDelegation.g:1918:2: ( rule__Rule__OperationAssignment_3 )?
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_3()); 
            // InternalDelegation.g:1919:2: ( rule__Rule__OperationAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=14 && LA13_0<=17)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDelegation.g:1919:3: rule__Rule__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__OperationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getOperationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalDelegation.g:1927:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1931:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalDelegation.g:1932:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalDelegation.g:1939:1: rule__Rule__Group__4__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1943:1: ( ( 'to' ) )
            // InternalDelegation.g:1944:1: ( 'to' )
            {
            // InternalDelegation.g:1944:1: ( 'to' )
            // InternalDelegation.g:1945:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalDelegation.g:1954:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1958:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalDelegation.g:1959:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalDelegation.g:1966:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__RolesAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1970:1: ( ( ( rule__Rule__RolesAssignment_5 ) ) )
            // InternalDelegation.g:1971:1: ( ( rule__Rule__RolesAssignment_5 ) )
            {
            // InternalDelegation.g:1971:1: ( ( rule__Rule__RolesAssignment_5 ) )
            // InternalDelegation.g:1972:2: ( rule__Rule__RolesAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5()); 
            // InternalDelegation.g:1973:2: ( rule__Rule__RolesAssignment_5 )
            // InternalDelegation.g:1973:3: rule__Rule__RolesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RolesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalDelegation.g:1981:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1985:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalDelegation.g:1986:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalDelegation.g:1993:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1997:1: ( ( ( rule__Rule__Group_6__0 )* ) )
            // InternalDelegation.g:1998:1: ( ( rule__Rule__Group_6__0 )* )
            {
            // InternalDelegation.g:1998:1: ( ( rule__Rule__Group_6__0 )* )
            // InternalDelegation.g:1999:2: ( rule__Rule__Group_6__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalDelegation.g:2000:2: ( rule__Rule__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDelegation.g:2000:3: rule__Rule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Rule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalDelegation.g:2008:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2012:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalDelegation.g:2013:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalDelegation.g:2020:1: rule__Rule__Group__7__Impl : ( '{' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2024:1: ( ( '{' ) )
            // InternalDelegation.g:2025:1: ( '{' )
            {
            // InternalDelegation.g:2025:1: ( '{' )
            // InternalDelegation.g:2026:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalDelegation.g:2035:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2039:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalDelegation.g:2040:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalDelegation.g:2047:1: rule__Rule__Group__8__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2051:1: ( ( 'from' ) )
            // InternalDelegation.g:2052:1: ( 'from' )
            {
            // InternalDelegation.g:2052:1: ( 'from' )
            // InternalDelegation.g:2053:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalDelegation.g:2062:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2066:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalDelegation.g:2067:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalDelegation.g:2074:1: rule__Rule__Group__9__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2078:1: ( ( 'query' ) )
            // InternalDelegation.g:2079:1: ( 'query' )
            {
            // InternalDelegation.g:2079:1: ( 'query' )
            // InternalDelegation.g:2080:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group__10"
    // InternalDelegation.g:2089:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2093:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalDelegation.g:2094:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // InternalDelegation.g:2101:1: rule__Rule__Group__10__Impl : ( ( rule__Rule__PatternAssignment_10 ) ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2105:1: ( ( ( rule__Rule__PatternAssignment_10 ) ) )
            // InternalDelegation.g:2106:1: ( ( rule__Rule__PatternAssignment_10 ) )
            {
            // InternalDelegation.g:2106:1: ( ( rule__Rule__PatternAssignment_10 ) )
            // InternalDelegation.g:2107:2: ( rule__Rule__PatternAssignment_10 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_10()); 
            // InternalDelegation.g:2108:2: ( rule__Rule__PatternAssignment_10 )
            // InternalDelegation.g:2108:3: rule__Rule__PatternAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PatternAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__Rule__Group__11"
    // InternalDelegation.g:2116:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2120:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalDelegation.g:2121:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__11"


    // $ANTLR start "rule__Rule__Group__11__Impl"
    // InternalDelegation.g:2128:1: rule__Rule__Group__11__Impl : ( 'select' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2132:1: ( ( 'select' ) )
            // InternalDelegation.g:2133:1: ( 'select' )
            {
            // InternalDelegation.g:2133:1: ( 'select' )
            // InternalDelegation.g:2134:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_11()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__12"
    // InternalDelegation.g:2143:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2147:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalDelegation.g:2148:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__12"


    // $ANTLR start "rule__Rule__Group__12__Impl"
    // InternalDelegation.g:2155:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__AssetAssignment_12 ) ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2159:1: ( ( ( rule__Rule__AssetAssignment_12 ) ) )
            // InternalDelegation.g:2160:1: ( ( rule__Rule__AssetAssignment_12 ) )
            {
            // InternalDelegation.g:2160:1: ( ( rule__Rule__AssetAssignment_12 ) )
            // InternalDelegation.g:2161:2: ( rule__Rule__AssetAssignment_12 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_12()); 
            // InternalDelegation.g:2162:2: ( rule__Rule__AssetAssignment_12 )
            // InternalDelegation.g:2162:3: rule__Rule__AssetAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssetAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssetAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__12__Impl"


    // $ANTLR start "rule__Rule__Group__13"
    // InternalDelegation.g:2170:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2174:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalDelegation.g:2175:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__13"


    // $ANTLR start "rule__Rule__Group__13__Impl"
    // InternalDelegation.g:2182:1: rule__Rule__Group__13__Impl : ( ( rule__Rule__BindingsAssignment_13 )* ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2186:1: ( ( ( rule__Rule__BindingsAssignment_13 )* ) )
            // InternalDelegation.g:2187:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            {
            // InternalDelegation.g:2187:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            // InternalDelegation.g:2188:2: ( rule__Rule__BindingsAssignment_13 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 
            // InternalDelegation.g:2189:2: ( rule__Rule__BindingsAssignment_13 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDelegation.g:2189:3: rule__Rule__BindingsAssignment_13
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Rule__BindingsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__13__Impl"


    // $ANTLR start "rule__Rule__Group__14"
    // InternalDelegation.g:2197:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl rule__Rule__Group__15 ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2201:1: ( rule__Rule__Group__14__Impl rule__Rule__Group__15 )
            // InternalDelegation.g:2202:2: rule__Rule__Group__14__Impl rule__Rule__Group__15
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__14"


    // $ANTLR start "rule__Rule__Group__14__Impl"
    // InternalDelegation.g:2209:1: rule__Rule__Group__14__Impl : ( '}' ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2213:1: ( ( '}' ) )
            // InternalDelegation.g:2214:1: ( '}' )
            {
            // InternalDelegation.g:2214:1: ( '}' )
            // InternalDelegation.g:2215:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__14__Impl"


    // $ANTLR start "rule__Rule__Group__15"
    // InternalDelegation.g:2224:1: rule__Rule__Group__15 : rule__Rule__Group__15__Impl ;
    public final void rule__Rule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2228:1: ( rule__Rule__Group__15__Impl )
            // InternalDelegation.g:2229:2: rule__Rule__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__15"


    // $ANTLR start "rule__Rule__Group__15__Impl"
    // InternalDelegation.g:2235:1: rule__Rule__Group__15__Impl : ( ( rule__Rule__Group_15__0 )? ) ;
    public final void rule__Rule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2239:1: ( ( ( rule__Rule__Group_15__0 )? ) )
            // InternalDelegation.g:2240:1: ( ( rule__Rule__Group_15__0 )? )
            {
            // InternalDelegation.g:2240:1: ( ( rule__Rule__Group_15__0 )? )
            // InternalDelegation.g:2241:2: ( rule__Rule__Group_15__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_15()); 
            // InternalDelegation.g:2242:2: ( rule__Rule__Group_15__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDelegation.g:2242:3: rule__Rule__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__15__Impl"


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalDelegation.g:2251:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2255:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalDelegation.g:2256:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalDelegation.g:2263:1: rule__Rule__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2267:1: ( ( ',' ) )
            // InternalDelegation.g:2268:1: ( ',' )
            {
            // InternalDelegation.g:2268:1: ( ',' )
            // InternalDelegation.g:2269:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalDelegation.g:2278:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2282:1: ( rule__Rule__Group_6__1__Impl )
            // InternalDelegation.g:2283:2: rule__Rule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalDelegation.g:2289:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__RolesAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2293:1: ( ( ( rule__Rule__RolesAssignment_6_1 ) ) )
            // InternalDelegation.g:2294:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            {
            // InternalDelegation.g:2294:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            // InternalDelegation.g:2295:2: ( rule__Rule__RolesAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 
            // InternalDelegation.g:2296:2: ( rule__Rule__RolesAssignment_6_1 )
            // InternalDelegation.g:2296:3: rule__Rule__RolesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RolesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Rule__Group_15__0"
    // InternalDelegation.g:2305:1: rule__Rule__Group_15__0 : rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 ;
    public final void rule__Rule__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2309:1: ( rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 )
            // InternalDelegation.g:2310:2: rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1
            {
            pushFollow(FOLLOW_26);
            rule__Rule__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_15__0"


    // $ANTLR start "rule__Rule__Group_15__0__Impl"
    // InternalDelegation.g:2317:1: rule__Rule__Group_15__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2321:1: ( ( 'with' ) )
            // InternalDelegation.g:2322:1: ( 'with' )
            {
            // InternalDelegation.g:2322:1: ( 'with' )
            // InternalDelegation.g:2323:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_15__0__Impl"


    // $ANTLR start "rule__Rule__Group_15__1"
    // InternalDelegation.g:2332:1: rule__Rule__Group_15__1 : rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 ;
    public final void rule__Rule__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2336:1: ( rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 )
            // InternalDelegation.g:2337:2: rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2
            {
            pushFollow(FOLLOW_27);
            rule__Rule__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_15__1"


    // $ANTLR start "rule__Rule__Group_15__1__Impl"
    // InternalDelegation.g:2344:1: rule__Rule__Group_15__1__Impl : ( ( rule__Rule__PriorityAssignment_15_1 ) ) ;
    public final void rule__Rule__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2348:1: ( ( ( rule__Rule__PriorityAssignment_15_1 ) ) )
            // InternalDelegation.g:2349:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            {
            // InternalDelegation.g:2349:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            // InternalDelegation.g:2350:2: ( rule__Rule__PriorityAssignment_15_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 
            // InternalDelegation.g:2351:2: ( rule__Rule__PriorityAssignment_15_1 )
            // InternalDelegation.g:2351:3: rule__Rule__PriorityAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PriorityAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_15__1__Impl"


    // $ANTLR start "rule__Rule__Group_15__2"
    // InternalDelegation.g:2359:1: rule__Rule__Group_15__2 : rule__Rule__Group_15__2__Impl ;
    public final void rule__Rule__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2363:1: ( rule__Rule__Group_15__2__Impl )
            // InternalDelegation.g:2364:2: rule__Rule__Group_15__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_15__2"


    // $ANTLR start "rule__Rule__Group_15__2__Impl"
    // InternalDelegation.g:2370:1: rule__Rule__Group_15__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2374:1: ( ( 'priority' ) )
            // InternalDelegation.g:2375:1: ( 'priority' )
            {
            // InternalDelegation.g:2375:1: ( 'priority' )
            // InternalDelegation.g:2376:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_15__2__Impl"


    // $ANTLR start "rule__ObjectFact__Group__0"
    // InternalDelegation.g:2386:1: rule__ObjectFact__Group__0 : rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 ;
    public final void rule__ObjectFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2390:1: ( rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 )
            // InternalDelegation.g:2391:2: rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ObjectFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__0"


    // $ANTLR start "rule__ObjectFact__Group__0__Impl"
    // InternalDelegation.g:2398:1: rule__ObjectFact__Group__0__Impl : ( 'obj' ) ;
    public final void rule__ObjectFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2402:1: ( ( 'obj' ) )
            // InternalDelegation.g:2403:1: ( 'obj' )
            {
            // InternalDelegation.g:2403:1: ( 'obj' )
            // InternalDelegation.g:2404:2: 'obj'
            {
             before(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__0__Impl"


    // $ANTLR start "rule__ObjectFact__Group__1"
    // InternalDelegation.g:2413:1: rule__ObjectFact__Group__1 : rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 ;
    public final void rule__ObjectFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2417:1: ( rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 )
            // InternalDelegation.g:2418:2: rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ObjectFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__1"


    // $ANTLR start "rule__ObjectFact__Group__1__Impl"
    // InternalDelegation.g:2425:1: rule__ObjectFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ObjectFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2429:1: ( ( '(' ) )
            // InternalDelegation.g:2430:1: ( '(' )
            {
            // InternalDelegation.g:2430:1: ( '(' )
            // InternalDelegation.g:2431:2: '('
            {
             before(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__1__Impl"


    // $ANTLR start "rule__ObjectFact__Group__2"
    // InternalDelegation.g:2440:1: rule__ObjectFact__Group__2 : rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 ;
    public final void rule__ObjectFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2444:1: ( rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 )
            // InternalDelegation.g:2445:2: rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ObjectFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__2"


    // $ANTLR start "rule__ObjectFact__Group__2__Impl"
    // InternalDelegation.g:2452:1: rule__ObjectFact__Group__2__Impl : ( ( rule__ObjectFact__VariableAssignment_2 ) ) ;
    public final void rule__ObjectFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2456:1: ( ( ( rule__ObjectFact__VariableAssignment_2 ) ) )
            // InternalDelegation.g:2457:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            {
            // InternalDelegation.g:2457:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            // InternalDelegation.g:2458:2: ( rule__ObjectFact__VariableAssignment_2 )
            {
             before(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 
            // InternalDelegation.g:2459:2: ( rule__ObjectFact__VariableAssignment_2 )
            // InternalDelegation.g:2459:3: rule__ObjectFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__2__Impl"


    // $ANTLR start "rule__ObjectFact__Group__3"
    // InternalDelegation.g:2467:1: rule__ObjectFact__Group__3 : rule__ObjectFact__Group__3__Impl ;
    public final void rule__ObjectFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2471:1: ( rule__ObjectFact__Group__3__Impl )
            // InternalDelegation.g:2472:2: rule__ObjectFact__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__3"


    // $ANTLR start "rule__ObjectFact__Group__3__Impl"
    // InternalDelegation.g:2478:1: rule__ObjectFact__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2482:1: ( ( ')' ) )
            // InternalDelegation.g:2483:1: ( ')' )
            {
            // InternalDelegation.g:2483:1: ( ')' )
            // InternalDelegation.g:2484:2: ')'
            {
             before(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__0"
    // InternalDelegation.g:2494:1: rule__ReferenceFact__Group__0 : rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 ;
    public final void rule__ReferenceFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2498:1: ( rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 )
            // InternalDelegation.g:2499:2: rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ReferenceFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__0"


    // $ANTLR start "rule__ReferenceFact__Group__0__Impl"
    // InternalDelegation.g:2506:1: rule__ReferenceFact__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2510:1: ( ( 'ref' ) )
            // InternalDelegation.g:2511:1: ( 'ref' )
            {
            // InternalDelegation.g:2511:1: ( 'ref' )
            // InternalDelegation.g:2512:2: 'ref'
            {
             before(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__0__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__1"
    // InternalDelegation.g:2521:1: rule__ReferenceFact__Group__1 : rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 ;
    public final void rule__ReferenceFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2525:1: ( rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 )
            // InternalDelegation.g:2526:2: rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__1"


    // $ANTLR start "rule__ReferenceFact__Group__1__Impl"
    // InternalDelegation.g:2533:1: rule__ReferenceFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ReferenceFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2537:1: ( ( '(' ) )
            // InternalDelegation.g:2538:1: ( '(' )
            {
            // InternalDelegation.g:2538:1: ( '(' )
            // InternalDelegation.g:2539:2: '('
            {
             before(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__1__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__2"
    // InternalDelegation.g:2548:1: rule__ReferenceFact__Group__2 : rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 ;
    public final void rule__ReferenceFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2552:1: ( rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 )
            // InternalDelegation.g:2553:2: rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ReferenceFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__2"


    // $ANTLR start "rule__ReferenceFact__Group__2__Impl"
    // InternalDelegation.g:2560:1: rule__ReferenceFact__Group__2__Impl : ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) ;
    public final void rule__ReferenceFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2564:1: ( ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) )
            // InternalDelegation.g:2565:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            {
            // InternalDelegation.g:2565:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            // InternalDelegation.g:2566:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 
            // InternalDelegation.g:2567:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            // InternalDelegation.g:2567:3: rule__ReferenceFact__SourceVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__SourceVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__2__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__3"
    // InternalDelegation.g:2575:1: rule__ReferenceFact__Group__3 : rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 ;
    public final void rule__ReferenceFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2579:1: ( rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 )
            // InternalDelegation.g:2580:2: rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__3"


    // $ANTLR start "rule__ReferenceFact__Group__3__Impl"
    // InternalDelegation.g:2587:1: rule__ReferenceFact__Group__3__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2591:1: ( ( '->' ) )
            // InternalDelegation.g:2592:1: ( '->' )
            {
            // InternalDelegation.g:2592:1: ( '->' )
            // InternalDelegation.g:2593:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__4"
    // InternalDelegation.g:2602:1: rule__ReferenceFact__Group__4 : rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 ;
    public final void rule__ReferenceFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2606:1: ( rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 )
            // InternalDelegation.g:2607:2: rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__ReferenceFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__4"


    // $ANTLR start "rule__ReferenceFact__Group__4__Impl"
    // InternalDelegation.g:2614:1: rule__ReferenceFact__Group__4__Impl : ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) ;
    public final void rule__ReferenceFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2618:1: ( ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) )
            // InternalDelegation.g:2619:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            {
            // InternalDelegation.g:2619:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            // InternalDelegation.g:2620:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 
            // InternalDelegation.g:2621:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            // InternalDelegation.g:2621:3: rule__ReferenceFact__TargetVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__TargetVarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__4__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__5"
    // InternalDelegation.g:2629:1: rule__ReferenceFact__Group__5 : rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 ;
    public final void rule__ReferenceFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2633:1: ( rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 )
            // InternalDelegation.g:2634:2: rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__5"


    // $ANTLR start "rule__ReferenceFact__Group__5__Impl"
    // InternalDelegation.g:2641:1: rule__ReferenceFact__Group__5__Impl : ( ':' ) ;
    public final void rule__ReferenceFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2645:1: ( ( ':' ) )
            // InternalDelegation.g:2646:1: ( ':' )
            {
            // InternalDelegation.g:2646:1: ( ':' )
            // InternalDelegation.g:2647:2: ':'
            {
             before(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__5__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__6"
    // InternalDelegation.g:2656:1: rule__ReferenceFact__Group__6 : rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 ;
    public final void rule__ReferenceFact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2660:1: ( rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 )
            // InternalDelegation.g:2661:2: rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__ReferenceFact__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__6"


    // $ANTLR start "rule__ReferenceFact__Group__6__Impl"
    // InternalDelegation.g:2668:1: rule__ReferenceFact__Group__6__Impl : ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) ;
    public final void rule__ReferenceFact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2672:1: ( ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) )
            // InternalDelegation.g:2673:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            {
            // InternalDelegation.g:2673:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            // InternalDelegation.g:2674:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 
            // InternalDelegation.g:2675:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            // InternalDelegation.g:2675:3: rule__ReferenceFact__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__ReferenceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__6__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__7"
    // InternalDelegation.g:2683:1: rule__ReferenceFact__Group__7 : rule__ReferenceFact__Group__7__Impl ;
    public final void rule__ReferenceFact__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2687:1: ( rule__ReferenceFact__Group__7__Impl )
            // InternalDelegation.g:2688:2: rule__ReferenceFact__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__7"


    // $ANTLR start "rule__ReferenceFact__Group__7__Impl"
    // InternalDelegation.g:2694:1: rule__ReferenceFact__Group__7__Impl : ( ')' ) ;
    public final void rule__ReferenceFact__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2698:1: ( ( ')' ) )
            // InternalDelegation.g:2699:1: ( ')' )
            {
            // InternalDelegation.g:2699:1: ( ')' )
            // InternalDelegation.g:2700:2: ')'
            {
             before(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__7__Impl"


    // $ANTLR start "rule__AttributeFact__Group__0"
    // InternalDelegation.g:2710:1: rule__AttributeFact__Group__0 : rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 ;
    public final void rule__AttributeFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2714:1: ( rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 )
            // InternalDelegation.g:2715:2: rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AttributeFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__0"


    // $ANTLR start "rule__AttributeFact__Group__0__Impl"
    // InternalDelegation.g:2722:1: rule__AttributeFact__Group__0__Impl : ( 'attr' ) ;
    public final void rule__AttributeFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2726:1: ( ( 'attr' ) )
            // InternalDelegation.g:2727:1: ( 'attr' )
            {
            // InternalDelegation.g:2727:1: ( 'attr' )
            // InternalDelegation.g:2728:2: 'attr'
            {
             before(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__0__Impl"


    // $ANTLR start "rule__AttributeFact__Group__1"
    // InternalDelegation.g:2737:1: rule__AttributeFact__Group__1 : rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 ;
    public final void rule__AttributeFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2741:1: ( rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 )
            // InternalDelegation.g:2742:2: rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AttributeFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__1"


    // $ANTLR start "rule__AttributeFact__Group__1__Impl"
    // InternalDelegation.g:2749:1: rule__AttributeFact__Group__1__Impl : ( '(' ) ;
    public final void rule__AttributeFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2753:1: ( ( '(' ) )
            // InternalDelegation.g:2754:1: ( '(' )
            {
            // InternalDelegation.g:2754:1: ( '(' )
            // InternalDelegation.g:2755:2: '('
            {
             before(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__1__Impl"


    // $ANTLR start "rule__AttributeFact__Group__2"
    // InternalDelegation.g:2764:1: rule__AttributeFact__Group__2 : rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 ;
    public final void rule__AttributeFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2768:1: ( rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 )
            // InternalDelegation.g:2769:2: rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__AttributeFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__2"


    // $ANTLR start "rule__AttributeFact__Group__2__Impl"
    // InternalDelegation.g:2776:1: rule__AttributeFact__Group__2__Impl : ( ( rule__AttributeFact__VariableAssignment_2 ) ) ;
    public final void rule__AttributeFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2780:1: ( ( ( rule__AttributeFact__VariableAssignment_2 ) ) )
            // InternalDelegation.g:2781:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            {
            // InternalDelegation.g:2781:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            // InternalDelegation.g:2782:2: ( rule__AttributeFact__VariableAssignment_2 )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 
            // InternalDelegation.g:2783:2: ( rule__AttributeFact__VariableAssignment_2 )
            // InternalDelegation.g:2783:3: rule__AttributeFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__2__Impl"


    // $ANTLR start "rule__AttributeFact__Group__3"
    // InternalDelegation.g:2791:1: rule__AttributeFact__Group__3 : rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 ;
    public final void rule__AttributeFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2795:1: ( rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 )
            // InternalDelegation.g:2796:2: rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AttributeFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__3"


    // $ANTLR start "rule__AttributeFact__Group__3__Impl"
    // InternalDelegation.g:2803:1: rule__AttributeFact__Group__3__Impl : ( ':' ) ;
    public final void rule__AttributeFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2807:1: ( ( ':' ) )
            // InternalDelegation.g:2808:1: ( ':' )
            {
            // InternalDelegation.g:2808:1: ( ':' )
            // InternalDelegation.g:2809:2: ':'
            {
             before(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__3__Impl"


    // $ANTLR start "rule__AttributeFact__Group__4"
    // InternalDelegation.g:2818:1: rule__AttributeFact__Group__4 : rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 ;
    public final void rule__AttributeFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2822:1: ( rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 )
            // InternalDelegation.g:2823:2: rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__AttributeFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__4"


    // $ANTLR start "rule__AttributeFact__Group__4__Impl"
    // InternalDelegation.g:2830:1: rule__AttributeFact__Group__4__Impl : ( ( rule__AttributeFact__AttributeAssignment_4 ) ) ;
    public final void rule__AttributeFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2834:1: ( ( ( rule__AttributeFact__AttributeAssignment_4 ) ) )
            // InternalDelegation.g:2835:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            {
            // InternalDelegation.g:2835:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            // InternalDelegation.g:2836:2: ( rule__AttributeFact__AttributeAssignment_4 )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 
            // InternalDelegation.g:2837:2: ( rule__AttributeFact__AttributeAssignment_4 )
            // InternalDelegation.g:2837:3: rule__AttributeFact__AttributeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__AttributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__4__Impl"


    // $ANTLR start "rule__AttributeFact__Group__5"
    // InternalDelegation.g:2845:1: rule__AttributeFact__Group__5 : rule__AttributeFact__Group__5__Impl ;
    public final void rule__AttributeFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2849:1: ( rule__AttributeFact__Group__5__Impl )
            // InternalDelegation.g:2850:2: rule__AttributeFact__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__5"


    // $ANTLR start "rule__AttributeFact__Group__5__Impl"
    // InternalDelegation.g:2856:1: rule__AttributeFact__Group__5__Impl : ( ')' ) ;
    public final void rule__AttributeFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2860:1: ( ( ')' ) )
            // InternalDelegation.g:2861:1: ( ')' )
            {
            // InternalDelegation.g:2861:1: ( ')' )
            // InternalDelegation.g:2862:2: ')'
            {
             before(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalDelegation.g:2872:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2876:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalDelegation.g:2877:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalDelegation.g:2884:1: rule__Binding__Group__0__Impl : ( 'where' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2888:1: ( ( 'where' ) )
            // InternalDelegation.g:2889:1: ( 'where' )
            {
            // InternalDelegation.g:2889:1: ( 'where' )
            // InternalDelegation.g:2890:2: 'where'
            {
             before(grammarAccess.getBindingAccess().getWhereKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getWhereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalDelegation.g:2899:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2903:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalDelegation.g:2904:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalDelegation.g:2911:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__VariableAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2915:1: ( ( ( rule__Binding__VariableAssignment_1 ) ) )
            // InternalDelegation.g:2916:1: ( ( rule__Binding__VariableAssignment_1 ) )
            {
            // InternalDelegation.g:2916:1: ( ( rule__Binding__VariableAssignment_1 ) )
            // InternalDelegation.g:2917:2: ( rule__Binding__VariableAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getVariableAssignment_1()); 
            // InternalDelegation.g:2918:2: ( rule__Binding__VariableAssignment_1 )
            // InternalDelegation.g:2918:3: rule__Binding__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalDelegation.g:2926:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2930:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalDelegation.g:2931:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalDelegation.g:2938:1: rule__Binding__Group__2__Impl : ( 'is' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2942:1: ( ( 'is' ) )
            // InternalDelegation.g:2943:1: ( 'is' )
            {
            // InternalDelegation.g:2943:1: ( 'is' )
            // InternalDelegation.g:2944:2: 'is'
            {
             before(grammarAccess.getBindingAccess().getIsKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalDelegation.g:2953:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2957:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalDelegation.g:2958:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalDelegation.g:2965:1: rule__Binding__Group__3__Impl : ( 'bound' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2969:1: ( ( 'bound' ) )
            // InternalDelegation.g:2970:1: ( 'bound' )
            {
            // InternalDelegation.g:2970:1: ( 'bound' )
            // InternalDelegation.g:2971:2: 'bound'
            {
             before(grammarAccess.getBindingAccess().getBoundKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBoundKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalDelegation.g:2980:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2984:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalDelegation.g:2985:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalDelegation.g:2992:1: rule__Binding__Group__4__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2996:1: ( ( 'to' ) )
            // InternalDelegation.g:2997:1: ( 'to' )
            {
            // InternalDelegation.g:2997:1: ( 'to' )
            // InternalDelegation.g:2998:2: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__5"
    // InternalDelegation.g:3007:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3011:1: ( rule__Binding__Group__5__Impl )
            // InternalDelegation.g:3012:2: rule__Binding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalDelegation.g:3018:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__BindAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3022:1: ( ( ( rule__Binding__BindAssignment_5 ) ) )
            // InternalDelegation.g:3023:1: ( ( rule__Binding__BindAssignment_5 ) )
            {
            // InternalDelegation.g:3023:1: ( ( rule__Binding__BindAssignment_5 ) )
            // InternalDelegation.g:3024:2: ( rule__Binding__BindAssignment_5 )
            {
             before(grammarAccess.getBindingAccess().getBindAssignment_5()); 
            // InternalDelegation.g:3025:2: ( rule__Binding__BindAssignment_5 )
            // InternalDelegation.g:3025:3: rule__Binding__BindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getBindAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__EnumValue__Group__0"
    // InternalDelegation.g:3034:1: rule__EnumValue__Group__0 : rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 ;
    public final void rule__EnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3038:1: ( rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 )
            // InternalDelegation.g:3039:2: rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0"


    // $ANTLR start "rule__EnumValue__Group__0__Impl"
    // InternalDelegation.g:3046:1: rule__EnumValue__Group__0__Impl : ( '::' ) ;
    public final void rule__EnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3050:1: ( ( '::' ) )
            // InternalDelegation.g:3051:1: ( '::' )
            {
            // InternalDelegation.g:3051:1: ( '::' )
            // InternalDelegation.g:3052:2: '::'
            {
             before(grammarAccess.getEnumValueAccess().getColonColonKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getColonColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0__Impl"


    // $ANTLR start "rule__EnumValue__Group__1"
    // InternalDelegation.g:3061:1: rule__EnumValue__Group__1 : rule__EnumValue__Group__1__Impl ;
    public final void rule__EnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3065:1: ( rule__EnumValue__Group__1__Impl )
            // InternalDelegation.g:3066:2: rule__EnumValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1"


    // $ANTLR start "rule__EnumValue__Group__1__Impl"
    // InternalDelegation.g:3072:1: rule__EnumValue__Group__1__Impl : ( ( rule__EnumValue__LiteralAssignment_1 ) ) ;
    public final void rule__EnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3076:1: ( ( ( rule__EnumValue__LiteralAssignment_1 ) ) )
            // InternalDelegation.g:3077:1: ( ( rule__EnumValue__LiteralAssignment_1 ) )
            {
            // InternalDelegation.g:3077:1: ( ( rule__EnumValue__LiteralAssignment_1 ) )
            // InternalDelegation.g:3078:2: ( rule__EnumValue__LiteralAssignment_1 )
            {
             before(grammarAccess.getEnumValueAccess().getLiteralAssignment_1()); 
            // InternalDelegation.g:3079:2: ( rule__EnumValue__LiteralAssignment_1 )
            // InternalDelegation.g:3079:3: rule__EnumValue__LiteralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__LiteralAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getLiteralAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1__Impl"


    // $ANTLR start "rule__DelegationModel__ImportAssignment_0"
    // InternalDelegation.g:3088:1: rule__DelegationModel__ImportAssignment_0 : ( ruleImport ) ;
    public final void rule__DelegationModel__ImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3092:1: ( ( ruleImport ) )
            // InternalDelegation.g:3093:2: ( ruleImport )
            {
            // InternalDelegation.g:3093:2: ( ruleImport )
            // InternalDelegation.g:3094:3: ruleImport
            {
             before(grammarAccess.getDelegationModelAccess().getImportImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDelegationModelAccess().getImportImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__ImportAssignment_0"


    // $ANTLR start "rule__DelegationModel__DelegationsAssignment_1"
    // InternalDelegation.g:3103:1: rule__DelegationModel__DelegationsAssignment_1 : ( ruleDelegation ) ;
    public final void rule__DelegationModel__DelegationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3107:1: ( ( ruleDelegation ) )
            // InternalDelegation.g:3108:2: ( ruleDelegation )
            {
            // InternalDelegation.g:3108:2: ( ruleDelegation )
            // InternalDelegation.g:3109:3: ruleDelegation
            {
             before(grammarAccess.getDelegationModelAccess().getDelegationsDelegationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelegation();

            state._fsp--;

             after(grammarAccess.getDelegationModelAccess().getDelegationsDelegationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__DelegationsAssignment_1"


    // $ANTLR start "rule__Delegation__NameAssignment_1"
    // InternalDelegation.g:3118:1: rule__Delegation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delegation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3122:1: ( ( RULE_ID ) )
            // InternalDelegation.g:3123:2: ( RULE_ID )
            {
            // InternalDelegation.g:3123:2: ( RULE_ID )
            // InternalDelegation.g:3124:3: RULE_ID
            {
             before(grammarAccess.getDelegationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__NameAssignment_1"


    // $ANTLR start "rule__Delegation__SourceAssignment_3"
    // InternalDelegation.g:3133:1: rule__Delegation__SourceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Delegation__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3137:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3138:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3138:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3139:3: ( RULE_ID )
            {
             before(grammarAccess.getDelegationAccess().getSourceUserCrossReference_3_0()); 
            // InternalDelegation.g:3140:3: ( RULE_ID )
            // InternalDelegation.g:3141:4: RULE_ID
            {
             before(grammarAccess.getDelegationAccess().getSourceUserIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getSourceUserIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDelegationAccess().getSourceUserCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__SourceAssignment_3"


    // $ANTLR start "rule__Delegation__AccessAssignment_4"
    // InternalDelegation.g:3152:1: rule__Delegation__AccessAssignment_4 : ( ruleAccessibilityLevel ) ;
    public final void rule__Delegation__AccessAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3156:1: ( ( ruleAccessibilityLevel ) )
            // InternalDelegation.g:3157:2: ( ruleAccessibilityLevel )
            {
            // InternalDelegation.g:3157:2: ( ruleAccessibilityLevel )
            // InternalDelegation.g:3158:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getDelegationAccess().getAccessAccessibilityLevelEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getDelegationAccess().getAccessAccessibilityLevelEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__AccessAssignment_4"


    // $ANTLR start "rule__Delegation__OperationAssignment_5"
    // InternalDelegation.g:3167:1: rule__Delegation__OperationAssignment_5 : ( ruleOperationType ) ;
    public final void rule__Delegation__OperationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3171:1: ( ( ruleOperationType ) )
            // InternalDelegation.g:3172:2: ( ruleOperationType )
            {
            // InternalDelegation.g:3172:2: ( ruleOperationType )
            // InternalDelegation.g:3173:3: ruleOperationType
            {
             before(grammarAccess.getDelegationAccess().getOperationOperationTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getDelegationAccess().getOperationOperationTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__OperationAssignment_5"


    // $ANTLR start "rule__Delegation__TargetsAssignment_7"
    // InternalDelegation.g:3182:1: rule__Delegation__TargetsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Delegation__TargetsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3186:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3187:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3187:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3188:3: ( RULE_ID )
            {
             before(grammarAccess.getDelegationAccess().getTargetsRoleCrossReference_7_0()); 
            // InternalDelegation.g:3189:3: ( RULE_ID )
            // InternalDelegation.g:3190:4: RULE_ID
            {
             before(grammarAccess.getDelegationAccess().getTargetsRoleIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getTargetsRoleIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getDelegationAccess().getTargetsRoleCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__TargetsAssignment_7"


    // $ANTLR start "rule__Delegation__TargetsAssignment_8_1"
    // InternalDelegation.g:3201:1: rule__Delegation__TargetsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Delegation__TargetsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3205:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3206:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3206:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3207:3: ( RULE_ID )
            {
             before(grammarAccess.getDelegationAccess().getTargetsRoleCrossReference_8_1_0()); 
            // InternalDelegation.g:3208:3: ( RULE_ID )
            // InternalDelegation.g:3209:4: RULE_ID
            {
             before(grammarAccess.getDelegationAccess().getTargetsRoleIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getTargetsRoleIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getDelegationAccess().getTargetsRoleCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__TargetsAssignment_8_1"


    // $ANTLR start "rule__Delegation__PatternAssignment_12"
    // InternalDelegation.g:3220:1: rule__Delegation__PatternAssignment_12 : ( ( RULE_STRING ) ) ;
    public final void rule__Delegation__PatternAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3224:1: ( ( ( RULE_STRING ) ) )
            // InternalDelegation.g:3225:2: ( ( RULE_STRING ) )
            {
            // InternalDelegation.g:3225:2: ( ( RULE_STRING ) )
            // InternalDelegation.g:3226:3: ( RULE_STRING )
            {
             before(grammarAccess.getDelegationAccess().getPatternPatternCrossReference_12_0()); 
            // InternalDelegation.g:3227:3: ( RULE_STRING )
            // InternalDelegation.g:3228:4: RULE_STRING
            {
             before(grammarAccess.getDelegationAccess().getPatternPatternSTRINGTerminalRuleCall_12_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDelegationAccess().getPatternPatternSTRINGTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getDelegationAccess().getPatternPatternCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__PatternAssignment_12"


    // $ANTLR start "rule__Delegation__AssetAssignment_14"
    // InternalDelegation.g:3239:1: rule__Delegation__AssetAssignment_14 : ( ruleModelFact ) ;
    public final void rule__Delegation__AssetAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3243:1: ( ( ruleModelFact ) )
            // InternalDelegation.g:3244:2: ( ruleModelFact )
            {
            // InternalDelegation.g:3244:2: ( ruleModelFact )
            // InternalDelegation.g:3245:3: ruleModelFact
            {
             before(grammarAccess.getDelegationAccess().getAssetModelFactParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getDelegationAccess().getAssetModelFactParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__AssetAssignment_14"


    // $ANTLR start "rule__Delegation__BindingsAssignment_15"
    // InternalDelegation.g:3254:1: rule__Delegation__BindingsAssignment_15 : ( ruleBinding ) ;
    public final void rule__Delegation__BindingsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3258:1: ( ( ruleBinding ) )
            // InternalDelegation.g:3259:2: ( ruleBinding )
            {
            // InternalDelegation.g:3259:2: ( ruleBinding )
            // InternalDelegation.g:3260:3: ruleBinding
            {
             before(grammarAccess.getDelegationAccess().getBindingsBindingParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getDelegationAccess().getBindingsBindingParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegation__BindingsAssignment_15"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalDelegation.g:3269:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3273:1: ( ( RULE_STRING ) )
            // InternalDelegation.g:3274:2: ( RULE_STRING )
            {
            // InternalDelegation.g:3274:2: ( RULE_STRING )
            // InternalDelegation.g:3275:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__User__NameAssignment_1"
    // InternalDelegation.g:3284:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3288:1: ( ( RULE_ID ) )
            // InternalDelegation.g:3289:2: ( RULE_ID )
            {
            // InternalDelegation.g:3289:2: ( RULE_ID )
            // InternalDelegation.g:3290:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // InternalDelegation.g:3299:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3303:1: ( ( RULE_ID ) )
            // InternalDelegation.g:3304:2: ( RULE_ID )
            {
            // InternalDelegation.g:3304:2: ( RULE_ID )
            // InternalDelegation.g:3305:3: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__RolesAssignment_3"
    // InternalDelegation.g:3314:1: rule__Group__RolesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3318:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3319:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3319:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3320:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0()); 
            // InternalDelegation.g:3321:3: ( RULE_ID )
            // InternalDelegation.g:3322:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RolesAssignment_3"


    // $ANTLR start "rule__Group__RolesAssignment_4_1"
    // InternalDelegation.g:3333:1: rule__Group__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3337:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3338:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3338:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3339:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalDelegation.g:3340:3: ( RULE_ID )
            // InternalDelegation.g:3341:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RolesAssignment_4_1"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalDelegation.g:3352:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3356:1: ( ( RULE_ID ) )
            // InternalDelegation.g:3357:2: ( RULE_ID )
            {
            // InternalDelegation.g:3357:2: ( RULE_ID )
            // InternalDelegation.g:3358:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__AccessAssignment_2"
    // InternalDelegation.g:3367:1: rule__Policy__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3371:1: ( ( ruleAccessibilityLevel ) )
            // InternalDelegation.g:3372:2: ( ruleAccessibilityLevel )
            {
            // InternalDelegation.g:3372:2: ( ruleAccessibilityLevel )
            // InternalDelegation.g:3373:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__AccessAssignment_2"


    // $ANTLR start "rule__Policy__RulesAssignment_6"
    // InternalDelegation.g:3382:1: rule__Policy__RulesAssignment_6 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3386:1: ( ( ruleRule ) )
            // InternalDelegation.g:3387:2: ( ruleRule )
            {
            // InternalDelegation.g:3387:2: ( ruleRule )
            // InternalDelegation.g:3388:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__RulesAssignment_6"


    // $ANTLR start "rule__Policy__ResolutionAssignment_9"
    // InternalDelegation.g:3397:1: rule__Policy__ResolutionAssignment_9 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3401:1: ( ( ruleResolutionType ) )
            // InternalDelegation.g:3402:2: ( ruleResolutionType )
            {
            // InternalDelegation.g:3402:2: ( ruleResolutionType )
            // InternalDelegation.g:3403:3: ruleResolutionType
            {
             before(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleResolutionType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__ResolutionAssignment_9"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalDelegation.g:3412:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3416:1: ( ( RULE_ID ) )
            // InternalDelegation.g:3417:2: ( RULE_ID )
            {
            // InternalDelegation.g:3417:2: ( RULE_ID )
            // InternalDelegation.g:3418:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__AccessAssignment_2"
    // InternalDelegation.g:3427:1: rule__Rule__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3431:1: ( ( ruleAccessibilityLevel ) )
            // InternalDelegation.g:3432:2: ( ruleAccessibilityLevel )
            {
            // InternalDelegation.g:3432:2: ( ruleAccessibilityLevel )
            // InternalDelegation.g:3433:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AccessAssignment_2"


    // $ANTLR start "rule__Rule__OperationAssignment_3"
    // InternalDelegation.g:3442:1: rule__Rule__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3446:1: ( ( ruleOperationType ) )
            // InternalDelegation.g:3447:2: ( ruleOperationType )
            {
            // InternalDelegation.g:3447:2: ( ruleOperationType )
            // InternalDelegation.g:3448:3: ruleOperationType
            {
             before(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OperationAssignment_3"


    // $ANTLR start "rule__Rule__RolesAssignment_5"
    // InternalDelegation.g:3457:1: rule__Rule__RolesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3461:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3462:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3462:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3463:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 
            // InternalDelegation.g:3464:3: ( RULE_ID )
            // InternalDelegation.g:3465:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RolesAssignment_5"


    // $ANTLR start "rule__Rule__RolesAssignment_6_1"
    // InternalDelegation.g:3476:1: rule__Rule__RolesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3480:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3481:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3481:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3482:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 
            // InternalDelegation.g:3483:3: ( RULE_ID )
            // InternalDelegation.g:3484:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RolesAssignment_6_1"


    // $ANTLR start "rule__Rule__PatternAssignment_10"
    // InternalDelegation.g:3495:1: rule__Rule__PatternAssignment_10 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3499:1: ( ( ( RULE_STRING ) ) )
            // InternalDelegation.g:3500:2: ( ( RULE_STRING ) )
            {
            // InternalDelegation.g:3500:2: ( ( RULE_STRING ) )
            // InternalDelegation.g:3501:3: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0()); 
            // InternalDelegation.g:3502:3: ( RULE_STRING )
            // InternalDelegation.g:3503:4: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_10_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PatternAssignment_10"


    // $ANTLR start "rule__Rule__AssetAssignment_12"
    // InternalDelegation.g:3514:1: rule__Rule__AssetAssignment_12 : ( ruleModelFact ) ;
    public final void rule__Rule__AssetAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3518:1: ( ( ruleModelFact ) )
            // InternalDelegation.g:3519:2: ( ruleModelFact )
            {
            // InternalDelegation.g:3519:2: ( ruleModelFact )
            // InternalDelegation.g:3520:3: ruleModelFact
            {
             before(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AssetAssignment_12"


    // $ANTLR start "rule__Rule__BindingsAssignment_13"
    // InternalDelegation.g:3529:1: rule__Rule__BindingsAssignment_13 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3533:1: ( ( ruleBinding ) )
            // InternalDelegation.g:3534:2: ( ruleBinding )
            {
            // InternalDelegation.g:3534:2: ( ruleBinding )
            // InternalDelegation.g:3535:3: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BindingsAssignment_13"


    // $ANTLR start "rule__Rule__PriorityAssignment_15_1"
    // InternalDelegation.g:3544:1: rule__Rule__PriorityAssignment_15_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3548:1: ( ( RULE_INT ) )
            // InternalDelegation.g:3549:2: ( RULE_INT )
            {
            // InternalDelegation.g:3549:2: ( RULE_INT )
            // InternalDelegation.g:3550:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PriorityAssignment_15_1"


    // $ANTLR start "rule__ObjectFact__VariableAssignment_2"
    // InternalDelegation.g:3559:1: rule__ObjectFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3563:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3564:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3564:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3565:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalDelegation.g:3566:3: ( RULE_ID )
            // InternalDelegation.g:3567:4: RULE_ID
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__VariableAssignment_2"


    // $ANTLR start "rule__ReferenceFact__SourceVarAssignment_2"
    // InternalDelegation.g:3578:1: rule__ReferenceFact__SourceVarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__SourceVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3582:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3583:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3583:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3584:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 
            // InternalDelegation.g:3585:3: ( RULE_ID )
            // InternalDelegation.g:3586:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__SourceVarAssignment_2"


    // $ANTLR start "rule__ReferenceFact__TargetVarAssignment_4"
    // InternalDelegation.g:3597:1: rule__ReferenceFact__TargetVarAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__TargetVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3601:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3602:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3602:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3603:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 
            // InternalDelegation.g:3604:3: ( RULE_ID )
            // InternalDelegation.g:3605:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__TargetVarAssignment_4"


    // $ANTLR start "rule__ReferenceFact__ReferenceAssignment_6"
    // InternalDelegation.g:3616:1: rule__ReferenceFact__ReferenceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3620:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3621:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3621:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3622:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 
            // InternalDelegation.g:3623:3: ( RULE_ID )
            // InternalDelegation.g:3624:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__ReferenceAssignment_6"


    // $ANTLR start "rule__AttributeFact__VariableAssignment_2"
    // InternalDelegation.g:3635:1: rule__AttributeFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3639:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3640:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3640:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3641:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalDelegation.g:3642:3: ( RULE_ID )
            // InternalDelegation.g:3643:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__VariableAssignment_2"


    // $ANTLR start "rule__AttributeFact__AttributeAssignment_4"
    // InternalDelegation.g:3654:1: rule__AttributeFact__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3658:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3659:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3659:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3660:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 
            // InternalDelegation.g:3661:3: ( RULE_ID )
            // InternalDelegation.g:3662:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__AttributeAssignment_4"


    // $ANTLR start "rule__Binding__VariableAssignment_1"
    // InternalDelegation.g:3673:1: rule__Binding__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3677:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3678:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3678:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3679:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 
            // InternalDelegation.g:3680:3: ( RULE_ID )
            // InternalDelegation.g:3681:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__VariableAssignment_1"


    // $ANTLR start "rule__Binding__BindAssignment_5"
    // InternalDelegation.g:3692:1: rule__Binding__BindAssignment_5 : ( ruleBind ) ;
    public final void rule__Binding__BindAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3696:1: ( ( ruleBind ) )
            // InternalDelegation.g:3697:2: ( ruleBind )
            {
            // InternalDelegation.g:3697:2: ( ruleBind )
            // InternalDelegation.g:3698:3: ruleBind
            {
             before(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__BindAssignment_5"


    // $ANTLR start "rule__Bind__ValueStringAssignment_0"
    // InternalDelegation.g:3707:1: rule__Bind__ValueStringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Bind__ValueStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3711:1: ( ( RULE_STRING ) )
            // InternalDelegation.g:3712:2: ( RULE_STRING )
            {
            // InternalDelegation.g:3712:2: ( RULE_STRING )
            // InternalDelegation.g:3713:3: RULE_STRING
            {
             before(grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ValueStringAssignment_0"


    // $ANTLR start "rule__Bind__ValueIntegerAssignment_1"
    // InternalDelegation.g:3722:1: rule__Bind__ValueIntegerAssignment_1 : ( RULE_INT ) ;
    public final void rule__Bind__ValueIntegerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3726:1: ( ( RULE_INT ) )
            // InternalDelegation.g:3727:2: ( RULE_INT )
            {
            // InternalDelegation.g:3727:2: ( RULE_INT )
            // InternalDelegation.g:3728:3: RULE_INT
            {
             before(grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ValueIntegerAssignment_1"


    // $ANTLR start "rule__Bind__ValueEnumLiteralAssignment_2"
    // InternalDelegation.g:3737:1: rule__Bind__ValueEnumLiteralAssignment_2 : ( ruleEnumValue ) ;
    public final void rule__Bind__ValueEnumLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3741:1: ( ( ruleEnumValue ) )
            // InternalDelegation.g:3742:2: ( ruleEnumValue )
            {
            // InternalDelegation.g:3742:2: ( ruleEnumValue )
            // InternalDelegation.g:3743:3: ruleEnumValue
            {
             before(grammarAccess.getBindAccess().getValueEnumLiteralEnumValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getBindAccess().getValueEnumLiteralEnumValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ValueEnumLiteralAssignment_2"


    // $ANTLR start "rule__EnumValue__LiteralAssignment_1"
    // InternalDelegation.g:3752:1: rule__EnumValue__LiteralAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumValue__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:3756:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:3757:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:3757:2: ( ( RULE_ID ) )
            // InternalDelegation.g:3758:3: ( RULE_ID )
            {
             before(grammarAccess.getEnumValueAccess().getLiteralEEnumLiteralCrossReference_1_0()); 
            // InternalDelegation.g:3759:3: ( RULE_ID )
            // InternalDelegation.g:3760:4: RULE_ID
            {
             before(grammarAccess.getEnumValueAccess().getLiteralEEnumLiteralIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getLiteralEEnumLiteralIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumValueAccess().getLiteralEEnumLiteralCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__LiteralAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000043C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000124000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000060L});

}