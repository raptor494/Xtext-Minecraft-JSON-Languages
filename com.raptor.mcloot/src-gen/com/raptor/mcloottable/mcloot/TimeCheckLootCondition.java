/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Check Loot Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#isPeriodDefined <em>Period Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#getPeriod <em>Period</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#isInverted <em>Inverted</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getTimeCheckLootCondition()
 * @model
 * @generated
 */
public interface TimeCheckLootCondition extends NamedLootCondition
{
  /**
   * Returns the value of the '<em><b>Period Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period Defined</em>' attribute.
   * @see #setPeriodDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getTimeCheckLootCondition_PeriodDefined()
   * @model
   * @generated
   */
  boolean isPeriodDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#isPeriodDefined <em>Period Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period Defined</em>' attribute.
   * @see #isPeriodDefined()
   * @generated
   */
  void setPeriodDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(long)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getTimeCheckLootCondition_Period()
   * @model
   * @generated
   */
  long getPeriod();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(long value);

  /**
   * Returns the value of the '<em><b>Inverted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inverted</em>' attribute.
   * @see #setInverted(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getTimeCheckLootCondition_Inverted()
   * @model
   * @generated
   */
  boolean isInverted();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#isInverted <em>Inverted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inverted</em>' attribute.
   * @see #isInverted()
   * @generated
   */
  void setInverted(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LongRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getTimeCheckLootCondition_Value()
   * @model containment="true"
   * @generated
   */
  LongRange getValue();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.TimeCheckLootCondition#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LongRange value);

} // TimeCheckLootCondition
