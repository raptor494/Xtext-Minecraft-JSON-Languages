/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.LongRange;
import com.raptor.mcloottable.mcloot.MclootPackage;
import com.raptor.mcloottable.mcloot.UnnamespacedStatisticPredicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnamespaced Statistic Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.UnnamespacedStatisticPredicateImpl#getStat <em>Stat</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.UnnamespacedStatisticPredicateImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnnamespacedStatisticPredicateImpl extends MinimalEObjectImpl.Container implements UnnamespacedStatisticPredicate
{
  /**
   * The default value of the '{@link #getStat() <em>Stat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStat()
   * @generated
   * @ordered
   */
  protected static final String STAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStat() <em>Stat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStat()
   * @generated
   * @ordered
   */
  protected String stat = STAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected LongRange value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnnamespacedStatisticPredicateImpl()
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
    return MclootPackage.Literals.UNNAMESPACED_STATISTIC_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStat()
  {
    return stat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStat(String newStat)
  {
    String oldStat = stat;
    stat = newStat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__STAT, oldStat, stat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LongRange getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(LongRange newValue, NotificationChain msgs)
  {
    LongRange oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(LongRange newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE, newValue, newValue));
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
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE:
        return basicSetValue(null, msgs);
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
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__STAT:
        return getStat();
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE:
        return getValue();
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
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__STAT:
        setStat((String)newValue);
        return;
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE:
        setValue((LongRange)newValue);
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
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__STAT:
        setStat(STAT_EDEFAULT);
        return;
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE:
        setValue((LongRange)null);
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
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__STAT:
        return STAT_EDEFAULT == null ? stat != null : !STAT_EDEFAULT.equals(stat);
      case MclootPackage.UNNAMESPACED_STATISTIC_PREDICATE__VALUE:
        return value != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (stat: ");
    result.append(stat);
    result.append(')');
    return result.toString();
  }

} //UnnamespacedStatisticPredicateImpl
