/**
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ontolizer.impl;

import de.protos.ontolizer.ontolizer.DepthRange;
import de.protos.ontolizer.ontolizer.EdgeType;
import de.protos.ontolizer.ontolizer.NodeType;
import de.protos.ontolizer.ontolizer.OntolizerPackage;
import de.protos.ontolizer.ontolizer.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ViewImpl#getEdgeTypes <em>Edge Types</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ViewImpl#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.ViewImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEdgeTypes() <em>Edge Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeTypes()
   * @generated
   * @ordered
   */
  protected EList<EdgeType> edgeTypes;

  /**
   * The cached value of the '{@link #getNodeTypes() <em>Node Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeTypes()
   * @generated
   * @ordered
   */
  protected EList<NodeType> nodeTypes;

  /**
   * The cached value of the '{@link #getDepth() <em>Depth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepth()
   * @generated
   * @ordered
   */
  protected DepthRange depth;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewImpl()
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
    return OntolizerPackage.Literals.VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntolizerPackage.VIEW__NAME, oldName, name));
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
      edgeTypes = new EObjectResolvingEList<EdgeType>(EdgeType.class, this, OntolizerPackage.VIEW__EDGE_TYPES);
    }
    return edgeTypes;
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
      nodeTypes = new EObjectResolvingEList<NodeType>(NodeType.class, this, OntolizerPackage.VIEW__NODE_TYPES);
    }
    return nodeTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepthRange getDepth()
  {
    return depth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDepth(DepthRange newDepth, NotificationChain msgs)
  {
    DepthRange oldDepth = depth;
    depth = newDepth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntolizerPackage.VIEW__DEPTH, oldDepth, newDepth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepth(DepthRange newDepth)
  {
    if (newDepth != depth)
    {
      NotificationChain msgs = null;
      if (depth != null)
        msgs = ((InternalEObject)depth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntolizerPackage.VIEW__DEPTH, null, msgs);
      if (newDepth != null)
        msgs = ((InternalEObject)newDepth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntolizerPackage.VIEW__DEPTH, null, msgs);
      msgs = basicSetDepth(newDepth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntolizerPackage.VIEW__DEPTH, newDepth, newDepth));
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
      case OntolizerPackage.VIEW__DEPTH:
        return basicSetDepth(null, msgs);
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
      case OntolizerPackage.VIEW__NAME:
        return getName();
      case OntolizerPackage.VIEW__EDGE_TYPES:
        return getEdgeTypes();
      case OntolizerPackage.VIEW__NODE_TYPES:
        return getNodeTypes();
      case OntolizerPackage.VIEW__DEPTH:
        return getDepth();
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
      case OntolizerPackage.VIEW__NAME:
        setName((String)newValue);
        return;
      case OntolizerPackage.VIEW__EDGE_TYPES:
        getEdgeTypes().clear();
        getEdgeTypes().addAll((Collection<? extends EdgeType>)newValue);
        return;
      case OntolizerPackage.VIEW__NODE_TYPES:
        getNodeTypes().clear();
        getNodeTypes().addAll((Collection<? extends NodeType>)newValue);
        return;
      case OntolizerPackage.VIEW__DEPTH:
        setDepth((DepthRange)newValue);
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
      case OntolizerPackage.VIEW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OntolizerPackage.VIEW__EDGE_TYPES:
        getEdgeTypes().clear();
        return;
      case OntolizerPackage.VIEW__NODE_TYPES:
        getNodeTypes().clear();
        return;
      case OntolizerPackage.VIEW__DEPTH:
        setDepth((DepthRange)null);
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
      case OntolizerPackage.VIEW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OntolizerPackage.VIEW__EDGE_TYPES:
        return edgeTypes != null && !edgeTypes.isEmpty();
      case OntolizerPackage.VIEW__NODE_TYPES:
        return nodeTypes != null && !nodeTypes.isEmpty();
      case OntolizerPackage.VIEW__DEPTH:
        return depth != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ViewImpl
