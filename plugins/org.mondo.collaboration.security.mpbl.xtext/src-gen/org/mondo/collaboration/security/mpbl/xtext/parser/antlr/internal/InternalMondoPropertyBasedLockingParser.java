package org.mondo.collaboration.security.mpbl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mondo.collaboration.security.mpbl.xtext.services.MondoPropertyBasedLockingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMondoPropertyBasedLockingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'locks'", "'{'", "'}'", "'user'", "'group'", "','", "'lock'", "'query'", "'bind'", "'role'", "'value'", "'object'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMondoPropertyBasedLockingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMondoPropertyBasedLockingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMondoPropertyBasedLockingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMondoPropertyBasedLocking.g"; }



     	private MondoPropertyBasedLockingGrammarAccess grammarAccess;

        public InternalMondoPropertyBasedLockingParser(TokenStream input, MondoPropertyBasedLockingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PropertyBasedLockingModel";
       	}

       	@Override
       	protected MondoPropertyBasedLockingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePropertyBasedLockingModel"
    // InternalMondoPropertyBasedLocking.g:64:1: entryRulePropertyBasedLockingModel returns [EObject current=null] : iv_rulePropertyBasedLockingModel= rulePropertyBasedLockingModel EOF ;
    public final EObject entryRulePropertyBasedLockingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyBasedLockingModel = null;


        try {
            // InternalMondoPropertyBasedLocking.g:64:66: (iv_rulePropertyBasedLockingModel= rulePropertyBasedLockingModel EOF )
            // InternalMondoPropertyBasedLocking.g:65:2: iv_rulePropertyBasedLockingModel= rulePropertyBasedLockingModel EOF
            {
             newCompositeNode(grammarAccess.getPropertyBasedLockingModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyBasedLockingModel=rulePropertyBasedLockingModel();

            state._fsp--;

             current =iv_rulePropertyBasedLockingModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyBasedLockingModel"


    // $ANTLR start "rulePropertyBasedLockingModel"
    // InternalMondoPropertyBasedLocking.g:71:1: rulePropertyBasedLockingModel returns [EObject current=null] : ( () ( (lv_roles_1_0= ruleRole ) )* otherlv_2= 'locks' otherlv_3= '{' ( (lv_locks_4_0= ruleLock ) )* otherlv_5= '}' ) ;
    public final EObject rulePropertyBasedLockingModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_roles_1_0 = null;

        EObject lv_locks_4_0 = null;



        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:77:2: ( ( () ( (lv_roles_1_0= ruleRole ) )* otherlv_2= 'locks' otherlv_3= '{' ( (lv_locks_4_0= ruleLock ) )* otherlv_5= '}' ) )
            // InternalMondoPropertyBasedLocking.g:78:2: ( () ( (lv_roles_1_0= ruleRole ) )* otherlv_2= 'locks' otherlv_3= '{' ( (lv_locks_4_0= ruleLock ) )* otherlv_5= '}' )
            {
            // InternalMondoPropertyBasedLocking.g:78:2: ( () ( (lv_roles_1_0= ruleRole ) )* otherlv_2= 'locks' otherlv_3= '{' ( (lv_locks_4_0= ruleLock ) )* otherlv_5= '}' )
            // InternalMondoPropertyBasedLocking.g:79:3: () ( (lv_roles_1_0= ruleRole ) )* otherlv_2= 'locks' otherlv_3= '{' ( (lv_locks_4_0= ruleLock ) )* otherlv_5= '}'
            {
            // InternalMondoPropertyBasedLocking.g:79:3: ()
            // InternalMondoPropertyBasedLocking.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyBasedLockingModelAccess().getPropertyBasedLockingModelAction_0(),
            					current);
            			

            }

            // InternalMondoPropertyBasedLocking.g:86:3: ( (lv_roles_1_0= ruleRole ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMondoPropertyBasedLocking.g:87:4: (lv_roles_1_0= ruleRole )
            	    {
            	    // InternalMondoPropertyBasedLocking.g:87:4: (lv_roles_1_0= ruleRole )
            	    // InternalMondoPropertyBasedLocking.g:88:5: lv_roles_1_0= ruleRole
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyBasedLockingModelAccess().getRolesRoleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_roles_1_0=ruleRole();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyBasedLockingModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roles",
            	    						lv_roles_1_0,
            	    						"org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Role");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyBasedLockingModelAccess().getLocksKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyBasedLockingModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMondoPropertyBasedLocking.g:113:3: ( (lv_locks_4_0= ruleLock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMondoPropertyBasedLocking.g:114:4: (lv_locks_4_0= ruleLock )
            	    {
            	    // InternalMondoPropertyBasedLocking.g:114:4: (lv_locks_4_0= ruleLock )
            	    // InternalMondoPropertyBasedLocking.g:115:5: lv_locks_4_0= ruleLock
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyBasedLockingModelAccess().getLocksLockParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_locks_4_0=ruleLock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyBasedLockingModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"locks",
            	    						lv_locks_4_0,
            	    						"org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Lock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyBasedLockingModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyBasedLockingModel"


    // $ANTLR start "entryRuleRole"
    // InternalMondoPropertyBasedLocking.g:140:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalMondoPropertyBasedLocking.g:140:45: (iv_ruleRole= ruleRole EOF )
            // InternalMondoPropertyBasedLocking.g:141:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalMondoPropertyBasedLocking.g:147:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:153:2: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // InternalMondoPropertyBasedLocking.g:154:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // InternalMondoPropertyBasedLocking.g:154:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMondoPropertyBasedLocking.g:155:3: this_User_0= ruleUser
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getUserParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_User_0=ruleUser();

                    state._fsp--;


                    			current = this_User_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMondoPropertyBasedLocking.g:164:3: this_Group_1= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;


                    			current = this_Group_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // InternalMondoPropertyBasedLocking.g:176:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalMondoPropertyBasedLocking.g:176:45: (iv_ruleUser= ruleUser EOF )
            // InternalMondoPropertyBasedLocking.g:177:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalMondoPropertyBasedLocking.g:183:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:189:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMondoPropertyBasedLocking.g:190:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMondoPropertyBasedLocking.g:190:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMondoPropertyBasedLocking.g:191:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalMondoPropertyBasedLocking.g:195:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMondoPropertyBasedLocking.g:196:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMondoPropertyBasedLocking.g:196:4: (lv_name_1_0= RULE_ID )
            // InternalMondoPropertyBasedLocking.g:197:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleGroup"
    // InternalMondoPropertyBasedLocking.g:217:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalMondoPropertyBasedLocking.g:217:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalMondoPropertyBasedLocking.g:218:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalMondoPropertyBasedLocking.g:224:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:230:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalMondoPropertyBasedLocking.g:231:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalMondoPropertyBasedLocking.g:231:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalMondoPropertyBasedLocking.g:232:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalMondoPropertyBasedLocking.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMondoPropertyBasedLocking.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMondoPropertyBasedLocking.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalMondoPropertyBasedLocking.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMondoPropertyBasedLocking.g:258:3: ( (otherlv_3= RULE_ID ) )
            // InternalMondoPropertyBasedLocking.g:259:4: (otherlv_3= RULE_ID )
            {
            // InternalMondoPropertyBasedLocking.g:259:4: (otherlv_3= RULE_ID )
            // InternalMondoPropertyBasedLocking.g:260:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0());
            				

            }


            }

            // InternalMondoPropertyBasedLocking.g:271:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMondoPropertyBasedLocking.g:272:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMondoPropertyBasedLocking.g:276:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalMondoPropertyBasedLocking.g:277:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMondoPropertyBasedLocking.g:277:5: (otherlv_5= RULE_ID )
            	    // InternalMondoPropertyBasedLocking.g:278:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleLock"
    // InternalMondoPropertyBasedLocking.g:298:1: entryRuleLock returns [EObject current=null] : iv_ruleLock= ruleLock EOF ;
    public final EObject entryRuleLock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLock = null;


        try {
            // InternalMondoPropertyBasedLocking.g:298:45: (iv_ruleLock= ruleLock EOF )
            // InternalMondoPropertyBasedLocking.g:299:2: iv_ruleLock= ruleLock EOF
            {
             newCompositeNode(grammarAccess.getLockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLock=ruleLock();

            state._fsp--;

             current =iv_ruleLock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLock"


    // $ANTLR start "ruleLock"
    // InternalMondoPropertyBasedLocking.g:305:1: ruleLock returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'lock' otherlv_2= '{' otherlv_3= 'query' ( (otherlv_4= RULE_STRING ) ) ( (lv_bindings_5_0= ruleBinding ) )* otherlv_6= '}' ) ;
    public final EObject ruleLock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_bindings_5_0 = null;



        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:311:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'lock' otherlv_2= '{' otherlv_3= 'query' ( (otherlv_4= RULE_STRING ) ) ( (lv_bindings_5_0= ruleBinding ) )* otherlv_6= '}' ) )
            // InternalMondoPropertyBasedLocking.g:312:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'lock' otherlv_2= '{' otherlv_3= 'query' ( (otherlv_4= RULE_STRING ) ) ( (lv_bindings_5_0= ruleBinding ) )* otherlv_6= '}' )
            {
            // InternalMondoPropertyBasedLocking.g:312:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'lock' otherlv_2= '{' otherlv_3= 'query' ( (otherlv_4= RULE_STRING ) ) ( (lv_bindings_5_0= ruleBinding ) )* otherlv_6= '}' )
            // InternalMondoPropertyBasedLocking.g:313:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'lock' otherlv_2= '{' otherlv_3= 'query' ( (otherlv_4= RULE_STRING ) ) ( (lv_bindings_5_0= ruleBinding ) )* otherlv_6= '}'
            {
            // InternalMondoPropertyBasedLocking.g:313:3: ( (otherlv_0= RULE_ID ) )
            // InternalMondoPropertyBasedLocking.g:314:4: (otherlv_0= RULE_ID )
            {
            // InternalMondoPropertyBasedLocking.g:314:4: (otherlv_0= RULE_ID )
            // InternalMondoPropertyBasedLocking.g:315:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLockRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getLockAccess().getOwnerRoleCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLockAccess().getLockKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLockAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLockAccess().getQueryKeyword_3());
            		
            // InternalMondoPropertyBasedLocking.g:338:3: ( (otherlv_4= RULE_STRING ) )
            // InternalMondoPropertyBasedLocking.g:339:4: (otherlv_4= RULE_STRING )
            {
            // InternalMondoPropertyBasedLocking.g:339:4: (otherlv_4= RULE_STRING )
            // InternalMondoPropertyBasedLocking.g:340:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLockRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getLockAccess().getPatternPatternCrossReference_4_0());
            				

            }


            }

            // InternalMondoPropertyBasedLocking.g:351:3: ( (lv_bindings_5_0= ruleBinding ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMondoPropertyBasedLocking.g:352:4: (lv_bindings_5_0= ruleBinding )
            	    {
            	    // InternalMondoPropertyBasedLocking.g:352:4: (lv_bindings_5_0= ruleBinding )
            	    // InternalMondoPropertyBasedLocking.g:353:5: lv_bindings_5_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getLockAccess().getBindingsBindingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_bindings_5_0=ruleBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bindings",
            	    						lv_bindings_5_0,
            	    						"org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Binding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLockAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLock"


    // $ANTLR start "entryRuleBinding"
    // InternalMondoPropertyBasedLocking.g:378:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMondoPropertyBasedLocking.g:378:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMondoPropertyBasedLocking.g:379:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalMondoPropertyBasedLocking.g:385:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) ( (lv_value_2_0= ruleBind ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:391:2: ( (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) ( (lv_value_2_0= ruleBind ) ) ) )
            // InternalMondoPropertyBasedLocking.g:392:2: (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) ( (lv_value_2_0= ruleBind ) ) )
            {
            // InternalMondoPropertyBasedLocking.g:392:2: (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) ( (lv_value_2_0= ruleBind ) ) )
            // InternalMondoPropertyBasedLocking.g:393:3: otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) ( (lv_value_2_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindKeyword_0());
            		
            // InternalMondoPropertyBasedLocking.g:397:3: ( (otherlv_1= RULE_ID ) )
            // InternalMondoPropertyBasedLocking.g:398:4: (otherlv_1= RULE_ID )
            {
            // InternalMondoPropertyBasedLocking.g:398:4: (otherlv_1= RULE_ID )
            // InternalMondoPropertyBasedLocking.g:399:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getParamVariableCrossReference_1_0());
            				

            }


            }

            // InternalMondoPropertyBasedLocking.g:410:3: ( (lv_value_2_0= ruleBind ) )
            // InternalMondoPropertyBasedLocking.g:411:4: (lv_value_2_0= ruleBind )
            {
            // InternalMondoPropertyBasedLocking.g:411:4: (lv_value_2_0= ruleBind )
            // InternalMondoPropertyBasedLocking.g:412:5: lv_value_2_0= ruleBind
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getValueBindParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLocking.Bind");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBind"
    // InternalMondoPropertyBasedLocking.g:433:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalMondoPropertyBasedLocking.g:433:45: (iv_ruleBind= ruleBind EOF )
            // InternalMondoPropertyBasedLocking.g:434:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalMondoPropertyBasedLocking.g:440:1: ruleBind returns [EObject current=null] : (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectBind_0 = null;

        EObject this_ValueBind_1 = null;

        EObject this_RoleBind_2 = null;



        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:446:2: ( (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind ) )
            // InternalMondoPropertyBasedLocking.g:447:2: (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind )
            {
            // InternalMondoPropertyBasedLocking.g:447:2: (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMondoPropertyBasedLocking.g:448:3: this_ObjectBind_0= ruleObjectBind
                    {

                    			newCompositeNode(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectBind_0=ruleObjectBind();

                    state._fsp--;


                    			current = this_ObjectBind_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMondoPropertyBasedLocking.g:457:3: this_ValueBind_1= ruleValueBind
                    {

                    			newCompositeNode(grammarAccess.getBindAccess().getValueBindParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueBind_1=ruleValueBind();

                    state._fsp--;


                    			current = this_ValueBind_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMondoPropertyBasedLocking.g:466:3: this_RoleBind_2= ruleRoleBind
                    {

                    			newCompositeNode(grammarAccess.getBindAccess().getRoleBindParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleBind_2=ruleRoleBind();

                    state._fsp--;


                    			current = this_RoleBind_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleRoleBind"
    // InternalMondoPropertyBasedLocking.g:478:1: entryRuleRoleBind returns [EObject current=null] : iv_ruleRoleBind= ruleRoleBind EOF ;
    public final EObject entryRuleRoleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleBind = null;


        try {
            // InternalMondoPropertyBasedLocking.g:478:49: (iv_ruleRoleBind= ruleRoleBind EOF )
            // InternalMondoPropertyBasedLocking.g:479:2: iv_ruleRoleBind= ruleRoleBind EOF
            {
             newCompositeNode(grammarAccess.getRoleBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleBind=ruleRoleBind();

            state._fsp--;

             current =iv_ruleRoleBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleBind"


    // $ANTLR start "ruleRoleBind"
    // InternalMondoPropertyBasedLocking.g:485:1: ruleRoleBind returns [EObject current=null] : (otherlv_0= 'role' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRoleBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:491:2: ( (otherlv_0= 'role' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMondoPropertyBasedLocking.g:492:2: (otherlv_0= 'role' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMondoPropertyBasedLocking.g:492:2: (otherlv_0= 'role' ( (otherlv_1= RULE_ID ) ) )
            // InternalMondoPropertyBasedLocking.g:493:3: otherlv_0= 'role' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleBindAccess().getRoleKeyword_0());
            		
            // InternalMondoPropertyBasedLocking.g:497:3: ( (otherlv_1= RULE_ID ) )
            // InternalMondoPropertyBasedLocking.g:498:4: (otherlv_1= RULE_ID )
            {
            // InternalMondoPropertyBasedLocking.g:498:4: (otherlv_1= RULE_ID )
            // InternalMondoPropertyBasedLocking.g:499:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleBindRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRoleBindAccess().getRoleRoleCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleBind"


    // $ANTLR start "entryRuleValueBind"
    // InternalMondoPropertyBasedLocking.g:514:1: entryRuleValueBind returns [EObject current=null] : iv_ruleValueBind= ruleValueBind EOF ;
    public final EObject entryRuleValueBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueBind = null;


        try {
            // InternalMondoPropertyBasedLocking.g:514:50: (iv_ruleValueBind= ruleValueBind EOF )
            // InternalMondoPropertyBasedLocking.g:515:2: iv_ruleValueBind= ruleValueBind EOF
            {
             newCompositeNode(grammarAccess.getValueBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueBind=ruleValueBind();

            state._fsp--;

             current =iv_ruleValueBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueBind"


    // $ANTLR start "ruleValueBind"
    // InternalMondoPropertyBasedLocking.g:521:1: ruleValueBind returns [EObject current=null] : (otherlv_0= 'value' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleValueBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:527:2: ( (otherlv_0= 'value' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalMondoPropertyBasedLocking.g:528:2: (otherlv_0= 'value' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalMondoPropertyBasedLocking.g:528:2: (otherlv_0= 'value' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalMondoPropertyBasedLocking.g:529:3: otherlv_0= 'value' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getValueBindAccess().getValueKeyword_0());
            		
            // InternalMondoPropertyBasedLocking.g:533:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalMondoPropertyBasedLocking.g:534:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalMondoPropertyBasedLocking.g:534:4: (lv_value_1_0= RULE_STRING )
            // InternalMondoPropertyBasedLocking.g:535:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getValueBindAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueBindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueBind"


    // $ANTLR start "entryRuleObjectBind"
    // InternalMondoPropertyBasedLocking.g:555:1: entryRuleObjectBind returns [EObject current=null] : iv_ruleObjectBind= ruleObjectBind EOF ;
    public final EObject entryRuleObjectBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectBind = null;


        try {
            // InternalMondoPropertyBasedLocking.g:555:51: (iv_ruleObjectBind= ruleObjectBind EOF )
            // InternalMondoPropertyBasedLocking.g:556:2: iv_ruleObjectBind= ruleObjectBind EOF
            {
             newCompositeNode(grammarAccess.getObjectBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectBind=ruleObjectBind();

            state._fsp--;

             current =iv_ruleObjectBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectBind"


    // $ANTLR start "ruleObjectBind"
    // InternalMondoPropertyBasedLocking.g:562:1: ruleObjectBind returns [EObject current=null] : (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleObjectBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMondoPropertyBasedLocking.g:568:2: ( (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMondoPropertyBasedLocking.g:569:2: (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMondoPropertyBasedLocking.g:569:2: (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) )
            // InternalMondoPropertyBasedLocking.g:570:3: otherlv_0= 'object' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectBindAccess().getObjectKeyword_0());
            		
            // InternalMondoPropertyBasedLocking.g:574:3: ( (otherlv_1= RULE_ID ) )
            // InternalMondoPropertyBasedLocking.g:575:4: (otherlv_1= RULE_ID )
            {
            // InternalMondoPropertyBasedLocking.g:575:4: (otherlv_1= RULE_ID )
            // InternalMondoPropertyBasedLocking.g:576:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectBindRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectBind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});

}