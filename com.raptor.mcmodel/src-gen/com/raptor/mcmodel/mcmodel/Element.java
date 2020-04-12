/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.mcmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcmodel.mcmodel.Element#getFrom <em>From</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.Element#getTo <em>To</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.Element#getRotation <em>Rotation</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.Element#getFaces <em>Faces</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.Element#getDefaultFace <em>Default Face</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.Element#isShadeDefined <em>Shade Defined</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.Element#isShade <em>Shade</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Vec3d)
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement_From()
   * @model containment="true"
   * @generated
   */
  Vec3d getFrom();

  /**
   * Sets the value of the '{@link com.raptor.mcmodel.mcmodel.Element#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Vec3d value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Vec3d)
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement_To()
   * @model containment="true"
   * @generated
   */
  Vec3d getTo();

  /**
   * Sets the value of the '{@link com.raptor.mcmodel.mcmodel.Element#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Vec3d value);

  /**
   * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotation</em>' containment reference.
   * @see #setRotation(Rotation)
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement_Rotation()
   * @model containment="true"
   * @generated
   */
  Rotation getRotation();

  /**
   * Sets the value of the '{@link com.raptor.mcmodel.mcmodel.Element#getRotation <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotation</em>' containment reference.
   * @see #getRotation()
   * @generated
   */
  void setRotation(Rotation value);

  /**
   * Returns the value of the '<em><b>Faces</b></em>' containment reference list.
   * The list contents are of type {@link com.raptor.mcmodel.mcmodel.Faces}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Faces</em>' containment reference list.
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement_Faces()
   * @model containment="true"
   * @generated
   */
  EList<Faces> getFaces();

  /**
   * Returns the value of the '<em><b>Default Face</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Face</em>' containment reference.
   * @see #setDefaultFace(Face)
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement_DefaultFace()
   * @model containment="true"
   * @generated
   */
  Face getDefaultFace();

  /**
   * Sets the value of the '{@link com.raptor.mcmodel.mcmodel.Element#getDefaultFace <em>Default Face</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Face</em>' containment reference.
   * @see #getDefaultFace()
   * @generated
   */
  void setDefaultFace(Face value);

  /**
   * Returns the value of the '<em><b>Shade Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shade Defined</em>' attribute.
   * @see #setShadeDefined(boolean)
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement_ShadeDefined()
   * @model
   * @generated
   */
  boolean isShadeDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcmodel.mcmodel.Element#isShadeDefined <em>Shade Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shade Defined</em>' attribute.
   * @see #isShadeDefined()
   * @generated
   */
  void setShadeDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Shade</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shade</em>' attribute.
   * @see #setShade(boolean)
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getElement_Shade()
   * @model
   * @generated
   */
  boolean isShade();

  /**
   * Sets the value of the '{@link com.raptor.mcmodel.mcmodel.Element#isShade <em>Shade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shade</em>' attribute.
   * @see #isShade()
   * @generated
   */
  void setShade(boolean value);

} // Element
