/*
 * generated by Xtext 2.9.1
 */
grammar InternalOntolizer;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.protos.ontolizer.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getNodeTypesNodeTypeParserRuleCall_0_0());
				}
				lv_nodeTypes_0_0=ruleNodeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"nodeTypes",
						lv_nodeTypes_0_0,
						"de.protos.ontolizer.Ontolizer.NodeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getEdgeTypesEdgeTypeParserRuleCall_1_0());
				}
				lv_edgeTypes_1_0=ruleEdgeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"edgeTypes",
						lv_edgeTypes_1_0,
						"de.protos.ontolizer.Ontolizer.EdgeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_2_0());
				}
				lv_nodes_2_0=ruleNode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"nodes",
						lv_nodes_2_0,
						"de.protos.ontolizer.Ontolizer.Node");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getViewsViewParserRuleCall_3_0());
				}
				lv_views_3_0=ruleView
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"views",
						lv_views_3_0,
						"de.protos.ontolizer.Ontolizer.View");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRuleNodeType
entryRuleNodeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeTypeRule()); }
	iv_ruleNodeType=ruleNodeType
	{ $current=$iv_ruleNodeType.current; }
	EOF;

// Rule NodeType
ruleNodeType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NodeType'
		{
			newLeafNode(otherlv_0, grammarAccess.getNodeTypeAccess().getNodeTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNodeTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='shape'
			{
				newLeafNode(otherlv_2, grammarAccess.getNodeTypeAccess().getShapeKeyword_2_0());
			}
			(
				(
					lv_shape_3_0=RULE_STRING
					{
						newLeafNode(lv_shape_3_0, grammarAccess.getNodeTypeAccess().getShapeSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeTypeRule());
						}
						setWithLastConsumed(
							$current,
							"shape",
							lv_shape_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_4='color'
			{
				newLeafNode(otherlv_4, grammarAccess.getNodeTypeAccess().getColorKeyword_3_0());
			}
			(
				(
					lv_color_5_0=RULE_STRING
					{
						newLeafNode(lv_color_5_0, grammarAccess.getNodeTypeAccess().getColorSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeTypeRule());
						}
						setWithLastConsumed(
							$current,
							"color",
							lv_color_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_6='style'
			{
				newLeafNode(otherlv_6, grammarAccess.getNodeTypeAccess().getStyleKeyword_4_0());
			}
			(
				(
					lv_style_7_0=RULE_STRING
					{
						newLeafNode(lv_style_7_0, grammarAccess.getNodeTypeAccess().getStyleSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeTypeRule());
						}
						setWithLastConsumed(
							$current,
							"style",
							lv_style_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getNodeTypeAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleEdgeType
entryRuleEdgeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEdgeTypeRule()); }
	iv_ruleEdgeType=ruleEdgeType
	{ $current=$iv_ruleEdgeType.current; }
	EOF;

// Rule EdgeType
ruleEdgeType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='EdgeType'
		{
			newLeafNode(otherlv_0, grammarAccess.getEdgeTypeAccess().getEdgeTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEdgeTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEdgeTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getEdgeTypeAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	iv_ruleNode=ruleNode
	{ $current=$iv_ruleNode.current; }
	EOF;

// Rule Node
ruleNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeTypeNodeTypeCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='summary'
			{
				newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getSummaryKeyword_2_0());
			}
			(
				(
					lv_summary_3_0=RULE_STRING
					{
						newLeafNode(lv_summary_3_0, grammarAccess.getNodeAccess().getSummarySTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeRule());
						}
						addWithLastConsumed(
							$current,
							"summary",
							lv_summary_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getNodeAccess().getEdgeListsEdgeListParserRuleCall_3_0());
				}
				lv_edgeLists_4_0=ruleEdgeList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeRule());
					}
					add(
						$current,
						"edgeLists",
						lv_edgeLists_4_0,
						"de.protos.ontolizer.Ontolizer.EdgeList");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleEdgeList
entryRuleEdgeList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEdgeListRule()); }
	iv_ruleEdgeList=ruleEdgeList
	{ $current=$iv_ruleEdgeList.current; }
	EOF;

// Rule EdgeList
ruleEdgeList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEdgeListRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getEdgeListAccess().getEdgeTypeEdgeTypeCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_1_0());
				}
				lv_edges_1_0=ruleEdge
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEdgeListRule());
					}
					add(
						$current,
						"edges",
						lv_edges_1_0,
						"de.protos.ontolizer.Ontolizer.Edge");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getEdgeListAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEdgeListAccess().getEdgesEdgeParserRuleCall_2_1_0());
					}
					lv_edges_3_0=ruleEdge
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEdgeListRule());
						}
						add(
							$current,
							"edges",
							lv_edges_3_0,
							"de.protos.ontolizer.Ontolizer.Edge");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEdge
entryRuleEdge returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEdgeRule()); }
	iv_ruleEdge=ruleEdge
	{ $current=$iv_ruleEdge.current; }
	EOF;

// Rule Edge
ruleEdge returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEdgeRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getEdgeAccess().getTargetNodeNodeCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleView
entryRuleView returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getViewRule()); }
	iv_ruleView=ruleView
	{ $current=$iv_ruleView.current; }
	EOF;

// Rule View
ruleView returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='View'
		{
			newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getViewAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViewRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='edgeTypes'
			{
				newLeafNode(otherlv_2, grammarAccess.getViewAccess().getEdgeTypesKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_1_0());
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getViewAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getViewRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getViewAccess().getEdgeTypesEdgeTypeCrossReference_2_2_1_0());
						}
					)
				)
			)*
		)?
		(
			otherlv_6='nodeTypes'
			{
				newLeafNode(otherlv_6, grammarAccess.getViewAccess().getNodeTypesKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getViewAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getViewRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getViewAccess().getNodeTypesNodeTypeCrossReference_3_2_1_0());
						}
					)
				)
			)*
		)?
		(
			otherlv_10='depth'
			{
				newLeafNode(otherlv_10, grammarAccess.getViewAccess().getDepthKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getViewAccess().getDepthDepthRangeParserRuleCall_4_1_0());
					}
					lv_depth_11_0=ruleDepthRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getViewRule());
						}
						set(
							$current,
							"depth",
							lv_depth_11_0,
							"de.protos.ontolizer.Ontolizer.DepthRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getViewAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleDepthRange
entryRuleDepthRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDepthRangeRule()); }
	iv_ruleDepthRange=ruleDepthRange
	{ $current=$iv_ruleDepthRange.current; }
	EOF;

// Rule DepthRange
ruleDepthRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_start_0_0=RULE_INT
				{
					newLeafNode(lv_start_0_0, grammarAccess.getDepthRangeAccess().getStartINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDepthRangeRule());
					}
					setWithLastConsumed(
						$current,
						"start",
						lv_start_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_1='..'
			{
				newLeafNode(otherlv_1, grammarAccess.getDepthRangeAccess().getFullStopFullStopKeyword_1_0());
			}
			(
				(
					lv_end_2_0=RULE_INT
					{
						newLeafNode(lv_end_2_0, grammarAccess.getDepthRangeAccess().getEndINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDepthRangeRule());
						}
						setWithLastConsumed(
							$current,
							"end",
							lv_end_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
