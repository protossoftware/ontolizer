/*
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.protos.ontolizer.ide.contentassist.antlr.internal.InternalOntolizerParser;
import de.protos.ontolizer.services.OntolizerGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class OntolizerParser extends AbstractContentAssistParser {

	@Inject
	private OntolizerGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalOntolizerParser createParser() {
		InternalOntolizerParser result = new InternalOntolizerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getNodeTypeAccess().getGroup(), "rule__NodeType__Group__0");
					put(grammarAccess.getNodeTypeAccess().getGroup_2(), "rule__NodeType__Group_2__0");
					put(grammarAccess.getNodeTypeAccess().getGroup_3(), "rule__NodeType__Group_3__0");
					put(grammarAccess.getNodeTypeAccess().getGroup_4(), "rule__NodeType__Group_4__0");
					put(grammarAccess.getEdgeTypeAccess().getGroup(), "rule__EdgeType__Group__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_2(), "rule__Node__Group_2__0");
					put(grammarAccess.getEdgeListAccess().getGroup(), "rule__EdgeList__Group__0");
					put(grammarAccess.getEdgeListAccess().getGroup_2(), "rule__EdgeList__Group_2__0");
					put(grammarAccess.getViewAccess().getGroup(), "rule__View__Group__0");
					put(grammarAccess.getViewAccess().getGroup_2(), "rule__View__Group_2__0");
					put(grammarAccess.getViewAccess().getGroup_2_2(), "rule__View__Group_2_2__0");
					put(grammarAccess.getViewAccess().getGroup_3(), "rule__View__Group_3__0");
					put(grammarAccess.getViewAccess().getGroup_3_2(), "rule__View__Group_3_2__0");
					put(grammarAccess.getViewAccess().getGroup_4(), "rule__View__Group_4__0");
					put(grammarAccess.getDepthRangeAccess().getGroup(), "rule__DepthRange__Group__0");
					put(grammarAccess.getDepthRangeAccess().getGroup_1(), "rule__DepthRange__Group_1__0");
					put(grammarAccess.getModelAccess().getNodeTypesAssignment_0(), "rule__Model__NodeTypesAssignment_0");
					put(grammarAccess.getModelAccess().getEdgeTypesAssignment_1(), "rule__Model__EdgeTypesAssignment_1");
					put(grammarAccess.getModelAccess().getNodesAssignment_2(), "rule__Model__NodesAssignment_2");
					put(grammarAccess.getModelAccess().getViewsAssignment_3(), "rule__Model__ViewsAssignment_3");
					put(grammarAccess.getNodeTypeAccess().getNameAssignment_1(), "rule__NodeType__NameAssignment_1");
					put(grammarAccess.getNodeTypeAccess().getShapeAssignment_2_1(), "rule__NodeType__ShapeAssignment_2_1");
					put(grammarAccess.getNodeTypeAccess().getColorAssignment_3_1(), "rule__NodeType__ColorAssignment_3_1");
					put(grammarAccess.getNodeTypeAccess().getStyleAssignment_4_1(), "rule__NodeType__StyleAssignment_4_1");
					put(grammarAccess.getEdgeTypeAccess().getNameAssignment_1(), "rule__EdgeType__NameAssignment_1");
					put(grammarAccess.getNodeAccess().getNodeTypeAssignment_0(), "rule__Node__NodeTypeAssignment_0");
					put(grammarAccess.getNodeAccess().getNameAssignment_1(), "rule__Node__NameAssignment_1");
					put(grammarAccess.getNodeAccess().getSummaryAssignment_2_1(), "rule__Node__SummaryAssignment_2_1");
					put(grammarAccess.getNodeAccess().getEdgeListsAssignment_3(), "rule__Node__EdgeListsAssignment_3");
					put(grammarAccess.getEdgeListAccess().getEdgeTypeAssignment_0(), "rule__EdgeList__EdgeTypeAssignment_0");
					put(grammarAccess.getEdgeListAccess().getEdgesAssignment_1(), "rule__EdgeList__EdgesAssignment_1");
					put(grammarAccess.getEdgeListAccess().getEdgesAssignment_2_1(), "rule__EdgeList__EdgesAssignment_2_1");
					put(grammarAccess.getEdgeAccess().getTargetNodeAssignment(), "rule__Edge__TargetNodeAssignment");
					put(grammarAccess.getViewAccess().getNameAssignment_1(), "rule__View__NameAssignment_1");
					put(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_1(), "rule__View__EdgeTypesAssignment_2_1");
					put(grammarAccess.getViewAccess().getEdgeTypesAssignment_2_2_1(), "rule__View__EdgeTypesAssignment_2_2_1");
					put(grammarAccess.getViewAccess().getNodeTypesAssignment_3_1(), "rule__View__NodeTypesAssignment_3_1");
					put(grammarAccess.getViewAccess().getNodeTypesAssignment_3_2_1(), "rule__View__NodeTypesAssignment_3_2_1");
					put(grammarAccess.getViewAccess().getDepthAssignment_4_1(), "rule__View__DepthAssignment_4_1");
					put(grammarAccess.getDepthRangeAccess().getStartAssignment_0(), "rule__DepthRange__StartAssignment_0");
					put(grammarAccess.getDepthRangeAccess().getEndAssignment_1_1(), "rule__DepthRange__EndAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalOntolizerParser typedParser = (InternalOntolizerParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OntolizerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OntolizerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
