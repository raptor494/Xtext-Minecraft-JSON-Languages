/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.Selector#getType <em>Type</em>}</li>
 *   <li>{@link com.raptor.mcentity.mcentity.Selector#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcentity.mcentity.McentityPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends JSONValue
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.raptor.mcentity.mcentity.SelectorType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.raptor.mcentity.mcentity.SelectorType
   * @see #setType(SelectorType)
   * @see com.raptor.mcentity.mcentity.McentityPackage#getSelector_Type()
   * @model
   * @generated
   */
  SelectorType getType();

  /**
   * Sets the value of the '{@link com.raptor.mcentity.mcentity.Selector#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.raptor.mcentity.mcentity.SelectorType
   * @see #getType()
   * @generated
   */
  void setType(SelectorType value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(SelectorArguments)
   * @see com.raptor.mcentity.mcentity.McentityPackage#getSelector_Arguments()
   * @model containment="true"
   * @generated
   */
  SelectorArguments getArguments();

  /**
   * Sets the value of the '{@link com.raptor.mcentity.mcentity.Selector#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(SelectorArguments value);

} // Selector