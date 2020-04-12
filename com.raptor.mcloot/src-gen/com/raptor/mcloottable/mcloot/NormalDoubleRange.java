/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Double Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.NormalDoubleRange#getMin <em>Min</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.NormalDoubleRange#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getNormalDoubleRange()
 * @model
 * @generated
 */
public interface NormalDoubleRange extends DoubleRange
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(double)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getNormalDoubleRange_Min()
   * @model
   * @generated
   */
  double getMin();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.NormalDoubleRange#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(double value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(double)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getNormalDoubleRange_Max()
   * @model
   * @generated
   */
  double getMax();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.NormalDoubleRange#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(double value);

} // NormalDoubleRange
