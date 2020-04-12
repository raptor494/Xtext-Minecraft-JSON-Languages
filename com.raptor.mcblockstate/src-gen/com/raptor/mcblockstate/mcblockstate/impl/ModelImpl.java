/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.mcblockstate.impl;

import com.raptor.mcblockstate.mcblockstate.McblockstatePackage;
import com.raptor.mcblockstate.mcblockstate.Model;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#isWeightDefined <em>Weight Defined</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#isXDefined <em>XDefined</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#getX <em>X</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#isYDefined <em>YDefined</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#getY <em>Y</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#isUvlockDefined <em>Uvlock Defined</em>}</li>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.ModelImpl#isUvlock <em>Uvlock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #isWeightDefined() <em>Weight Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeightDefined()
   * @generated
   * @ordered
   */
  protected static final boolean WEIGHT_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWeightDefined() <em>Weight Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeightDefined()
   * @generated
   * @ordered
   */
  protected boolean weightDefined = WEIGHT_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final long WEIGHT_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected long weight = WEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #isXDefined() <em>XDefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isXDefined()
   * @generated
   * @ordered
   */
  protected static final boolean XDEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isXDefined() <em>XDefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isXDefined()
   * @generated
   * @ordered
   */
  protected boolean xDefined = XDEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final long X_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected long x = X_EDEFAULT;

  /**
   * The default value of the '{@link #isYDefined() <em>YDefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isYDefined()
   * @generated
   * @ordered
   */
  protected static final boolean YDEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isYDefined() <em>YDefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isYDefined()
   * @generated
   * @ordered
   */
  protected boolean yDefined = YDEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final long Y_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected long y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #isUvlockDefined() <em>Uvlock Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUvlockDefined()
   * @generated
   * @ordered
   */
  protected static final boolean UVLOCK_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUvlockDefined() <em>Uvlock Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUvlockDefined()
   * @generated
   * @ordered
   */
  protected boolean uvlockDefined = UVLOCK_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #isUvlock() <em>Uvlock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUvlock()
   * @generated
   * @ordered
   */
  protected static final boolean UVLOCK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUvlock() <em>Uvlock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUvlock()
   * @generated
   * @ordered
   */
  protected boolean uvlock = UVLOCK_EDEFAULT;

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
    return McblockstatePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isWeightDefined()
  {
    return weightDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeightDefined(boolean newWeightDefined)
  {
    boolean oldWeightDefined = weightDefined;
    weightDefined = newWeightDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__WEIGHT_DEFINED, oldWeightDefined, weightDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeight(long newWeight)
  {
    long oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isXDefined()
  {
    return xDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXDefined(boolean newXDefined)
  {
    boolean oldXDefined = xDefined;
    xDefined = newXDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__XDEFINED, oldXDefined, xDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setX(long newX)
  {
    long oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isYDefined()
  {
    return yDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYDefined(boolean newYDefined)
  {
    boolean oldYDefined = yDefined;
    yDefined = newYDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__YDEFINED, oldYDefined, yDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setY(long newY)
  {
    long oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isUvlockDefined()
  {
    return uvlockDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUvlockDefined(boolean newUvlockDefined)
  {
    boolean oldUvlockDefined = uvlockDefined;
    uvlockDefined = newUvlockDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__UVLOCK_DEFINED, oldUvlockDefined, uvlockDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isUvlock()
  {
    return uvlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUvlock(boolean newUvlock)
  {
    boolean oldUvlock = uvlock;
    uvlock = newUvlock;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.MODEL__UVLOCK, oldUvlock, uvlock));
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
      case McblockstatePackage.MODEL__LOCATION:
        return getLocation();
      case McblockstatePackage.MODEL__WEIGHT_DEFINED:
        return isWeightDefined();
      case McblockstatePackage.MODEL__WEIGHT:
        return getWeight();
      case McblockstatePackage.MODEL__XDEFINED:
        return isXDefined();
      case McblockstatePackage.MODEL__X:
        return getX();
      case McblockstatePackage.MODEL__YDEFINED:
        return isYDefined();
      case McblockstatePackage.MODEL__Y:
        return getY();
      case McblockstatePackage.MODEL__UVLOCK_DEFINED:
        return isUvlockDefined();
      case McblockstatePackage.MODEL__UVLOCK:
        return isUvlock();
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
      case McblockstatePackage.MODEL__LOCATION:
        setLocation((String)newValue);
        return;
      case McblockstatePackage.MODEL__WEIGHT_DEFINED:
        setWeightDefined((Boolean)newValue);
        return;
      case McblockstatePackage.MODEL__WEIGHT:
        setWeight((Long)newValue);
        return;
      case McblockstatePackage.MODEL__XDEFINED:
        setXDefined((Boolean)newValue);
        return;
      case McblockstatePackage.MODEL__X:
        setX((Long)newValue);
        return;
      case McblockstatePackage.MODEL__YDEFINED:
        setYDefined((Boolean)newValue);
        return;
      case McblockstatePackage.MODEL__Y:
        setY((Long)newValue);
        return;
      case McblockstatePackage.MODEL__UVLOCK_DEFINED:
        setUvlockDefined((Boolean)newValue);
        return;
      case McblockstatePackage.MODEL__UVLOCK:
        setUvlock((Boolean)newValue);
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
      case McblockstatePackage.MODEL__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__WEIGHT_DEFINED:
        setWeightDefined(WEIGHT_DEFINED_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__XDEFINED:
        setXDefined(XDEFINED_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__X:
        setX(X_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__YDEFINED:
        setYDefined(YDEFINED_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__Y:
        setY(Y_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__UVLOCK_DEFINED:
        setUvlockDefined(UVLOCK_DEFINED_EDEFAULT);
        return;
      case McblockstatePackage.MODEL__UVLOCK:
        setUvlock(UVLOCK_EDEFAULT);
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
      case McblockstatePackage.MODEL__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case McblockstatePackage.MODEL__WEIGHT_DEFINED:
        return weightDefined != WEIGHT_DEFINED_EDEFAULT;
      case McblockstatePackage.MODEL__WEIGHT:
        return weight != WEIGHT_EDEFAULT;
      case McblockstatePackage.MODEL__XDEFINED:
        return xDefined != XDEFINED_EDEFAULT;
      case McblockstatePackage.MODEL__X:
        return x != X_EDEFAULT;
      case McblockstatePackage.MODEL__YDEFINED:
        return yDefined != YDEFINED_EDEFAULT;
      case McblockstatePackage.MODEL__Y:
        return y != Y_EDEFAULT;
      case McblockstatePackage.MODEL__UVLOCK_DEFINED:
        return uvlockDefined != UVLOCK_DEFINED_EDEFAULT;
      case McblockstatePackage.MODEL__UVLOCK:
        return uvlock != UVLOCK_EDEFAULT;
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
    result.append(" (location: ");
    result.append(location);
    result.append(", weightDefined: ");
    result.append(weightDefined);
    result.append(", weight: ");
    result.append(weight);
    result.append(", xDefined: ");
    result.append(xDefined);
    result.append(", x: ");
    result.append(x);
    result.append(", yDefined: ");
    result.append(yDefined);
    result.append(", y: ");
    result.append(y);
    result.append(", uvlockDefined: ");
    result.append(uvlockDefined);
    result.append(", uvlock: ");
    result.append(uvlock);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
