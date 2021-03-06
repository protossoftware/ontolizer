/*
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class OntolizerGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNodeTypesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNodeTypesNodeTypeParserRuleCall_0_0 = (RuleCall)cNodeTypesAssignment_0.eContents().get(0);
		private final Assignment cEdgeTypesAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cEdgeTypesEdgeTypeParserRuleCall_1_0 = (RuleCall)cEdgeTypesAssignment_1.eContents().get(0);
		private final Assignment cNodesAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cNodesNodeParserRuleCall_2_0 = (RuleCall)cNodesAssignment_2.eContents().get(0);
		private final Assignment cViewsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cViewsViewParserRuleCall_3_0 = (RuleCall)cViewsAssignment_3.eContents().get(0);
		
		//Model:
		//	(nodeTypes+=NodeType | edgeTypes+=EdgeType | nodes+=Node | views+=View)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(nodeTypes+=NodeType | edgeTypes+=EdgeType | nodes+=Node | views+=View)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//nodeTypes+=NodeType
		public Assignment getNodeTypesAssignment_0() { return cNodeTypesAssignment_0; }
		
		//NodeType
		public RuleCall getNodeTypesNodeTypeParserRuleCall_0_0() { return cNodeTypesNodeTypeParserRuleCall_0_0; }
		
		//edgeTypes+=EdgeType
		public Assignment getEdgeTypesAssignment_1() { return cEdgeTypesAssignment_1; }
		
		//EdgeType
		public RuleCall getEdgeTypesEdgeTypeParserRuleCall_1_0() { return cEdgeTypesEdgeTypeParserRuleCall_1_0; }
		
		//nodes+=Node
		public Assignment getNodesAssignment_2() { return cNodesAssignment_2; }
		
		//Node
		public RuleCall getNodesNodeParserRuleCall_2_0() { return cNodesNodeParserRuleCall_2_0; }
		
		//views+=View
		public Assignment getViewsAssignment_3() { return cViewsAssignment_3; }
		
		//View
		public RuleCall getViewsViewParserRuleCall_3_0() { return cViewsViewParserRuleCall_3_0; }
	}
	public class NodeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.NodeType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNodeTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cShapeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cShapeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cShapeSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cShapeAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColorKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cColorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cColorSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cColorAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cStyleKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cStyleAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cStyleAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//NodeType:
		//	'NodeType' name=ID ('shape' shape=STRING)? ('color' color=STRING)? ('style' style=STRING)?
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//'NodeType' name=ID ('shape' shape=STRING)? ('color' color=STRING)? ('style' style=STRING)? ';'
		public Group getGroup() { return cGroup; }
		
		//'NodeType'
		public Keyword getNodeTypeKeyword_0() { return cNodeTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('shape' shape=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'shape'
		public Keyword getShapeKeyword_2_0() { return cShapeKeyword_2_0; }
		
		//shape=STRING
		public Assignment getShapeAssignment_2_1() { return cShapeAssignment_2_1; }
		
		//STRING
		public RuleCall getShapeSTRINGTerminalRuleCall_2_1_0() { return cShapeSTRINGTerminalRuleCall_2_1_0; }
		
		//('color' color=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'color'
		public Keyword getColorKeyword_3_0() { return cColorKeyword_3_0; }
		
		//color=STRING
		public Assignment getColorAssignment_3_1() { return cColorAssignment_3_1; }
		
		//STRING
		public RuleCall getColorSTRINGTerminalRuleCall_3_1_0() { return cColorSTRINGTerminalRuleCall_3_1_0; }
		
		//('style' style=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'style'
		public Keyword getStyleKeyword_4_0() { return cStyleKeyword_4_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_4_1() { return cStyleAssignment_4_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_4_1_0() { return cStyleSTRINGTerminalRuleCall_4_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class EdgeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.EdgeType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEdgeTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//EdgeType:
		//	'EdgeType' name=ID
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//'EdgeType' name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'EdgeType'
		public Keyword getEdgeTypeKeyword_0() { return cEdgeTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNodeTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNodeTypeNodeTypeCrossReference_0_0 = (CrossReference)cNodeTypeAssignment_0.eContents().get(0);
		private final RuleCall cNodeTypeNodeTypeIDTerminalRuleCall_0_0_1 = (RuleCall)cNodeTypeNodeTypeCrossReference_0_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSummaryKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSummaryAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cSummarySTRINGTerminalRuleCall_2_1_0 = (RuleCall)cSummaryAssignment_2_1.eContents().get(0);
		private final Assignment cEdgeListsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEdgeListsEdgeListParserRuleCall_3_0 = (RuleCall)cEdgeListsAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Node:
		//	nodeType=[NodeType] name=ID ('summary' summary+=STRING)*
		//	edgeLists+=EdgeList*
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//nodeType=[NodeType] name=ID ('summary' summary+=STRING)* edgeLists+=EdgeList* ';'
		public Group getGroup() { return cGroup; }
		
		//nodeType=[NodeType]
		public Assignment getNodeTypeAssignment_0() { return cNodeTypeAssignment_0; }
		
		//[NodeType]
		public CrossReference getNodeTypeNodeTypeCrossReference_0_0() { return cNodeTypeNodeTypeCrossReference_0_0; }
		
		//ID
		public RuleCall getNodeTypeNodeTypeIDTerminalRuleCall_0_0_1() { return cNodeTypeNodeTypeIDTerminalRuleCall_0_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('summary' summary+=STRING)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'summary'
		public Keyword getSummaryKeyword_2_0() { return cSummaryKeyword_2_0; }
		
		//summary+=STRING
		public Assignment getSummaryAssignment_2_1() { return cSummaryAssignment_2_1; }
		
		//STRING
		public RuleCall getSummarySTRINGTerminalRuleCall_2_1_0() { return cSummarySTRINGTerminalRuleCall_2_1_0; }
		
		//edgeLists+=EdgeList*
		public Assignment getEdgeListsAssignment_3() { return cEdgeListsAssignment_3; }
		
		//EdgeList
		public RuleCall getEdgeListsEdgeListParserRuleCall_3_0() { return cEdgeListsEdgeListParserRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class EdgeListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.EdgeList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEdgeTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEdgeTypeEdgeTypeCrossReference_0_0 = (CrossReference)cEdgeTypeAssignment_0.eContents().get(0);
		private final RuleCall cEdgeTypeEdgeTypeIDTerminalRuleCall_0_0_1 = (RuleCall)cEdgeTypeEdgeTypeCrossReference_0_0.eContents().get(1);
		private final Assignment cEdgesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEdgesEdgeParserRuleCall_1_0 = (RuleCall)cEdgesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEdgesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEdgesEdgeParserRuleCall_2_1_0 = (RuleCall)cEdgesAssignment_2_1.eContents().get(0);
		
		//EdgeList:
		//	edgeType=[EdgeType] edges+=Edge (',' edges+=Edge)*;
		@Override public ParserRule getRule() { return rule; }
		
		//edgeType=[EdgeType] edges+=Edge (',' edges+=Edge)*
		public Group getGroup() { return cGroup; }
		
		//edgeType=[EdgeType]
		public Assignment getEdgeTypeAssignment_0() { return cEdgeTypeAssignment_0; }
		
		//[EdgeType]
		public CrossReference getEdgeTypeEdgeTypeCrossReference_0_0() { return cEdgeTypeEdgeTypeCrossReference_0_0; }
		
		//ID
		public RuleCall getEdgeTypeEdgeTypeIDTerminalRuleCall_0_0_1() { return cEdgeTypeEdgeTypeIDTerminalRuleCall_0_0_1; }
		
		//edges+=Edge
		public Assignment getEdgesAssignment_1() { return cEdgesAssignment_1; }
		
		//Edge
		public RuleCall getEdgesEdgeParserRuleCall_1_0() { return cEdgesEdgeParserRuleCall_1_0; }
		
		//(',' edges+=Edge)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//edges+=Edge
		public Assignment getEdgesAssignment_2_1() { return cEdgesAssignment_2_1; }
		
		//Edge
		public RuleCall getEdgesEdgeParserRuleCall_2_1_0() { return cEdgesEdgeParserRuleCall_2_1_0; }
	}
	public class EdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.Edge");
		private final Assignment cTargetNodeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTargetNodeNodeCrossReference_0 = (CrossReference)cTargetNodeAssignment.eContents().get(0);
		private final RuleCall cTargetNodeNodeIDTerminalRuleCall_0_1 = (RuleCall)cTargetNodeNodeCrossReference_0.eContents().get(1);
		
		//Edge:
		//	targetNode=[Node];
		@Override public ParserRule getRule() { return rule; }
		
		//targetNode=[Node]
		public Assignment getTargetNodeAssignment() { return cTargetNodeAssignment; }
		
		//[Node]
		public CrossReference getTargetNodeNodeCrossReference_0() { return cTargetNodeNodeCrossReference_0; }
		
		//ID
		public RuleCall getTargetNodeNodeIDTerminalRuleCall_0_1() { return cTargetNodeNodeIDTerminalRuleCall_0_1; }
	}
	public class ViewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.View");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cViewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEdgeTypesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEdgeTypesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cEdgeTypesEdgeTypeCrossReference_2_1_0 = (CrossReference)cEdgeTypesAssignment_2_1.eContents().get(0);
		private final RuleCall cEdgeTypesEdgeTypeIDTerminalRuleCall_2_1_0_1 = (RuleCall)cEdgeTypesEdgeTypeCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cEdgeTypesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cEdgeTypesEdgeTypeCrossReference_2_2_1_0 = (CrossReference)cEdgeTypesAssignment_2_2_1.eContents().get(0);
		private final RuleCall cEdgeTypesEdgeTypeIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cEdgeTypesEdgeTypeCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNodeTypesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNodeTypesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cNodeTypesNodeTypeCrossReference_3_1_0 = (CrossReference)cNodeTypesAssignment_3_1.eContents().get(0);
		private final RuleCall cNodeTypesNodeTypeIDTerminalRuleCall_3_1_0_1 = (RuleCall)cNodeTypesNodeTypeCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cNodeTypesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cNodeTypesNodeTypeCrossReference_3_2_1_0 = (CrossReference)cNodeTypesAssignment_3_2_1.eContents().get(0);
		private final RuleCall cNodeTypesNodeTypeIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cNodeTypesNodeTypeCrossReference_3_2_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDepthKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDepthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDepthDepthRangeParserRuleCall_4_1_0 = (RuleCall)cDepthAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//View:
		//	'View' name=ID ('edgeTypes' edgeTypes+=[EdgeType] (',' edgeTypes+=[EdgeType])*)? ('nodeTypes' nodeTypes+=[NodeType]
		//	(',' nodeTypes+=[NodeType])*)? ('depth' depth=DepthRange)?
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//'View' name=ID ('edgeTypes' edgeTypes+=[EdgeType] (',' edgeTypes+=[EdgeType])*)? ('nodeTypes' nodeTypes+=[NodeType] (','
		//nodeTypes+=[NodeType])*)? ('depth' depth=DepthRange)? ';'
		public Group getGroup() { return cGroup; }
		
		//'View'
		public Keyword getViewKeyword_0() { return cViewKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('edgeTypes' edgeTypes+=[EdgeType] (',' edgeTypes+=[EdgeType])*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'edgeTypes'
		public Keyword getEdgeTypesKeyword_2_0() { return cEdgeTypesKeyword_2_0; }
		
		//edgeTypes+=[EdgeType]
		public Assignment getEdgeTypesAssignment_2_1() { return cEdgeTypesAssignment_2_1; }
		
		//[EdgeType]
		public CrossReference getEdgeTypesEdgeTypeCrossReference_2_1_0() { return cEdgeTypesEdgeTypeCrossReference_2_1_0; }
		
		//ID
		public RuleCall getEdgeTypesEdgeTypeIDTerminalRuleCall_2_1_0_1() { return cEdgeTypesEdgeTypeIDTerminalRuleCall_2_1_0_1; }
		
		//(',' edgeTypes+=[EdgeType])*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//edgeTypes+=[EdgeType]
		public Assignment getEdgeTypesAssignment_2_2_1() { return cEdgeTypesAssignment_2_2_1; }
		
		//[EdgeType]
		public CrossReference getEdgeTypesEdgeTypeCrossReference_2_2_1_0() { return cEdgeTypesEdgeTypeCrossReference_2_2_1_0; }
		
		//ID
		public RuleCall getEdgeTypesEdgeTypeIDTerminalRuleCall_2_2_1_0_1() { return cEdgeTypesEdgeTypeIDTerminalRuleCall_2_2_1_0_1; }
		
		//('nodeTypes' nodeTypes+=[NodeType] (',' nodeTypes+=[NodeType])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'nodeTypes'
		public Keyword getNodeTypesKeyword_3_0() { return cNodeTypesKeyword_3_0; }
		
		//nodeTypes+=[NodeType]
		public Assignment getNodeTypesAssignment_3_1() { return cNodeTypesAssignment_3_1; }
		
		//[NodeType]
		public CrossReference getNodeTypesNodeTypeCrossReference_3_1_0() { return cNodeTypesNodeTypeCrossReference_3_1_0; }
		
		//ID
		public RuleCall getNodeTypesNodeTypeIDTerminalRuleCall_3_1_0_1() { return cNodeTypesNodeTypeIDTerminalRuleCall_3_1_0_1; }
		
		//(',' nodeTypes+=[NodeType])*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//nodeTypes+=[NodeType]
		public Assignment getNodeTypesAssignment_3_2_1() { return cNodeTypesAssignment_3_2_1; }
		
		//[NodeType]
		public CrossReference getNodeTypesNodeTypeCrossReference_3_2_1_0() { return cNodeTypesNodeTypeCrossReference_3_2_1_0; }
		
		//ID
		public RuleCall getNodeTypesNodeTypeIDTerminalRuleCall_3_2_1_0_1() { return cNodeTypesNodeTypeIDTerminalRuleCall_3_2_1_0_1; }
		
		//('depth' depth=DepthRange)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'depth'
		public Keyword getDepthKeyword_4_0() { return cDepthKeyword_4_0; }
		
		//depth=DepthRange
		public Assignment getDepthAssignment_4_1() { return cDepthAssignment_4_1; }
		
		//DepthRange
		public RuleCall getDepthDepthRangeParserRuleCall_4_1_0() { return cDepthDepthRangeParserRuleCall_4_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class DepthRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.ontolizer.Ontolizer.DepthRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStartAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStartINTTerminalRuleCall_0_0 = (RuleCall)cStartAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEndAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEndINTTerminalRuleCall_1_1_0 = (RuleCall)cEndAssignment_1_1.eContents().get(0);
		
		//DepthRange:
		//	start=INT ('..' end=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//start=INT ('..' end=INT)?
		public Group getGroup() { return cGroup; }
		
		//start=INT
		public Assignment getStartAssignment_0() { return cStartAssignment_0; }
		
		//INT
		public RuleCall getStartINTTerminalRuleCall_0_0() { return cStartINTTerminalRuleCall_0_0; }
		
		//('..' end=INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_1_0() { return cFullStopFullStopKeyword_1_0; }
		
		//end=INT
		public Assignment getEndAssignment_1_1() { return cEndAssignment_1_1; }
		
		//INT
		public RuleCall getEndINTTerminalRuleCall_1_1_0() { return cEndINTTerminalRuleCall_1_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final NodeTypeElements pNodeType;
	private final EdgeTypeElements pEdgeType;
	private final NodeElements pNode;
	private final EdgeListElements pEdgeList;
	private final EdgeElements pEdge;
	private final ViewElements pView;
	private final DepthRangeElements pDepthRange;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OntolizerGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pNodeType = new NodeTypeElements();
		this.pEdgeType = new EdgeTypeElements();
		this.pNode = new NodeElements();
		this.pEdgeList = new EdgeListElements();
		this.pEdge = new EdgeElements();
		this.pView = new ViewElements();
		this.pDepthRange = new DepthRangeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.protos.ontolizer.Ontolizer".equals(grammar.getName())) {
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

	
	//Model:
	//	(nodeTypes+=NodeType | edgeTypes+=EdgeType | nodes+=Node | views+=View)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//NodeType:
	//	'NodeType' name=ID ('shape' shape=STRING)? ('color' color=STRING)? ('style' style=STRING)?
	//	';';
	public NodeTypeElements getNodeTypeAccess() {
		return pNodeType;
	}
	
	public ParserRule getNodeTypeRule() {
		return getNodeTypeAccess().getRule();
	}
	
	//EdgeType:
	//	'EdgeType' name=ID
	//	';';
	public EdgeTypeElements getEdgeTypeAccess() {
		return pEdgeType;
	}
	
	public ParserRule getEdgeTypeRule() {
		return getEdgeTypeAccess().getRule();
	}
	
	//Node:
	//	nodeType=[NodeType] name=ID ('summary' summary+=STRING)*
	//	edgeLists+=EdgeList*
	//	';';
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}
	
	//EdgeList:
	//	edgeType=[EdgeType] edges+=Edge (',' edges+=Edge)*;
	public EdgeListElements getEdgeListAccess() {
		return pEdgeList;
	}
	
	public ParserRule getEdgeListRule() {
		return getEdgeListAccess().getRule();
	}
	
	//Edge:
	//	targetNode=[Node];
	public EdgeElements getEdgeAccess() {
		return pEdge;
	}
	
	public ParserRule getEdgeRule() {
		return getEdgeAccess().getRule();
	}
	
	//View:
	//	'View' name=ID ('edgeTypes' edgeTypes+=[EdgeType] (',' edgeTypes+=[EdgeType])*)? ('nodeTypes' nodeTypes+=[NodeType]
	//	(',' nodeTypes+=[NodeType])*)? ('depth' depth=DepthRange)?
	//	';';
	public ViewElements getViewAccess() {
		return pView;
	}
	
	public ParserRule getViewRule() {
		return getViewAccess().getRule();
	}
	
	//DepthRange:
	//	start=INT ('..' end=INT)?;
	public DepthRangeElements getDepthRangeAccess() {
		return pDepthRange;
	}
	
	public ParserRule getDepthRangeRule() {
		return getDepthRangeAccess().getRule();
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
	//	'/ *'->'* /';
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
