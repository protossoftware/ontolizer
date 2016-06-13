package de.protos.ontolizer.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.protos.ontolizer.services.OntolizerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntolizerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NodeType'", "'shape'", "'color'", "'style'", "';'", "'EdgeType'", "'summary'", "','", "'View'", "'edgeTypes'", "'nodeTypes'", "'depth'", "'..'"
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

        public InternalOntolizerParser(TokenStream input, OntolizerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OntolizerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOntolizer.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOntolizer.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalOntolizer.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntolizer.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_nodeTypes_0_0= ruleNodeType ) ) | ( (lv_edgeTypes_1_0= ruleEdgeType ) ) | ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_views_3_0= ruleView ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_0_0 = null;

        EObject lv_edgeTypes_1_0 = null;

        EObject lv_nodes_2_0 = null;

        EObject lv_views_3_0 = null;



        	enterRule();

        try {
            // InternalOntolizer.g:77:2: ( ( ( (lv_nodeTypes_0_0= ruleNodeType ) ) | ( (lv_edgeTypes_1_0= ruleEdgeType ) ) | ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_views_3_0= ruleView ) ) )* )
            // InternalOntolizer.g:78:2: ( ( (lv_nodeTypes_0_0= ruleNodeType ) ) | ( (lv_edgeTypes_1_0= ruleEdgeType ) ) | ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_views_3_0= ruleView ) ) )*
            {
            // InternalOntolizer.g:78:2: ( ( (lv_nodeTypes_0_0= ruleNodeType ) ) | ( (lv_edgeTypes_1_0= ruleEdgeType ) ) | ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_views_3_0= ruleView ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt1=3;
                    }
                    break;
                case 19:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalOntolizer.g:79:3: ( (lv_nodeTypes_0_0= ruleNodeType ) )
            	    {
            	    // InternalOntolizer.g:79:3: ( (lv_nodeTypes_0_0= ruleNodeType ) )
            	    // InternalOntolizer.g:80:4: (lv_nodeTypes_0_0= ruleNodeType )
            	    {
            	    // InternalOntolizer.g:80:4: (lv_nodeTypes_0_0= ruleNodeType )
            	    // InternalOntolizer.g:81:5: lv_nodeTypes_0_0= ruleNodeType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getNodeTypesNodeTypeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_nodeTypes_0_0=ruleNodeType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodeTypes",
            	    						lv_nodeTypes_0_0,
            	    						"de.protos.ontolizer.Ontolizer.NodeType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntolizer.g:99:3: ( (lv_edgeTypes_1_0= ruleEdgeType ) )
            	    {
            	    // InternalOntolizer.g:99:3: ( (lv_edgeTypes_1_0= ruleEdgeType ) )
            	    // InternalOntolizer.g:100:4: (lv_edgeTypes_1_0= ruleEdgeType )
            	    {
            	    // InternalOntolizer.g:100:4: (lv_edgeTypes_1_0= ruleEdgeType )
            	    // InternalOntolizer.g:101:5: lv_edgeTypes_1_0= ruleEdgeType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEdgeTypesEdgeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_edgeTypes_1_0=ruleEdgeType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edgeTypes",
            	    						lv_edgeTypes_1_0,
            	    						"de.protos.ontolizer.Ontolizer.EdgeType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOntolizer.g:119:3: ( (lv_nodes_2_0= ruleNode ) )
            	    {
            	    // InternalOntolizer.g:119:3: ( (lv_nodes_2_0= ruleNode ) )
            	    // InternalOntolizer.g:120:4: (lv_nodes_2_0= ruleNode )
            	    {
            	    // InternalOntolizer.g:120:4: (lv_nodes_2_0= ruleNode )
            	    // InternalOntolizer.g:121:5: lv_nodes_2_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_nodes_2_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_2_0,
            	    						"de.protos.ontolizer.Ontolizer.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOntolizer.g:139:3: ( (lv_views_3_0= ruleView ) )
            	    {
            	    // InternalOntolizer.g:139:3: ( (lv_views_3_0= ruleView ) )
            	    // InternalOntolizer.g:140:4: (lv_views_3_0= ruleView )
            	    {
            	    // InternalOntolizer.g:140:4: (lv_views_3_0= ruleView )
            	    // InternalOntolizer.g:141:5: lv_views_3_0= ruleView
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getViewsViewParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_views_3_0=ruleView();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"views",
            	    						lv_views_3_0,
            	    						"de.protos.ontolizer.Ontolizer.View");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeType"
    // InternalOntolizer.g:162:1: entryRuleNodeType returns [EObject current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final EObject entryRuleNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeType = null;


        try {
            // InternalOntolizer.g:162:49: (iv_ruleNodeType= ruleNodeType EOF )
            // InternalOntolizer.g:163:2: iv_ruleNodeType= ruleNodeType EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeType=ruleNodeType();

            state._fsp--;

             current =iv_ruleNodeType; 
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
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // InternalOntolizer.g:169:1: ruleNodeType returns [EObject current=null] : (otherlv_0= 'NodeType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'shape' ( (lv_shape_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= RULE_STRING ) ) )? (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_shape_3_0=null;
        Token otherlv_4=null;
        Token lv_color_5_0=null;
        Token otherlv_6=null;
        Token lv_style_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalOntolizer.g:175:2: ( (otherlv_0= 'NodeType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'shape' ( (lv_shape_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= RULE_STRING ) ) )? (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? otherlv_8= ';' ) )
            // InternalOntolizer.g:176:2: (otherlv_0= 'NodeType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'shape' ( (lv_shape_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= RULE_STRING ) ) )? (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? otherlv_8= ';' )
            {
            // InternalOntolizer.g:176:2: (otherlv_0= 'NodeType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'shape' ( (lv_shape_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= RULE_STRING ) ) )? (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? otherlv_8= ';' )
            // InternalOntolizer.g:177:3: otherlv_0= 'NodeType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'shape' ( (lv_shape_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= RULE_STRING ) ) )? (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeTypeAccess().getNodeTypeKeyword_0());
            		
            // InternalOntolizer.g:181:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntolizer.g:182:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntolizer.g:182:4: (lv_name_1_0= RULE_ID )
            // InternalOntolizer.g:183:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntolizer.g:199:3: (otherlv_2= 'shape' ( (lv_shape_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntolizer.g:200:4: otherlv_2= 'shape' ( (lv_shape_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeTypeAccess().getShapeKeyword_2_0());
                    			
                    // InternalOntolizer.g:204:4: ( (lv_shape_3_0= RULE_STRING ) )
                    // InternalOntolizer.g:205:5: (lv_shape_3_0= RULE_STRING )
                    {
                    // InternalOntolizer.g:205:5: (lv_shape_3_0= RULE_STRING )
                    // InternalOntolizer.g:206:6: lv_shape_3_0= RULE_STRING
                    {
                    lv_shape_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_shape_3_0, grammarAccess.getNodeTypeAccess().getShapeSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"shape",
                    							lv_shape_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntolizer.g:223:3: (otherlv_4= 'color' ( (lv_color_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntolizer.g:224:4: otherlv_4= 'color' ( (lv_color_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeTypeAccess().getColorKeyword_3_0());
                    			
                    // InternalOntolizer.g:228:4: ( (lv_color_5_0= RULE_STRING ) )
                    // InternalOntolizer.g:229:5: (lv_color_5_0= RULE_STRING )
                    {
                    // InternalOntolizer.g:229:5: (lv_color_5_0= RULE_STRING )
                    // InternalOntolizer.g:230:6: lv_color_5_0= RULE_STRING
                    {
                    lv_color_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_color_5_0, grammarAccess.getNodeTypeAccess().getColorSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"color",
                    							lv_color_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntolizer.g:247:3: (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntolizer.g:248:4: otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getNodeTypeAccess().getStyleKeyword_4_0());
                    			
                    // InternalOntolizer.g:252:4: ( (lv_style_7_0= RULE_STRING ) )
                    // InternalOntolizer.g:253:5: (lv_style_7_0= RULE_STRING )
                    {
                    // InternalOntolizer.g:253:5: (lv_style_7_0= RULE_STRING )
                    // InternalOntolizer.g:254:6: lv_style_7_0= RULE_STRING
                    {
                    lv_style_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_style_7_0, grammarAccess.getNodeTypeAccess().getStyleSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"style",
                    							lv_style_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getNodeTypeAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleEdgeType"
    // InternalOntolizer.g:279:1: entryRuleEdgeType returns [EObject current=null] : iv_ruleEdgeType= ruleEdgeType EOF ;
    public final EObject entryRuleEdgeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeType = null;


        try {
            // InternalOntolizer.g:279:49: (iv_ruleEdgeType= ruleEdgeType EOF )
            // InternalOntolizer.g:280:2: iv_ruleEdgeType= ruleEdgeType EOF
            {
             newCompositeNode(grammarAccess.getEdgeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeType=ruleEdgeType();

            state._fsp--;

             current =iv_ruleEdgeType; 
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
    // $ANTLR end "entryRuleEdgeType"


    // $ANTLR start "ruleEdgeType"
    // InternalOntolizer.g:286:1: ruleEdgeType returns [EObject current=null] : (otherlv_0= 'EdgeType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleEdgeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOntolizer.g:292:2: ( (otherlv_0= 'EdgeType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalOntolizer.g:293:2: (otherlv_0= 'EdgeType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalOntolizer.g:293:2: (otherlv_0= 'EdgeType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalOntolizer.g:294:3: otherlv_0= 'EdgeType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEdgeTypeAccess().getEdgeTypeKeyword_0());
            		
            // InternalOntolizer.g:298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntolizer.g:299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntolizer.g:299:4: (lv_name_1_0= RULE_ID )
            // InternalOntolizer.g:300:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEdgeTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEdgeTypeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleEdgeType"


    // $ANTLR start "entryRuleNode"
    // InternalOntolizer.g:324:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalOntolizer.g:324:45: (iv_ruleNode= ruleNode EOF )
            // InternalOntolizer.g:325:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalOntolizer.g:331:1: ruleNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )* ( (lv_edgeLists_4_0= ruleEdgeList ) )* otherlv_5= ';' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_summary_3_0=null;
        Token otherlv_5=null;
        EObject lv_edgeLists_4_0 = null;



        	enterRule();

        try {
            // InternalOntolizer.g:337:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )* ( (lv_edgeLists_4_0= ruleEdgeList ) )* otherlv_5= ';' ) )
            // InternalOntolizer.g:338:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )* ( (lv_edgeLists_4_0= ruleEdgeList ) )* otherlv_5= ';' )
            {
            // InternalOntolizer.g:338:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )* ( (lv_edgeLists_4_0= ruleEdgeList ) )* otherlv_5= ';' )
            // InternalOntolizer.g:339:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )* ( (lv_edgeLists_4_0= ruleEdgeList ) )* otherlv_5= ';'
            {
            // InternalOntolizer.g:339:3: ( (otherlv_0= RULE_ID ) )
            // InternalOntolizer.g:340:4: (otherlv_0= RULE_ID )
            {
            // InternalOntolizer.g:340:4: (otherlv_0= RULE_ID )
            // InternalOntolizer.g:341:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeTypeNodeTypeCrossReference_0_0());
            				

            }


            }

            // InternalOntolizer.g:352:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntolizer.g:353:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntolizer.g:353:4: (lv_name_1_0= RULE_ID )
            // InternalOntolizer.g:354:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntolizer.g:370:3: (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOntolizer.g:371:4: otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getSummaryKeyword_2_0());
            	    			
            	    // InternalOntolizer.g:375:4: ( (lv_summary_3_0= RULE_STRING ) )
            	    // InternalOntolizer.g:376:5: (lv_summary_3_0= RULE_STRING )
            	    {
            	    // InternalOntolizer.g:376:5: (lv_summary_3_0= RULE_STRING )
            	    // InternalOntolizer.g:377:6: lv_summary_3_0= RULE_STRING
            	    {
            	    lv_summary_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_summary_3_0, grammarAccess.getNodeAccess().getSummarySTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNodeRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"summary",
            	    							lv_summary_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalOntolizer.g:394:3: ( (lv_edgeLists_4_0= ruleEdgeList ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOntolizer.g:395:4: (lv_edgeLists_4_0= ruleEdgeList )
            	    {
            	    // InternalOntolizer.g:395:4: (lv_edgeLists_4_0= ruleEdgeList )
            	    // InternalOntolizer.g:396:5: lv_edgeLists_4_0= ruleEdgeList
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getEdgeListsEdgeListParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_edgeLists_4_0=ruleEdgeList();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edgeLists",
            	    						lv_edgeLists_4_0,
            	    						"de.protos.ontolizer.Ontolizer.EdgeList");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEdgeList"
    // InternalOntolizer.g:421:1: entryRuleEdgeList returns [EObject current=null] : iv_ruleEdgeList= ruleEdgeList EOF ;
    public final EObject entryRuleEdgeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeList = null;


        try {
            // InternalOntolizer.g:421:49: (iv_ruleEdgeList= ruleEdgeList EOF )
            // InternalOntolizer.g:422:2: iv_ruleEdgeList= ruleEdgeList EOF
            {
             newCompositeNode(grammarAccess.getEdgeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeList=ruleEdgeList();

            state._fsp--;

             current =iv_ruleEdgeList; 
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
    // $ANTLR end "entryRuleEdgeList"


    // $ANTLR start "ruleEdgeList"
    // InternalOntolizer.g:428:1: ruleEdgeList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_edges_1_0= ruleEdge ) ) (otherlv_2= ',' ( (lv_edges_3_0= ruleEdge ) ) )* ) ;
    public final EObject ruleEdgeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_edges_1_0 = null;

        EObject lv_edges_3_0 = null;



        	enterRule();

        try {
            // InternalOntolizer.g:434:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_edges_1_0= ruleEdge ) ) (otherlv_2= ',' ( (lv_edges_3_0= ruleEdge ) ) )* ) )
            // InternalOntolizer.g:435:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_edges_1_0= ruleEdge ) ) (otherlv_2= ',' ( (lv_edges_3_0= ruleEdge ) ) )* )
            {
            // InternalOntolizer.g:435:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_edges_1_0= ruleEdge ) ) (otherlv_2= ',' ( (lv_edges_3_0= ruleEdge ) ) )* )
            // InternalOntolizer.g:436:3: ( (otherlv_0= RULE_ID ) ) ( (lv_edges_1_0= ruleEdge ) ) (otherlv_2= ',' ( (lv_edges_3_0= ruleEdge ) ) )*
            {
            // InternalOntolizer.g:436:3: ( (otherlv_0= RULE_ID ) )
            // InternalOntolizer.g:437:4: (otherlv_0= RULE_ID )
            {
            // InternalOntolizer.g:437:4: (otherlv_0= RULE_ID )
            // InternalOntolizer.g:438:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeListRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getEdgeListAccess().getEdgeTypeEdgeTypeCrossReference_0_0());
            				

            }


            }

            // InternalOntolizer.g:449:3: ( (lv_edges_1_0= ruleEdge ) )
            // InternalOntolizer.g:450:4: (lv_edges_1_0= ruleEdge )
            {
            // InternalOntolizer.g:450:4: (lv_edges_1_0= ruleEdge )
            // InternalOntolizer.g:451:5: lv_edges_1_0= ruleEdge
            {

            					newCompositeNode(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_edges_1_0=ruleEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEdgeListRule());
            					}
            					add(
            						current,
            						"edges",
            						lv_edges_1_0,
            						"de.protos.ontolizer.Ontolizer.Edge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntolizer.g:468:3: (otherlv_2= ',' ( (lv_edges_3_0= ruleEdge ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOntolizer.g:469:4: otherlv_2= ',' ( (lv_edges_3_0= ruleEdge ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEdgeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOntolizer.g:473:4: ( (lv_edges_3_0= ruleEdge ) )
            	    // InternalOntolizer.g:474:5: (lv_edges_3_0= ruleEdge )
            	    {
            	    // InternalOntolizer.g:474:5: (lv_edges_3_0= ruleEdge )
            	    // InternalOntolizer.g:475:6: lv_edges_3_0= ruleEdge
            	    {

            	    						newCompositeNode(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_edges_3_0=ruleEdge();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEdgeListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"edges",
            	    							lv_edges_3_0,
            	    							"de.protos.ontolizer.Ontolizer.Edge");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleEdgeList"


    // $ANTLR start "entryRuleEdge"
    // InternalOntolizer.g:497:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalOntolizer.g:497:45: (iv_ruleEdge= ruleEdge EOF )
            // InternalOntolizer.g:498:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalOntolizer.g:504:1: ruleEdge returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOntolizer.g:510:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalOntolizer.g:511:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalOntolizer.g:511:2: ( (otherlv_0= RULE_ID ) )
            // InternalOntolizer.g:512:3: (otherlv_0= RULE_ID )
            {
            // InternalOntolizer.g:512:3: (otherlv_0= RULE_ID )
            // InternalOntolizer.g:513:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEdgeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEdgeAccess().getTargetNodeNodeCrossReference_0());
            			

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleView"
    // InternalOntolizer.g:527:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // InternalOntolizer.g:527:45: (iv_ruleView= ruleView EOF )
            // InternalOntolizer.g:528:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // InternalOntolizer.g:534:1: ruleView returns [EObject current=null] : (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'edgeTypes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'nodeTypes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'depth' ( (lv_depth_11_0= ruleDepthRange ) ) )? otherlv_12= ';' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_depth_11_0 = null;



        	enterRule();

        try {
            // InternalOntolizer.g:540:2: ( (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'edgeTypes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'nodeTypes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'depth' ( (lv_depth_11_0= ruleDepthRange ) ) )? otherlv_12= ';' ) )
            // InternalOntolizer.g:541:2: (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'edgeTypes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'nodeTypes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'depth' ( (lv_depth_11_0= ruleDepthRange ) ) )? otherlv_12= ';' )
            {
            // InternalOntolizer.g:541:2: (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'edgeTypes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'nodeTypes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'depth' ( (lv_depth_11_0= ruleDepthRange ) ) )? otherlv_12= ';' )
            // InternalOntolizer.g:542:3: otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'edgeTypes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'nodeTypes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'depth' ( (lv_depth_11_0= ruleDepthRange ) ) )? otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
            		
            // InternalOntolizer.g:546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntolizer.g:547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntolizer.g:547:4: (lv_name_1_0= RULE_ID )
            // InternalOntolizer.g:548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getViewAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntolizer.g:564:3: (otherlv_2= 'edgeTypes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntolizer.g:565:4: otherlv_2= 'edgeTypes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getViewAccess().getEdgeTypesKeyword_2_0());
                    			
                    // InternalOntolizer.g:569:4: ( (otherlv_3= RULE_ID ) )
                    // InternalOntolizer.g:570:5: (otherlv_3= RULE_ID )
                    {
                    // InternalOntolizer.g:570:5: (otherlv_3= RULE_ID )
                    // InternalOntolizer.g:571:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalOntolizer.g:582:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOntolizer.g:583:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getViewAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntolizer.g:587:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalOntolizer.g:588:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalOntolizer.g:588:6: (otherlv_5= RULE_ID )
                    	    // InternalOntolizer.g:589:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getViewRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntolizer.g:602:3: (otherlv_6= 'nodeTypes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntolizer.g:603:4: otherlv_6= 'nodeTypes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getViewAccess().getNodeTypesKeyword_3_0());
                    			
                    // InternalOntolizer.g:607:4: ( (otherlv_7= RULE_ID ) )
                    // InternalOntolizer.g:608:5: (otherlv_7= RULE_ID )
                    {
                    // InternalOntolizer.g:608:5: (otherlv_7= RULE_ID )
                    // InternalOntolizer.g:609:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_7, grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalOntolizer.g:620:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalOntolizer.g:621:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getViewAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOntolizer.g:625:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalOntolizer.g:626:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalOntolizer.g:626:6: (otherlv_9= RULE_ID )
                    	    // InternalOntolizer.g:627:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getViewRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntolizer.g:640:3: (otherlv_10= 'depth' ( (lv_depth_11_0= ruleDepthRange ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntolizer.g:641:4: otherlv_10= 'depth' ( (lv_depth_11_0= ruleDepthRange ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getViewAccess().getDepthKeyword_4_0());
                    			
                    // InternalOntolizer.g:645:4: ( (lv_depth_11_0= ruleDepthRange ) )
                    // InternalOntolizer.g:646:5: (lv_depth_11_0= ruleDepthRange )
                    {
                    // InternalOntolizer.g:646:5: (lv_depth_11_0= ruleDepthRange )
                    // InternalOntolizer.g:647:6: lv_depth_11_0= ruleDepthRange
                    {

                    						newCompositeNode(grammarAccess.getViewAccess().getDepthDepthRangeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_depth_11_0=ruleDepthRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getViewRule());
                    						}
                    						set(
                    							current,
                    							"depth",
                    							lv_depth_11_0,
                    							"de.protos.ontolizer.Ontolizer.DepthRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getViewAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleDepthRange"
    // InternalOntolizer.g:673:1: entryRuleDepthRange returns [EObject current=null] : iv_ruleDepthRange= ruleDepthRange EOF ;
    public final EObject entryRuleDepthRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepthRange = null;


        try {
            // InternalOntolizer.g:673:51: (iv_ruleDepthRange= ruleDepthRange EOF )
            // InternalOntolizer.g:674:2: iv_ruleDepthRange= ruleDepthRange EOF
            {
             newCompositeNode(grammarAccess.getDepthRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepthRange=ruleDepthRange();

            state._fsp--;

             current =iv_ruleDepthRange; 
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
    // $ANTLR end "entryRuleDepthRange"


    // $ANTLR start "ruleDepthRange"
    // InternalOntolizer.g:680:1: ruleDepthRange returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) (otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDepthRange() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalOntolizer.g:686:2: ( ( ( (lv_start_0_0= RULE_INT ) ) (otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )? ) )
            // InternalOntolizer.g:687:2: ( ( (lv_start_0_0= RULE_INT ) ) (otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )? )
            {
            // InternalOntolizer.g:687:2: ( ( (lv_start_0_0= RULE_INT ) ) (otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )? )
            // InternalOntolizer.g:688:3: ( (lv_start_0_0= RULE_INT ) ) (otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )?
            {
            // InternalOntolizer.g:688:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalOntolizer.g:689:4: (lv_start_0_0= RULE_INT )
            {
            // InternalOntolizer.g:689:4: (lv_start_0_0= RULE_INT )
            // InternalOntolizer.g:690:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_start_0_0, grammarAccess.getDepthRangeAccess().getStartINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepthRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOntolizer.g:706:3: (otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntolizer.g:707:4: otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getDepthRangeAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalOntolizer.g:711:4: ( (lv_end_2_0= RULE_INT ) )
                    // InternalOntolizer.g:712:5: (lv_end_2_0= RULE_INT )
                    {
                    // InternalOntolizer.g:712:5: (lv_end_2_0= RULE_INT )
                    // InternalOntolizer.g:713:6: lv_end_2_0= RULE_INT
                    {
                    lv_end_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_end_2_0, grammarAccess.getDepthRangeAccess().getEndINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepthRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDepthRange"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000090812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000708000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000648000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000448000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});

}