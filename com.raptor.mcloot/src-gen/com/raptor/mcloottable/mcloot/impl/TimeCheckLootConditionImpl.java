/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.LongRange;
import com.raptor.mcloottable.mcloot.MclootPackage;
import com.raptor.mcloottable.mcloot.TimeCheckLootCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Check Loot Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.TimeCheckLootConditionImpl#isPeriodDefined <em>Period Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.TimeCheckLootConditionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.TimeCheckLootConditionImpl#isInverted <em>Inverted</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.TimeCheckLootConditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeCheckLootConditionImpl extends NamedLootConditionImpl implements TimeCheckLootCondition
{
  /**
   * The default value of the '{@link #isPeriodDefined() <em>Period Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPeriodDefined()
   * @generated
   * @ordered
   */
  protected static final boolean PERIOD_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPeriodDefined() <em>Period Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPeriodDefined()
   * @generated
   * @ordered
   */
  protected boolean periodDefined = PERIOD_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final long PERIOD_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected long period = PERIOD_EDEFAULT;

  /**
   * The default value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInverted()
   * @generated
   * @ordered
   */
  protected static final boolean INVERTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInverted()
   * @generated
   * @ordered
   */
  protected boolean inverted = INVERTED_EDEFAULT;

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
  protected TimeCheckLootConditionImpl()
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
    return MclootPackage.Literals.TIME_CHECK_LOOT_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPeriodDefined()
  {
    return periodDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPeriodDefined(boolean newPeriodDefined)
  {
    boolean oldPeriodDefined = periodDefined;
    periodDefined = newPeriodDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD_DEFINED, oldPeriodDefined, periodDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPeriod(long newPeriod)
  {
    long oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isInverted()
  {
    return inverted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInverted(boolean newInverted)
  {
    boolean oldInverted = inverted;
    inverted = newInverted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.TIME_CHECK_LOOT_CONDITION__INVERTED, oldInverted, inverted));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE, newValue, newValue));
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
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE:
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
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD_DEFINED:
        return isPeriodDefined();
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD:
        return getPeriod();
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__INVERTED:
        return isInverted();
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE:
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
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD_DEFINED:
        setPeriodDefined((Boolean)newValue);
        return;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD:
        setPeriod((Long)newValue);
        return;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__INVERTED:
        setInverted((Boolean)newValue);
        return;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE:
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
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD_DEFINED:
        setPeriodDefined(PERIOD_DEFINED_EDEFAULT);
        return;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__INVERTED:
        setInverted(INVERTED_EDEFAULT);
        return;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE:
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
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD_DEFINED:
        return periodDefined != PERIOD_DEFINED_EDEFAULT;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__PERIOD:
        return period != PERIOD_EDEFAULT;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__INVERTED:
        return inverted != INVERTED_EDEFAULT;
      case MclootPackage.TIME_CHECK_LOOT_CONDITION__VALUE:
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
    result.append(" (periodDefined: ");
    result.append(periodDefined);
    result.append(", period: ");
    result.append(period);
    result.append(", inverted: ");
    result.append(inverted);
    result.append(')');
    return result.toString();
  }

} //TimeCheckLootConditionImpl
