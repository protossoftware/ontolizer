package de.protos.ontolizer.ide.contentassist.antlr.internal;

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
import de.protos.ontolizer.services.OntolizerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntolizerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NodeType'", "';'", "'shape'", "'color'", "'style'", "'EdgeType'", "'summary'", "','", "'View'", "'edgeTypes'", "'nodeTypes'", "'node'", "'depth'", "'..'"
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
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOntolizerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOntolizerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOntolizerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOntolizer.g"; }


    	private OntolizerGrammarAccess grammarAccess;

    	public void setGrammarAccess(OntolizerGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalOntolizer.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOntolizer.g:54:1: ( ruleModel EOF )
            // InternalOntolizer.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntolizer.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalOntolizer.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalOntolizer.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalOntolizer.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalOntolizer.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==16||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntolizer.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeType"
    // InternalOntolizer.g:78:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // InternalOntolizer.g:79:1: ( ruleNodeType EOF )
            // InternalOntolizer.g:80:1: ruleNodeType EOF
            {
             before(grammarAccess.getNodeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeType();

            state._fsp--;

             after(grammarAccess.getNodeTypeRule()); 
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
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // InternalOntolizer.g:87:1: ruleNodeType : ( ( rule__NodeType__Group__0 ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:91:2: ( ( ( rule__NodeType__Group__0 ) ) )
            // InternalOntolizer.g:92:2: ( ( rule__NodeType__Group__0 ) )
            {
            // InternalOntolizer.g:92:2: ( ( rule__NodeType__Group__0 ) )
            // InternalOntolizer.g:93:3: ( rule__NodeType__Group__0 )
            {
             before(grammarAccess.getNodeTypeAccess().getGroup()); 
            // InternalOntolizer.g:94:3: ( rule__NodeType__Group__0 )
            // InternalOntolizer.g:94:4: rule__NodeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleEdgeType"
    // InternalOntolizer.g:103:1: entryRuleEdgeType : ruleEdgeType EOF ;
    public final void entryRuleEdgeType() throws RecognitionException {
        try {
            // InternalOntolizer.g:104:1: ( ruleEdgeType EOF )
            // InternalOntolizer.g:105:1: ruleEdgeType EOF
            {
             before(grammarAccess.getEdgeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeType();

            state._fsp--;

             after(grammarAccess.getEdgeTypeRule()); 
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
    // $ANTLR end "entryRuleEdgeType"


    // $ANTLR start "ruleEdgeType"
    // InternalOntolizer.g:112:1: ruleEdgeType : ( ( rule__EdgeType__Group__0 ) ) ;
    public final void ruleEdgeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:116:2: ( ( ( rule__EdgeType__Group__0 ) ) )
            // InternalOntolizer.g:117:2: ( ( rule__EdgeType__Group__0 ) )
            {
            // InternalOntolizer.g:117:2: ( ( rule__EdgeType__Group__0 ) )
            // InternalOntolizer.g:118:3: ( rule__EdgeType__Group__0 )
            {
             before(grammarAccess.getEdgeTypeAccess().getGroup()); 
            // InternalOntolizer.g:119:3: ( rule__EdgeType__Group__0 )
            // InternalOntolizer.g:119:4: rule__EdgeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleEdgeType"


    // $ANTLR start "entryRuleNode"
    // InternalOntolizer.g:128:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalOntolizer.g:129:1: ( ruleNode EOF )
            // InternalOntolizer.g:130:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalOntolizer.g:137:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:141:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalOntolizer.g:142:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalOntolizer.g:142:2: ( ( rule__Node__Group__0 ) )
            // InternalOntolizer.g:143:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalOntolizer.g:144:3: ( rule__Node__Group__0 )
            // InternalOntolizer.g:144:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEdgeList"
    // InternalOntolizer.g:153:1: entryRuleEdgeList : ruleEdgeList EOF ;
    public final void entryRuleEdgeList() throws RecognitionException {
        try {
            // InternalOntolizer.g:154:1: ( ruleEdgeList EOF )
            // InternalOntolizer.g:155:1: ruleEdgeList EOF
            {
             before(grammarAccess.getEdgeListRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeList();

            state._fsp--;

             after(grammarAccess.getEdgeListRule()); 
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
    // $ANTLR end "entryRuleEdgeList"


    // $ANTLR start "ruleEdgeList"
    // InternalOntolizer.g:162:1: ruleEdgeList : ( ( rule__EdgeList__Group__0 ) ) ;
    public final void ruleEdgeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:166:2: ( ( ( rule__EdgeList__Group__0 ) ) )
            // InternalOntolizer.g:167:2: ( ( rule__EdgeList__Group__0 ) )
            {
            // InternalOntolizer.g:167:2: ( ( rule__EdgeList__Group__0 ) )
            // InternalOntolizer.g:168:3: ( rule__EdgeList__Group__0 )
            {
             before(grammarAccess.getEdgeListAccess().getGroup()); 
            // InternalOntolizer.g:169:3: ( rule__EdgeList__Group__0 )
            // InternalOntolizer.g:169:4: rule__EdgeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeListAccess().getGroup()); 

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
    // $ANTLR end "ruleEdgeList"


    // $ANTLR start "entryRuleEdge"
    // InternalOntolizer.g:178:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalOntolizer.g:179:1: ( ruleEdge EOF )
            // InternalOntolizer.g:180:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalOntolizer.g:187:1: ruleEdge : ( ( rule__Edge__TargetNodeAssignment ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:191:2: ( ( ( rule__Edge__TargetNodeAssignment ) ) )
            // InternalOntolizer.g:192:2: ( ( rule__Edge__TargetNodeAssignment ) )
            {
            // InternalOntolizer.g:192:2: ( ( rule__Edge__TargetNodeAssignment ) )
            // InternalOntolizer.g:193:3: ( rule__Edge__TargetNodeAssignment )
            {
             before(grammarAccess.getEdgeAccess().getTargetNodeAssignment()); 
            // InternalOntolizer.g:194:3: ( rule__Edge__TargetNodeAssignment )
            // InternalOntolizer.g:194:4: rule__Edge__TargetNodeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Edge__TargetNodeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getTargetNodeAssignment()); 

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleView"
    // InternalOntolizer.g:203:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // InternalOntolizer.g:204:1: ( ruleView EOF )
            // InternalOntolizer.g:205:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_1);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // InternalOntolizer.g:212:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:216:2: ( ( ( rule__View__Group__0 ) ) )
            // InternalOntolizer.g:217:2: ( ( rule__View__Group__0 ) )
            {
            // InternalOntolizer.g:217:2: ( ( rule__View__Group__0 ) )
            // InternalOntolizer.g:218:3: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // InternalOntolizer.g:219:3: ( rule__View__Group__0 )
            // InternalOntolizer.g:219:4: rule__View__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__View__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleDepthRange"
    // InternalOntolizer.g:228:1: entryRuleDepthRange : ruleDepthRange EOF ;
    public final void entryRuleDepthRange() throws RecognitionException {
        try {
            // InternalOntolizer.g:229:1: ( ruleDepthRange EOF )
            // InternalOntolizer.g:230:1: ruleDepthRange EOF
            {
             before(grammarAccess.getDepthRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleDepthRange();

            state._fsp--;

             after(grammarAccess.getDepthRangeRule()); 
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
    // $ANTLR end "entryRuleDepthRange"


    // $ANTLR start "ruleDepthRange"
    // InternalOntolizer.g:237:1: ruleDepthRange : ( ( rule__DepthRange__Group__0 ) ) ;
    public final void ruleDepthRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:241:2: ( ( ( rule__DepthRange__Group__0 ) ) )
            // InternalOntolizer.g:242:2: ( ( rule__DepthRange__Group__0 ) )
            {
            // InternalOntolizer.g:242:2: ( ( rule__DepthRange__Group__0 ) )
            // InternalOntolizer.g:243:3: ( rule__DepthRange__Group__0 )
            {
             before(grammarAccess.getDepthRangeAccess().getGroup()); 
            // InternalOntolizer.g:244:3: ( rule__DepthRange__Group__0 )
            // InternalOntolizer.g:244:4: rule__DepthRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DepthRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDepthRangeAccess().getGroup()); 

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
    // $ANTLR end "ruleDepthRange"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalOntolizer.g:252:1: rule__Model__Alternatives : ( ( ( rule__Model__NodeTypesAssignment_0 ) ) | ( ( rule__Model__EdgeTypesAssignment_1 ) ) | ( ( rule__Model__NodesAssignment_2 ) ) | ( ( rule__Model__ViewsAssignment_3 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:256:1: ( ( ( rule__Model__NodeTypesAssignment_0 ) ) | ( ( rule__Model__EdgeTypesAssignment_1 ) ) | ( ( rule__Model__NodesAssignment_2 ) ) | ( ( rule__Model__ViewsAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntolizer.g:257:2: ( ( rule__Model__NodeTypesAssignment_0 ) )
                    {
                    // InternalOntolizer.g:257:2: ( ( rule__Model__NodeTypesAssignment_0 ) )
                    // InternalOntolizer.g:258:3: ( rule__Model__NodeTypesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getNodeTypesAssignment_0()); 
                    // InternalOntolizer.g:259:3: ( rule__Model__NodeTypesAssignment_0 )
                    // InternalOntolizer.g:259:4: rule__Model__NodeTypesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__NodeTypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodeTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntolizer.g:263:2: ( ( rule__Model__EdgeTypesAssignment_1 ) )
                    {
                    // InternalOntolizer.g:263:2: ( ( rule__Model__EdgeTypesAssignment_1 ) )
                    // InternalOntolizer.g:264:3: ( rule__Model__EdgeTypesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getEdgeTypesAssignment_1()); 
                    // InternalOntolizer.g:265:3: ( rule__Model__EdgeTypesAssignment_1 )
                    // InternalOntolizer.g:265:4: rule__Model__EdgeTypesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__EdgeTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getEdgeTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntolizer.g:269:2: ( ( rule__Model__NodesAssignment_2 ) )
                    {
                    // InternalOntolizer.g:269:2: ( ( rule__Model__NodesAssignment_2 ) )
                    // InternalOntolizer.g:270:3: ( rule__Model__NodesAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getNodesAssignment_2()); 
                    // InternalOntolizer.g:271:3: ( rule__Model__NodesAssignment_2 )
                    // InternalOntolizer.g:271:4: rule__Model__NodesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__NodesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntolizer.g:275:2: ( ( rule__Model__ViewsAssignment_3 ) )
                    {
                    // InternalOntolizer.g:275:2: ( ( rule__Model__ViewsAssignment_3 ) )
                    // InternalOntolizer.g:276:3: ( rule__Model__ViewsAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getViewsAssignment_3()); 
                    // InternalOntolizer.g:277:3: ( rule__Model__ViewsAssignment_3 )
                    // InternalOntolizer.g:277:4: rule__Model__ViewsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ViewsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getViewsAssignment_3()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__NodeType__Group__0"
    // InternalOntolizer.g:285:1: rule__NodeType__Group__0 : rule__NodeType__Group__0__Impl rule__NodeType__Group__1 ;
    public final void rule__NodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:289:1: ( rule__NodeType__Group__0__Impl rule__NodeType__Group__1 )
            // InternalOntolizer.g:290:2: rule__NodeType__Group__0__Impl rule__NodeType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group__1();

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
    // $ANTLR end "rule__NodeType__Group__0"


    // $ANTLR start "rule__NodeType__Group__0__Impl"
    // InternalOntolizer.g:297:1: rule__NodeType__Group__0__Impl : ( 'NodeType' ) ;
    public final void rule__NodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:301:1: ( ( 'NodeType' ) )
            // InternalOntolizer.g:302:1: ( 'NodeType' )
            {
            // InternalOntolizer.g:302:1: ( 'NodeType' )
            // InternalOntolizer.g:303:2: 'NodeType'
            {
             before(grammarAccess.getNodeTypeAccess().getNodeTypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getNodeTypeKeyword_0()); 

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
    // $ANTLR end "rule__NodeType__Group__0__Impl"


    // $ANTLR start "rule__NodeType__Group__1"
    // InternalOntolizer.g:312:1: rule__NodeType__Group__1 : rule__NodeType__Group__1__Impl rule__NodeType__Group__2 ;
    public final void rule__NodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:316:1: ( rule__NodeType__Group__1__Impl rule__NodeType__Group__2 )
            // InternalOntolizer.g:317:2: rule__NodeType__Group__1__Impl rule__NodeType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NodeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group__2();

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
    // $ANTLR end "rule__NodeType__Group__1"


    // $ANTLR start "rule__NodeType__Group__1__Impl"
    // InternalOntolizer.g:324:1: rule__NodeType__Group__1__Impl : ( ( rule__NodeType__NameAssignment_1 ) ) ;
    public final void rule__NodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:328:1: ( ( ( rule__NodeType__NameAssignment_1 ) ) )
            // InternalOntolizer.g:329:1: ( ( rule__NodeType__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:329:1: ( ( rule__NodeType__NameAssignment_1 ) )
            // InternalOntolizer.g:330:2: ( rule__NodeType__NameAssignment_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:331:2: ( rule__NodeType__NameAssignment_1 )
            // InternalOntolizer.g:331:3: rule__NodeType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NodeType__Group__1__Impl"


    // $ANTLR start "rule__NodeType__Group__2"
    // InternalOntolizer.g:339:1: rule__NodeType__Group__2 : rule__NodeType__Group__2__Impl rule__NodeType__Group__3 ;
    public final void rule__NodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:343:1: ( rule__NodeType__Group__2__Impl rule__NodeType__Group__3 )
            // InternalOntolizer.g:344:2: rule__NodeType__Group__2__Impl rule__NodeType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__NodeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group__3();

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
    // $ANTLR end "rule__NodeType__Group__2"


    // $ANTLR start "rule__NodeType__Group__2__Impl"
    // InternalOntolizer.g:351:1: rule__NodeType__Group__2__Impl : ( ( rule__NodeType__Group_2__0 )? ) ;
    public final void rule__NodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:355:1: ( ( ( rule__NodeType__Group_2__0 )? ) )
            // InternalOntolizer.g:356:1: ( ( rule__NodeType__Group_2__0 )? )
            {
            // InternalOntolizer.g:356:1: ( ( rule__NodeType__Group_2__0 )? )
            // InternalOntolizer.g:357:2: ( rule__NodeType__Group_2__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_2()); 
            // InternalOntolizer.g:358:2: ( rule__NodeType__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntolizer.g:358:3: rule__NodeType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NodeType__Group__2__Impl"


    // $ANTLR start "rule__NodeType__Group__3"
    // InternalOntolizer.g:366:1: rule__NodeType__Group__3 : rule__NodeType__Group__3__Impl rule__NodeType__Group__4 ;
    public final void rule__NodeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:370:1: ( rule__NodeType__Group__3__Impl rule__NodeType__Group__4 )
            // InternalOntolizer.g:371:2: rule__NodeType__Group__3__Impl rule__NodeType__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__NodeType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group__4();

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
    // $ANTLR end "rule__NodeType__Group__3"


    // $ANTLR start "rule__NodeType__Group__3__Impl"
    // InternalOntolizer.g:378:1: rule__NodeType__Group__3__Impl : ( ( rule__NodeType__Group_3__0 )? ) ;
    public final void rule__NodeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:382:1: ( ( ( rule__NodeType__Group_3__0 )? ) )
            // InternalOntolizer.g:383:1: ( ( rule__NodeType__Group_3__0 )? )
            {
            // InternalOntolizer.g:383:1: ( ( rule__NodeType__Group_3__0 )? )
            // InternalOntolizer.g:384:2: ( rule__NodeType__Group_3__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_3()); 
            // InternalOntolizer.g:385:2: ( rule__NodeType__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntolizer.g:385:3: rule__NodeType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NodeType__Group__3__Impl"


    // $ANTLR start "rule__NodeType__Group__4"
    // InternalOntolizer.g:393:1: rule__NodeType__Group__4 : rule__NodeType__Group__4__Impl rule__NodeType__Group__5 ;
    public final void rule__NodeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:397:1: ( rule__NodeType__Group__4__Impl rule__NodeType__Group__5 )
            // InternalOntolizer.g:398:2: rule__NodeType__Group__4__Impl rule__NodeType__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__NodeType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group__5();

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
    // $ANTLR end "rule__NodeType__Group__4"


    // $ANTLR start "rule__NodeType__Group__4__Impl"
    // InternalOntolizer.g:405:1: rule__NodeType__Group__4__Impl : ( ( rule__NodeType__Group_4__0 )? ) ;
    public final void rule__NodeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:409:1: ( ( ( rule__NodeType__Group_4__0 )? ) )
            // InternalOntolizer.g:410:1: ( ( rule__NodeType__Group_4__0 )? )
            {
            // InternalOntolizer.g:410:1: ( ( rule__NodeType__Group_4__0 )? )
            // InternalOntolizer.g:411:2: ( rule__NodeType__Group_4__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_4()); 
            // InternalOntolizer.g:412:2: ( rule__NodeType__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntolizer.g:412:3: rule__NodeType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__NodeType__Group__4__Impl"


    // $ANTLR start "rule__NodeType__Group__5"
    // InternalOntolizer.g:420:1: rule__NodeType__Group__5 : rule__NodeType__Group__5__Impl ;
    public final void rule__NodeType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:424:1: ( rule__NodeType__Group__5__Impl )
            // InternalOntolizer.g:425:2: rule__NodeType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__Group__5__Impl();

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
    // $ANTLR end "rule__NodeType__Group__5"


    // $ANTLR start "rule__NodeType__Group__5__Impl"
    // InternalOntolizer.g:431:1: rule__NodeType__Group__5__Impl : ( ';' ) ;
    public final void rule__NodeType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:435:1: ( ( ';' ) )
            // InternalOntolizer.g:436:1: ( ';' )
            {
            // InternalOntolizer.g:436:1: ( ';' )
            // InternalOntolizer.g:437:2: ';'
            {
             before(grammarAccess.getNodeTypeAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__NodeType__Group__5__Impl"


    // $ANTLR start "rule__NodeType__Group_2__0"
    // InternalOntolizer.g:447:1: rule__NodeType__Group_2__0 : rule__NodeType__Group_2__0__Impl rule__NodeType__Group_2__1 ;
    public final void rule__NodeType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:451:1: ( rule__NodeType__Group_2__0__Impl rule__NodeType__Group_2__1 )
            // InternalOntolizer.g:452:2: rule__NodeType__Group_2__0__Impl rule__NodeType__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__NodeType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group_2__1();

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
    // $ANTLR end "rule__NodeType__Group_2__0"


    // $ANTLR start "rule__NodeType__Group_2__0__Impl"
    // InternalOntolizer.g:459:1: rule__NodeType__Group_2__0__Impl : ( 'shape' ) ;
    public final void rule__NodeType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:463:1: ( ( 'shape' ) )
            // InternalOntolizer.g:464:1: ( 'shape' )
            {
            // InternalOntolizer.g:464:1: ( 'shape' )
            // InternalOntolizer.g:465:2: 'shape'
            {
             before(grammarAccess.getNodeTypeAccess().getShapeKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getShapeKeyword_2_0()); 

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
    // $ANTLR end "rule__NodeType__Group_2__0__Impl"


    // $ANTLR start "rule__NodeType__Group_2__1"
    // InternalOntolizer.g:474:1: rule__NodeType__Group_2__1 : rule__NodeType__Group_2__1__Impl ;
    public final void rule__NodeType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:478:1: ( rule__NodeType__Group_2__1__Impl )
            // InternalOntolizer.g:479:2: rule__NodeType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__Group_2__1__Impl();

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
    // $ANTLR end "rule__NodeType__Group_2__1"


    // $ANTLR start "rule__NodeType__Group_2__1__Impl"
    // InternalOntolizer.g:485:1: rule__NodeType__Group_2__1__Impl : ( ( rule__NodeType__ShapeAssignment_2_1 ) ) ;
    public final void rule__NodeType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:489:1: ( ( ( rule__NodeType__ShapeAssignment_2_1 ) ) )
            // InternalOntolizer.g:490:1: ( ( rule__NodeType__ShapeAssignment_2_1 ) )
            {
            // InternalOntolizer.g:490:1: ( ( rule__NodeType__ShapeAssignment_2_1 ) )
            // InternalOntolizer.g:491:2: ( rule__NodeType__ShapeAssignment_2_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getShapeAssignment_2_1()); 
            // InternalOntolizer.g:492:2: ( rule__NodeType__ShapeAssignment_2_1 )
            // InternalOntolizer.g:492:3: rule__NodeType__ShapeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__ShapeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getShapeAssignment_2_1()); 

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
    // $ANTLR end "rule__NodeType__Group_2__1__Impl"


    // $ANTLR start "rule__NodeType__Group_3__0"
    // InternalOntolizer.g:501:1: rule__NodeType__Group_3__0 : rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1 ;
    public final void rule__NodeType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:505:1: ( rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1 )
            // InternalOntolizer.g:506:2: rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__NodeType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group_3__1();

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
    // $ANTLR end "rule__NodeType__Group_3__0"


    // $ANTLR start "rule__NodeType__Group_3__0__Impl"
    // InternalOntolizer.g:513:1: rule__NodeType__Group_3__0__Impl : ( 'color' ) ;
    public final void rule__NodeType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:517:1: ( ( 'color' ) )
            // InternalOntolizer.g:518:1: ( 'color' )
            {
            // InternalOntolizer.g:518:1: ( 'color' )
            // InternalOntolizer.g:519:2: 'color'
            {
             before(grammarAccess.getNodeTypeAccess().getColorKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getColorKeyword_3_0()); 

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
    // $ANTLR end "rule__NodeType__Group_3__0__Impl"


    // $ANTLR start "rule__NodeType__Group_3__1"
    // InternalOntolizer.g:528:1: rule__NodeType__Group_3__1 : rule__NodeType__Group_3__1__Impl ;
    public final void rule__NodeType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:532:1: ( rule__NodeType__Group_3__1__Impl )
            // InternalOntolizer.g:533:2: rule__NodeType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__Group_3__1__Impl();

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
    // $ANTLR end "rule__NodeType__Group_3__1"


    // $ANTLR start "rule__NodeType__Group_3__1__Impl"
    // InternalOntolizer.g:539:1: rule__NodeType__Group_3__1__Impl : ( ( rule__NodeType__ColorAssignment_3_1 ) ) ;
    public final void rule__NodeType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:543:1: ( ( ( rule__NodeType__ColorAssignment_3_1 ) ) )
            // InternalOntolizer.g:544:1: ( ( rule__NodeType__ColorAssignment_3_1 ) )
            {
            // InternalOntolizer.g:544:1: ( ( rule__NodeType__ColorAssignment_3_1 ) )
            // InternalOntolizer.g:545:2: ( rule__NodeType__ColorAssignment_3_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getColorAssignment_3_1()); 
            // InternalOntolizer.g:546:2: ( rule__NodeType__ColorAssignment_3_1 )
            // InternalOntolizer.g:546:3: rule__NodeType__ColorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__ColorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getColorAssignment_3_1()); 

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
    // $ANTLR end "rule__NodeType__Group_3__1__Impl"


    // $ANTLR start "rule__NodeType__Group_4__0"
    // InternalOntolizer.g:555:1: rule__NodeType__Group_4__0 : rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1 ;
    public final void rule__NodeType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:559:1: ( rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1 )
            // InternalOntolizer.g:560:2: rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__NodeType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeType__Group_4__1();

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
    // $ANTLR end "rule__NodeType__Group_4__0"


    // $ANTLR start "rule__NodeType__Group_4__0__Impl"
    // InternalOntolizer.g:567:1: rule__NodeType__Group_4__0__Impl : ( 'style' ) ;
    public final void rule__NodeType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:571:1: ( ( 'style' ) )
            // InternalOntolizer.g:572:1: ( 'style' )
            {
            // InternalOntolizer.g:572:1: ( 'style' )
            // InternalOntolizer.g:573:2: 'style'
            {
             before(grammarAccess.getNodeTypeAccess().getStyleKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getStyleKeyword_4_0()); 

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
    // $ANTLR end "rule__NodeType__Group_4__0__Impl"


    // $ANTLR start "rule__NodeType__Group_4__1"
    // InternalOntolizer.g:582:1: rule__NodeType__Group_4__1 : rule__NodeType__Group_4__1__Impl ;
    public final void rule__NodeType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:586:1: ( rule__NodeType__Group_4__1__Impl )
            // InternalOntolizer.g:587:2: rule__NodeType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__Group_4__1__Impl();

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
    // $ANTLR end "rule__NodeType__Group_4__1"


    // $ANTLR start "rule__NodeType__Group_4__1__Impl"
    // InternalOntolizer.g:593:1: rule__NodeType__Group_4__1__Impl : ( ( rule__NodeType__StyleAssignment_4_1 ) ) ;
    public final void rule__NodeType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:597:1: ( ( ( rule__NodeType__StyleAssignment_4_1 ) ) )
            // InternalOntolizer.g:598:1: ( ( rule__NodeType__StyleAssignment_4_1 ) )
            {
            // InternalOntolizer.g:598:1: ( ( rule__NodeType__StyleAssignment_4_1 ) )
            // InternalOntolizer.g:599:2: ( rule__NodeType__StyleAssignment_4_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getStyleAssignment_4_1()); 
            // InternalOntolizer.g:600:2: ( rule__NodeType__StyleAssignment_4_1 )
            // InternalOntolizer.g:600:3: rule__NodeType__StyleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__StyleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getStyleAssignment_4_1()); 

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
    // $ANTLR end "rule__NodeType__Group_4__1__Impl"


    // $ANTLR start "rule__EdgeType__Group__0"
    // InternalOntolizer.g:609:1: rule__EdgeType__Group__0 : rule__EdgeType__Group__0__Impl rule__EdgeType__Group__1 ;
    public final void rule__EdgeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:613:1: ( rule__EdgeType__Group__0__Impl rule__EdgeType__Group__1 )
            // InternalOntolizer.g:614:2: rule__EdgeType__Group__0__Impl rule__EdgeType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EdgeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeType__Group__1();

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
    // $ANTLR end "rule__EdgeType__Group__0"


    // $ANTLR start "rule__EdgeType__Group__0__Impl"
    // InternalOntolizer.g:621:1: rule__EdgeType__Group__0__Impl : ( 'EdgeType' ) ;
    public final void rule__EdgeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:625:1: ( ( 'EdgeType' ) )
            // InternalOntolizer.g:626:1: ( 'EdgeType' )
            {
            // InternalOntolizer.g:626:1: ( 'EdgeType' )
            // InternalOntolizer.g:627:2: 'EdgeType'
            {
             before(grammarAccess.getEdgeTypeAccess().getEdgeTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEdgeTypeAccess().getEdgeTypeKeyword_0()); 

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
    // $ANTLR end "rule__EdgeType__Group__0__Impl"


    // $ANTLR start "rule__EdgeType__Group__1"
    // InternalOntolizer.g:636:1: rule__EdgeType__Group__1 : rule__EdgeType__Group__1__Impl rule__EdgeType__Group__2 ;
    public final void rule__EdgeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:640:1: ( rule__EdgeType__Group__1__Impl rule__EdgeType__Group__2 )
            // InternalOntolizer.g:641:2: rule__EdgeType__Group__1__Impl rule__EdgeType__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EdgeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeType__Group__2();

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
    // $ANTLR end "rule__EdgeType__Group__1"


    // $ANTLR start "rule__EdgeType__Group__1__Impl"
    // InternalOntolizer.g:648:1: rule__EdgeType__Group__1__Impl : ( ( rule__EdgeType__NameAssignment_1 ) ) ;
    public final void rule__EdgeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:652:1: ( ( ( rule__EdgeType__NameAssignment_1 ) ) )
            // InternalOntolizer.g:653:1: ( ( rule__EdgeType__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:653:1: ( ( rule__EdgeType__NameAssignment_1 ) )
            // InternalOntolizer.g:654:2: ( rule__EdgeType__NameAssignment_1 )
            {
             before(grammarAccess.getEdgeTypeAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:655:2: ( rule__EdgeType__NameAssignment_1 )
            // InternalOntolizer.g:655:3: rule__EdgeType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EdgeType__Group__1__Impl"


    // $ANTLR start "rule__EdgeType__Group__2"
    // InternalOntolizer.g:663:1: rule__EdgeType__Group__2 : rule__EdgeType__Group__2__Impl ;
    public final void rule__EdgeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:667:1: ( rule__EdgeType__Group__2__Impl )
            // InternalOntolizer.g:668:2: rule__EdgeType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeType__Group__2__Impl();

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
    // $ANTLR end "rule__EdgeType__Group__2"


    // $ANTLR start "rule__EdgeType__Group__2__Impl"
    // InternalOntolizer.g:674:1: rule__EdgeType__Group__2__Impl : ( ';' ) ;
    public final void rule__EdgeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:678:1: ( ( ';' ) )
            // InternalOntolizer.g:679:1: ( ';' )
            {
            // InternalOntolizer.g:679:1: ( ';' )
            // InternalOntolizer.g:680:2: ';'
            {
             before(grammarAccess.getEdgeTypeAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEdgeTypeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__EdgeType__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalOntolizer.g:690:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:694:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalOntolizer.g:695:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalOntolizer.g:702:1: rule__Node__Group__0__Impl : ( ( rule__Node__NodeTypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:706:1: ( ( ( rule__Node__NodeTypeAssignment_0 ) ) )
            // InternalOntolizer.g:707:1: ( ( rule__Node__NodeTypeAssignment_0 ) )
            {
            // InternalOntolizer.g:707:1: ( ( rule__Node__NodeTypeAssignment_0 ) )
            // InternalOntolizer.g:708:2: ( rule__Node__NodeTypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNodeTypeAssignment_0()); 
            // InternalOntolizer.g:709:2: ( rule__Node__NodeTypeAssignment_0 )
            // InternalOntolizer.g:709:3: rule__Node__NodeTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__NodeTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNodeTypeAssignment_0()); 

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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalOntolizer.g:717:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:721:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalOntolizer.g:722:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalOntolizer.g:729:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:733:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalOntolizer.g:734:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:734:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalOntolizer.g:735:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:736:2: ( rule__Node__NameAssignment_1 )
            // InternalOntolizer.g:736:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalOntolizer.g:744:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:748:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalOntolizer.g:749:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

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
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalOntolizer.g:756:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )* ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:760:1: ( ( ( rule__Node__Group_2__0 )* ) )
            // InternalOntolizer.g:761:1: ( ( rule__Node__Group_2__0 )* )
            {
            // InternalOntolizer.g:761:1: ( ( rule__Node__Group_2__0 )* )
            // InternalOntolizer.g:762:2: ( rule__Node__Group_2__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // InternalOntolizer.g:763:2: ( rule__Node__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOntolizer.g:763:3: rule__Node__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Node__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalOntolizer.g:771:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:775:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalOntolizer.g:776:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

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
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalOntolizer.g:783:1: rule__Node__Group__3__Impl : ( ( rule__Node__EdgeListsAssignment_3 )* ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:787:1: ( ( ( rule__Node__EdgeListsAssignment_3 )* ) )
            // InternalOntolizer.g:788:1: ( ( rule__Node__EdgeListsAssignment_3 )* )
            {
            // InternalOntolizer.g:788:1: ( ( rule__Node__EdgeListsAssignment_3 )* )
            // InternalOntolizer.g:789:2: ( rule__Node__EdgeListsAssignment_3 )*
            {
             before(grammarAccess.getNodeAccess().getEdgeListsAssignment_3()); 
            // InternalOntolizer.g:790:2: ( rule__Node__EdgeListsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOntolizer.g:790:3: rule__Node__EdgeListsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Node__EdgeListsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getEdgeListsAssignment_3()); 

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
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalOntolizer.g:798:1: rule__Node__Group__4 : rule__Node__Group__4__Impl ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:802:1: ( rule__Node__Group__4__Impl )
            // InternalOntolizer.g:803:2: rule__Node__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__4__Impl();

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
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalOntolizer.g:809:1: rule__Node__Group__4__Impl : ( ';' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:813:1: ( ( ';' ) )
            // InternalOntolizer.g:814:1: ( ';' )
            {
            // InternalOntolizer.g:814:1: ( ';' )
            // InternalOntolizer.g:815:2: ';'
            {
             before(grammarAccess.getNodeAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group_2__0"
    // InternalOntolizer.g:825:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:829:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // InternalOntolizer.g:830:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Node__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_2__1();

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
    // $ANTLR end "rule__Node__Group_2__0"


    // $ANTLR start "rule__Node__Group_2__0__Impl"
    // InternalOntolizer.g:837:1: rule__Node__Group_2__0__Impl : ( 'summary' ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:841:1: ( ( 'summary' ) )
            // InternalOntolizer.g:842:1: ( 'summary' )
            {
            // InternalOntolizer.g:842:1: ( 'summary' )
            // InternalOntolizer.g:843:2: 'summary'
            {
             before(grammarAccess.getNodeAccess().getSummaryKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSummaryKeyword_2_0()); 

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
    // $ANTLR end "rule__Node__Group_2__0__Impl"


    // $ANTLR start "rule__Node__Group_2__1"
    // InternalOntolizer.g:852:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:856:1: ( rule__Node__Group_2__1__Impl )
            // InternalOntolizer.g:857:2: rule__Node__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_2__1__Impl();

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
    // $ANTLR end "rule__Node__Group_2__1"


    // $ANTLR start "rule__Node__Group_2__1__Impl"
    // InternalOntolizer.g:863:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__SummaryAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:867:1: ( ( ( rule__Node__SummaryAssignment_2_1 ) ) )
            // InternalOntolizer.g:868:1: ( ( rule__Node__SummaryAssignment_2_1 ) )
            {
            // InternalOntolizer.g:868:1: ( ( rule__Node__SummaryAssignment_2_1 ) )
            // InternalOntolizer.g:869:2: ( rule__Node__SummaryAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getSummaryAssignment_2_1()); 
            // InternalOntolizer.g:870:2: ( rule__Node__SummaryAssignment_2_1 )
            // InternalOntolizer.g:870:3: rule__Node__SummaryAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__SummaryAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getSummaryAssignment_2_1()); 

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
    // $ANTLR end "rule__Node__Group_2__1__Impl"


    // $ANTLR start "rule__EdgeList__Group__0"
    // InternalOntolizer.g:879:1: rule__EdgeList__Group__0 : rule__EdgeList__Group__0__Impl rule__EdgeList__Group__1 ;
    public final void rule__EdgeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:883:1: ( rule__EdgeList__Group__0__Impl rule__EdgeList__Group__1 )
            // InternalOntolizer.g:884:2: rule__EdgeList__Group__0__Impl rule__EdgeList__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EdgeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeList__Group__1();

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
    // $ANTLR end "rule__EdgeList__Group__0"


    // $ANTLR start "rule__EdgeList__Group__0__Impl"
    // InternalOntolizer.g:891:1: rule__EdgeList__Group__0__Impl : ( ( rule__EdgeList__EdgeTypeAssignment_0 ) ) ;
    public final void rule__EdgeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:895:1: ( ( ( rule__EdgeList__EdgeTypeAssignment_0 ) ) )
            // InternalOntolizer.g:896:1: ( ( rule__EdgeList__EdgeTypeAssignment_0 ) )
            {
            // InternalOntolizer.g:896:1: ( ( rule__EdgeList__EdgeTypeAssignment_0 ) )
            // InternalOntolizer.g:897:2: ( rule__EdgeList__EdgeTypeAssignment_0 )
            {
             before(grammarAccess.getEdgeListAccess().getEdgeTypeAssignment_0()); 
            // InternalOntolizer.g:898:2: ( rule__EdgeList__EdgeTypeAssignment_0 )
            // InternalOntolizer.g:898:3: rule__EdgeList__EdgeTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeList__EdgeTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeListAccess().getEdgeTypeAssignment_0()); 

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
    // $ANTLR end "rule__EdgeList__Group__0__Impl"


    // $ANTLR start "rule__EdgeList__Group__1"
    // InternalOntolizer.g:906:1: rule__EdgeList__Group__1 : rule__EdgeList__Group__1__Impl rule__EdgeList__Group__2 ;
    public final void rule__EdgeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:910:1: ( rule__EdgeList__Group__1__Impl rule__EdgeList__Group__2 )
            // InternalOntolizer.g:911:2: rule__EdgeList__Group__1__Impl rule__EdgeList__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EdgeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeList__Group__2();

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
    // $ANTLR end "rule__EdgeList__Group__1"


    // $ANTLR start "rule__EdgeList__Group__1__Impl"
    // InternalOntolizer.g:918:1: rule__EdgeList__Group__1__Impl : ( ( rule__EdgeList__EdgesAssignment_1 ) ) ;
    public final void rule__EdgeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:922:1: ( ( ( rule__EdgeList__EdgesAssignment_1 ) ) )
            // InternalOntolizer.g:923:1: ( ( rule__EdgeList__EdgesAssignment_1 ) )
            {
            // InternalOntolizer.g:923:1: ( ( rule__EdgeList__EdgesAssignment_1 ) )
            // InternalOntolizer.g:924:2: ( rule__EdgeList__EdgesAssignment_1 )
            {
             before(grammarAccess.getEdgeListAccess().getEdgesAssignment_1()); 
            // InternalOntolizer.g:925:2: ( rule__EdgeList__EdgesAssignment_1 )
            // InternalOntolizer.g:925:3: rule__EdgeList__EdgesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeList__EdgesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeListAccess().getEdgesAssignment_1()); 

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
    // $ANTLR end "rule__EdgeList__Group__1__Impl"


    // $ANTLR start "rule__EdgeList__Group__2"
    // InternalOntolizer.g:933:1: rule__EdgeList__Group__2 : rule__EdgeList__Group__2__Impl ;
    public final void rule__EdgeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:937:1: ( rule__EdgeList__Group__2__Impl )
            // InternalOntolizer.g:938:2: rule__EdgeList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeList__Group__2__Impl();

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
    // $ANTLR end "rule__EdgeList__Group__2"


    // $ANTLR start "rule__EdgeList__Group__2__Impl"
    // InternalOntolizer.g:944:1: rule__EdgeList__Group__2__Impl : ( ( rule__EdgeList__Group_2__0 )* ) ;
    public final void rule__EdgeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:948:1: ( ( ( rule__EdgeList__Group_2__0 )* ) )
            // InternalOntolizer.g:949:1: ( ( rule__EdgeList__Group_2__0 )* )
            {
            // InternalOntolizer.g:949:1: ( ( rule__EdgeList__Group_2__0 )* )
            // InternalOntolizer.g:950:2: ( rule__EdgeList__Group_2__0 )*
            {
             before(grammarAccess.getEdgeListAccess().getGroup_2()); 
            // InternalOntolizer.g:951:2: ( rule__EdgeList__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntolizer.g:951:3: rule__EdgeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EdgeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEdgeListAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EdgeList__Group__2__Impl"


    // $ANTLR start "rule__EdgeList__Group_2__0"
    // InternalOntolizer.g:960:1: rule__EdgeList__Group_2__0 : rule__EdgeList__Group_2__0__Impl rule__EdgeList__Group_2__1 ;
    public final void rule__EdgeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:964:1: ( rule__EdgeList__Group_2__0__Impl rule__EdgeList__Group_2__1 )
            // InternalOntolizer.g:965:2: rule__EdgeList__Group_2__0__Impl rule__EdgeList__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__EdgeList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeList__Group_2__1();

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
    // $ANTLR end "rule__EdgeList__Group_2__0"


    // $ANTLR start "rule__EdgeList__Group_2__0__Impl"
    // InternalOntolizer.g:972:1: rule__EdgeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EdgeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:976:1: ( ( ',' ) )
            // InternalOntolizer.g:977:1: ( ',' )
            {
            // InternalOntolizer.g:977:1: ( ',' )
            // InternalOntolizer.g:978:2: ','
            {
             before(grammarAccess.getEdgeListAccess().getCommaKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEdgeListAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__EdgeList__Group_2__0__Impl"


    // $ANTLR start "rule__EdgeList__Group_2__1"
    // InternalOntolizer.g:987:1: rule__EdgeList__Group_2__1 : rule__EdgeList__Group_2__1__Impl ;
    public final void rule__EdgeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:991:1: ( rule__EdgeList__Group_2__1__Impl )
            // InternalOntolizer.g:992:2: rule__EdgeList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeList__Group_2__1__Impl();

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
    // $ANTLR end "rule__EdgeList__Group_2__1"


    // $ANTLR start "rule__EdgeList__Group_2__1__Impl"
    // InternalOntolizer.g:998:1: rule__EdgeList__Group_2__1__Impl : ( ( rule__EdgeList__EdgesAssignment_2_1 ) ) ;
    public final void rule__EdgeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1002:1: ( ( ( rule__EdgeList__EdgesAssignment_2_1 ) ) )
            // InternalOntolizer.g:1003:1: ( ( rule__EdgeList__EdgesAssignment_2_1 ) )
            {
            // InternalOntolizer.g:1003:1: ( ( rule__EdgeList__EdgesAssignment_2_1 ) )
            // InternalOntolizer.g:1004:2: ( rule__EdgeList__EdgesAssignment_2_1 )
            {
             before(grammarAccess.getEdgeListAccess().getEdgesAssignment_2_1()); 
            // InternalOntolizer.g:1005:2: ( rule__EdgeList__EdgesAssignment_2_1 )
            // InternalOntolizer.g:1005:3: rule__EdgeList__EdgesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeList__EdgesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeListAccess().getEdgesAssignment_2_1()); 

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
    // $ANTLR end "rule__EdgeList__Group_2__1__Impl"


    // $ANTLR start "rule__View__Group__0"
    // InternalOntolizer.g:1014:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1018:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // InternalOntolizer.g:1019:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__1();

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
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // InternalOntolizer.g:1026:1: rule__View__Group__0__Impl : ( 'View' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1030:1: ( ( 'View' ) )
            // InternalOntolizer.g:1031:1: ( 'View' )
            {
            // InternalOntolizer.g:1031:1: ( 'View' )
            // InternalOntolizer.g:1032:2: 'View'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getViewKeyword_0()); 

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
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // InternalOntolizer.g:1041:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1045:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // InternalOntolizer.g:1046:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__2();

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
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // InternalOntolizer.g:1053:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1057:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // InternalOntolizer.g:1058:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:1058:1: ( ( rule__View__NameAssignment_1 ) )
            // InternalOntolizer.g:1059:2: ( rule__View__NameAssignment_1 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:1060:2: ( rule__View__NameAssignment_1 )
            // InternalOntolizer.g:1060:3: rule__View__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__View__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // InternalOntolizer.g:1068:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1072:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // InternalOntolizer.g:1073:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__3();

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
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // InternalOntolizer.g:1080:1: rule__View__Group__2__Impl : ( ( rule__View__Group_2__0 )? ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1084:1: ( ( ( rule__View__Group_2__0 )? ) )
            // InternalOntolizer.g:1085:1: ( ( rule__View__Group_2__0 )? )
            {
            // InternalOntolizer.g:1085:1: ( ( rule__View__Group_2__0 )? )
            // InternalOntolizer.g:1086:2: ( rule__View__Group_2__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_2()); 
            // InternalOntolizer.g:1087:2: ( rule__View__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntolizer.g:1087:3: rule__View__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_2()); 

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
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group__3"
    // InternalOntolizer.g:1095:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1099:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // InternalOntolizer.g:1100:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__4();

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
    // $ANTLR end "rule__View__Group__3"


    // $ANTLR start "rule__View__Group__3__Impl"
    // InternalOntolizer.g:1107:1: rule__View__Group__3__Impl : ( ( rule__View__Group_3__0 )? ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1111:1: ( ( ( rule__View__Group_3__0 )? ) )
            // InternalOntolizer.g:1112:1: ( ( rule__View__Group_3__0 )? )
            {
            // InternalOntolizer.g:1112:1: ( ( rule__View__Group_3__0 )? )
            // InternalOntolizer.g:1113:2: ( rule__View__Group_3__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3()); 
            // InternalOntolizer.g:1114:2: ( rule__View__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntolizer.g:1114:3: rule__View__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_3()); 

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
    // $ANTLR end "rule__View__Group__3__Impl"


    // $ANTLR start "rule__View__Group__4"
    // InternalOntolizer.g:1122:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1126:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // InternalOntolizer.g:1127:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__5();

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
    // $ANTLR end "rule__View__Group__4"


    // $ANTLR start "rule__View__Group__4__Impl"
    // InternalOntolizer.g:1134:1: rule__View__Group__4__Impl : ( ( rule__View__Group_4__0 )? ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1138:1: ( ( ( rule__View__Group_4__0 )? ) )
            // InternalOntolizer.g:1139:1: ( ( rule__View__Group_4__0 )? )
            {
            // InternalOntolizer.g:1139:1: ( ( rule__View__Group_4__0 )? )
            // InternalOntolizer.g:1140:2: ( rule__View__Group_4__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_4()); 
            // InternalOntolizer.g:1141:2: ( rule__View__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntolizer.g:1141:3: rule__View__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_4()); 

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
    // $ANTLR end "rule__View__Group__4__Impl"


    // $ANTLR start "rule__View__Group__5"
    // InternalOntolizer.g:1149:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1153:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // InternalOntolizer.g:1154:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__6();

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
    // $ANTLR end "rule__View__Group__5"


    // $ANTLR start "rule__View__Group__5__Impl"
    // InternalOntolizer.g:1161:1: rule__View__Group__5__Impl : ( ( rule__View__Group_5__0 )? ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1165:1: ( ( ( rule__View__Group_5__0 )? ) )
            // InternalOntolizer.g:1166:1: ( ( rule__View__Group_5__0 )? )
            {
            // InternalOntolizer.g:1166:1: ( ( rule__View__Group_5__0 )? )
            // InternalOntolizer.g:1167:2: ( rule__View__Group_5__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_5()); 
            // InternalOntolizer.g:1168:2: ( rule__View__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntolizer.g:1168:3: rule__View__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_5()); 

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
    // $ANTLR end "rule__View__Group__5__Impl"


    // $ANTLR start "rule__View__Group__6"
    // InternalOntolizer.g:1176:1: rule__View__Group__6 : rule__View__Group__6__Impl ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1180:1: ( rule__View__Group__6__Impl )
            // InternalOntolizer.g:1181:2: rule__View__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group__6__Impl();

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
    // $ANTLR end "rule__View__Group__6"


    // $ANTLR start "rule__View__Group__6__Impl"
    // InternalOntolizer.g:1187:1: rule__View__Group__6__Impl : ( ';' ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1191:1: ( ( ';' ) )
            // InternalOntolizer.g:1192:1: ( ';' )
            {
            // InternalOntolizer.g:1192:1: ( ';' )
            // InternalOntolizer.g:1193:2: ';'
            {
             before(grammarAccess.getViewAccess().getSemicolonKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__View__Group__6__Impl"


    // $ANTLR start "rule__View__Group_2__0"
    // InternalOntolizer.g:1203:1: rule__View__Group_2__0 : rule__View__Group_2__0__Impl rule__View__Group_2__1 ;
    public final void rule__View__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1207:1: ( rule__View__Group_2__0__Impl rule__View__Group_2__1 )
            // InternalOntolizer.g:1208:2: rule__View__Group_2__0__Impl rule__View__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_2__1();

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
    // $ANTLR end "rule__View__Group_2__0"


    // $ANTLR start "rule__View__Group_2__0__Impl"
    // InternalOntolizer.g:1215:1: rule__View__Group_2__0__Impl : ( 'edgeTypes' ) ;
    public final void rule__View__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1219:1: ( ( 'edgeTypes' ) )
            // InternalOntolizer.g:1220:1: ( 'edgeTypes' )
            {
            // InternalOntolizer.g:1220:1: ( 'edgeTypes' )
            // InternalOntolizer.g:1221:2: 'edgeTypes'
            {
             before(grammarAccess.getViewAccess().getEdgeTypesKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getEdgeTypesKeyword_2_0()); 

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
    // $ANTLR end "rule__View__Group_2__0__Impl"


    // $ANTLR start "rule__View__Group_2__1"
    // InternalOntolizer.g:1230:1: rule__View__Group_2__1 : rule__View__Group_2__1__Impl rule__View__Group_2__2 ;
    public final void rule__View__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1234:1: ( rule__View__Group_2__1__Impl rule__View__Group_2__2 )
            // InternalOntolizer.g:1235:2: rule__View__Group_2__1__Impl rule__View__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__View__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_2__2();

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
    // $ANTLR end "rule__View__Group_2__1"


    // $ANTLR start "rule__View__Group_2__1__Impl"
    // InternalOntolizer.g:1242:1: rule__View__Group_2__1__Impl : ( ( rule__View__EdgeTypesAssignment_2_1 ) ) ;
    public final void rule__View__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1246:1: ( ( ( rule__View__EdgeTypesAssignment_2_1 ) ) )
            // InternalOntolizer.g:1247:1: ( ( rule__View__EdgeTypesAssignment_2_1 ) )
            {
            // InternalOntolizer.g:1247:1: ( ( rule__View__EdgeTypesAssignment_2_1 ) )
            // InternalOntolizer.g:1248:2: ( rule__View__EdgeTypesAssignment_2_1 )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_1()); 
            // InternalOntolizer.g:1249:2: ( rule__View__EdgeTypesAssignment_2_1 )
            // InternalOntolizer.g:1249:3: rule__View__EdgeTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__View__EdgeTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_1()); 

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
    // $ANTLR end "rule__View__Group_2__1__Impl"


    // $ANTLR start "rule__View__Group_2__2"
    // InternalOntolizer.g:1257:1: rule__View__Group_2__2 : rule__View__Group_2__2__Impl ;
    public final void rule__View__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1261:1: ( rule__View__Group_2__2__Impl )
            // InternalOntolizer.g:1262:2: rule__View__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_2__2__Impl();

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
    // $ANTLR end "rule__View__Group_2__2"


    // $ANTLR start "rule__View__Group_2__2__Impl"
    // InternalOntolizer.g:1268:1: rule__View__Group_2__2__Impl : ( ( rule__View__Group_2_2__0 )* ) ;
    public final void rule__View__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1272:1: ( ( ( rule__View__Group_2_2__0 )* ) )
            // InternalOntolizer.g:1273:1: ( ( rule__View__Group_2_2__0 )* )
            {
            // InternalOntolizer.g:1273:1: ( ( rule__View__Group_2_2__0 )* )
            // InternalOntolizer.g:1274:2: ( rule__View__Group_2_2__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_2_2()); 
            // InternalOntolizer.g:1275:2: ( rule__View__Group_2_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntolizer.g:1275:3: rule__View__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__View__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__View__Group_2__2__Impl"


    // $ANTLR start "rule__View__Group_2_2__0"
    // InternalOntolizer.g:1284:1: rule__View__Group_2_2__0 : rule__View__Group_2_2__0__Impl rule__View__Group_2_2__1 ;
    public final void rule__View__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1288:1: ( rule__View__Group_2_2__0__Impl rule__View__Group_2_2__1 )
            // InternalOntolizer.g:1289:2: rule__View__Group_2_2__0__Impl rule__View__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_2_2__1();

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
    // $ANTLR end "rule__View__Group_2_2__0"


    // $ANTLR start "rule__View__Group_2_2__0__Impl"
    // InternalOntolizer.g:1296:1: rule__View__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__View__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1300:1: ( ( ',' ) )
            // InternalOntolizer.g:1301:1: ( ',' )
            {
            // InternalOntolizer.g:1301:1: ( ',' )
            // InternalOntolizer.g:1302:2: ','
            {
             before(grammarAccess.getViewAccess().getCommaKeyword_2_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__View__Group_2_2__0__Impl"


    // $ANTLR start "rule__View__Group_2_2__1"
    // InternalOntolizer.g:1311:1: rule__View__Group_2_2__1 : rule__View__Group_2_2__1__Impl ;
    public final void rule__View__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1315:1: ( rule__View__Group_2_2__1__Impl )
            // InternalOntolizer.g:1316:2: rule__View__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__View__Group_2_2__1"


    // $ANTLR start "rule__View__Group_2_2__1__Impl"
    // InternalOntolizer.g:1322:1: rule__View__Group_2_2__1__Impl : ( ( rule__View__EdgeTypesAssignment_2_2_1 ) ) ;
    public final void rule__View__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1326:1: ( ( ( rule__View__EdgeTypesAssignment_2_2_1 ) ) )
            // InternalOntolizer.g:1327:1: ( ( rule__View__EdgeTypesAssignment_2_2_1 ) )
            {
            // InternalOntolizer.g:1327:1: ( ( rule__View__EdgeTypesAssignment_2_2_1 ) )
            // InternalOntolizer.g:1328:2: ( rule__View__EdgeTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_2_1()); 
            // InternalOntolizer.g:1329:2: ( rule__View__EdgeTypesAssignment_2_2_1 )
            // InternalOntolizer.g:1329:3: rule__View__EdgeTypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__View__EdgeTypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__View__Group_2_2__1__Impl"


    // $ANTLR start "rule__View__Group_3__0"
    // InternalOntolizer.g:1338:1: rule__View__Group_3__0 : rule__View__Group_3__0__Impl rule__View__Group_3__1 ;
    public final void rule__View__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1342:1: ( rule__View__Group_3__0__Impl rule__View__Group_3__1 )
            // InternalOntolizer.g:1343:2: rule__View__Group_3__0__Impl rule__View__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_3__1();

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
    // $ANTLR end "rule__View__Group_3__0"


    // $ANTLR start "rule__View__Group_3__0__Impl"
    // InternalOntolizer.g:1350:1: rule__View__Group_3__0__Impl : ( 'nodeTypes' ) ;
    public final void rule__View__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1354:1: ( ( 'nodeTypes' ) )
            // InternalOntolizer.g:1355:1: ( 'nodeTypes' )
            {
            // InternalOntolizer.g:1355:1: ( 'nodeTypes' )
            // InternalOntolizer.g:1356:2: 'nodeTypes'
            {
             before(grammarAccess.getViewAccess().getNodeTypesKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getNodeTypesKeyword_3_0()); 

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
    // $ANTLR end "rule__View__Group_3__0__Impl"


    // $ANTLR start "rule__View__Group_3__1"
    // InternalOntolizer.g:1365:1: rule__View__Group_3__1 : rule__View__Group_3__1__Impl rule__View__Group_3__2 ;
    public final void rule__View__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1369:1: ( rule__View__Group_3__1__Impl rule__View__Group_3__2 )
            // InternalOntolizer.g:1370:2: rule__View__Group_3__1__Impl rule__View__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__View__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_3__2();

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
    // $ANTLR end "rule__View__Group_3__1"


    // $ANTLR start "rule__View__Group_3__1__Impl"
    // InternalOntolizer.g:1377:1: rule__View__Group_3__1__Impl : ( ( rule__View__NodeTypesAssignment_3_1 ) ) ;
    public final void rule__View__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1381:1: ( ( ( rule__View__NodeTypesAssignment_3_1 ) ) )
            // InternalOntolizer.g:1382:1: ( ( rule__View__NodeTypesAssignment_3_1 ) )
            {
            // InternalOntolizer.g:1382:1: ( ( rule__View__NodeTypesAssignment_3_1 ) )
            // InternalOntolizer.g:1383:2: ( rule__View__NodeTypesAssignment_3_1 )
            {
             before(grammarAccess.getViewAccess().getNodeTypesAssignment_3_1()); 
            // InternalOntolizer.g:1384:2: ( rule__View__NodeTypesAssignment_3_1 )
            // InternalOntolizer.g:1384:3: rule__View__NodeTypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__View__NodeTypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNodeTypesAssignment_3_1()); 

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
    // $ANTLR end "rule__View__Group_3__1__Impl"


    // $ANTLR start "rule__View__Group_3__2"
    // InternalOntolizer.g:1392:1: rule__View__Group_3__2 : rule__View__Group_3__2__Impl ;
    public final void rule__View__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1396:1: ( rule__View__Group_3__2__Impl )
            // InternalOntolizer.g:1397:2: rule__View__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_3__2__Impl();

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
    // $ANTLR end "rule__View__Group_3__2"


    // $ANTLR start "rule__View__Group_3__2__Impl"
    // InternalOntolizer.g:1403:1: rule__View__Group_3__2__Impl : ( ( rule__View__Group_3_2__0 )* ) ;
    public final void rule__View__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1407:1: ( ( ( rule__View__Group_3_2__0 )* ) )
            // InternalOntolizer.g:1408:1: ( ( rule__View__Group_3_2__0 )* )
            {
            // InternalOntolizer.g:1408:1: ( ( rule__View__Group_3_2__0 )* )
            // InternalOntolizer.g:1409:2: ( rule__View__Group_3_2__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_3_2()); 
            // InternalOntolizer.g:1410:2: ( rule__View__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOntolizer.g:1410:3: rule__View__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__View__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__View__Group_3__2__Impl"


    // $ANTLR start "rule__View__Group_3_2__0"
    // InternalOntolizer.g:1419:1: rule__View__Group_3_2__0 : rule__View__Group_3_2__0__Impl rule__View__Group_3_2__1 ;
    public final void rule__View__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1423:1: ( rule__View__Group_3_2__0__Impl rule__View__Group_3_2__1 )
            // InternalOntolizer.g:1424:2: rule__View__Group_3_2__0__Impl rule__View__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_3_2__1();

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
    // $ANTLR end "rule__View__Group_3_2__0"


    // $ANTLR start "rule__View__Group_3_2__0__Impl"
    // InternalOntolizer.g:1431:1: rule__View__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__View__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1435:1: ( ( ',' ) )
            // InternalOntolizer.g:1436:1: ( ',' )
            {
            // InternalOntolizer.g:1436:1: ( ',' )
            // InternalOntolizer.g:1437:2: ','
            {
             before(grammarAccess.getViewAccess().getCommaKeyword_3_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__View__Group_3_2__0__Impl"


    // $ANTLR start "rule__View__Group_3_2__1"
    // InternalOntolizer.g:1446:1: rule__View__Group_3_2__1 : rule__View__Group_3_2__1__Impl ;
    public final void rule__View__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1450:1: ( rule__View__Group_3_2__1__Impl )
            // InternalOntolizer.g:1451:2: rule__View__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__View__Group_3_2__1"


    // $ANTLR start "rule__View__Group_3_2__1__Impl"
    // InternalOntolizer.g:1457:1: rule__View__Group_3_2__1__Impl : ( ( rule__View__NodeTypesAssignment_3_2_1 ) ) ;
    public final void rule__View__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1461:1: ( ( ( rule__View__NodeTypesAssignment_3_2_1 ) ) )
            // InternalOntolizer.g:1462:1: ( ( rule__View__NodeTypesAssignment_3_2_1 ) )
            {
            // InternalOntolizer.g:1462:1: ( ( rule__View__NodeTypesAssignment_3_2_1 ) )
            // InternalOntolizer.g:1463:2: ( rule__View__NodeTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getViewAccess().getNodeTypesAssignment_3_2_1()); 
            // InternalOntolizer.g:1464:2: ( rule__View__NodeTypesAssignment_3_2_1 )
            // InternalOntolizer.g:1464:3: rule__View__NodeTypesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__View__NodeTypesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNodeTypesAssignment_3_2_1()); 

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
    // $ANTLR end "rule__View__Group_3_2__1__Impl"


    // $ANTLR start "rule__View__Group_4__0"
    // InternalOntolizer.g:1473:1: rule__View__Group_4__0 : rule__View__Group_4__0__Impl rule__View__Group_4__1 ;
    public final void rule__View__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1477:1: ( rule__View__Group_4__0__Impl rule__View__Group_4__1 )
            // InternalOntolizer.g:1478:2: rule__View__Group_4__0__Impl rule__View__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_4__1();

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
    // $ANTLR end "rule__View__Group_4__0"


    // $ANTLR start "rule__View__Group_4__0__Impl"
    // InternalOntolizer.g:1485:1: rule__View__Group_4__0__Impl : ( 'node' ) ;
    public final void rule__View__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1489:1: ( ( 'node' ) )
            // InternalOntolizer.g:1490:1: ( 'node' )
            {
            // InternalOntolizer.g:1490:1: ( 'node' )
            // InternalOntolizer.g:1491:2: 'node'
            {
             before(grammarAccess.getViewAccess().getNodeKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getNodeKeyword_4_0()); 

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
    // $ANTLR end "rule__View__Group_4__0__Impl"


    // $ANTLR start "rule__View__Group_4__1"
    // InternalOntolizer.g:1500:1: rule__View__Group_4__1 : rule__View__Group_4__1__Impl ;
    public final void rule__View__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1504:1: ( rule__View__Group_4__1__Impl )
            // InternalOntolizer.g:1505:2: rule__View__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_4__1__Impl();

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
    // $ANTLR end "rule__View__Group_4__1"


    // $ANTLR start "rule__View__Group_4__1__Impl"
    // InternalOntolizer.g:1511:1: rule__View__Group_4__1__Impl : ( ( rule__View__NodeAssignment_4_1 ) ) ;
    public final void rule__View__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1515:1: ( ( ( rule__View__NodeAssignment_4_1 ) ) )
            // InternalOntolizer.g:1516:1: ( ( rule__View__NodeAssignment_4_1 ) )
            {
            // InternalOntolizer.g:1516:1: ( ( rule__View__NodeAssignment_4_1 ) )
            // InternalOntolizer.g:1517:2: ( rule__View__NodeAssignment_4_1 )
            {
             before(grammarAccess.getViewAccess().getNodeAssignment_4_1()); 
            // InternalOntolizer.g:1518:2: ( rule__View__NodeAssignment_4_1 )
            // InternalOntolizer.g:1518:3: rule__View__NodeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__View__NodeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNodeAssignment_4_1()); 

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
    // $ANTLR end "rule__View__Group_4__1__Impl"


    // $ANTLR start "rule__View__Group_5__0"
    // InternalOntolizer.g:1527:1: rule__View__Group_5__0 : rule__View__Group_5__0__Impl rule__View__Group_5__1 ;
    public final void rule__View__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1531:1: ( rule__View__Group_5__0__Impl rule__View__Group_5__1 )
            // InternalOntolizer.g:1532:2: rule__View__Group_5__0__Impl rule__View__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__View__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_5__1();

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
    // $ANTLR end "rule__View__Group_5__0"


    // $ANTLR start "rule__View__Group_5__0__Impl"
    // InternalOntolizer.g:1539:1: rule__View__Group_5__0__Impl : ( 'depth' ) ;
    public final void rule__View__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1543:1: ( ( 'depth' ) )
            // InternalOntolizer.g:1544:1: ( 'depth' )
            {
            // InternalOntolizer.g:1544:1: ( 'depth' )
            // InternalOntolizer.g:1545:2: 'depth'
            {
             before(grammarAccess.getViewAccess().getDepthKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getDepthKeyword_5_0()); 

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
    // $ANTLR end "rule__View__Group_5__0__Impl"


    // $ANTLR start "rule__View__Group_5__1"
    // InternalOntolizer.g:1554:1: rule__View__Group_5__1 : rule__View__Group_5__1__Impl ;
    public final void rule__View__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1558:1: ( rule__View__Group_5__1__Impl )
            // InternalOntolizer.g:1559:2: rule__View__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_5__1__Impl();

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
    // $ANTLR end "rule__View__Group_5__1"


    // $ANTLR start "rule__View__Group_5__1__Impl"
    // InternalOntolizer.g:1565:1: rule__View__Group_5__1__Impl : ( ( rule__View__DepthAssignment_5_1 ) ) ;
    public final void rule__View__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1569:1: ( ( ( rule__View__DepthAssignment_5_1 ) ) )
            // InternalOntolizer.g:1570:1: ( ( rule__View__DepthAssignment_5_1 ) )
            {
            // InternalOntolizer.g:1570:1: ( ( rule__View__DepthAssignment_5_1 ) )
            // InternalOntolizer.g:1571:2: ( rule__View__DepthAssignment_5_1 )
            {
             before(grammarAccess.getViewAccess().getDepthAssignment_5_1()); 
            // InternalOntolizer.g:1572:2: ( rule__View__DepthAssignment_5_1 )
            // InternalOntolizer.g:1572:3: rule__View__DepthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__View__DepthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getDepthAssignment_5_1()); 

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
    // $ANTLR end "rule__View__Group_5__1__Impl"


    // $ANTLR start "rule__DepthRange__Group__0"
    // InternalOntolizer.g:1581:1: rule__DepthRange__Group__0 : rule__DepthRange__Group__0__Impl rule__DepthRange__Group__1 ;
    public final void rule__DepthRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1585:1: ( rule__DepthRange__Group__0__Impl rule__DepthRange__Group__1 )
            // InternalOntolizer.g:1586:2: rule__DepthRange__Group__0__Impl rule__DepthRange__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DepthRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DepthRange__Group__1();

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
    // $ANTLR end "rule__DepthRange__Group__0"


    // $ANTLR start "rule__DepthRange__Group__0__Impl"
    // InternalOntolizer.g:1593:1: rule__DepthRange__Group__0__Impl : ( ( rule__DepthRange__StartAssignment_0 ) ) ;
    public final void rule__DepthRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1597:1: ( ( ( rule__DepthRange__StartAssignment_0 ) ) )
            // InternalOntolizer.g:1598:1: ( ( rule__DepthRange__StartAssignment_0 ) )
            {
            // InternalOntolizer.g:1598:1: ( ( rule__DepthRange__StartAssignment_0 ) )
            // InternalOntolizer.g:1599:2: ( rule__DepthRange__StartAssignment_0 )
            {
             before(grammarAccess.getDepthRangeAccess().getStartAssignment_0()); 
            // InternalOntolizer.g:1600:2: ( rule__DepthRange__StartAssignment_0 )
            // InternalOntolizer.g:1600:3: rule__DepthRange__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DepthRange__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDepthRangeAccess().getStartAssignment_0()); 

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
    // $ANTLR end "rule__DepthRange__Group__0__Impl"


    // $ANTLR start "rule__DepthRange__Group__1"
    // InternalOntolizer.g:1608:1: rule__DepthRange__Group__1 : rule__DepthRange__Group__1__Impl ;
    public final void rule__DepthRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1612:1: ( rule__DepthRange__Group__1__Impl )
            // InternalOntolizer.g:1613:2: rule__DepthRange__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DepthRange__Group__1__Impl();

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
    // $ANTLR end "rule__DepthRange__Group__1"


    // $ANTLR start "rule__DepthRange__Group__1__Impl"
    // InternalOntolizer.g:1619:1: rule__DepthRange__Group__1__Impl : ( ( rule__DepthRange__Group_1__0 )? ) ;
    public final void rule__DepthRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1623:1: ( ( ( rule__DepthRange__Group_1__0 )? ) )
            // InternalOntolizer.g:1624:1: ( ( rule__DepthRange__Group_1__0 )? )
            {
            // InternalOntolizer.g:1624:1: ( ( rule__DepthRange__Group_1__0 )? )
            // InternalOntolizer.g:1625:2: ( rule__DepthRange__Group_1__0 )?
            {
             before(grammarAccess.getDepthRangeAccess().getGroup_1()); 
            // InternalOntolizer.g:1626:2: ( rule__DepthRange__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntolizer.g:1626:3: rule__DepthRange__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DepthRange__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDepthRangeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DepthRange__Group__1__Impl"


    // $ANTLR start "rule__DepthRange__Group_1__0"
    // InternalOntolizer.g:1635:1: rule__DepthRange__Group_1__0 : rule__DepthRange__Group_1__0__Impl rule__DepthRange__Group_1__1 ;
    public final void rule__DepthRange__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1639:1: ( rule__DepthRange__Group_1__0__Impl rule__DepthRange__Group_1__1 )
            // InternalOntolizer.g:1640:2: rule__DepthRange__Group_1__0__Impl rule__DepthRange__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__DepthRange__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DepthRange__Group_1__1();

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
    // $ANTLR end "rule__DepthRange__Group_1__0"


    // $ANTLR start "rule__DepthRange__Group_1__0__Impl"
    // InternalOntolizer.g:1647:1: rule__DepthRange__Group_1__0__Impl : ( '..' ) ;
    public final void rule__DepthRange__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1651:1: ( ( '..' ) )
            // InternalOntolizer.g:1652:1: ( '..' )
            {
            // InternalOntolizer.g:1652:1: ( '..' )
            // InternalOntolizer.g:1653:2: '..'
            {
             before(grammarAccess.getDepthRangeAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDepthRangeAccess().getFullStopFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__DepthRange__Group_1__0__Impl"


    // $ANTLR start "rule__DepthRange__Group_1__1"
    // InternalOntolizer.g:1662:1: rule__DepthRange__Group_1__1 : rule__DepthRange__Group_1__1__Impl ;
    public final void rule__DepthRange__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1666:1: ( rule__DepthRange__Group_1__1__Impl )
            // InternalOntolizer.g:1667:2: rule__DepthRange__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DepthRange__Group_1__1__Impl();

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
    // $ANTLR end "rule__DepthRange__Group_1__1"


    // $ANTLR start "rule__DepthRange__Group_1__1__Impl"
    // InternalOntolizer.g:1673:1: rule__DepthRange__Group_1__1__Impl : ( ( rule__DepthRange__EndAssignment_1_1 ) ) ;
    public final void rule__DepthRange__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1677:1: ( ( ( rule__DepthRange__EndAssignment_1_1 ) ) )
            // InternalOntolizer.g:1678:1: ( ( rule__DepthRange__EndAssignment_1_1 ) )
            {
            // InternalOntolizer.g:1678:1: ( ( rule__DepthRange__EndAssignment_1_1 ) )
            // InternalOntolizer.g:1679:2: ( rule__DepthRange__EndAssignment_1_1 )
            {
             before(grammarAccess.getDepthRangeAccess().getEndAssignment_1_1()); 
            // InternalOntolizer.g:1680:2: ( rule__DepthRange__EndAssignment_1_1 )
            // InternalOntolizer.g:1680:3: rule__DepthRange__EndAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DepthRange__EndAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDepthRangeAccess().getEndAssignment_1_1()); 

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
    // $ANTLR end "rule__DepthRange__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NodeTypesAssignment_0"
    // InternalOntolizer.g:1689:1: rule__Model__NodeTypesAssignment_0 : ( ruleNodeType ) ;
    public final void rule__Model__NodeTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1693:1: ( ( ruleNodeType ) )
            // InternalOntolizer.g:1694:2: ( ruleNodeType )
            {
            // InternalOntolizer.g:1694:2: ( ruleNodeType )
            // InternalOntolizer.g:1695:3: ruleNodeType
            {
             before(grammarAccess.getModelAccess().getNodeTypesNodeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodeTypesNodeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__NodeTypesAssignment_0"


    // $ANTLR start "rule__Model__EdgeTypesAssignment_1"
    // InternalOntolizer.g:1704:1: rule__Model__EdgeTypesAssignment_1 : ( ruleEdgeType ) ;
    public final void rule__Model__EdgeTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1708:1: ( ( ruleEdgeType ) )
            // InternalOntolizer.g:1709:2: ( ruleEdgeType )
            {
            // InternalOntolizer.g:1709:2: ( ruleEdgeType )
            // InternalOntolizer.g:1710:3: ruleEdgeType
            {
             before(grammarAccess.getModelAccess().getEdgeTypesEdgeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEdgeTypesEdgeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__EdgeTypesAssignment_1"


    // $ANTLR start "rule__Model__NodesAssignment_2"
    // InternalOntolizer.g:1719:1: rule__Model__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__Model__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1723:1: ( ( ruleNode ) )
            // InternalOntolizer.g:1724:2: ( ruleNode )
            {
            // InternalOntolizer.g:1724:2: ( ruleNode )
            // InternalOntolizer.g:1725:3: ruleNode
            {
             before(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NodesAssignment_2"


    // $ANTLR start "rule__Model__ViewsAssignment_3"
    // InternalOntolizer.g:1734:1: rule__Model__ViewsAssignment_3 : ( ruleView ) ;
    public final void rule__Model__ViewsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1738:1: ( ( ruleView ) )
            // InternalOntolizer.g:1739:2: ( ruleView )
            {
            // InternalOntolizer.g:1739:2: ( ruleView )
            // InternalOntolizer.g:1740:3: ruleView
            {
             before(grammarAccess.getModelAccess().getViewsViewParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleView();

            state._fsp--;

             after(grammarAccess.getModelAccess().getViewsViewParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__ViewsAssignment_3"


    // $ANTLR start "rule__NodeType__NameAssignment_1"
    // InternalOntolizer.g:1749:1: rule__NodeType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1753:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1754:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1754:2: ( RULE_ID )
            // InternalOntolizer.g:1755:3: RULE_ID
            {
             before(grammarAccess.getNodeTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NodeType__NameAssignment_1"


    // $ANTLR start "rule__NodeType__ShapeAssignment_2_1"
    // InternalOntolizer.g:1764:1: rule__NodeType__ShapeAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__NodeType__ShapeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1768:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1769:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1769:2: ( RULE_STRING )
            // InternalOntolizer.g:1770:3: RULE_STRING
            {
             before(grammarAccess.getNodeTypeAccess().getShapeSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getShapeSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__NodeType__ShapeAssignment_2_1"


    // $ANTLR start "rule__NodeType__ColorAssignment_3_1"
    // InternalOntolizer.g:1779:1: rule__NodeType__ColorAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__NodeType__ColorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1783:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1784:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1784:2: ( RULE_STRING )
            // InternalOntolizer.g:1785:3: RULE_STRING
            {
             before(grammarAccess.getNodeTypeAccess().getColorSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getColorSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NodeType__ColorAssignment_3_1"


    // $ANTLR start "rule__NodeType__StyleAssignment_4_1"
    // InternalOntolizer.g:1794:1: rule__NodeType__StyleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__NodeType__StyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1798:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1799:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1799:2: ( RULE_STRING )
            // InternalOntolizer.g:1800:3: RULE_STRING
            {
             before(grammarAccess.getNodeTypeAccess().getStyleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeTypeAccess().getStyleSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__NodeType__StyleAssignment_4_1"


    // $ANTLR start "rule__EdgeType__NameAssignment_1"
    // InternalOntolizer.g:1809:1: rule__EdgeType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EdgeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1813:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1814:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1814:2: ( RULE_ID )
            // InternalOntolizer.g:1815:3: RULE_ID
            {
             before(grammarAccess.getEdgeTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EdgeType__NameAssignment_1"


    // $ANTLR start "rule__Node__NodeTypeAssignment_0"
    // InternalOntolizer.g:1824:1: rule__Node__NodeTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__NodeTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1828:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1829:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1829:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1830:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getNodeTypeNodeTypeCrossReference_0_0()); 
            // InternalOntolizer.g:1831:3: ( RULE_ID )
            // InternalOntolizer.g:1832:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNodeTypeNodeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeTypeNodeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getNodeTypeNodeTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__Node__NodeTypeAssignment_0"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalOntolizer.g:1843:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1847:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1848:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1848:2: ( RULE_ID )
            // InternalOntolizer.g:1849:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__SummaryAssignment_2_1"
    // InternalOntolizer.g:1858:1: rule__Node__SummaryAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__SummaryAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1862:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1863:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1863:2: ( RULE_STRING )
            // InternalOntolizer.g:1864:3: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getSummarySTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSummarySTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Node__SummaryAssignment_2_1"


    // $ANTLR start "rule__Node__EdgeListsAssignment_3"
    // InternalOntolizer.g:1873:1: rule__Node__EdgeListsAssignment_3 : ( ruleEdgeList ) ;
    public final void rule__Node__EdgeListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1877:1: ( ( ruleEdgeList ) )
            // InternalOntolizer.g:1878:2: ( ruleEdgeList )
            {
            // InternalOntolizer.g:1878:2: ( ruleEdgeList )
            // InternalOntolizer.g:1879:3: ruleEdgeList
            {
             before(grammarAccess.getNodeAccess().getEdgeListsEdgeListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeList();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getEdgeListsEdgeListParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Node__EdgeListsAssignment_3"


    // $ANTLR start "rule__EdgeList__EdgeTypeAssignment_0"
    // InternalOntolizer.g:1888:1: rule__EdgeList__EdgeTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EdgeList__EdgeTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1892:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1893:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1893:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1894:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeListAccess().getEdgeTypeEdgeTypeCrossReference_0_0()); 
            // InternalOntolizer.g:1895:3: ( RULE_ID )
            // InternalOntolizer.g:1896:4: RULE_ID
            {
             before(grammarAccess.getEdgeListAccess().getEdgeTypeEdgeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeListAccess().getEdgeTypeEdgeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEdgeListAccess().getEdgeTypeEdgeTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__EdgeList__EdgeTypeAssignment_0"


    // $ANTLR start "rule__EdgeList__EdgesAssignment_1"
    // InternalOntolizer.g:1907:1: rule__EdgeList__EdgesAssignment_1 : ( ruleEdge ) ;
    public final void rule__EdgeList__EdgesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1911:1: ( ( ruleEdge ) )
            // InternalOntolizer.g:1912:2: ( ruleEdge )
            {
            // InternalOntolizer.g:1912:2: ( ruleEdge )
            // InternalOntolizer.g:1913:3: ruleEdge
            {
             before(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EdgeList__EdgesAssignment_1"


    // $ANTLR start "rule__EdgeList__EdgesAssignment_2_1"
    // InternalOntolizer.g:1922:1: rule__EdgeList__EdgesAssignment_2_1 : ( ruleEdge ) ;
    public final void rule__EdgeList__EdgesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1926:1: ( ( ruleEdge ) )
            // InternalOntolizer.g:1927:2: ( ruleEdge )
            {
            // InternalOntolizer.g:1927:2: ( ruleEdge )
            // InternalOntolizer.g:1928:3: ruleEdge
            {
             before(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EdgeList__EdgesAssignment_2_1"


    // $ANTLR start "rule__Edge__TargetNodeAssignment"
    // InternalOntolizer.g:1937:1: rule__Edge__TargetNodeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Edge__TargetNodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1941:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1942:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1942:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1943:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getTargetNodeNodeCrossReference_0()); 
            // InternalOntolizer.g:1944:3: ( RULE_ID )
            // InternalOntolizer.g:1945:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getTargetNodeNodeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getTargetNodeNodeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getTargetNodeNodeCrossReference_0()); 

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
    // $ANTLR end "rule__Edge__TargetNodeAssignment"


    // $ANTLR start "rule__View__NameAssignment_1"
    // InternalOntolizer.g:1956:1: rule__View__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1960:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1961:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1961:2: ( RULE_ID )
            // InternalOntolizer.g:1962:3: RULE_ID
            {
             before(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__View__NameAssignment_1"


    // $ANTLR start "rule__View__EdgeTypesAssignment_2_1"
    // InternalOntolizer.g:1971:1: rule__View__EdgeTypesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__EdgeTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1975:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1976:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1976:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1977:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_1_0()); 
            // InternalOntolizer.g:1978:3: ( RULE_ID )
            // InternalOntolizer.g:1979:4: RULE_ID
            {
             before(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__View__EdgeTypesAssignment_2_1"


    // $ANTLR start "rule__View__EdgeTypesAssignment_2_2_1"
    // InternalOntolizer.g:1990:1: rule__View__EdgeTypesAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__EdgeTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1994:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1995:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1995:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1996:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_2_1_0()); 
            // InternalOntolizer.g:1997:3: ( RULE_ID )
            // InternalOntolizer.g:1998:4: RULE_ID
            {
             before(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__View__EdgeTypesAssignment_2_2_1"


    // $ANTLR start "rule__View__NodeTypesAssignment_3_1"
    // InternalOntolizer.g:2009:1: rule__View__NodeTypesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__NodeTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:2013:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:2014:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:2014:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:2015:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_1_0()); 
            // InternalOntolizer.g:2016:3: ( RULE_ID )
            // InternalOntolizer.g:2017:4: RULE_ID
            {
             before(grammarAccess.getViewAccess().getNodeTypesNodeTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getNodeTypesNodeTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__View__NodeTypesAssignment_3_1"


    // $ANTLR start "rule__View__NodeTypesAssignment_3_2_1"
    // InternalOntolizer.g:2028:1: rule__View__NodeTypesAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__NodeTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:2032:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:2033:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:2033:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:2034:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_2_1_0()); 
            // InternalOntolizer.g:2035:3: ( RULE_ID )
            // InternalOntolizer.g:2036:4: RULE_ID
            {
             before(grammarAccess.getViewAccess().getNodeTypesNodeTypeIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getNodeTypesNodeTypeIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_2_1_0()); 

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
    // $ANTLR end "rule__View__NodeTypesAssignment_3_2_1"


    // $ANTLR start "rule__View__NodeAssignment_4_1"
    // InternalOntolizer.g:2047:1: rule__View__NodeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__NodeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:2051:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:2052:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:2052:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:2053:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getNodeNodeCrossReference_4_1_0()); 
            // InternalOntolizer.g:2054:3: ( RULE_ID )
            // InternalOntolizer.g:2055:4: RULE_ID
            {
             before(grammarAccess.getViewAccess().getNodeNodeIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getNodeNodeIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getViewAccess().getNodeNodeCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__View__NodeAssignment_4_1"


    // $ANTLR start "rule__View__DepthAssignment_5_1"
    // InternalOntolizer.g:2066:1: rule__View__DepthAssignment_5_1 : ( ruleDepthRange ) ;
    public final void rule__View__DepthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:2070:1: ( ( ruleDepthRange ) )
            // InternalOntolizer.g:2071:2: ( ruleDepthRange )
            {
            // InternalOntolizer.g:2071:2: ( ruleDepthRange )
            // InternalOntolizer.g:2072:3: ruleDepthRange
            {
             before(grammarAccess.getViewAccess().getDepthDepthRangeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDepthRange();

            state._fsp--;

             after(grammarAccess.getViewAccess().getDepthDepthRangeParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__View__DepthAssignment_5_1"


    // $ANTLR start "rule__DepthRange__StartAssignment_0"
    // InternalOntolizer.g:2081:1: rule__DepthRange__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__DepthRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:2085:1: ( ( RULE_INT ) )
            // InternalOntolizer.g:2086:2: ( RULE_INT )
            {
            // InternalOntolizer.g:2086:2: ( RULE_INT )
            // InternalOntolizer.g:2087:3: RULE_INT
            {
             before(grammarAccess.getDepthRangeAccess().getStartINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDepthRangeAccess().getStartINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DepthRange__StartAssignment_0"


    // $ANTLR start "rule__DepthRange__EndAssignment_1_1"
    // InternalOntolizer.g:2096:1: rule__DepthRange__EndAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__DepthRange__EndAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:2100:1: ( ( RULE_INT ) )
            // InternalOntolizer.g:2101:2: ( RULE_INT )
            {
            // InternalOntolizer.g:2101:2: ( RULE_INT )
            // InternalOntolizer.g:2102:3: RULE_INT
            {
             before(grammarAccess.getDepthRangeAccess().getEndINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDepthRangeAccess().getEndINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DepthRange__EndAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000090812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000021010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F01000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});

}