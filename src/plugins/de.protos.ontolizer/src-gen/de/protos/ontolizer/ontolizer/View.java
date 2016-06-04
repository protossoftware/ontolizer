/**
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ontolizer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.protos.ontolizer.ontolizer.View#getName <em>Name</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.View#getEdgeTypes <em>Edge Types</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.View#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.View#getNode <em>Node</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.View#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @see de.protos.ontolizer.ontolizer.OntolizerPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.protos.ontolizer.ontolizer.OntolizerPackage#getView_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.protos.ontolizer.ontolizer.View#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Edge Types</b></em>' reference list.
   * The list contents are of type {@link de.protos.ontolizer.ontolizer.EdgeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge Types</em>' reference list.
   * @see de.protos.ontolizer.ontolizer.OntolizerPackage#getView_EdgeTypes()
   * @model
   * @generated
   */
  EList<EdgeType> getEdgeTypes();

  /**
   * Returns the value of the '<em><b>Node Types</b></em>' reference list.
   * The list contents are of type {@link de.protos.ontolizer.ontolizer.NodeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Types</em>' reference list.
   * @see de.protos.ontolizer.ontolizer.OntolizerPackage#getView_NodeTypes()
   * @model
   * @generated
   */
  EList<NodeType> getNodeTypes();

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(Node)
   * @see de.protos.ontolizer.ontolizer.OntolizerPackage#getView_Node()
   * @model
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link de.protos.ontolizer.ontolizer.View#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Node value);

  /**
   * Returns the value of the '<em><b>Depth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depth</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depth</em>' containment reference.
   * @see #setDepth(DepthRange)
   * @see de.protos.ontolizer.ontolizer.OntolizerPackage#getView_Depth()
   * @model containment="true"
   * @generated
   */
  DepthRange getDepth();

  /**
   * Sets the value of the '{@link de.protos.ontolizer.ontolizer.View#getDepth <em>Depth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depth</em>' containment reference.
   * @see #getDepth()
   * @generated
   */
  void setDepth(DepthRange value);

} // View
