/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.CopyStateLootFunction;
import com.raptor.mcloottable.mcloot.MclootPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy State Loot Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.CopyStateLootFunctionImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.CopyStateLootFunctionImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyStateLootFunctionImpl extends LootFunctionImpl implements CopyStateLootFunction
{
  /**
   * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected static final String BLOCK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected String block = BLOCK_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<String> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CopyStateLootFunctionImpl()
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
    return MclootPackage.Literals.COPY_STATE_LOOT_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBlock(String newBlock)
  {
    String oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.COPY_STATE_LOOT_FUNCTION__BLOCK, oldBlock, block));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getProperties()
  {
    if (properties == null)
    {
      properties = new EDataTypeEList<String>(String.class, this, MclootPackage.COPY_STATE_LOOT_FUNCTION__PROPERTIES);
    }
    return properties;
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
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__BLOCK:
        return getBlock();
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__PROPERTIES:
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
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__BLOCK:
        setBlock((String)newValue);
        return;
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends String>)newValue);
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
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__BLOCK:
        setBlock(BLOCK_EDEFAULT);
        return;
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__PROPERTIES:
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
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__BLOCK:
        return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
      case MclootPackage.COPY_STATE_LOOT_FUNCTION__PROPERTIES:
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
    result.append(" (block: ");
    result.append(block);
    result.append(", properties: ");
    result.append(properties);
    result.append(')');
    return result.toString();
  }

} //CopyStateLootFunctionImpl
