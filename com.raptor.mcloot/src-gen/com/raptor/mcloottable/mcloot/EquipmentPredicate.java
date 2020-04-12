/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.EquipmentPredicate#getSlots <em>Slots</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.EquipmentPredicate#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getEquipmentPredicate()
 * @model
 * @generated
 */
public interface EquipmentPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Slots</b></em>' attribute list.
   * The list contents are of type {@link com.raptor.mcloottable.mcloot.EnumEquipmentSlot}.
   * The literals are from the enumeration {@link com.raptor.mcloottable.mcloot.EnumEquipmentSlot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slots</em>' attribute list.
   * @see com.raptor.mcloottable.mcloot.EnumEquipmentSlot
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getEquipmentPredicate_Slots()
   * @model unique="false"
   * @generated
   */
  EList<EnumEquipmentSlot> getSlots();

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(ItemPredicate)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getEquipmentPredicate_Predicate()
   * @model containment="true"
   * @generated
   */
  ItemPredicate getPredicate();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.EquipmentPredicate#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(ItemPredicate value);

} // EquipmentPredicate
