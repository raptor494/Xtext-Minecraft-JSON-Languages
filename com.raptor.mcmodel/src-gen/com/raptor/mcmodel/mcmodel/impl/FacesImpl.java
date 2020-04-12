/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.mcmodel.impl;

import com.raptor.mcmodel.mcmodel.EnumFace;
import com.raptor.mcmodel.mcmodel.Face;
import com.raptor.mcmodel.mcmodel.Faces;
import com.raptor.mcmodel.mcmodel.McmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcmodel.mcmodel.impl.FacesImpl#getSides <em>Sides</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.impl.FacesImpl#getFace <em>Face</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacesImpl extends MinimalEObjectImpl.Container implements Faces
{
  /**
   * The cached value of the '{@link #getSides() <em>Sides</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSides()
   * @generated
   * @ordered
   */
  protected EList<EnumFace> sides;

  /**
   * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
  protected Face face;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return McmodelPackage.Literals.FACES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EnumFace> getSides()
  {
    if (sides == null)
    {
      sides = new EDataTypeEList<EnumFace>(EnumFace.class, this, McmodelPackage.FACES__SIDES);
    }
    return sides;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Face getFace()
  {
    return face;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFace(Face newFace, NotificationChain msgs)
  {
    Face oldFace = face;
    face = newFace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McmodelPackage.FACES__FACE, oldFace, newFace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFace(Face newFace)
  {
    if (newFace != face)
    {
      NotificationChain msgs = null;
      if (face != null)
        msgs = ((InternalEObject)face).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.FACES__FACE, null, msgs);
      if (newFace != null)
        msgs = ((InternalEObject)newFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.FACES__FACE, null, msgs);
      msgs = basicSetFace(newFace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McmodelPackage.FACES__FACE, newFace, newFace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case McmodelPackage.FACES__FACE:
        return basicSetFace(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case McmodelPackage.FACES__SIDES:
        return getSides();
      case McmodelPackage.FACES__FACE:
        return getFace();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case McmodelPackage.FACES__SIDES:
        getSides().clear();
        getSides().addAll((Collection<? extends EnumFace>)newValue);
        return;
      case McmodelPackage.FACES__FACE:
        setFace((Face)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case McmodelPackage.FACES__SIDES:
        getSides().clear();
        return;
      case McmodelPackage.FACES__FACE:
        setFace((Face)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case McmodelPackage.FACES__SIDES:
        return sides != null && !sides.isEmpty();
      case McmodelPackage.FACES__FACE:
        return face != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (sides: ");
    result.append(sides);
    result.append(')');
    return result.toString();
  }

} //FacesImpl