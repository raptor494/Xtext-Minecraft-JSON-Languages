/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.EnchantmentLevel;
import com.raptor.mcloottable.mcloot.ItemPredicate;
import com.raptor.mcloottable.mcloot.LongRange;
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
 * An implementation of the model object '<em><b>Item Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#isCountDefined <em>Count Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#isDurabilityDefined <em>Durability Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getDurability <em>Durability</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#isEnchantmentsDefined <em>Enchantments Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getEnchantments <em>Enchantments</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#isStoredEnchantmentsDefined <em>Stored Enchantments Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getStoredEnchantments <em>Stored Enchantments</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#isNbtDefined <em>Nbt Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getNbt <em>Nbt</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#isPotionDefined <em>Potion Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ItemPredicateImpl#getPotion <em>Potion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemPredicateImpl extends MinimalEObjectImpl.Container implements ItemPredicate
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
   * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected static final String ITEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected String item = ITEM_EDEFAULT;

  /**
   * The default value of the '{@link #isCountDefined() <em>Count Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCountDefined()
   * @generated
   * @ordered
   */
  protected static final boolean COUNT_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCountDefined() <em>Count Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCountDefined()
   * @generated
   * @ordered
   */
  protected boolean countDefined = COUNT_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected LongRange count;

  /**
   * The default value of the '{@link #isDurabilityDefined() <em>Durability Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDurabilityDefined()
   * @generated
   * @ordered
   */
  protected static final boolean DURABILITY_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDurabilityDefined() <em>Durability Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDurabilityDefined()
   * @generated
   * @ordered
   */
  protected boolean durabilityDefined = DURABILITY_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getDurability() <em>Durability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDurability()
   * @generated
   * @ordered
   */
  protected LongRange durability;

  /**
   * The default value of the '{@link #isEnchantmentsDefined() <em>Enchantments Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnchantmentsDefined()
   * @generated
   * @ordered
   */
  protected static final boolean ENCHANTMENTS_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnchantmentsDefined() <em>Enchantments Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnchantmentsDefined()
   * @generated
   * @ordered
   */
  protected boolean enchantmentsDefined = ENCHANTMENTS_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnchantments() <em>Enchantments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnchantments()
   * @generated
   * @ordered
   */
  protected EList<EnchantmentLevel> enchantments;

  /**
   * The default value of the '{@link #isStoredEnchantmentsDefined() <em>Stored Enchantments Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStoredEnchantmentsDefined()
   * @generated
   * @ordered
   */
  protected static final boolean STORED_ENCHANTMENTS_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStoredEnchantmentsDefined() <em>Stored Enchantments Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStoredEnchantmentsDefined()
   * @generated
   * @ordered
   */
  protected boolean storedEnchantmentsDefined = STORED_ENCHANTMENTS_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getStoredEnchantments() <em>Stored Enchantments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStoredEnchantments()
   * @generated
   * @ordered
   */
  protected EList<EnchantmentLevel> storedEnchantments;

  /**
   * The default value of the '{@link #isNbtDefined() <em>Nbt Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNbtDefined()
   * @generated
   * @ordered
   */
  protected static final boolean NBT_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNbtDefined() <em>Nbt Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNbtDefined()
   * @generated
   * @ordered
   */
  protected boolean nbtDefined = NBT_DEFINED_EDEFAULT;

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
   * The default value of the '{@link #isPotionDefined() <em>Potion Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPotionDefined()
   * @generated
   * @ordered
   */
  protected static final boolean POTION_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPotionDefined() <em>Potion Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPotionDefined()
   * @generated
   * @ordered
   */
  protected boolean potionDefined = POTION_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getPotion() <em>Potion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPotion()
   * @generated
   * @ordered
   */
  protected static final String POTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPotion() <em>Potion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPotion()
   * @generated
   * @ordered
   */
  protected String potion = POTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemPredicateImpl()
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
    return MclootPackage.Literals.ITEM_PREDICATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setItem(String newItem)
  {
    String oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isCountDefined()
  {
    return countDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCountDefined(boolean newCountDefined)
  {
    boolean oldCountDefined = countDefined;
    countDefined = newCountDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__COUNT_DEFINED, oldCountDefined, countDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LongRange getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCount(LongRange newCount, NotificationChain msgs)
  {
    LongRange oldCount = count;
    count = newCount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__COUNT, oldCount, newCount);
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
  public void setCount(LongRange newCount)
  {
    if (newCount != count)
    {
      NotificationChain msgs = null;
      if (count != null)
        msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ITEM_PREDICATE__COUNT, null, msgs);
      if (newCount != null)
        msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ITEM_PREDICATE__COUNT, null, msgs);
      msgs = basicSetCount(newCount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__COUNT, newCount, newCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDurabilityDefined()
  {
    return durabilityDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDurabilityDefined(boolean newDurabilityDefined)
  {
    boolean oldDurabilityDefined = durabilityDefined;
    durabilityDefined = newDurabilityDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__DURABILITY_DEFINED, oldDurabilityDefined, durabilityDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LongRange getDurability()
  {
    return durability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDurability(LongRange newDurability, NotificationChain msgs)
  {
    LongRange oldDurability = durability;
    durability = newDurability;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__DURABILITY, oldDurability, newDurability);
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
  public void setDurability(LongRange newDurability)
  {
    if (newDurability != durability)
    {
      NotificationChain msgs = null;
      if (durability != null)
        msgs = ((InternalEObject)durability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ITEM_PREDICATE__DURABILITY, null, msgs);
      if (newDurability != null)
        msgs = ((InternalEObject)newDurability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ITEM_PREDICATE__DURABILITY, null, msgs);
      msgs = basicSetDurability(newDurability, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__DURABILITY, newDurability, newDurability));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEnchantmentsDefined()
  {
    return enchantmentsDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnchantmentsDefined(boolean newEnchantmentsDefined)
  {
    boolean oldEnchantmentsDefined = enchantmentsDefined;
    enchantmentsDefined = newEnchantmentsDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__ENCHANTMENTS_DEFINED, oldEnchantmentsDefined, enchantmentsDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EnchantmentLevel> getEnchantments()
  {
    if (enchantments == null)
    {
      enchantments = new EObjectContainmentEList<EnchantmentLevel>(EnchantmentLevel.class, this, MclootPackage.ITEM_PREDICATE__ENCHANTMENTS);
    }
    return enchantments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isStoredEnchantmentsDefined()
  {
    return storedEnchantmentsDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStoredEnchantmentsDefined(boolean newStoredEnchantmentsDefined)
  {
    boolean oldStoredEnchantmentsDefined = storedEnchantmentsDefined;
    storedEnchantmentsDefined = newStoredEnchantmentsDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS_DEFINED, oldStoredEnchantmentsDefined, storedEnchantmentsDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EnchantmentLevel> getStoredEnchantments()
  {
    if (storedEnchantments == null)
    {
      storedEnchantments = new EObjectContainmentEList<EnchantmentLevel>(EnchantmentLevel.class, this, MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS);
    }
    return storedEnchantments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNbtDefined()
  {
    return nbtDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNbtDefined(boolean newNbtDefined)
  {
    boolean oldNbtDefined = nbtDefined;
    nbtDefined = newNbtDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__NBT_DEFINED, oldNbtDefined, nbtDefined));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__NBT, oldNbt, nbt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPotionDefined()
  {
    return potionDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPotionDefined(boolean newPotionDefined)
  {
    boolean oldPotionDefined = potionDefined;
    potionDefined = newPotionDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__POTION_DEFINED, oldPotionDefined, potionDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPotion()
  {
    return potion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPotion(String newPotion)
  {
    String oldPotion = potion;
    potion = newPotion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ITEM_PREDICATE__POTION, oldPotion, potion));
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
      case MclootPackage.ITEM_PREDICATE__COUNT:
        return basicSetCount(null, msgs);
      case MclootPackage.ITEM_PREDICATE__DURABILITY:
        return basicSetDurability(null, msgs);
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS:
        return ((InternalEList<?>)getEnchantments()).basicRemove(otherEnd, msgs);
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS:
        return ((InternalEList<?>)getStoredEnchantments()).basicRemove(otherEnd, msgs);
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
      case MclootPackage.ITEM_PREDICATE__TAG:
        return getTag();
      case MclootPackage.ITEM_PREDICATE__ITEM:
        return getItem();
      case MclootPackage.ITEM_PREDICATE__COUNT_DEFINED:
        return isCountDefined();
      case MclootPackage.ITEM_PREDICATE__COUNT:
        return getCount();
      case MclootPackage.ITEM_PREDICATE__DURABILITY_DEFINED:
        return isDurabilityDefined();
      case MclootPackage.ITEM_PREDICATE__DURABILITY:
        return getDurability();
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS_DEFINED:
        return isEnchantmentsDefined();
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS:
        return getEnchantments();
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS_DEFINED:
        return isStoredEnchantmentsDefined();
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS:
        return getStoredEnchantments();
      case MclootPackage.ITEM_PREDICATE__NBT_DEFINED:
        return isNbtDefined();
      case MclootPackage.ITEM_PREDICATE__NBT:
        return getNbt();
      case MclootPackage.ITEM_PREDICATE__POTION_DEFINED:
        return isPotionDefined();
      case MclootPackage.ITEM_PREDICATE__POTION:
        return getPotion();
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
      case MclootPackage.ITEM_PREDICATE__TAG:
        setTag((String)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__ITEM:
        setItem((String)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__COUNT_DEFINED:
        setCountDefined((Boolean)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__COUNT:
        setCount((LongRange)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__DURABILITY_DEFINED:
        setDurabilityDefined((Boolean)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__DURABILITY:
        setDurability((LongRange)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS_DEFINED:
        setEnchantmentsDefined((Boolean)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS:
        getEnchantments().clear();
        getEnchantments().addAll((Collection<? extends EnchantmentLevel>)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS_DEFINED:
        setStoredEnchantmentsDefined((Boolean)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS:
        getStoredEnchantments().clear();
        getStoredEnchantments().addAll((Collection<? extends EnchantmentLevel>)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__NBT_DEFINED:
        setNbtDefined((Boolean)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__NBT:
        setNbt((String)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__POTION_DEFINED:
        setPotionDefined((Boolean)newValue);
        return;
      case MclootPackage.ITEM_PREDICATE__POTION:
        setPotion((String)newValue);
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
      case MclootPackage.ITEM_PREDICATE__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__ITEM:
        setItem(ITEM_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__COUNT_DEFINED:
        setCountDefined(COUNT_DEFINED_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__COUNT:
        setCount((LongRange)null);
        return;
      case MclootPackage.ITEM_PREDICATE__DURABILITY_DEFINED:
        setDurabilityDefined(DURABILITY_DEFINED_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__DURABILITY:
        setDurability((LongRange)null);
        return;
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS_DEFINED:
        setEnchantmentsDefined(ENCHANTMENTS_DEFINED_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS:
        getEnchantments().clear();
        return;
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS_DEFINED:
        setStoredEnchantmentsDefined(STORED_ENCHANTMENTS_DEFINED_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS:
        getStoredEnchantments().clear();
        return;
      case MclootPackage.ITEM_PREDICATE__NBT_DEFINED:
        setNbtDefined(NBT_DEFINED_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__NBT:
        setNbt(NBT_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__POTION_DEFINED:
        setPotionDefined(POTION_DEFINED_EDEFAULT);
        return;
      case MclootPackage.ITEM_PREDICATE__POTION:
        setPotion(POTION_EDEFAULT);
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
      case MclootPackage.ITEM_PREDICATE__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case MclootPackage.ITEM_PREDICATE__ITEM:
        return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
      case MclootPackage.ITEM_PREDICATE__COUNT_DEFINED:
        return countDefined != COUNT_DEFINED_EDEFAULT;
      case MclootPackage.ITEM_PREDICATE__COUNT:
        return count != null;
      case MclootPackage.ITEM_PREDICATE__DURABILITY_DEFINED:
        return durabilityDefined != DURABILITY_DEFINED_EDEFAULT;
      case MclootPackage.ITEM_PREDICATE__DURABILITY:
        return durability != null;
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS_DEFINED:
        return enchantmentsDefined != ENCHANTMENTS_DEFINED_EDEFAULT;
      case MclootPackage.ITEM_PREDICATE__ENCHANTMENTS:
        return enchantments != null && !enchantments.isEmpty();
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS_DEFINED:
        return storedEnchantmentsDefined != STORED_ENCHANTMENTS_DEFINED_EDEFAULT;
      case MclootPackage.ITEM_PREDICATE__STORED_ENCHANTMENTS:
        return storedEnchantments != null && !storedEnchantments.isEmpty();
      case MclootPackage.ITEM_PREDICATE__NBT_DEFINED:
        return nbtDefined != NBT_DEFINED_EDEFAULT;
      case MclootPackage.ITEM_PREDICATE__NBT:
        return NBT_EDEFAULT == null ? nbt != null : !NBT_EDEFAULT.equals(nbt);
      case MclootPackage.ITEM_PREDICATE__POTION_DEFINED:
        return potionDefined != POTION_DEFINED_EDEFAULT;
      case MclootPackage.ITEM_PREDICATE__POTION:
        return POTION_EDEFAULT == null ? potion != null : !POTION_EDEFAULT.equals(potion);
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
    result.append(", item: ");
    result.append(item);
    result.append(", countDefined: ");
    result.append(countDefined);
    result.append(", durabilityDefined: ");
    result.append(durabilityDefined);
    result.append(", enchantmentsDefined: ");
    result.append(enchantmentsDefined);
    result.append(", storedEnchantmentsDefined: ");
    result.append(storedEnchantmentsDefined);
    result.append(", nbtDefined: ");
    result.append(nbtDefined);
    result.append(", nbt: ");
    result.append(nbt);
    result.append(", potionDefined: ");
    result.append(potionDefined);
    result.append(", potion: ");
    result.append(potion);
    result.append(')');
    return result.toString();
  }

} //ItemPredicateImpl
