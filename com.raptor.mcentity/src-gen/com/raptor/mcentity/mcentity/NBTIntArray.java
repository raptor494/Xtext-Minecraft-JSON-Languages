/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NBT Int Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.NBTIntArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTIntArray()
 * @model
 * @generated
 */
public interface NBTIntArray extends NBTValue
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' attribute list.
   * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTIntArray_Elements()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getElements();

} // NBTIntArray