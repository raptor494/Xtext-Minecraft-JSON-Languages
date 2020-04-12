/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loot Function With Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.LootFunctionWithConditions#isConditionsDefined <em>Conditions Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LootFunctionWithConditions#getConditions <em>Conditions</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LootFunctionWithConditions#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getLootFunctionWithConditions()
 * @model
 * @generated
 */
public interface LootFunctionWithConditions extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Conditions Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions Defined</em>' attribute.
   * @see #setConditionsDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLootFunctionWithConditions_ConditionsDefined()
   * @model
   * @generated
   */
  boolean isConditionsDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LootFunctionWithConditions#isConditionsDefined <em>Conditions Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditions Defined</em>' attribute.
   * @see #isConditionsDefined()
   * @generated
   */
  void setConditionsDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link com.raptor.mcloottable.mcloot.LootCondition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLootFunctionWithConditions_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<LootCondition> getConditions();

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(LootFunction)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLootFunctionWithConditions_Function()
   * @model containment="true"
   * @generated
   */
  LootFunction getFunction();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LootFunctionWithConditions#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(LootFunction value);

} // LootFunctionWithConditions
