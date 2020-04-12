/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate;
import com.raptor.mcloottable.mcloot.FluidPredicate;
import com.raptor.mcloottable.mcloot.MclootPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fluid Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.FluidPredicateImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.FluidPredicateImpl#getFluid <em>Fluid</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.FluidPredicateImpl#isStateDefined <em>State Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.FluidPredicateImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FluidPredicateImpl extends MinimalEObjectImpl.Container implements FluidPredicate
{
  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

  /**
   * The default value of the '{@link #getFluid() <em>Fluid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluid()
   * @generated
   * @ordered
   */
  protected static final String FLUID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFluid() <em>Fluid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluid()
   * @generated
   * @ordered
   */
  protected String fluid = FLUID_EDEFAULT;

  /**
   * The default value of the '{@link #isStateDefined() <em>State Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStateDefined()
   * @generated
   * @ordered
   */
  protected static final boolean STATE_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStateDefined() <em>State Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStateDefined()
   * @generated
   * @ordered
   */
  protected boolean stateDefined = STATE_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<BlockStatePropertyPredicate> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FluidPredicateImpl()
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
    return MclootPackage.Literals.FLUID_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTag(String newTag)
  {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.FLUID_PREDICATE__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFluid()
  {
    return fluid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFluid(String newFluid)
  {
    String oldFluid = fluid;
    fluid = newFluid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.FLUID_PREDICATE__FLUID, oldFluid, fluid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isStateDefined()
  {
    return stateDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStateDefined(boolean newStateDefined)
  {
    boolean oldStateDefined = stateDefined;
    stateDefined = newStateDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.FLUID_PREDICATE__STATE_DEFINED, oldStateDefined, stateDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BlockStatePropertyPredicate> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<BlockStatePropertyPredicate>(BlockStatePropertyPredicate.class, this, MclootPackage.FLUID_PREDICATE__PROPERTIES);
    }
    return properties;
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
      case MclootPackage.FLUID_PREDICATE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case MclootPackage.FLUID_PREDICATE__TAG:
        return getTag();
      case MclootPackage.FLUID_PREDICATE__FLUID:
        return getFluid();
      case MclootPackage.FLUID_PREDICATE__STATE_DEFINED:
        return isStateDefined();
      case MclootPackage.FLUID_PREDICATE__PROPERTIES:
        return getProperties();
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
      case MclootPackage.FLUID_PREDICATE__TAG:
        setTag((String)newValue);
        return;
      case MclootPackage.FLUID_PREDICATE__FLUID:
        setFluid((String)newValue);
        return;
      case MclootPackage.FLUID_PREDICATE__STATE_DEFINED:
        setStateDefined((Boolean)newValue);
        return;
      case MclootPackage.FLUID_PREDICATE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends BlockStatePropertyPredicate>)newValue);
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
      case MclootPackage.FLUID_PREDICATE__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case MclootPackage.FLUID_PREDICATE__FLUID:
        setFluid(FLUID_EDEFAULT);
        return;
      case MclootPackage.FLUID_PREDICATE__STATE_DEFINED:
        setStateDefined(STATE_DEFINED_EDEFAULT);
        return;
      case MclootPackage.FLUID_PREDICATE__PROPERTIES:
        getProperties().clear();
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
      case MclootPackage.FLUID_PREDICATE__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case MclootPackage.FLUID_PREDICATE__FLUID:
        return FLUID_EDEFAULT == null ? fluid != null : !FLUID_EDEFAULT.equals(fluid);
      case MclootPackage.FLUID_PREDICATE__STATE_DEFINED:
        return stateDefined != STATE_DEFINED_EDEFAULT;
      case MclootPackage.FLUID_PREDICATE__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(" (tag: ");
    result.append(tag);
    result.append(", fluid: ");
    result.append(fluid);
    result.append(", stateDefined: ");
    result.append(stateDefined);
    result.append(')');
    return result.toString();
  }

} //FluidPredicateImpl
