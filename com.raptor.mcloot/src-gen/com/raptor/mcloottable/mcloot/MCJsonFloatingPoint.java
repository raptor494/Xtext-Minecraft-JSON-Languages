/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MC Json Floating Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.MCJsonFloatingPoint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getMCJsonFloatingPoint()
 * @model
 * @generated
 */
public interface MCJsonFloatingPoint extends MCJsonNumber
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getMCJsonFloatingPoint_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.MCJsonFloatingPoint#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

} // MCJsonFloatingPoint
