/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.JSONEntry#getKey <em>Key</em>}</li>
 *   <li>{@link com.raptor.mcentity.mcentity.JSONEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcentity.mcentity.McentityPackage#getJSONEntry()
 * @model
 * @generated
 */
public interface JSONEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see com.raptor.mcentity.mcentity.McentityPackage#getJSONEntry_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link com.raptor.mcentity.mcentity.JSONEntry#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(JSONValue)
   * @see com.raptor.mcentity.mcentity.McentityPackage#getJSONEntry_Value()
   * @model containment="true"
   * @generated
   */
  JSONValue getValue();

  /**
   * Sets the value of the '{@link com.raptor.mcentity.mcentity.JSONEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(JSONValue value);

} // JSONEntry
