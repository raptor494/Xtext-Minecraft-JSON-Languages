/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Attributes Loot Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.SetAttributesLootFunction#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetAttributesLootFunction()
 * @model
 * @generated
 */
public interface SetAttributesLootFunction extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link com.raptor.mcloottable.mcloot.AttributeModifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference list.
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getSetAttributesLootFunction_Modifiers()
   * @model containment="true"
   * @generated
   */
  EList<AttributeModifier> getModifiers();

} // SetAttributesLootFunction
