/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.EntityScore#getObjective <em>Objective</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.EntityScore#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getEntityScore()
 * @model
 * @generated
 */
public interface EntityScore extends EObject
{
  /**
   * Returns the value of the '<em><b>Objective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objective</em>' attribute.
   * @see #setObjective(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getEntityScore_Objective()
   * @model
   * @generated
   */
  String getObjective();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.EntityScore#getObjective <em>Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objective</em>' attribute.
   * @see #getObjective()
   * @generated
   */
  void setObjective(String value);

  /**
   * Returns the value of the '<em><b>Score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Score</em>' containment reference.
   * @see #setScore(LongRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getEntityScore_Score()
   * @model containment="true"
   * @generated
   */
  LongRange getScore();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.EntityScore#getScore <em>Score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Score</em>' containment reference.
   * @see #getScore()
   * @generated
   */
  void setScore(LongRange value);

} // EntityScore
