/**
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ontolizer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.protos.ontolizer.ontolizer.OntolizerFactory
 * @model kind="package"
 * @generated
 */
public interface OntolizerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ontolizer";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.protos.de/ontolizer/Ontolizer";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ontolizer";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OntolizerPackage eINSTANCE = de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl.init();

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.ModelImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Node Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NODE_TYPES = 0;

  /**
   * The feature id for the '<em><b>Edge Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EDGE_TYPES = 1;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NODES = 2;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VIEWS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.NodeTypeImpl <em>Node Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.NodeTypeImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getNodeType()
   * @generated
   */
  int NODE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__SHAPE = 1;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__COLOR = 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__STYLE = 3;

  /**
   * The number of structural features of the '<em>Node Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.EdgeTypeImpl <em>Edge Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.EdgeTypeImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getEdgeType()
   * @generated
   */
  int EDGE_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Edge Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.NodeImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getNode()
   * @generated
   */
  int NODE = 3;

  /**
   * The feature id for the '<em><b>Node Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NODE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 1;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__SUMMARY = 2;

  /**
   * The feature id for the '<em><b>Edge Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__EDGE_LISTS = 3;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.EdgeListImpl <em>Edge List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.EdgeListImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getEdgeList()
   * @generated
   */
  int EDGE_LIST = 4;

  /**
   * The feature id for the '<em><b>Edge Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LIST__EDGE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LIST__EDGES = 1;

  /**
   * The number of structural features of the '<em>Edge List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.EdgeImpl <em>Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.EdgeImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getEdge()
   * @generated
   */
  int EDGE = 5;

  /**
   * The feature id for the '<em><b>Target Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__TARGET_NODE = 0;

  /**
   * The number of structural features of the '<em>Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.ViewImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getView()
   * @generated
   */
  int VIEW = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The feature id for the '<em><b>Edge Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__EDGE_TYPES = 1;

  /**
   * The feature id for the '<em><b>Node Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NODE_TYPES = 2;

  /**
   * The feature id for the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NODE = 3;

  /**
   * The feature id for the '<em><b>Depth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__DEPTH = 4;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.protos.ontolizer.ontolizer.impl.DepthRangeImpl <em>Depth Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.ontolizer.ontolizer.impl.DepthRangeImpl
   * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getDepthRange()
   * @generated
   */
  int DEPTH_RANGE = 7;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPTH_RANGE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPTH_RANGE__END = 1;

  /**
   * The number of structural features of the '<em>Depth Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPTH_RANGE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.protos.ontolizer.ontolizer.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.ontolizer.ontolizer.Model#getNodeTypes <em>Node Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Node Types</em>'.
   * @see de.protos.ontolizer.ontolizer.Model#getNodeTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_NodeTypes();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.ontolizer.ontolizer.Model#getEdgeTypes <em>Edge Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge Types</em>'.
   * @see de.protos.ontolizer.ontolizer.Model#getEdgeTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_EdgeTypes();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.ontolizer.ontolizer.Model#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see de.protos.ontolizer.ontolizer.Model#getNodes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.ontolizer.ontolizer.Model#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see de.protos.ontolizer.ontolizer.Model#getViews()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Views();

  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.NodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type</em>'.
   * @see de.protos.ontolizer.ontolizer.NodeType
   * @generated
   */
  EClass getNodeType();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.NodeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.ontolizer.ontolizer.NodeType#getName()
   * @see #getNodeType()
   * @generated
   */
  EAttribute getNodeType_Name();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.NodeType#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see de.protos.ontolizer.ontolizer.NodeType#getShape()
   * @see #getNodeType()
   * @generated
   */
  EAttribute getNodeType_Shape();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.NodeType#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see de.protos.ontolizer.ontolizer.NodeType#getColor()
   * @see #getNodeType()
   * @generated
   */
  EAttribute getNodeType_Color();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.NodeType#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see de.protos.ontolizer.ontolizer.NodeType#getStyle()
   * @see #getNodeType()
   * @generated
   */
  EAttribute getNodeType_Style();

  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.EdgeType <em>Edge Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Type</em>'.
   * @see de.protos.ontolizer.ontolizer.EdgeType
   * @generated
   */
  EClass getEdgeType();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.EdgeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.ontolizer.ontolizer.EdgeType#getName()
   * @see #getEdgeType()
   * @generated
   */
  EAttribute getEdgeType_Name();

  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see de.protos.ontolizer.ontolizer.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the reference '{@link de.protos.ontolizer.ontolizer.Node#getNodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node Type</em>'.
   * @see de.protos.ontolizer.ontolizer.Node#getNodeType()
   * @see #getNode()
   * @generated
   */
  EReference getNode_NodeType();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.ontolizer.ontolizer.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.protos.ontolizer.ontolizer.Node#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Summary</em>'.
   * @see de.protos.ontolizer.ontolizer.Node#getSummary()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Summary();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.ontolizer.ontolizer.Node#getEdgeLists <em>Edge Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge Lists</em>'.
   * @see de.protos.ontolizer.ontolizer.Node#getEdgeLists()
   * @see #getNode()
   * @generated
   */
  EReference getNode_EdgeLists();

  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.EdgeList <em>Edge List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge List</em>'.
   * @see de.protos.ontolizer.ontolizer.EdgeList
   * @generated
   */
  EClass getEdgeList();

  /**
   * Returns the meta object for the reference '{@link de.protos.ontolizer.ontolizer.EdgeList#getEdgeType <em>Edge Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Edge Type</em>'.
   * @see de.protos.ontolizer.ontolizer.EdgeList#getEdgeType()
   * @see #getEdgeList()
   * @generated
   */
  EReference getEdgeList_EdgeType();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.ontolizer.ontolizer.EdgeList#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see de.protos.ontolizer.ontolizer.EdgeList#getEdges()
   * @see #getEdgeList()
   * @generated
   */
  EReference getEdgeList_Edges();

  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.Edge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge</em>'.
   * @see de.protos.ontolizer.ontolizer.Edge
   * @generated
   */
  EClass getEdge();

  /**
   * Returns the meta object for the reference '{@link de.protos.ontolizer.ontolizer.Edge#getTargetNode <em>Target Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Node</em>'.
   * @see de.protos.ontolizer.ontolizer.Edge#getTargetNode()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_TargetNode();

  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see de.protos.ontolizer.ontolizer.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.ontolizer.ontolizer.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the reference list '{@link de.protos.ontolizer.ontolizer.View#getEdgeTypes <em>Edge Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Edge Types</em>'.
   * @see de.protos.ontolizer.ontolizer.View#getEdgeTypes()
   * @see #getView()
   * @generated
   */
  EReference getView_EdgeTypes();

  /**
   * Returns the meta object for the reference list '{@link de.protos.ontolizer.ontolizer.View#getNodeTypes <em>Node Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Node Types</em>'.
   * @see de.protos.ontolizer.ontolizer.View#getNodeTypes()
   * @see #getView()
   * @generated
   */
  EReference getView_NodeTypes();

  /**
   * Returns the meta object for the reference '{@link de.protos.ontolizer.ontolizer.View#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node</em>'.
   * @see de.protos.ontolizer.ontolizer.View#getNode()
   * @see #getView()
   * @generated
   */
  EReference getView_Node();

  /**
   * Returns the meta object for the containment reference '{@link de.protos.ontolizer.ontolizer.View#getDepth <em>Depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Depth</em>'.
   * @see de.protos.ontolizer.ontolizer.View#getDepth()
   * @see #getView()
   * @generated
   */
  EReference getView_Depth();

  /**
   * Returns the meta object for class '{@link de.protos.ontolizer.ontolizer.DepthRange <em>Depth Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Depth Range</em>'.
   * @see de.protos.ontolizer.ontolizer.DepthRange
   * @generated
   */
  EClass getDepthRange();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.DepthRange#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see de.protos.ontolizer.ontolizer.DepthRange#getStart()
   * @see #getDepthRange()
   * @generated
   */
  EAttribute getDepthRange_Start();

  /**
   * Returns the meta object for the attribute '{@link de.protos.ontolizer.ontolizer.DepthRange#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.protos.ontolizer.ontolizer.DepthRange#getEnd()
   * @see #getDepthRange()
   * @generated
   */
  EAttribute getDepthRange_End();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OntolizerFactory getOntolizerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.ModelImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Node Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NODE_TYPES = eINSTANCE.getModel_NodeTypes();

    /**
     * The meta object literal for the '<em><b>Edge Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EDGE_TYPES = eINSTANCE.getModel_EdgeTypes();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NODES = eINSTANCE.getModel_Nodes();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__VIEWS = eINSTANCE.getModel_Views();

    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.NodeTypeImpl <em>Node Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.NodeTypeImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getNodeType()
     * @generated
     */
    EClass NODE_TYPE = eINSTANCE.getNodeType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE__NAME = eINSTANCE.getNodeType_Name();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE__SHAPE = eINSTANCE.getNodeType_Shape();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE__COLOR = eINSTANCE.getNodeType_Color();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE__STYLE = eINSTANCE.getNodeType_Style();

    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.EdgeTypeImpl <em>Edge Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.EdgeTypeImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getEdgeType()
     * @generated
     */
    EClass EDGE_TYPE = eINSTANCE.getEdgeType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_TYPE__NAME = eINSTANCE.getEdgeType_Name();

    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.NodeImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Node Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__NODE_TYPE = eINSTANCE.getNode_NodeType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__SUMMARY = eINSTANCE.getNode_Summary();

    /**
     * The meta object literal for the '<em><b>Edge Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__EDGE_LISTS = eINSTANCE.getNode_EdgeLists();

    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.EdgeListImpl <em>Edge List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.EdgeListImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getEdgeList()
     * @generated
     */
    EClass EDGE_LIST = eINSTANCE.getEdgeList();

    /**
     * The meta object literal for the '<em><b>Edge Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_LIST__EDGE_TYPE = eINSTANCE.getEdgeList_EdgeType();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_LIST__EDGES = eINSTANCE.getEdgeList_Edges();

    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.EdgeImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getEdge()
     * @generated
     */
    EClass EDGE = eINSTANCE.getEdge();

    /**
     * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE__TARGET_NODE = eINSTANCE.getEdge_TargetNode();

    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.ViewImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>Edge Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__EDGE_TYPES = eINSTANCE.getView_EdgeTypes();

    /**
     * The meta object literal for the '<em><b>Node Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__NODE_TYPES = eINSTANCE.getView_NodeTypes();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__NODE = eINSTANCE.getView_Node();

    /**
     * The meta object literal for the '<em><b>Depth</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__DEPTH = eINSTANCE.getView_Depth();

    /**
     * The meta object literal for the '{@link de.protos.ontolizer.ontolizer.impl.DepthRangeImpl <em>Depth Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.ontolizer.ontolizer.impl.DepthRangeImpl
     * @see de.protos.ontolizer.ontolizer.impl.OntolizerPackageImpl#getDepthRange()
     * @generated
     */
    EClass DEPTH_RANGE = eINSTANCE.getDepthRange();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPTH_RANGE__START = eINSTANCE.getDepthRange_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPTH_RANGE__END = eINSTANCE.getDepthRange_End();

  }

} //OntolizerPackage
