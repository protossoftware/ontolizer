/**
 * generated by Xtext 2.9.2
 */
package de.protos.ontolizer.ontolizer.impl;

import de.protos.ontolizer.ontolizer.EdgeType;
import de.protos.ontolizer.ontolizer.Model;
import de.protos.ontolizer.ontolizer.Node;
import de.protos.ontolizer.ontolizer.NodeType;
import de.protos.ontolizer.ontolizer.OntolizerPackage;
import de.protos.ontolizer.ontolizer.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ModelImpl#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ModelImpl#getEdgeTypes <em>Edge Types</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ModelImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ModelImpl#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getNodeTypes() <em>Node Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeTypes()
   * @generated
   * @ordered
   */
  protected EList<NodeType> nodeTypes;

  /**
   * The cached value of the '{@link #getEdgeTypes() <em>Edge Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeTypes()
   * @generated
   * @ordered
   */
  protected EList<EdgeType> edgeTypes;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> nodes;

  /**
   * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViews()
   * @generated
   * @ordered
   */
  protected EList<View> views;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OntolizerPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeType> getNodeTypes()
  {
    if (nodeTypes == null)
    {
      nodeTypes = new EObjectContainmentEList<NodeType>(NodeType.class, this, OntolizerPackage.MODEL__NODE_TYPES);
    }
    return nodeTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EdgeType> getEdgeTypes()
  {
    if (edgeTypes == null)
    {
      edgeTypes = new EObjectContainmentEList<EdgeType>(EdgeType.class, this, OntolizerPackage.MODEL__EDGE_TYPES);
    }
    return edgeTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Node>(Node.class, this, OntolizerPackage.MODEL__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<View> getViews()
  {
    if (views == null)
    {
      views = new EObjectContainmentEList<View>(View.class, this, OntolizerPackage.MODEL__VIEWS);
    }
    return views;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OntolizerPackage.MODEL__NODE_TYPES:
        return ((InternalEList<?>)getNodeTypes()).basicRemove(otherEnd, msgs);
      case OntolizerPackage.MODEL__EDGE_TYPES:
        return ((InternalEList<?>)getEdgeTypes()).basicRemove(otherEnd, msgs);
      case OntolizerPackage.MODEL__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case OntolizerPackage.MODEL__VIEWS:
        return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OntolizerPackage.MODEL__NODE_TYPES:
        return getNodeTypes();
      case OntolizerPackage.MODEL__EDGE_TYPES:
        return getEdgeTypes();
      case OntolizerPackage.MODEL__NODES:
        return getNodes();
      case OntolizerPackage.MODEL__VIEWS:
        return getViews();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OntolizerPackage.MODEL__NODE_TYPES:
        getNodeTypes().clear();
        getNodeTypes().addAll((Collection<? extends NodeType>)newValue);
        return;
      case OntolizerPackage.MODEL__EDGE_TYPES:
        getEdgeTypes().clear();
        getEdgeTypes().addAll((Collection<? extends EdgeType>)newValue);
        return;
      case OntolizerPackage.MODEL__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Node>)newValue);
        return;
      case OntolizerPackage.MODEL__VIEWS:
        getViews().clear();
        getViews().addAll((Collection<? extends View>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OntolizerPackage.MODEL__NODE_TYPES:
        getNodeTypes().clear();
        return;
      case OntolizerPackage.MODEL__EDGE_TYPES:
        getEdgeTypes().clear();
        return;
      case OntolizerPackage.MODEL__NODES:
        getNodes().clear();
        return;
      case OntolizerPackage.MODEL__VIEWS:
        getViews().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OntolizerPackage.MODEL__NODE_TYPES:
        return nodeTypes != null && !nodeTypes.isEmpty();
      case OntolizerPackage.MODEL__EDGE_TYPES:
        return edgeTypes != null && !edgeTypes.isEmpty();
      case OntolizerPackage.MODEL__NODES:
        return nodes != null && !nodes.isEmpty();
      case OntolizerPackage.MODEL__VIEWS:
        return views != null && !views.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
