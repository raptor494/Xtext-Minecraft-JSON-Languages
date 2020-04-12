/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.mcblockstate.util;

import com.raptor.mcblockstate.mcblockstate.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.raptor.mcblockstate.mcblockstate.McblockstatePackage
 * @generated
 */
public class McblockstateSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static McblockstatePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McblockstateSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = McblockstatePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case McblockstatePackage.BLOCKSTATE:
      {
        Blockstate blockstate = (Blockstate)theEObject;
        T result = caseBlockstate(blockstate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.VARIANTS_BLOCKSTATE:
      {
        VariantsBlockstate variantsBlockstate = (VariantsBlockstate)theEObject;
        T result = caseVariantsBlockstate(variantsBlockstate);
        if (result == null) result = caseBlockstate(variantsBlockstate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.VARIANT:
      {
        Variant variant = (Variant)theEObject;
        T result = caseVariant(variant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.BLOCKSTATE_PROPERTY:
      {
        BlockstateProperty blockstateProperty = (BlockstateProperty)theEObject;
        T result = caseBlockstateProperty(blockstateProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MULTIPART_BLOCKSTATE:
      {
        MultipartBlockstate multipartBlockstate = (MultipartBlockstate)theEObject;
        T result = caseMultipartBlockstate(multipartBlockstate);
        if (result == null) result = caseBlockstate(multipartBlockstate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.CASE_CONDITION:
      {
        CaseCondition caseCondition = (CaseCondition)theEObject;
        T result = caseCaseCondition(caseCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.BLOCKSTATE_PROPERTY_PREDICATE:
      {
        BlockstatePropertyPredicate blockstatePropertyPredicate = (BlockstatePropertyPredicate)theEObject;
        T result = caseBlockstatePropertyPredicate(blockstatePropertyPredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.CUSTOM_BLOCKSTATE:
      {
        CustomBlockstate customBlockstate = (CustomBlockstate)theEObject;
        T result = caseCustomBlockstate(customBlockstate);
        if (result == null) result = caseBlockstate(customBlockstate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MODEL_LIST:
      {
        ModelList modelList = (ModelList)theEObject;
        T result = caseModelList(modelList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_VALUE:
      {
        MCJsonValue mcJsonValue = (MCJsonValue)theEObject;
        T result = caseMCJsonValue(mcJsonValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_OBJECT:
      {
        MCJsonObject mcJsonObject = (MCJsonObject)theEObject;
        T result = caseMCJsonObject(mcJsonObject);
        if (result == null) result = caseMCJsonValue(mcJsonObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_ENTRY:
      {
        MCJsonEntry mcJsonEntry = (MCJsonEntry)theEObject;
        T result = caseMCJsonEntry(mcJsonEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_ARRAY:
      {
        MCJsonArray mcJsonArray = (MCJsonArray)theEObject;
        T result = caseMCJsonArray(mcJsonArray);
        if (result == null) result = caseMCJsonValue(mcJsonArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_STRING:
      {
        MCJsonString mcJsonString = (MCJsonString)theEObject;
        T result = caseMCJsonString(mcJsonString);
        if (result == null) result = caseMCJsonValue(mcJsonString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_NUMBER:
      {
        MCJsonNumber mcJsonNumber = (MCJsonNumber)theEObject;
        T result = caseMCJsonNumber(mcJsonNumber);
        if (result == null) result = caseMCJsonValue(mcJsonNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_INTEGRAL:
      {
        MCJsonIntegral mcJsonIntegral = (MCJsonIntegral)theEObject;
        T result = caseMCJsonIntegral(mcJsonIntegral);
        if (result == null) result = caseMCJsonNumber(mcJsonIntegral);
        if (result == null) result = caseMCJsonValue(mcJsonIntegral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_FLOATING_POINT:
      {
        MCJsonFloatingPoint mcJsonFloatingPoint = (MCJsonFloatingPoint)theEObject;
        T result = caseMCJsonFloatingPoint(mcJsonFloatingPoint);
        if (result == null) result = caseMCJsonNumber(mcJsonFloatingPoint);
        if (result == null) result = caseMCJsonValue(mcJsonFloatingPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_BOOLEAN:
      {
        MCJsonBoolean mcJsonBoolean = (MCJsonBoolean)theEObject;
        T result = caseMCJsonBoolean(mcJsonBoolean);
        if (result == null) result = caseMCJsonValue(mcJsonBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.MC_JSON_NULL:
      {
        MCJsonNull mcJsonNull = (MCJsonNull)theEObject;
        T result = caseMCJsonNull(mcJsonNull);
        if (result == null) result = caseMCJsonValue(mcJsonNull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.OR_CASE_CONDITION:
      {
        OrCaseCondition orCaseCondition = (OrCaseCondition)theEObject;
        T result = caseOrCaseCondition(orCaseCondition);
        if (result == null) result = caseCaseCondition(orCaseCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.BASE_CASE_CONDITION:
      {
        BaseCaseCondition baseCaseCondition = (BaseCaseCondition)theEObject;
        T result = caseBaseCaseCondition(baseCaseCondition);
        if (result == null) result = caseCaseCondition(baseCaseCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.NORMAL_BLOCKSTATE_PROPERTY_PREDICATE:
      {
        NormalBlockstatePropertyPredicate normalBlockstatePropertyPredicate = (NormalBlockstatePropertyPredicate)theEObject;
        T result = caseNormalBlockstatePropertyPredicate(normalBlockstatePropertyPredicate);
        if (result == null) result = caseBlockstatePropertyPredicate(normalBlockstatePropertyPredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McblockstatePackage.BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE:
      {
        BooleanBlockstatePropertyPredicate booleanBlockstatePropertyPredicate = (BooleanBlockstatePropertyPredicate)theEObject;
        T result = caseBooleanBlockstatePropertyPredicate(booleanBlockstatePropertyPredicate);
        if (result == null) result = caseBlockstatePropertyPredicate(booleanBlockstatePropertyPredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blockstate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blockstate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockstate(Blockstate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variants Blockstate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variants Blockstate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariantsBlockstate(VariantsBlockstate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariant(Variant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blockstate Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blockstate Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockstateProperty(BlockstateProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multipart Blockstate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multipart Blockstate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultipartBlockstate(MultipartBlockstate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseCondition(CaseCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blockstate Property Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blockstate Property Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockstatePropertyPredicate(BlockstatePropertyPredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Blockstate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Blockstate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomBlockstate(CustomBlockstate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelList(ModelList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonValue(MCJsonValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonObject(MCJsonObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonEntry(MCJsonEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonArray(MCJsonArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonString(MCJsonString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonNumber(MCJsonNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Integral</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Integral</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonIntegral(MCJsonIntegral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Floating Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Floating Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonFloatingPoint(MCJsonFloatingPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonBoolean(MCJsonBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MC Json Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MC Json Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCJsonNull(MCJsonNull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Case Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Case Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrCaseCondition(OrCaseCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Case Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Case Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseCaseCondition(BaseCaseCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normal Blockstate Property Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normal Blockstate Property Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormalBlockstatePropertyPredicate(NormalBlockstatePropertyPredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Blockstate Property Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Blockstate Property Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanBlockstatePropertyPredicate(BooleanBlockstatePropertyPredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //McblockstateSwitch
