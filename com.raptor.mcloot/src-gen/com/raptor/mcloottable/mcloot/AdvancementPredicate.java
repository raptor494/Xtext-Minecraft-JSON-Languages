/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advancement Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.AdvancementPredicate#getName <em>Name</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.AdvancementPredicate#isDidNotGet <em>Did Not Get</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.AdvancementPredicate#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getAdvancementPredicate()
 * @model
 * @generated
 */
public interface AdvancementPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getAdvancementPredicate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.AdvancementPredicate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Did Not Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Did Not Get</em>' attribute.
   * @see #setDidNotGet(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getAdvancementPredicate_DidNotGet()
   * @model
   * @generated
   */
  boolean isDidNotGet();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.AdvancementPredicate#isDidNotGet <em>Did Not Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Did Not Get</em>' attribute.
   * @see #isDidNotGet()
   * @generated
   */
  void setDidNotGet(boolean value);

  /**
   * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
   * The list contents are of type {@link com.raptor.mcloottable.mcloot.AdvancementCriteria}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criteria</em>' containment reference list.
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getAdvancementPredicate_Criteria()
   * @model containment="true"
   * @generated
   */
  EList<AdvancementCriteria> getCriteria();

} // AdvancementPredicate
