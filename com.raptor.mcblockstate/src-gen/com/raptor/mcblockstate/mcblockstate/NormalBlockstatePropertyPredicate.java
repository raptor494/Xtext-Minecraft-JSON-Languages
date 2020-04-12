/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.mcblockstate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Blockstate Property Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.NormalBlockstatePropertyPredicate#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcblockstate.mcblockstate.McblockstatePackage#getNormalBlockstatePropertyPredicate()
 * @model
 * @generated
 */
public interface NormalBlockstatePropertyPredicate extends BlockstatePropertyPredicate
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see com.raptor.mcblockstate.mcblockstate.McblockstatePackage#getNormalBlockstatePropertyPredicate_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // NormalBlockstatePropertyPredicate