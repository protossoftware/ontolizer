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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NodeType'", "';'", "'shape'", "'color'", "'style'", "'EdgeType'", "'summary'", "','", "'View'", "'edgeTypes'", "'nodeTypes'", "'node'"
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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalOntolizer.g:227:1: rule__Model__Alternatives : ( ( ( rule__Model__NodeTypesAssignment_0 ) ) | ( ( rule__Model__EdgeTypesAssignment_1 ) ) | ( ( rule__Model__NodesAssignment_2 ) ) | ( ( rule__Model__ViewsAssignment_3 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:231:1: ( ( ( rule__Model__NodeTypesAssignment_0 ) ) | ( ( rule__Model__EdgeTypesAssignment_1 ) ) | ( ( rule__Model__NodesAssignment_2 ) ) | ( ( rule__Model__ViewsAssignment_3 ) ) )
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
                    // InternalOntolizer.g:232:2: ( ( rule__Model__NodeTypesAssignment_0 ) )
                    {
                    // InternalOntolizer.g:232:2: ( ( rule__Model__NodeTypesAssignment_0 ) )
                    // InternalOntolizer.g:233:3: ( rule__Model__NodeTypesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getNodeTypesAssignment_0()); 
                    // InternalOntolizer.g:234:3: ( rule__Model__NodeTypesAssignment_0 )
                    // InternalOntolizer.g:234:4: rule__Model__NodeTypesAssignment_0
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
                    // InternalOntolizer.g:238:2: ( ( rule__Model__EdgeTypesAssignment_1 ) )
                    {
                    // InternalOntolizer.g:238:2: ( ( rule__Model__EdgeTypesAssignment_1 ) )
                    // InternalOntolizer.g:239:3: ( rule__Model__EdgeTypesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getEdgeTypesAssignment_1()); 
                    // InternalOntolizer.g:240:3: ( rule__Model__EdgeTypesAssignment_1 )
                    // InternalOntolizer.g:240:4: rule__Model__EdgeTypesAssignment_1
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
                    // InternalOntolizer.g:244:2: ( ( rule__Model__NodesAssignment_2 ) )
                    {
                    // InternalOntolizer.g:244:2: ( ( rule__Model__NodesAssignment_2 ) )
                    // InternalOntolizer.g:245:3: ( rule__Model__NodesAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getNodesAssignment_2()); 
                    // InternalOntolizer.g:246:3: ( rule__Model__NodesAssignment_2 )
                    // InternalOntolizer.g:246:4: rule__Model__NodesAssignment_2
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
                    // InternalOntolizer.g:250:2: ( ( rule__Model__ViewsAssignment_3 ) )
                    {
                    // InternalOntolizer.g:250:2: ( ( rule__Model__ViewsAssignment_3 ) )
                    // InternalOntolizer.g:251:3: ( rule__Model__ViewsAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getViewsAssignment_3()); 
                    // InternalOntolizer.g:252:3: ( rule__Model__ViewsAssignment_3 )
                    // InternalOntolizer.g:252:4: rule__Model__ViewsAssignment_3
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
    // InternalOntolizer.g:260:1: rule__NodeType__Group__0 : rule__NodeType__Group__0__Impl rule__NodeType__Group__1 ;
    public final void rule__NodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:264:1: ( rule__NodeType__Group__0__Impl rule__NodeType__Group__1 )
            // InternalOntolizer.g:265:2: rule__NodeType__Group__0__Impl rule__NodeType__Group__1
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
    // InternalOntolizer.g:272:1: rule__NodeType__Group__0__Impl : ( 'NodeType' ) ;
    public final void rule__NodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:276:1: ( ( 'NodeType' ) )
            // InternalOntolizer.g:277:1: ( 'NodeType' )
            {
            // InternalOntolizer.g:277:1: ( 'NodeType' )
            // InternalOntolizer.g:278:2: 'NodeType'
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
    // InternalOntolizer.g:287:1: rule__NodeType__Group__1 : rule__NodeType__Group__1__Impl rule__NodeType__Group__2 ;
    public final void rule__NodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:291:1: ( rule__NodeType__Group__1__Impl rule__NodeType__Group__2 )
            // InternalOntolizer.g:292:2: rule__NodeType__Group__1__Impl rule__NodeType__Group__2
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
    // InternalOntolizer.g:299:1: rule__NodeType__Group__1__Impl : ( ( rule__NodeType__NameAssignment_1 ) ) ;
    public final void rule__NodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:303:1: ( ( ( rule__NodeType__NameAssignment_1 ) ) )
            // InternalOntolizer.g:304:1: ( ( rule__NodeType__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:304:1: ( ( rule__NodeType__NameAssignment_1 ) )
            // InternalOntolizer.g:305:2: ( rule__NodeType__NameAssignment_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:306:2: ( rule__NodeType__NameAssignment_1 )
            // InternalOntolizer.g:306:3: rule__NodeType__NameAssignment_1
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
    // InternalOntolizer.g:314:1: rule__NodeType__Group__2 : rule__NodeType__Group__2__Impl rule__NodeType__Group__3 ;
    public final void rule__NodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:318:1: ( rule__NodeType__Group__2__Impl rule__NodeType__Group__3 )
            // InternalOntolizer.g:319:2: rule__NodeType__Group__2__Impl rule__NodeType__Group__3
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
    // InternalOntolizer.g:326:1: rule__NodeType__Group__2__Impl : ( ( rule__NodeType__Group_2__0 )? ) ;
    public final void rule__NodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:330:1: ( ( ( rule__NodeType__Group_2__0 )? ) )
            // InternalOntolizer.g:331:1: ( ( rule__NodeType__Group_2__0 )? )
            {
            // InternalOntolizer.g:331:1: ( ( rule__NodeType__Group_2__0 )? )
            // InternalOntolizer.g:332:2: ( rule__NodeType__Group_2__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_2()); 
            // InternalOntolizer.g:333:2: ( rule__NodeType__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntolizer.g:333:3: rule__NodeType__Group_2__0
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
    // InternalOntolizer.g:341:1: rule__NodeType__Group__3 : rule__NodeType__Group__3__Impl rule__NodeType__Group__4 ;
    public final void rule__NodeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:345:1: ( rule__NodeType__Group__3__Impl rule__NodeType__Group__4 )
            // InternalOntolizer.g:346:2: rule__NodeType__Group__3__Impl rule__NodeType__Group__4
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
    // InternalOntolizer.g:353:1: rule__NodeType__Group__3__Impl : ( ( rule__NodeType__Group_3__0 )? ) ;
    public final void rule__NodeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:357:1: ( ( ( rule__NodeType__Group_3__0 )? ) )
            // InternalOntolizer.g:358:1: ( ( rule__NodeType__Group_3__0 )? )
            {
            // InternalOntolizer.g:358:1: ( ( rule__NodeType__Group_3__0 )? )
            // InternalOntolizer.g:359:2: ( rule__NodeType__Group_3__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_3()); 
            // InternalOntolizer.g:360:2: ( rule__NodeType__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntolizer.g:360:3: rule__NodeType__Group_3__0
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
    // InternalOntolizer.g:368:1: rule__NodeType__Group__4 : rule__NodeType__Group__4__Impl rule__NodeType__Group__5 ;
    public final void rule__NodeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:372:1: ( rule__NodeType__Group__4__Impl rule__NodeType__Group__5 )
            // InternalOntolizer.g:373:2: rule__NodeType__Group__4__Impl rule__NodeType__Group__5
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
    // InternalOntolizer.g:380:1: rule__NodeType__Group__4__Impl : ( ( rule__NodeType__Group_4__0 )? ) ;
    public final void rule__NodeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:384:1: ( ( ( rule__NodeType__Group_4__0 )? ) )
            // InternalOntolizer.g:385:1: ( ( rule__NodeType__Group_4__0 )? )
            {
            // InternalOntolizer.g:385:1: ( ( rule__NodeType__Group_4__0 )? )
            // InternalOntolizer.g:386:2: ( rule__NodeType__Group_4__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_4()); 
            // InternalOntolizer.g:387:2: ( rule__NodeType__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntolizer.g:387:3: rule__NodeType__Group_4__0
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
    // InternalOntolizer.g:395:1: rule__NodeType__Group__5 : rule__NodeType__Group__5__Impl ;
    public final void rule__NodeType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:399:1: ( rule__NodeType__Group__5__Impl )
            // InternalOntolizer.g:400:2: rule__NodeType__Group__5__Impl
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
    // InternalOntolizer.g:406:1: rule__NodeType__Group__5__Impl : ( ';' ) ;
    public final void rule__NodeType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:410:1: ( ( ';' ) )
            // InternalOntolizer.g:411:1: ( ';' )
            {
            // InternalOntolizer.g:411:1: ( ';' )
            // InternalOntolizer.g:412:2: ';'
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
    // InternalOntolizer.g:422:1: rule__NodeType__Group_2__0 : rule__NodeType__Group_2__0__Impl rule__NodeType__Group_2__1 ;
    public final void rule__NodeType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:426:1: ( rule__NodeType__Group_2__0__Impl rule__NodeType__Group_2__1 )
            // InternalOntolizer.g:427:2: rule__NodeType__Group_2__0__Impl rule__NodeType__Group_2__1
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
    // InternalOntolizer.g:434:1: rule__NodeType__Group_2__0__Impl : ( 'shape' ) ;
    public final void rule__NodeType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:438:1: ( ( 'shape' ) )
            // InternalOntolizer.g:439:1: ( 'shape' )
            {
            // InternalOntolizer.g:439:1: ( 'shape' )
            // InternalOntolizer.g:440:2: 'shape'
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
    // InternalOntolizer.g:449:1: rule__NodeType__Group_2__1 : rule__NodeType__Group_2__1__Impl ;
    public final void rule__NodeType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:453:1: ( rule__NodeType__Group_2__1__Impl )
            // InternalOntolizer.g:454:2: rule__NodeType__Group_2__1__Impl
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
    // InternalOntolizer.g:460:1: rule__NodeType__Group_2__1__Impl : ( ( rule__NodeType__ShapeAssignment_2_1 ) ) ;
    public final void rule__NodeType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:464:1: ( ( ( rule__NodeType__ShapeAssignment_2_1 ) ) )
            // InternalOntolizer.g:465:1: ( ( rule__NodeType__ShapeAssignment_2_1 ) )
            {
            // InternalOntolizer.g:465:1: ( ( rule__NodeType__ShapeAssignment_2_1 ) )
            // InternalOntolizer.g:466:2: ( rule__NodeType__ShapeAssignment_2_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getShapeAssignment_2_1()); 
            // InternalOntolizer.g:467:2: ( rule__NodeType__ShapeAssignment_2_1 )
            // InternalOntolizer.g:467:3: rule__NodeType__ShapeAssignment_2_1
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
    // InternalOntolizer.g:476:1: rule__NodeType__Group_3__0 : rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1 ;
    public final void rule__NodeType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:480:1: ( rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1 )
            // InternalOntolizer.g:481:2: rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1
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
    // InternalOntolizer.g:488:1: rule__NodeType__Group_3__0__Impl : ( 'color' ) ;
    public final void rule__NodeType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:492:1: ( ( 'color' ) )
            // InternalOntolizer.g:493:1: ( 'color' )
            {
            // InternalOntolizer.g:493:1: ( 'color' )
            // InternalOntolizer.g:494:2: 'color'
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
    // InternalOntolizer.g:503:1: rule__NodeType__Group_3__1 : rule__NodeType__Group_3__1__Impl ;
    public final void rule__NodeType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:507:1: ( rule__NodeType__Group_3__1__Impl )
            // InternalOntolizer.g:508:2: rule__NodeType__Group_3__1__Impl
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
    // InternalOntolizer.g:514:1: rule__NodeType__Group_3__1__Impl : ( ( rule__NodeType__ColorAssignment_3_1 ) ) ;
    public final void rule__NodeType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:518:1: ( ( ( rule__NodeType__ColorAssignment_3_1 ) ) )
            // InternalOntolizer.g:519:1: ( ( rule__NodeType__ColorAssignment_3_1 ) )
            {
            // InternalOntolizer.g:519:1: ( ( rule__NodeType__ColorAssignment_3_1 ) )
            // InternalOntolizer.g:520:2: ( rule__NodeType__ColorAssignment_3_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getColorAssignment_3_1()); 
            // InternalOntolizer.g:521:2: ( rule__NodeType__ColorAssignment_3_1 )
            // InternalOntolizer.g:521:3: rule__NodeType__ColorAssignment_3_1
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
    // InternalOntolizer.g:530:1: rule__NodeType__Group_4__0 : rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1 ;
    public final void rule__NodeType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:534:1: ( rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1 )
            // InternalOntolizer.g:535:2: rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1
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
    // InternalOntolizer.g:542:1: rule__NodeType__Group_4__0__Impl : ( 'style' ) ;
    public final void rule__NodeType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:546:1: ( ( 'style' ) )
            // InternalOntolizer.g:547:1: ( 'style' )
            {
            // InternalOntolizer.g:547:1: ( 'style' )
            // InternalOntolizer.g:548:2: 'style'
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
    // InternalOntolizer.g:557:1: rule__NodeType__Group_4__1 : rule__NodeType__Group_4__1__Impl ;
    public final void rule__NodeType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:561:1: ( rule__NodeType__Group_4__1__Impl )
            // InternalOntolizer.g:562:2: rule__NodeType__Group_4__1__Impl
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
    // InternalOntolizer.g:568:1: rule__NodeType__Group_4__1__Impl : ( ( rule__NodeType__StyleAssignment_4_1 ) ) ;
    public final void rule__NodeType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:572:1: ( ( ( rule__NodeType__StyleAssignment_4_1 ) ) )
            // InternalOntolizer.g:573:1: ( ( rule__NodeType__StyleAssignment_4_1 ) )
            {
            // InternalOntolizer.g:573:1: ( ( rule__NodeType__StyleAssignment_4_1 ) )
            // InternalOntolizer.g:574:2: ( rule__NodeType__StyleAssignment_4_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getStyleAssignment_4_1()); 
            // InternalOntolizer.g:575:2: ( rule__NodeType__StyleAssignment_4_1 )
            // InternalOntolizer.g:575:3: rule__NodeType__StyleAssignment_4_1
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
    // InternalOntolizer.g:584:1: rule__EdgeType__Group__0 : rule__EdgeType__Group__0__Impl rule__EdgeType__Group__1 ;
    public final void rule__EdgeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:588:1: ( rule__EdgeType__Group__0__Impl rule__EdgeType__Group__1 )
            // InternalOntolizer.g:589:2: rule__EdgeType__Group__0__Impl rule__EdgeType__Group__1
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
    // InternalOntolizer.g:596:1: rule__EdgeType__Group__0__Impl : ( 'EdgeType' ) ;
    public final void rule__EdgeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:600:1: ( ( 'EdgeType' ) )
            // InternalOntolizer.g:601:1: ( 'EdgeType' )
            {
            // InternalOntolizer.g:601:1: ( 'EdgeType' )
            // InternalOntolizer.g:602:2: 'EdgeType'
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
    // InternalOntolizer.g:611:1: rule__EdgeType__Group__1 : rule__EdgeType__Group__1__Impl rule__EdgeType__Group__2 ;
    public final void rule__EdgeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:615:1: ( rule__EdgeType__Group__1__Impl rule__EdgeType__Group__2 )
            // InternalOntolizer.g:616:2: rule__EdgeType__Group__1__Impl rule__EdgeType__Group__2
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
    // InternalOntolizer.g:623:1: rule__EdgeType__Group__1__Impl : ( ( rule__EdgeType__NameAssignment_1 ) ) ;
    public final void rule__EdgeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:627:1: ( ( ( rule__EdgeType__NameAssignment_1 ) ) )
            // InternalOntolizer.g:628:1: ( ( rule__EdgeType__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:628:1: ( ( rule__EdgeType__NameAssignment_1 ) )
            // InternalOntolizer.g:629:2: ( rule__EdgeType__NameAssignment_1 )
            {
             before(grammarAccess.getEdgeTypeAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:630:2: ( rule__EdgeType__NameAssignment_1 )
            // InternalOntolizer.g:630:3: rule__EdgeType__NameAssignment_1
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
    // InternalOntolizer.g:638:1: rule__EdgeType__Group__2 : rule__EdgeType__Group__2__Impl ;
    public final void rule__EdgeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:642:1: ( rule__EdgeType__Group__2__Impl )
            // InternalOntolizer.g:643:2: rule__EdgeType__Group__2__Impl
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
    // InternalOntolizer.g:649:1: rule__EdgeType__Group__2__Impl : ( ';' ) ;
    public final void rule__EdgeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:653:1: ( ( ';' ) )
            // InternalOntolizer.g:654:1: ( ';' )
            {
            // InternalOntolizer.g:654:1: ( ';' )
            // InternalOntolizer.g:655:2: ';'
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
    // InternalOntolizer.g:665:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:669:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalOntolizer.g:670:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalOntolizer.g:677:1: rule__Node__Group__0__Impl : ( ( rule__Node__NodeTypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:681:1: ( ( ( rule__Node__NodeTypeAssignment_0 ) ) )
            // InternalOntolizer.g:682:1: ( ( rule__Node__NodeTypeAssignment_0 ) )
            {
            // InternalOntolizer.g:682:1: ( ( rule__Node__NodeTypeAssignment_0 ) )
            // InternalOntolizer.g:683:2: ( rule__Node__NodeTypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNodeTypeAssignment_0()); 
            // InternalOntolizer.g:684:2: ( rule__Node__NodeTypeAssignment_0 )
            // InternalOntolizer.g:684:3: rule__Node__NodeTypeAssignment_0
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
    // InternalOntolizer.g:692:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:696:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalOntolizer.g:697:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalOntolizer.g:704:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:708:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalOntolizer.g:709:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:709:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalOntolizer.g:710:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:711:2: ( rule__Node__NameAssignment_1 )
            // InternalOntolizer.g:711:3: rule__Node__NameAssignment_1
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
    // InternalOntolizer.g:719:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:723:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalOntolizer.g:724:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalOntolizer.g:731:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )* ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:735:1: ( ( ( rule__Node__Group_2__0 )* ) )
            // InternalOntolizer.g:736:1: ( ( rule__Node__Group_2__0 )* )
            {
            // InternalOntolizer.g:736:1: ( ( rule__Node__Group_2__0 )* )
            // InternalOntolizer.g:737:2: ( rule__Node__Group_2__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // InternalOntolizer.g:738:2: ( rule__Node__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOntolizer.g:738:3: rule__Node__Group_2__0
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
    // InternalOntolizer.g:746:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:750:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalOntolizer.g:751:2: rule__Node__Group__3__Impl rule__Node__Group__4
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
    // InternalOntolizer.g:758:1: rule__Node__Group__3__Impl : ( ( rule__Node__EdgeListsAssignment_3 )* ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:762:1: ( ( ( rule__Node__EdgeListsAssignment_3 )* ) )
            // InternalOntolizer.g:763:1: ( ( rule__Node__EdgeListsAssignment_3 )* )
            {
            // InternalOntolizer.g:763:1: ( ( rule__Node__EdgeListsAssignment_3 )* )
            // InternalOntolizer.g:764:2: ( rule__Node__EdgeListsAssignment_3 )*
            {
             before(grammarAccess.getNodeAccess().getEdgeListsAssignment_3()); 
            // InternalOntolizer.g:765:2: ( rule__Node__EdgeListsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOntolizer.g:765:3: rule__Node__EdgeListsAssignment_3
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
    // InternalOntolizer.g:773:1: rule__Node__Group__4 : rule__Node__Group__4__Impl ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:777:1: ( rule__Node__Group__4__Impl )
            // InternalOntolizer.g:778:2: rule__Node__Group__4__Impl
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
    // InternalOntolizer.g:784:1: rule__Node__Group__4__Impl : ( ';' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:788:1: ( ( ';' ) )
            // InternalOntolizer.g:789:1: ( ';' )
            {
            // InternalOntolizer.g:789:1: ( ';' )
            // InternalOntolizer.g:790:2: ';'
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
    // InternalOntolizer.g:800:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:804:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // InternalOntolizer.g:805:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
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
    // InternalOntolizer.g:812:1: rule__Node__Group_2__0__Impl : ( 'summary' ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:816:1: ( ( 'summary' ) )
            // InternalOntolizer.g:817:1: ( 'summary' )
            {
            // InternalOntolizer.g:817:1: ( 'summary' )
            // InternalOntolizer.g:818:2: 'summary'
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
    // InternalOntolizer.g:827:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:831:1: ( rule__Node__Group_2__1__Impl )
            // InternalOntolizer.g:832:2: rule__Node__Group_2__1__Impl
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
    // InternalOntolizer.g:838:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__SummaryAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:842:1: ( ( ( rule__Node__SummaryAssignment_2_1 ) ) )
            // InternalOntolizer.g:843:1: ( ( rule__Node__SummaryAssignment_2_1 ) )
            {
            // InternalOntolizer.g:843:1: ( ( rule__Node__SummaryAssignment_2_1 ) )
            // InternalOntolizer.g:844:2: ( rule__Node__SummaryAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getSummaryAssignment_2_1()); 
            // InternalOntolizer.g:845:2: ( rule__Node__SummaryAssignment_2_1 )
            // InternalOntolizer.g:845:3: rule__Node__SummaryAssignment_2_1
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
    // InternalOntolizer.g:854:1: rule__EdgeList__Group__0 : rule__EdgeList__Group__0__Impl rule__EdgeList__Group__1 ;
    public final void rule__EdgeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:858:1: ( rule__EdgeList__Group__0__Impl rule__EdgeList__Group__1 )
            // InternalOntolizer.g:859:2: rule__EdgeList__Group__0__Impl rule__EdgeList__Group__1
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
    // InternalOntolizer.g:866:1: rule__EdgeList__Group__0__Impl : ( ( rule__EdgeList__EdgeTypeAssignment_0 ) ) ;
    public final void rule__EdgeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:870:1: ( ( ( rule__EdgeList__EdgeTypeAssignment_0 ) ) )
            // InternalOntolizer.g:871:1: ( ( rule__EdgeList__EdgeTypeAssignment_0 ) )
            {
            // InternalOntolizer.g:871:1: ( ( rule__EdgeList__EdgeTypeAssignment_0 ) )
            // InternalOntolizer.g:872:2: ( rule__EdgeList__EdgeTypeAssignment_0 )
            {
             before(grammarAccess.getEdgeListAccess().getEdgeTypeAssignment_0()); 
            // InternalOntolizer.g:873:2: ( rule__EdgeList__EdgeTypeAssignment_0 )
            // InternalOntolizer.g:873:3: rule__EdgeList__EdgeTypeAssignment_0
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
    // InternalOntolizer.g:881:1: rule__EdgeList__Group__1 : rule__EdgeList__Group__1__Impl rule__EdgeList__Group__2 ;
    public final void rule__EdgeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:885:1: ( rule__EdgeList__Group__1__Impl rule__EdgeList__Group__2 )
            // InternalOntolizer.g:886:2: rule__EdgeList__Group__1__Impl rule__EdgeList__Group__2
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
    // InternalOntolizer.g:893:1: rule__EdgeList__Group__1__Impl : ( ( rule__EdgeList__EdgesAssignment_1 ) ) ;
    public final void rule__EdgeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:897:1: ( ( ( rule__EdgeList__EdgesAssignment_1 ) ) )
            // InternalOntolizer.g:898:1: ( ( rule__EdgeList__EdgesAssignment_1 ) )
            {
            // InternalOntolizer.g:898:1: ( ( rule__EdgeList__EdgesAssignment_1 ) )
            // InternalOntolizer.g:899:2: ( rule__EdgeList__EdgesAssignment_1 )
            {
             before(grammarAccess.getEdgeListAccess().getEdgesAssignment_1()); 
            // InternalOntolizer.g:900:2: ( rule__EdgeList__EdgesAssignment_1 )
            // InternalOntolizer.g:900:3: rule__EdgeList__EdgesAssignment_1
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
    // InternalOntolizer.g:908:1: rule__EdgeList__Group__2 : rule__EdgeList__Group__2__Impl ;
    public final void rule__EdgeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:912:1: ( rule__EdgeList__Group__2__Impl )
            // InternalOntolizer.g:913:2: rule__EdgeList__Group__2__Impl
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
    // InternalOntolizer.g:919:1: rule__EdgeList__Group__2__Impl : ( ( rule__EdgeList__Group_2__0 )* ) ;
    public final void rule__EdgeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:923:1: ( ( ( rule__EdgeList__Group_2__0 )* ) )
            // InternalOntolizer.g:924:1: ( ( rule__EdgeList__Group_2__0 )* )
            {
            // InternalOntolizer.g:924:1: ( ( rule__EdgeList__Group_2__0 )* )
            // InternalOntolizer.g:925:2: ( rule__EdgeList__Group_2__0 )*
            {
             before(grammarAccess.getEdgeListAccess().getGroup_2()); 
            // InternalOntolizer.g:926:2: ( rule__EdgeList__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntolizer.g:926:3: rule__EdgeList__Group_2__0
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
    // InternalOntolizer.g:935:1: rule__EdgeList__Group_2__0 : rule__EdgeList__Group_2__0__Impl rule__EdgeList__Group_2__1 ;
    public final void rule__EdgeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:939:1: ( rule__EdgeList__Group_2__0__Impl rule__EdgeList__Group_2__1 )
            // InternalOntolizer.g:940:2: rule__EdgeList__Group_2__0__Impl rule__EdgeList__Group_2__1
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
    // InternalOntolizer.g:947:1: rule__EdgeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EdgeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:951:1: ( ( ',' ) )
            // InternalOntolizer.g:952:1: ( ',' )
            {
            // InternalOntolizer.g:952:1: ( ',' )
            // InternalOntolizer.g:953:2: ','
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
    // InternalOntolizer.g:962:1: rule__EdgeList__Group_2__1 : rule__EdgeList__Group_2__1__Impl ;
    public final void rule__EdgeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:966:1: ( rule__EdgeList__Group_2__1__Impl )
            // InternalOntolizer.g:967:2: rule__EdgeList__Group_2__1__Impl
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
    // InternalOntolizer.g:973:1: rule__EdgeList__Group_2__1__Impl : ( ( rule__EdgeList__EdgesAssignment_2_1 ) ) ;
    public final void rule__EdgeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:977:1: ( ( ( rule__EdgeList__EdgesAssignment_2_1 ) ) )
            // InternalOntolizer.g:978:1: ( ( rule__EdgeList__EdgesAssignment_2_1 ) )
            {
            // InternalOntolizer.g:978:1: ( ( rule__EdgeList__EdgesAssignment_2_1 ) )
            // InternalOntolizer.g:979:2: ( rule__EdgeList__EdgesAssignment_2_1 )
            {
             before(grammarAccess.getEdgeListAccess().getEdgesAssignment_2_1()); 
            // InternalOntolizer.g:980:2: ( rule__EdgeList__EdgesAssignment_2_1 )
            // InternalOntolizer.g:980:3: rule__EdgeList__EdgesAssignment_2_1
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
    // InternalOntolizer.g:989:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:993:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // InternalOntolizer.g:994:2: rule__View__Group__0__Impl rule__View__Group__1
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
    // InternalOntolizer.g:1001:1: rule__View__Group__0__Impl : ( 'View' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1005:1: ( ( 'View' ) )
            // InternalOntolizer.g:1006:1: ( 'View' )
            {
            // InternalOntolizer.g:1006:1: ( 'View' )
            // InternalOntolizer.g:1007:2: 'View'
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
    // InternalOntolizer.g:1016:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1020:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // InternalOntolizer.g:1021:2: rule__View__Group__1__Impl rule__View__Group__2
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
    // InternalOntolizer.g:1028:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1032:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // InternalOntolizer.g:1033:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // InternalOntolizer.g:1033:1: ( ( rule__View__NameAssignment_1 ) )
            // InternalOntolizer.g:1034:2: ( rule__View__NameAssignment_1 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            // InternalOntolizer.g:1035:2: ( rule__View__NameAssignment_1 )
            // InternalOntolizer.g:1035:3: rule__View__NameAssignment_1
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
    // InternalOntolizer.g:1043:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1047:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // InternalOntolizer.g:1048:2: rule__View__Group__2__Impl rule__View__Group__3
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
    // InternalOntolizer.g:1055:1: rule__View__Group__2__Impl : ( ( rule__View__Group_2__0 )? ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1059:1: ( ( ( rule__View__Group_2__0 )? ) )
            // InternalOntolizer.g:1060:1: ( ( rule__View__Group_2__0 )? )
            {
            // InternalOntolizer.g:1060:1: ( ( rule__View__Group_2__0 )? )
            // InternalOntolizer.g:1061:2: ( rule__View__Group_2__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_2()); 
            // InternalOntolizer.g:1062:2: ( rule__View__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntolizer.g:1062:3: rule__View__Group_2__0
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
    // InternalOntolizer.g:1070:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1074:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // InternalOntolizer.g:1075:2: rule__View__Group__3__Impl rule__View__Group__4
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
    // InternalOntolizer.g:1082:1: rule__View__Group__3__Impl : ( ( rule__View__Group_3__0 )? ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1086:1: ( ( ( rule__View__Group_3__0 )? ) )
            // InternalOntolizer.g:1087:1: ( ( rule__View__Group_3__0 )? )
            {
            // InternalOntolizer.g:1087:1: ( ( rule__View__Group_3__0 )? )
            // InternalOntolizer.g:1088:2: ( rule__View__Group_3__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3()); 
            // InternalOntolizer.g:1089:2: ( rule__View__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntolizer.g:1089:3: rule__View__Group_3__0
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
    // InternalOntolizer.g:1097:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1101:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // InternalOntolizer.g:1102:2: rule__View__Group__4__Impl rule__View__Group__5
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
    // InternalOntolizer.g:1109:1: rule__View__Group__4__Impl : ( ( rule__View__Group_4__0 )? ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1113:1: ( ( ( rule__View__Group_4__0 )? ) )
            // InternalOntolizer.g:1114:1: ( ( rule__View__Group_4__0 )? )
            {
            // InternalOntolizer.g:1114:1: ( ( rule__View__Group_4__0 )? )
            // InternalOntolizer.g:1115:2: ( rule__View__Group_4__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_4()); 
            // InternalOntolizer.g:1116:2: ( rule__View__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntolizer.g:1116:3: rule__View__Group_4__0
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
    // InternalOntolizer.g:1124:1: rule__View__Group__5 : rule__View__Group__5__Impl ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1128:1: ( rule__View__Group__5__Impl )
            // InternalOntolizer.g:1129:2: rule__View__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group__5__Impl();

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
    // InternalOntolizer.g:1135:1: rule__View__Group__5__Impl : ( ';' ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1139:1: ( ( ';' ) )
            // InternalOntolizer.g:1140:1: ( ';' )
            {
            // InternalOntolizer.g:1140:1: ( ';' )
            // InternalOntolizer.g:1141:2: ';'
            {
             before(grammarAccess.getViewAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getSemicolonKeyword_5()); 

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


    // $ANTLR start "rule__View__Group_2__0"
    // InternalOntolizer.g:1151:1: rule__View__Group_2__0 : rule__View__Group_2__0__Impl rule__View__Group_2__1 ;
    public final void rule__View__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1155:1: ( rule__View__Group_2__0__Impl rule__View__Group_2__1 )
            // InternalOntolizer.g:1156:2: rule__View__Group_2__0__Impl rule__View__Group_2__1
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
    // InternalOntolizer.g:1163:1: rule__View__Group_2__0__Impl : ( 'edgeTypes' ) ;
    public final void rule__View__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1167:1: ( ( 'edgeTypes' ) )
            // InternalOntolizer.g:1168:1: ( 'edgeTypes' )
            {
            // InternalOntolizer.g:1168:1: ( 'edgeTypes' )
            // InternalOntolizer.g:1169:2: 'edgeTypes'
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
    // InternalOntolizer.g:1178:1: rule__View__Group_2__1 : rule__View__Group_2__1__Impl rule__View__Group_2__2 ;
    public final void rule__View__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1182:1: ( rule__View__Group_2__1__Impl rule__View__Group_2__2 )
            // InternalOntolizer.g:1183:2: rule__View__Group_2__1__Impl rule__View__Group_2__2
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
    // InternalOntolizer.g:1190:1: rule__View__Group_2__1__Impl : ( ( rule__View__EdgeTypesAssignment_2_1 ) ) ;
    public final void rule__View__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1194:1: ( ( ( rule__View__EdgeTypesAssignment_2_1 ) ) )
            // InternalOntolizer.g:1195:1: ( ( rule__View__EdgeTypesAssignment_2_1 ) )
            {
            // InternalOntolizer.g:1195:1: ( ( rule__View__EdgeTypesAssignment_2_1 ) )
            // InternalOntolizer.g:1196:2: ( rule__View__EdgeTypesAssignment_2_1 )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_1()); 
            // InternalOntolizer.g:1197:2: ( rule__View__EdgeTypesAssignment_2_1 )
            // InternalOntolizer.g:1197:3: rule__View__EdgeTypesAssignment_2_1
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
    // InternalOntolizer.g:1205:1: rule__View__Group_2__2 : rule__View__Group_2__2__Impl ;
    public final void rule__View__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1209:1: ( rule__View__Group_2__2__Impl )
            // InternalOntolizer.g:1210:2: rule__View__Group_2__2__Impl
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
    // InternalOntolizer.g:1216:1: rule__View__Group_2__2__Impl : ( ( rule__View__Group_2_2__0 )* ) ;
    public final void rule__View__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1220:1: ( ( ( rule__View__Group_2_2__0 )* ) )
            // InternalOntolizer.g:1221:1: ( ( rule__View__Group_2_2__0 )* )
            {
            // InternalOntolizer.g:1221:1: ( ( rule__View__Group_2_2__0 )* )
            // InternalOntolizer.g:1222:2: ( rule__View__Group_2_2__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_2_2()); 
            // InternalOntolizer.g:1223:2: ( rule__View__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntolizer.g:1223:3: rule__View__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__View__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalOntolizer.g:1232:1: rule__View__Group_2_2__0 : rule__View__Group_2_2__0__Impl rule__View__Group_2_2__1 ;
    public final void rule__View__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1236:1: ( rule__View__Group_2_2__0__Impl rule__View__Group_2_2__1 )
            // InternalOntolizer.g:1237:2: rule__View__Group_2_2__0__Impl rule__View__Group_2_2__1
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
    // InternalOntolizer.g:1244:1: rule__View__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__View__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1248:1: ( ( ',' ) )
            // InternalOntolizer.g:1249:1: ( ',' )
            {
            // InternalOntolizer.g:1249:1: ( ',' )
            // InternalOntolizer.g:1250:2: ','
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
    // InternalOntolizer.g:1259:1: rule__View__Group_2_2__1 : rule__View__Group_2_2__1__Impl ;
    public final void rule__View__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1263:1: ( rule__View__Group_2_2__1__Impl )
            // InternalOntolizer.g:1264:2: rule__View__Group_2_2__1__Impl
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
    // InternalOntolizer.g:1270:1: rule__View__Group_2_2__1__Impl : ( ( rule__View__EdgeTypesAssignment_2_2_1 ) ) ;
    public final void rule__View__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1274:1: ( ( ( rule__View__EdgeTypesAssignment_2_2_1 ) ) )
            // InternalOntolizer.g:1275:1: ( ( rule__View__EdgeTypesAssignment_2_2_1 ) )
            {
            // InternalOntolizer.g:1275:1: ( ( rule__View__EdgeTypesAssignment_2_2_1 ) )
            // InternalOntolizer.g:1276:2: ( rule__View__EdgeTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_2_1()); 
            // InternalOntolizer.g:1277:2: ( rule__View__EdgeTypesAssignment_2_2_1 )
            // InternalOntolizer.g:1277:3: rule__View__EdgeTypesAssignment_2_2_1
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
    // InternalOntolizer.g:1286:1: rule__View__Group_3__0 : rule__View__Group_3__0__Impl rule__View__Group_3__1 ;
    public final void rule__View__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1290:1: ( rule__View__Group_3__0__Impl rule__View__Group_3__1 )
            // InternalOntolizer.g:1291:2: rule__View__Group_3__0__Impl rule__View__Group_3__1
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
    // InternalOntolizer.g:1298:1: rule__View__Group_3__0__Impl : ( 'nodeTypes' ) ;
    public final void rule__View__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1302:1: ( ( 'nodeTypes' ) )
            // InternalOntolizer.g:1303:1: ( 'nodeTypes' )
            {
            // InternalOntolizer.g:1303:1: ( 'nodeTypes' )
            // InternalOntolizer.g:1304:2: 'nodeTypes'
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
    // InternalOntolizer.g:1313:1: rule__View__Group_3__1 : rule__View__Group_3__1__Impl rule__View__Group_3__2 ;
    public final void rule__View__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1317:1: ( rule__View__Group_3__1__Impl rule__View__Group_3__2 )
            // InternalOntolizer.g:1318:2: rule__View__Group_3__1__Impl rule__View__Group_3__2
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
    // InternalOntolizer.g:1325:1: rule__View__Group_3__1__Impl : ( ( rule__View__NodeTypesAssignment_3_1 ) ) ;
    public final void rule__View__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1329:1: ( ( ( rule__View__NodeTypesAssignment_3_1 ) ) )
            // InternalOntolizer.g:1330:1: ( ( rule__View__NodeTypesAssignment_3_1 ) )
            {
            // InternalOntolizer.g:1330:1: ( ( rule__View__NodeTypesAssignment_3_1 ) )
            // InternalOntolizer.g:1331:2: ( rule__View__NodeTypesAssignment_3_1 )
            {
             before(grammarAccess.getViewAccess().getNodeTypesAssignment_3_1()); 
            // InternalOntolizer.g:1332:2: ( rule__View__NodeTypesAssignment_3_1 )
            // InternalOntolizer.g:1332:3: rule__View__NodeTypesAssignment_3_1
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
    // InternalOntolizer.g:1340:1: rule__View__Group_3__2 : rule__View__Group_3__2__Impl ;
    public final void rule__View__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1344:1: ( rule__View__Group_3__2__Impl )
            // InternalOntolizer.g:1345:2: rule__View__Group_3__2__Impl
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
    // InternalOntolizer.g:1351:1: rule__View__Group_3__2__Impl : ( ( rule__View__Group_3_2__0 )* ) ;
    public final void rule__View__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1355:1: ( ( ( rule__View__Group_3_2__0 )* ) )
            // InternalOntolizer.g:1356:1: ( ( rule__View__Group_3_2__0 )* )
            {
            // InternalOntolizer.g:1356:1: ( ( rule__View__Group_3_2__0 )* )
            // InternalOntolizer.g:1357:2: ( rule__View__Group_3_2__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_3_2()); 
            // InternalOntolizer.g:1358:2: ( rule__View__Group_3_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntolizer.g:1358:3: rule__View__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__View__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalOntolizer.g:1367:1: rule__View__Group_3_2__0 : rule__View__Group_3_2__0__Impl rule__View__Group_3_2__1 ;
    public final void rule__View__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1371:1: ( rule__View__Group_3_2__0__Impl rule__View__Group_3_2__1 )
            // InternalOntolizer.g:1372:2: rule__View__Group_3_2__0__Impl rule__View__Group_3_2__1
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
    // InternalOntolizer.g:1379:1: rule__View__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__View__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1383:1: ( ( ',' ) )
            // InternalOntolizer.g:1384:1: ( ',' )
            {
            // InternalOntolizer.g:1384:1: ( ',' )
            // InternalOntolizer.g:1385:2: ','
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
    // InternalOntolizer.g:1394:1: rule__View__Group_3_2__1 : rule__View__Group_3_2__1__Impl ;
    public final void rule__View__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1398:1: ( rule__View__Group_3_2__1__Impl )
            // InternalOntolizer.g:1399:2: rule__View__Group_3_2__1__Impl
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
    // InternalOntolizer.g:1405:1: rule__View__Group_3_2__1__Impl : ( ( rule__View__NodeTypesAssignment_3_2_1 ) ) ;
    public final void rule__View__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1409:1: ( ( ( rule__View__NodeTypesAssignment_3_2_1 ) ) )
            // InternalOntolizer.g:1410:1: ( ( rule__View__NodeTypesAssignment_3_2_1 ) )
            {
            // InternalOntolizer.g:1410:1: ( ( rule__View__NodeTypesAssignment_3_2_1 ) )
            // InternalOntolizer.g:1411:2: ( rule__View__NodeTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getViewAccess().getNodeTypesAssignment_3_2_1()); 
            // InternalOntolizer.g:1412:2: ( rule__View__NodeTypesAssignment_3_2_1 )
            // InternalOntolizer.g:1412:3: rule__View__NodeTypesAssignment_3_2_1
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
    // InternalOntolizer.g:1421:1: rule__View__Group_4__0 : rule__View__Group_4__0__Impl rule__View__Group_4__1 ;
    public final void rule__View__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1425:1: ( rule__View__Group_4__0__Impl rule__View__Group_4__1 )
            // InternalOntolizer.g:1426:2: rule__View__Group_4__0__Impl rule__View__Group_4__1
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
    // InternalOntolizer.g:1433:1: rule__View__Group_4__0__Impl : ( 'node' ) ;
    public final void rule__View__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1437:1: ( ( 'node' ) )
            // InternalOntolizer.g:1438:1: ( 'node' )
            {
            // InternalOntolizer.g:1438:1: ( 'node' )
            // InternalOntolizer.g:1439:2: 'node'
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
    // InternalOntolizer.g:1448:1: rule__View__Group_4__1 : rule__View__Group_4__1__Impl ;
    public final void rule__View__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1452:1: ( rule__View__Group_4__1__Impl )
            // InternalOntolizer.g:1453:2: rule__View__Group_4__1__Impl
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
    // InternalOntolizer.g:1459:1: rule__View__Group_4__1__Impl : ( ( rule__View__NodeAssignment_4_1 ) ) ;
    public final void rule__View__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1463:1: ( ( ( rule__View__NodeAssignment_4_1 ) ) )
            // InternalOntolizer.g:1464:1: ( ( rule__View__NodeAssignment_4_1 ) )
            {
            // InternalOntolizer.g:1464:1: ( ( rule__View__NodeAssignment_4_1 ) )
            // InternalOntolizer.g:1465:2: ( rule__View__NodeAssignment_4_1 )
            {
             before(grammarAccess.getViewAccess().getNodeAssignment_4_1()); 
            // InternalOntolizer.g:1466:2: ( rule__View__NodeAssignment_4_1 )
            // InternalOntolizer.g:1466:3: rule__View__NodeAssignment_4_1
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


    // $ANTLR start "rule__Model__NodeTypesAssignment_0"
    // InternalOntolizer.g:1475:1: rule__Model__NodeTypesAssignment_0 : ( ruleNodeType ) ;
    public final void rule__Model__NodeTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1479:1: ( ( ruleNodeType ) )
            // InternalOntolizer.g:1480:2: ( ruleNodeType )
            {
            // InternalOntolizer.g:1480:2: ( ruleNodeType )
            // InternalOntolizer.g:1481:3: ruleNodeType
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
    // InternalOntolizer.g:1490:1: rule__Model__EdgeTypesAssignment_1 : ( ruleEdgeType ) ;
    public final void rule__Model__EdgeTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1494:1: ( ( ruleEdgeType ) )
            // InternalOntolizer.g:1495:2: ( ruleEdgeType )
            {
            // InternalOntolizer.g:1495:2: ( ruleEdgeType )
            // InternalOntolizer.g:1496:3: ruleEdgeType
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
    // InternalOntolizer.g:1505:1: rule__Model__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__Model__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1509:1: ( ( ruleNode ) )
            // InternalOntolizer.g:1510:2: ( ruleNode )
            {
            // InternalOntolizer.g:1510:2: ( ruleNode )
            // InternalOntolizer.g:1511:3: ruleNode
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
    // InternalOntolizer.g:1520:1: rule__Model__ViewsAssignment_3 : ( ruleView ) ;
    public final void rule__Model__ViewsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1524:1: ( ( ruleView ) )
            // InternalOntolizer.g:1525:2: ( ruleView )
            {
            // InternalOntolizer.g:1525:2: ( ruleView )
            // InternalOntolizer.g:1526:3: ruleView
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
    // InternalOntolizer.g:1535:1: rule__NodeType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1539:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1540:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1540:2: ( RULE_ID )
            // InternalOntolizer.g:1541:3: RULE_ID
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
    // InternalOntolizer.g:1550:1: rule__NodeType__ShapeAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__NodeType__ShapeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1554:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1555:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1555:2: ( RULE_STRING )
            // InternalOntolizer.g:1556:3: RULE_STRING
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
    // InternalOntolizer.g:1565:1: rule__NodeType__ColorAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__NodeType__ColorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1569:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1570:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1570:2: ( RULE_STRING )
            // InternalOntolizer.g:1571:3: RULE_STRING
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
    // InternalOntolizer.g:1580:1: rule__NodeType__StyleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__NodeType__StyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1584:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1585:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1585:2: ( RULE_STRING )
            // InternalOntolizer.g:1586:3: RULE_STRING
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
    // InternalOntolizer.g:1595:1: rule__EdgeType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EdgeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1599:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1600:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1600:2: ( RULE_ID )
            // InternalOntolizer.g:1601:3: RULE_ID
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
    // InternalOntolizer.g:1610:1: rule__Node__NodeTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__NodeTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1614:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1615:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1615:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1616:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getNodeTypeNodeTypeCrossReference_0_0()); 
            // InternalOntolizer.g:1617:3: ( RULE_ID )
            // InternalOntolizer.g:1618:4: RULE_ID
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
    // InternalOntolizer.g:1629:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1633:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1634:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1634:2: ( RULE_ID )
            // InternalOntolizer.g:1635:3: RULE_ID
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
    // InternalOntolizer.g:1644:1: rule__Node__SummaryAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__SummaryAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1648:1: ( ( RULE_STRING ) )
            // InternalOntolizer.g:1649:2: ( RULE_STRING )
            {
            // InternalOntolizer.g:1649:2: ( RULE_STRING )
            // InternalOntolizer.g:1650:3: RULE_STRING
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
    // InternalOntolizer.g:1659:1: rule__Node__EdgeListsAssignment_3 : ( ruleEdgeList ) ;
    public final void rule__Node__EdgeListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1663:1: ( ( ruleEdgeList ) )
            // InternalOntolizer.g:1664:2: ( ruleEdgeList )
            {
            // InternalOntolizer.g:1664:2: ( ruleEdgeList )
            // InternalOntolizer.g:1665:3: ruleEdgeList
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
    // InternalOntolizer.g:1674:1: rule__EdgeList__EdgeTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EdgeList__EdgeTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1678:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1679:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1679:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1680:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeListAccess().getEdgeTypeEdgeTypeCrossReference_0_0()); 
            // InternalOntolizer.g:1681:3: ( RULE_ID )
            // InternalOntolizer.g:1682:4: RULE_ID
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
    // InternalOntolizer.g:1693:1: rule__EdgeList__EdgesAssignment_1 : ( ruleEdge ) ;
    public final void rule__EdgeList__EdgesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1697:1: ( ( ruleEdge ) )
            // InternalOntolizer.g:1698:2: ( ruleEdge )
            {
            // InternalOntolizer.g:1698:2: ( ruleEdge )
            // InternalOntolizer.g:1699:3: ruleEdge
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
    // InternalOntolizer.g:1708:1: rule__EdgeList__EdgesAssignment_2_1 : ( ruleEdge ) ;
    public final void rule__EdgeList__EdgesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1712:1: ( ( ruleEdge ) )
            // InternalOntolizer.g:1713:2: ( ruleEdge )
            {
            // InternalOntolizer.g:1713:2: ( ruleEdge )
            // InternalOntolizer.g:1714:3: ruleEdge
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
    // InternalOntolizer.g:1723:1: rule__Edge__TargetNodeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Edge__TargetNodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1727:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1728:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1728:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1729:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getTargetNodeNodeCrossReference_0()); 
            // InternalOntolizer.g:1730:3: ( RULE_ID )
            // InternalOntolizer.g:1731:4: RULE_ID
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
    // InternalOntolizer.g:1742:1: rule__View__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1746:1: ( ( RULE_ID ) )
            // InternalOntolizer.g:1747:2: ( RULE_ID )
            {
            // InternalOntolizer.g:1747:2: ( RULE_ID )
            // InternalOntolizer.g:1748:3: RULE_ID
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
    // InternalOntolizer.g:1757:1: rule__View__EdgeTypesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__EdgeTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1761:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1762:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1762:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1763:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_1_0()); 
            // InternalOntolizer.g:1764:3: ( RULE_ID )
            // InternalOntolizer.g:1765:4: RULE_ID
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
    // InternalOntolizer.g:1776:1: rule__View__EdgeTypesAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__EdgeTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1780:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1781:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1781:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1782:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_2_1_0()); 
            // InternalOntolizer.g:1783:3: ( RULE_ID )
            // InternalOntolizer.g:1784:4: RULE_ID
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
    // InternalOntolizer.g:1795:1: rule__View__NodeTypesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__NodeTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1799:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1800:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1800:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1801:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_1_0()); 
            // InternalOntolizer.g:1802:3: ( RULE_ID )
            // InternalOntolizer.g:1803:4: RULE_ID
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
    // InternalOntolizer.g:1814:1: rule__View__NodeTypesAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__NodeTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1818:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1819:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1819:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1820:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_2_1_0()); 
            // InternalOntolizer.g:1821:3: ( RULE_ID )
            // InternalOntolizer.g:1822:4: RULE_ID
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
    // InternalOntolizer.g:1833:1: rule__View__NodeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__NodeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntolizer.g:1837:1: ( ( ( RULE_ID ) ) )
            // InternalOntolizer.g:1838:2: ( ( RULE_ID ) )
            {
            // InternalOntolizer.g:1838:2: ( ( RULE_ID ) )
            // InternalOntolizer.g:1839:3: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getNodeNodeCrossReference_4_1_0()); 
            // InternalOntolizer.g:1840:3: ( RULE_ID )
            // InternalOntolizer.g:1841:4: RULE_ID
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000701000L});

}