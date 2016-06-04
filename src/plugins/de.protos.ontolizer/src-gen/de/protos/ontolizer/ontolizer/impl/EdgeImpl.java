/**
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ontolizer.impl;

import de.protos.ontolizer.ontolizer.Edge;
import de.protos.ontolizer.ontolizer.Node;
import de.protos.ontolizer.ontolizer.OntolizerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.EdgeImpl#getTargetNode <em>Target Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge
{
  /**
   * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNode()
   * @generated
   * @ordered
   */
  protected Node targetNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeImpl()
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
    return OntolizerPackage.Literals.EDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getTargetNode()
  {
    if (targetNode != null && targetNode.eIsProxy())
    {
      InternalEObject oldTargetNode = (InternalEObject)targetNode;
      targetNode = (Node)eResolveProxy(oldTargetNode);
      if (targetNode != oldTargetNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntolizerPackage.EDGE__TARGET_NODE, oldTargetNode, targetNode));
      }
    }
    return targetNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetTargetNode()
  {
    return targetNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetNode(Node newTargetNode)
  {
    Node oldTargetNode = targetNode;
    targetNode = newTargetNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntolizerPackage.EDGE__TARGET_NODE, oldTargetNode, targetNode));
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
      case OntolizerPackage.EDGE__TARGET_NODE:
        if (resolve) return getTargetNode();
        return basicGetTargetNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OntolizerPackage.EDGE__TARGET_NODE:
        setTargetNode((Node)newValue);
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
      case OntolizerPackage.EDGE__TARGET_NODE:
        setTargetNode((Node)null);
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
      case OntolizerPackage.EDGE__TARGET_NODE:
        return targetNode != null;
    }
    return super.eIsSet(featureID);
  }

} //EdgeImpl
