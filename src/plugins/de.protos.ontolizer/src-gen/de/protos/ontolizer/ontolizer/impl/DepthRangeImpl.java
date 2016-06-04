/**
 * generated by Xtext 2.9.1
 */
package de.protos.ontolizer.ontolizer.impl;

import de.protos.ontolizer.ontolizer.DepthRange;
import de.protos.ontolizer.ontolizer.OntolizerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depth Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.DepthRangeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.protos.ontolizer.ontolizer.impl.DepthRangeImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepthRangeImpl extends MinimalEObjectImpl.Container implements DepthRange
{
  /**
   * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected static final int START_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected int start = START_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final int END_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected int end = END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepthRangeImpl()
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
    return OntolizerPackage.Literals.DEPTH_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(int newStart)
  {
    int oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntolizerPackage.DEPTH_RANGE__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(int newEnd)
  {
    int oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntolizerPackage.DEPTH_RANGE__END, oldEnd, end));
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
      case OntolizerPackage.DEPTH_RANGE__START:
        return getStart();
      case OntolizerPackage.DEPTH_RANGE__END:
        return getEnd();
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
      case OntolizerPackage.DEPTH_RANGE__START:
        setStart((Integer)newValue);
        return;
      case OntolizerPackage.DEPTH_RANGE__END:
        setEnd((Integer)newValue);
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
      case OntolizerPackage.DEPTH_RANGE__START:
        setStart(START_EDEFAULT);
        return;
      case OntolizerPackage.DEPTH_RANGE__END:
        setEnd(END_EDEFAULT);
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
      case OntolizerPackage.DEPTH_RANGE__START:
        return start != START_EDEFAULT;
      case OntolizerPackage.DEPTH_RANGE__END:
        return end != END_EDEFAULT;
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
    result.append(" (start: ");
    result.append(start);
    result.append(", end: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //DepthRangeImpl
