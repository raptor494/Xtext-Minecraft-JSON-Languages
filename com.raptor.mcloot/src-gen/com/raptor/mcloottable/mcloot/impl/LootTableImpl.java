/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.EnumLootTableType;
import com.raptor.mcloottable.mcloot.LootPool;
import com.raptor.mcloottable.mcloot.LootTable;
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
 * An implementation of the model object '<em><b>Loot Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.LootTableImpl#isTypeDefined <em>Type Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.LootTableImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.LootTableImpl#isPoolsDefined <em>Pools Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.LootTableImpl#getPools <em>Pools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LootTableImpl extends MinimalEObjectImpl.Container implements LootTable
{
  /**
   * The default value of the '{@link #isTypeDefined() <em>Type Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeDefined()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTypeDefined() <em>Type Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeDefined()
   * @generated
   * @ordered
   */
  protected boolean typeDefined = TYPE_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final EnumLootTableType TYPE_EDEFAULT = EnumLootTableType.GENERIC;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EnumLootTableType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isPoolsDefined() <em>Pools Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoolsDefined()
   * @generated
   * @ordered
   */
  protected static final boolean POOLS_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoolsDefined() <em>Pools Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoolsDefined()
   * @generated
   * @ordered
   */
  protected boolean poolsDefined = POOLS_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getPools() <em>Pools</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPools()
   * @generated
   * @ordered
   */
  protected EList<LootPool> pools;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LootTableImpl()
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
    return MclootPackage.Literals.LOOT_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isTypeDefined()
  {
    return typeDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTypeDefined(boolean newTypeDefined)
  {
    boolean oldTypeDefined = typeDefined;
    typeDefined = newTypeDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.LOOT_TABLE__TYPE_DEFINED, oldTypeDefined, typeDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumLootTableType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(EnumLootTableType newType)
  {
    EnumLootTableType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.LOOT_TABLE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPoolsDefined()
  {
    return poolsDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPoolsDefined(boolean newPoolsDefined)
  {
    boolean oldPoolsDefined = poolsDefined;
    poolsDefined = newPoolsDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.LOOT_TABLE__POOLS_DEFINED, oldPoolsDefined, poolsDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LootPool> getPools()
  {
    if (pools == null)
    {
      pools = new EObjectContainmentEList<LootPool>(LootPool.class, this, MclootPackage.LOOT_TABLE__POOLS);
    }
    return pools;
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
      case MclootPackage.LOOT_TABLE__POOLS:
        return ((InternalEList<?>)getPools()).basicRemove(otherEnd, msgs);
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
      case MclootPackage.LOOT_TABLE__TYPE_DEFINED:
        return isTypeDefined();
      case MclootPackage.LOOT_TABLE__TYPE:
        return getType();
      case MclootPackage.LOOT_TABLE__POOLS_DEFINED:
        return isPoolsDefined();
      case MclootPackage.LOOT_TABLE__POOLS:
        return getPools();
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
      case MclootPackage.LOOT_TABLE__TYPE_DEFINED:
        setTypeDefined((Boolean)newValue);
        return;
      case MclootPackage.LOOT_TABLE__TYPE:
        setType((EnumLootTableType)newValue);
        return;
      case MclootPackage.LOOT_TABLE__POOLS_DEFINED:
        setPoolsDefined((Boolean)newValue);
        return;
      case MclootPackage.LOOT_TABLE__POOLS:
        getPools().clear();
        getPools().addAll((Collection<? extends LootPool>)newValue);
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
      case MclootPackage.LOOT_TABLE__TYPE_DEFINED:
        setTypeDefined(TYPE_DEFINED_EDEFAULT);
        return;
      case MclootPackage.LOOT_TABLE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MclootPackage.LOOT_TABLE__POOLS_DEFINED:
        setPoolsDefined(POOLS_DEFINED_EDEFAULT);
        return;
      case MclootPackage.LOOT_TABLE__POOLS:
        getPools().clear();
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
      case MclootPackage.LOOT_TABLE__TYPE_DEFINED:
        return typeDefined != TYPE_DEFINED_EDEFAULT;
      case MclootPackage.LOOT_TABLE__TYPE:
        return type != TYPE_EDEFAULT;
      case MclootPackage.LOOT_TABLE__POOLS_DEFINED:
        return poolsDefined != POOLS_DEFINED_EDEFAULT;
      case MclootPackage.LOOT_TABLE__POOLS:
        return pools != null && !pools.isEmpty();
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
    result.append(" (typeDefined: ");
    result.append(typeDefined);
    result.append(", type: ");
    result.append(type);
    result.append(", poolsDefined: ");
    result.append(poolsDefined);
    result.append(')');
    return result.toString();
  }

} //LootTableImpl
