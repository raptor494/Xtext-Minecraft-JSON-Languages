/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Lore Loot Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.SetLoreLootFunction#isReplaceDefined <em>Replace Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.SetLoreLootFunction#isReplace <em>Replace</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.SetLoreLootFunction#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.SetLoreLootFunction#getLore <em>Lore</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetLoreLootFunction()
 * @model
 * @generated
 */
public interface SetLoreLootFunction extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Replace Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replace Defined</em>' attribute.
   * @see #setReplaceDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetLoreLootFunction_ReplaceDefined()
   * @model
   * @generated
   */
  boolean isReplaceDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.SetLoreLootFunction#isReplaceDefined <em>Replace Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replace Defined</em>' attribute.
   * @see #isReplaceDefined()
   * @generated
   */
  void setReplaceDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Replace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replace</em>' attribute.
   * @see #setReplace(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetLoreLootFunction_Replace()
   * @model
   * @generated
   */
  boolean isReplace();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.SetLoreLootFunction#isReplace <em>Replace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replace</em>' attribute.
   * @see #isReplace()
   * @generated
   */
  void setReplace(boolean value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' attribute.
   * The literals are from the enumeration {@link com.raptor.mcloottable.mcloot.EnumEntitySource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' attribute.
   * @see com.raptor.mcloottable.mcloot.EnumEntitySource
   * @see #setEntity(EnumEntitySource)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetLoreLootFunction_Entity()
   * @model
   * @generated
   */
  EnumEntitySource getEntity();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.SetLoreLootFunction#getEntity <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' attribute.
   * @see com.raptor.mcloottable.mcloot.EnumEntitySource
   * @see #getEntity()
   * @generated
   */
  void setEntity(EnumEntitySource value);

  /**
   * Returns the value of the '<em><b>Lore</b></em>' containment reference list.
   * The list contents are of type {@link com.raptor.mcloottable.mcloot.MCJsonValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lore</em>' containment reference list.
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetLoreLootFunction_Lore()
   * @model containment="true"
   * @generated
   */
  EList<MCJsonValue> getLore();

} // SetLoreLootFunction