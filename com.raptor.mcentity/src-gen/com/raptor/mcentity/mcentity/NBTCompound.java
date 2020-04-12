/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NBT Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.NBTCompound#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTCompound()
 * @model
 * @generated
 */
public interface NBTCompound extends NBTValue, SelectorValue
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link com.raptor.mcentity.mcentity.NBTEntry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTCompound_Entries()
   * @model containment="true"
   * @generated
   */
  EList<NBTEntry> getEntries();

} // NBTCompound
