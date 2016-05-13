/*
 * generated by Xtext 2.9.2
 */
package de.protos.ontolizer.serializer;

import com.google.inject.Inject;
import de.protos.ontolizer.ontolizer.Edge;
import de.protos.ontolizer.ontolizer.EdgeList;
import de.protos.ontolizer.ontolizer.EdgeType;
import de.protos.ontolizer.ontolizer.Model;
import de.protos.ontolizer.ontolizer.Node;
import de.protos.ontolizer.ontolizer.NodeType;
import de.protos.ontolizer.ontolizer.OntolizerPackage;
import de.protos.ontolizer.ontolizer.View;
import de.protos.ontolizer.services.OntolizerGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OntolizerSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OntolizerGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OntolizerPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OntolizerPackage.EDGE:
				sequence_Edge(context, (Edge) semanticObject); 
				return; 
			case OntolizerPackage.EDGE_LIST:
				sequence_EdgeList(context, (EdgeList) semanticObject); 
				return; 
			case OntolizerPackage.EDGE_TYPE:
				sequence_EdgeType(context, (EdgeType) semanticObject); 
				return; 
			case OntolizerPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case OntolizerPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case OntolizerPackage.NODE_TYPE:
				sequence_NodeType(context, (NodeType) semanticObject); 
				return; 
			case OntolizerPackage.VIEW:
				sequence_View(context, (View) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EdgeList returns EdgeList
	 *
	 * Constraint:
	 *     (edgeType=[EdgeType|ID] edges+=Edge edges+=Edge*)
	 */
	protected void sequence_EdgeList(ISerializationContext context, EdgeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EdgeType returns EdgeType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EdgeType(ISerializationContext context, EdgeType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OntolizerPackage.Literals.EDGE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OntolizerPackage.Literals.EDGE_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdgeTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Edge returns Edge
	 *
	 * Constraint:
	 *     targetNode=[Node|ID]
	 */
	protected void sequence_Edge(ISerializationContext context, Edge semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OntolizerPackage.Literals.EDGE__TARGET_NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OntolizerPackage.Literals.EDGE__TARGET_NODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdgeAccess().getTargetNodeNodeIDTerminalRuleCall_0_1(), semanticObject.getTargetNode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (nodeTypes+=NodeType | edgeTypes+=EdgeType | nodes+=Node | views+=View)+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodeType returns NodeType
	 *
	 * Constraint:
	 *     (name=ID shape=STRING? color=STRING? style=STRING?)
	 */
	protected void sequence_NodeType(ISerializationContext context, NodeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Node returns Node
	 *
	 * Constraint:
	 *     (nodeType=[NodeType|ID] name=ID summary+=STRING* edgeLists+=EdgeList*)
	 */
	protected void sequence_Node(ISerializationContext context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     View returns View
	 *
	 * Constraint:
	 *     (name=ID (edgeTypes+=[EdgeType|ID] edgeTypes+=[EdgeType|ID]*)? (nodeTypes+=[NodeType|ID] nodeTypes+=[NodeType|ID]*)? node=[Node|ID]?)
	 */
	protected void sequence_View(ISerializationContext context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}