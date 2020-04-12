/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.mcblockstate.impl;

import com.raptor.mcblockstate.mcblockstate.BaseCaseCondition;
import com.raptor.mcblockstate.mcblockstate.Blockstate;
import com.raptor.mcblockstate.mcblockstate.BlockstateProperty;
import com.raptor.mcblockstate.mcblockstate.BlockstatePropertyPredicate;
import com.raptor.mcblockstate.mcblockstate.BooleanBlockstatePropertyPredicate;
import com.raptor.mcblockstate.mcblockstate.Case;
import com.raptor.mcblockstate.mcblockstate.CaseCondition;
import com.raptor.mcblockstate.mcblockstate.CustomBlockstate;
import com.raptor.mcblockstate.mcblockstate.MCJsonArray;
import com.raptor.mcblockstate.mcblockstate.MCJsonBoolean;
import com.raptor.mcblockstate.mcblockstate.MCJsonEntry;
import com.raptor.mcblockstate.mcblockstate.MCJsonFloatingPoint;
import com.raptor.mcblockstate.mcblockstate.MCJsonIntegral;
import com.raptor.mcblockstate.mcblockstate.MCJsonNull;
import com.raptor.mcblockstate.mcblockstate.MCJsonNumber;
import com.raptor.mcblockstate.mcblockstate.MCJsonObject;
import com.raptor.mcblockstate.mcblockstate.MCJsonString;
import com.raptor.mcblockstate.mcblockstate.MCJsonValue;
import com.raptor.mcblockstate.mcblockstate.McblockstateFactory;
import com.raptor.mcblockstate.mcblockstate.McblockstatePackage;
import com.raptor.mcblockstate.mcblockstate.Model;
import com.raptor.mcblockstate.mcblockstate.ModelList;
import com.raptor.mcblockstate.mcblockstate.MultipartBlockstate;
import com.raptor.mcblockstate.mcblockstate.NormalBlockstatePropertyPredicate;
import com.raptor.mcblockstate.mcblockstate.OrCaseCondition;
import com.raptor.mcblockstate.mcblockstate.Variant;
import com.raptor.mcblockstate.mcblockstate.VariantsBlockstate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McblockstatePackageImpl extends EPackageImpl implements McblockstatePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockstateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantsBlockstateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockstatePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multipartBlockstateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockstatePropertyPredicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customBlockstateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonIntegralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonFloatingPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonBooleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcJsonNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orCaseConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseCaseConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalBlockstatePropertyPredicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanBlockstatePropertyPredicateEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.raptor.mcblockstate.mcblockstate.McblockstatePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private McblockstatePackageImpl()
  {
    super(eNS_URI, McblockstateFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link McblockstatePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static McblockstatePackage init()
  {
    if (isInited) return (McblockstatePackage)EPackage.Registry.INSTANCE.getEPackage(McblockstatePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMcblockstatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    McblockstatePackageImpl theMcblockstatePackage = registeredMcblockstatePackage instanceof McblockstatePackageImpl ? (McblockstatePackageImpl)registeredMcblockstatePackage : new McblockstatePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMcblockstatePackage.createPackageContents();

    // Initialize created meta-data
    theMcblockstatePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMcblockstatePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(McblockstatePackage.eNS_URI, theMcblockstatePackage);
    return theMcblockstatePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBlockstate()
  {
    return blockstateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariantsBlockstate()
  {
    return variantsBlockstateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVariantsBlockstate_Variants()
  {
    return (EReference)variantsBlockstateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariant()
  {
    return variantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVariant_Properties()
  {
    return (EReference)variantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVariant_Models()
  {
    return (EReference)variantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBlockstateProperty()
  {
    return blockstatePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBlockstateProperty_Name()
  {
    return (EAttribute)blockstatePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBlockstateProperty_Value()
  {
    return (EAttribute)blockstatePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultipartBlockstate()
  {
    return multipartBlockstateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMultipartBlockstate_Cases()
  {
    return (EReference)multipartBlockstateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCase_Condition()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCase_Models()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCaseCondition()
  {
    return caseConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBlockstatePropertyPredicate()
  {
    return blockstatePropertyPredicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBlockstatePropertyPredicate_Name()
  {
    return (EAttribute)blockstatePropertyPredicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCustomBlockstate()
  {
    return customBlockstateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCustomBlockstate_Json()
  {
    return (EReference)customBlockstateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModelList()
  {
    return modelListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModelList_Models()
  {
    return (EReference)modelListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_Location()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_WeightDefined()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_Weight()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_XDefined()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_X()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_YDefined()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_Y()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_UvlockDefined()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_Uvlock()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonValue()
  {
    return mcJsonValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonObject()
  {
    return mcJsonObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMCJsonObject_Entries()
  {
    return (EReference)mcJsonObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonEntry()
  {
    return mcJsonEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMCJsonEntry_Name()
  {
    return (EAttribute)mcJsonEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMCJsonEntry_Value()
  {
    return (EReference)mcJsonEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonArray()
  {
    return mcJsonArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMCJsonArray_Elements()
  {
    return (EReference)mcJsonArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonString()
  {
    return mcJsonStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMCJsonString_Value()
  {
    return (EAttribute)mcJsonStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonNumber()
  {
    return mcJsonNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonIntegral()
  {
    return mcJsonIntegralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMCJsonIntegral_Value()
  {
    return (EAttribute)mcJsonIntegralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonFloatingPoint()
  {
    return mcJsonFloatingPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMCJsonFloatingPoint_Value()
  {
    return (EAttribute)mcJsonFloatingPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonBoolean()
  {
    return mcJsonBooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMCJsonBoolean_Value()
  {
    return (EAttribute)mcJsonBooleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMCJsonNull()
  {
    return mcJsonNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrCaseCondition()
  {
    return orCaseConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrCaseCondition_Options()
  {
    return (EReference)orCaseConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBaseCaseCondition()
  {
    return baseCaseConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBaseCaseCondition_Properties()
  {
    return (EReference)baseCaseConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNormalBlockstatePropertyPredicate()
  {
    return normalBlockstatePropertyPredicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNormalBlockstatePropertyPredicate_Values()
  {
    return (EAttribute)normalBlockstatePropertyPredicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBooleanBlockstatePropertyPredicate()
  {
    return booleanBlockstatePropertyPredicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBooleanBlockstatePropertyPredicate_Inverted()
  {
    return (EAttribute)booleanBlockstatePropertyPredicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public McblockstateFactory getMcblockstateFactory()
  {
    return (McblockstateFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    blockstateEClass = createEClass(BLOCKSTATE);

    variantsBlockstateEClass = createEClass(VARIANTS_BLOCKSTATE);
    createEReference(variantsBlockstateEClass, VARIANTS_BLOCKSTATE__VARIANTS);

    variantEClass = createEClass(VARIANT);
    createEReference(variantEClass, VARIANT__PROPERTIES);
    createEReference(variantEClass, VARIANT__MODELS);

    blockstatePropertyEClass = createEClass(BLOCKSTATE_PROPERTY);
    createEAttribute(blockstatePropertyEClass, BLOCKSTATE_PROPERTY__NAME);
    createEAttribute(blockstatePropertyEClass, BLOCKSTATE_PROPERTY__VALUE);

    multipartBlockstateEClass = createEClass(MULTIPART_BLOCKSTATE);
    createEReference(multipartBlockstateEClass, MULTIPART_BLOCKSTATE__CASES);

    caseEClass = createEClass(CASE);
    createEReference(caseEClass, CASE__CONDITION);
    createEReference(caseEClass, CASE__MODELS);

    caseConditionEClass = createEClass(CASE_CONDITION);

    blockstatePropertyPredicateEClass = createEClass(BLOCKSTATE_PROPERTY_PREDICATE);
    createEAttribute(blockstatePropertyPredicateEClass, BLOCKSTATE_PROPERTY_PREDICATE__NAME);

    customBlockstateEClass = createEClass(CUSTOM_BLOCKSTATE);
    createEReference(customBlockstateEClass, CUSTOM_BLOCKSTATE__JSON);

    modelListEClass = createEClass(MODEL_LIST);
    createEReference(modelListEClass, MODEL_LIST__MODELS);

    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__LOCATION);
    createEAttribute(modelEClass, MODEL__WEIGHT_DEFINED);
    createEAttribute(modelEClass, MODEL__WEIGHT);
    createEAttribute(modelEClass, MODEL__XDEFINED);
    createEAttribute(modelEClass, MODEL__X);
    createEAttribute(modelEClass, MODEL__YDEFINED);
    createEAttribute(modelEClass, MODEL__Y);
    createEAttribute(modelEClass, MODEL__UVLOCK_DEFINED);
    createEAttribute(modelEClass, MODEL__UVLOCK);

    mcJsonValueEClass = createEClass(MC_JSON_VALUE);

    mcJsonObjectEClass = createEClass(MC_JSON_OBJECT);
    createEReference(mcJsonObjectEClass, MC_JSON_OBJECT__ENTRIES);

    mcJsonEntryEClass = createEClass(MC_JSON_ENTRY);
    createEAttribute(mcJsonEntryEClass, MC_JSON_ENTRY__NAME);
    createEReference(mcJsonEntryEClass, MC_JSON_ENTRY__VALUE);

    mcJsonArrayEClass = createEClass(MC_JSON_ARRAY);
    createEReference(mcJsonArrayEClass, MC_JSON_ARRAY__ELEMENTS);

    mcJsonStringEClass = createEClass(MC_JSON_STRING);
    createEAttribute(mcJsonStringEClass, MC_JSON_STRING__VALUE);

    mcJsonNumberEClass = createEClass(MC_JSON_NUMBER);

    mcJsonIntegralEClass = createEClass(MC_JSON_INTEGRAL);
    createEAttribute(mcJsonIntegralEClass, MC_JSON_INTEGRAL__VALUE);

    mcJsonFloatingPointEClass = createEClass(MC_JSON_FLOATING_POINT);
    createEAttribute(mcJsonFloatingPointEClass, MC_JSON_FLOATING_POINT__VALUE);

    mcJsonBooleanEClass = createEClass(MC_JSON_BOOLEAN);
    createEAttribute(mcJsonBooleanEClass, MC_JSON_BOOLEAN__VALUE);

    mcJsonNullEClass = createEClass(MC_JSON_NULL);

    orCaseConditionEClass = createEClass(OR_CASE_CONDITION);
    createEReference(orCaseConditionEClass, OR_CASE_CONDITION__OPTIONS);

    baseCaseConditionEClass = createEClass(BASE_CASE_CONDITION);
    createEReference(baseCaseConditionEClass, BASE_CASE_CONDITION__PROPERTIES);

    normalBlockstatePropertyPredicateEClass = createEClass(NORMAL_BLOCKSTATE_PROPERTY_PREDICATE);
    createEAttribute(normalBlockstatePropertyPredicateEClass, NORMAL_BLOCKSTATE_PROPERTY_PREDICATE__VALUES);

    booleanBlockstatePropertyPredicateEClass = createEClass(BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE);
    createEAttribute(booleanBlockstatePropertyPredicateEClass, BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE__INVERTED);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    variantsBlockstateEClass.getESuperTypes().add(this.getBlockstate());
    multipartBlockstateEClass.getESuperTypes().add(this.getBlockstate());
    customBlockstateEClass.getESuperTypes().add(this.getBlockstate());
    mcJsonObjectEClass.getESuperTypes().add(this.getMCJsonValue());
    mcJsonArrayEClass.getESuperTypes().add(this.getMCJsonValue());
    mcJsonStringEClass.getESuperTypes().add(this.getMCJsonValue());
    mcJsonNumberEClass.getESuperTypes().add(this.getMCJsonValue());
    mcJsonIntegralEClass.getESuperTypes().add(this.getMCJsonNumber());
    mcJsonFloatingPointEClass.getESuperTypes().add(this.getMCJsonNumber());
    mcJsonBooleanEClass.getESuperTypes().add(this.getMCJsonValue());
    mcJsonNullEClass.getESuperTypes().add(this.getMCJsonValue());
    orCaseConditionEClass.getESuperTypes().add(this.getCaseCondition());
    baseCaseConditionEClass.getESuperTypes().add(this.getCaseCondition());
    normalBlockstatePropertyPredicateEClass.getESuperTypes().add(this.getBlockstatePropertyPredicate());
    booleanBlockstatePropertyPredicateEClass.getESuperTypes().add(this.getBlockstatePropertyPredicate());

    // Initialize classes and features; add operations and parameters
    initEClass(blockstateEClass, Blockstate.class, "Blockstate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variantsBlockstateEClass, VariantsBlockstate.class, "VariantsBlockstate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariantsBlockstate_Variants(), this.getVariant(), null, "variants", null, 0, -1, VariantsBlockstate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariant_Properties(), this.getBlockstateProperty(), null, "properties", null, 0, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariant_Models(), this.getModelList(), null, "models", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockstatePropertyEClass, BlockstateProperty.class, "BlockstateProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlockstateProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, BlockstateProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlockstateProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, BlockstateProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multipartBlockstateEClass, MultipartBlockstate.class, "MultipartBlockstate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultipartBlockstate_Cases(), this.getCase(), null, "cases", null, 0, -1, MultipartBlockstate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_Condition(), this.getCaseCondition(), null, "condition", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_Models(), this.getModelList(), null, "models", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseConditionEClass, CaseCondition.class, "CaseCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockstatePropertyPredicateEClass, BlockstatePropertyPredicate.class, "BlockstatePropertyPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlockstatePropertyPredicate_Name(), ecorePackage.getEString(), "name", null, 0, 1, BlockstatePropertyPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customBlockstateEClass, CustomBlockstate.class, "CustomBlockstate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomBlockstate_Json(), this.getMCJsonObject(), null, "json", null, 0, 1, CustomBlockstate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelListEClass, ModelList.class, "ModelList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelList_Models(), this.getModel(), null, "models", null, 0, -1, ModelList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Location(), ecorePackage.getEString(), "location", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_WeightDefined(), ecorePackage.getEBoolean(), "weightDefined", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Weight(), ecorePackage.getELong(), "weight", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_XDefined(), ecorePackage.getEBoolean(), "xDefined", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_X(), ecorePackage.getELong(), "x", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_YDefined(), ecorePackage.getEBoolean(), "yDefined", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Y(), ecorePackage.getELong(), "y", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_UvlockDefined(), ecorePackage.getEBoolean(), "uvlockDefined", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Uvlock(), ecorePackage.getEBoolean(), "uvlock", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonValueEClass, MCJsonValue.class, "MCJsonValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mcJsonObjectEClass, MCJsonObject.class, "MCJsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCJsonObject_Entries(), this.getMCJsonEntry(), null, "entries", null, 0, -1, MCJsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonEntryEClass, MCJsonEntry.class, "MCJsonEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCJsonEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, MCJsonEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCJsonEntry_Value(), this.getMCJsonValue(), null, "value", null, 0, 1, MCJsonEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonArrayEClass, MCJsonArray.class, "MCJsonArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCJsonArray_Elements(), this.getMCJsonValue(), null, "elements", null, 0, -1, MCJsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonStringEClass, MCJsonString.class, "MCJsonString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCJsonString_Value(), ecorePackage.getEString(), "value", null, 0, 1, MCJsonString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonNumberEClass, MCJsonNumber.class, "MCJsonNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mcJsonIntegralEClass, MCJsonIntegral.class, "MCJsonIntegral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCJsonIntegral_Value(), ecorePackage.getELong(), "value", null, 0, 1, MCJsonIntegral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonFloatingPointEClass, MCJsonFloatingPoint.class, "MCJsonFloatingPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCJsonFloatingPoint_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, MCJsonFloatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonBooleanEClass, MCJsonBoolean.class, "MCJsonBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCJsonBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, MCJsonBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcJsonNullEClass, MCJsonNull.class, "MCJsonNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orCaseConditionEClass, OrCaseCondition.class, "OrCaseCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrCaseCondition_Options(), this.getCaseCondition(), null, "options", null, 0, -1, OrCaseCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseCaseConditionEClass, BaseCaseCondition.class, "BaseCaseCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBaseCaseCondition_Properties(), this.getBlockstatePropertyPredicate(), null, "properties", null, 0, -1, BaseCaseCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalBlockstatePropertyPredicateEClass, NormalBlockstatePropertyPredicate.class, "NormalBlockstatePropertyPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNormalBlockstatePropertyPredicate_Values(), ecorePackage.getEString(), "values", null, 0, -1, NormalBlockstatePropertyPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanBlockstatePropertyPredicateEClass, BooleanBlockstatePropertyPredicate.class, "BooleanBlockstatePropertyPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanBlockstatePropertyPredicate_Inverted(), ecorePackage.getEBoolean(), "inverted", null, 0, 1, BooleanBlockstatePropertyPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //McblockstatePackageImpl
