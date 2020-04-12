/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Name Loot Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.SetNameLootFunction#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.SetNameLootFunction#getItemName <em>Item Name</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetNameLootFunction()
 * @model
 * @generated
 */
public interface SetNameLootFunction extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' attribute.
   * The literals are from the enumeration {@link com.raptor.mcloottable.mcloot.EnumEntitySource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' attribute.
   * @see com.raptor.mcloottable.mcloot.EnumEntitySource
   * @see #setEntity(EnumEntitySource)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetNameLootFunction_Entity()
   * @model
   * @generated
   */
  EnumEntitySource getEntity();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.SetNameLootFunction#getEntity <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' attribute.
   * @see com.raptor.mcloottable.mcloot.EnumEntitySource
   * @see #getEntity()
   * @generated
   */
  void setEntity(EnumEntitySource value);

  /**
   * Returns the value of the '<em><b>Item Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Name</em>' containment reference.
   * @see #setItemName(MCJsonValue)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetNameLootFunction_ItemName()
   * @model containment="true"
   * @generated
   */
  MCJsonValue getItemName();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.SetNameLootFunction#getItemName <em>Item Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Name</em>' containment reference.
   * @see #getItemName()
   * @generated
   */
  void setItemName(MCJsonValue value);

} // SetNameLootFunction