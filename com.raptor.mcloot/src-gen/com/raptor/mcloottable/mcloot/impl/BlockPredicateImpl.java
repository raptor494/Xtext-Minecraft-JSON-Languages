/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.BlockPredicate;
import com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate;
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
 * An implementation of the model object '<em><b>Block Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockPredicateImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockPredicateImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockPredicateImpl#getNbt <em>Nbt</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockPredicateImpl#isStateDefined <em>State Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockPredicateImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockPredicateImpl extends MinimalEObjectImpl.Container implements BlockPredicate
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
   * The default value of the '{@link #getNbt() <em>Nbt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbt()
   * @generated
   * @ordered
   */
  protected static final String NBT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNbt() <em>Nbt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbt()
   * @generated
   * @ordered
   */
  protected String nbt = NBT_EDEFAULT;

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
  protected BlockPredicateImpl()
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
    return MclootPackage.Literals.BLOCK_PREDICATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_PREDICATE__TAG, oldTag, tag));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_PREDICATE__BLOCK, oldBlock, block));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNbt()
  {
    return nbt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNbt(String newNbt)
  {
    String oldNbt = nbt;
    nbt = newNbt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_PREDICATE__NBT, oldNbt, nbt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_PREDICATE__STATE_DEFINED, oldStateDefined, stateDefined));
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
      properties = new EObjectContainmentEList<BlockStatePropertyPredicate>(BlockStatePropertyPredicate.class, this, MclootPackage.BLOCK_PREDICATE__PROPERTIES);
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
      case MclootPackage.BLOCK_PREDICATE__PROPERTIES:
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
      case MclootPackage.BLOCK_PREDICATE__TAG:
        return getTag();
      case MclootPackage.BLOCK_PREDICATE__BLOCK:
        return getBlock();
      case MclootPackage.BLOCK_PREDICATE__NBT:
        return getNbt();
      case MclootPackage.BLOCK_PREDICATE__STATE_DEFINED:
        return isStateDefined();
      case MclootPackage.BLOCK_PREDICATE__PROPERTIES:
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
      case MclootPackage.BLOCK_PREDICATE__TAG:
        setTag((String)newValue);
        return;
      case MclootPackage.BLOCK_PREDICATE__BLOCK:
        setBlock((String)newValue);
        return;
      case MclootPackage.BLOCK_PREDICATE__NBT:
        setNbt((String)newValue);
        return;
      case MclootPackage.BLOCK_PREDICATE__STATE_DEFINED:
        setStateDefined((Boolean)newValue);
        return;
      case MclootPackage.BLOCK_PREDICATE__PROPERTIES:
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
      case MclootPackage.BLOCK_PREDICATE__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case MclootPackage.BLOCK_PREDICATE__BLOCK:
        setBlock(BLOCK_EDEFAULT);
        return;
      case MclootPackage.BLOCK_PREDICATE__NBT:
        setNbt(NBT_EDEFAULT);
        return;
      case MclootPackage.BLOCK_PREDICATE__STATE_DEFINED:
        setStateDefined(STATE_DEFINED_EDEFAULT);
        return;
      case MclootPackage.BLOCK_PREDICATE__PROPERTIES:
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
      case MclootPackage.BLOCK_PREDICATE__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case MclootPackage.BLOCK_PREDICATE__BLOCK:
        return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
      case MclootPackage.BLOCK_PREDICATE__NBT:
        return NBT_EDEFAULT == null ? nbt != null : !NBT_EDEFAULT.equals(nbt);
      case MclootPackage.BLOCK_PREDICATE__STATE_DEFINED:
        return stateDefined != STATE_DEFINED_EDEFAULT;
      case MclootPackage.BLOCK_PREDICATE__PROPERTIES:
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
    result.append(", block: ");
    result.append(block);
    result.append(", nbt: ");
    result.append(nbt);
    result.append(", stateDefined: ");
    result.append(stateDefined);
    result.append(')');
    return result.toString();
  }

} //BlockPredicateImpl