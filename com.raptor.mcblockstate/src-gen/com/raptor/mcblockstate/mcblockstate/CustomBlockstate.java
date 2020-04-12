/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.mcblockstate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Blockstate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.CustomBlockstate#getJson <em>Json</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcblockstate.mcblockstate.McblockstatePackage#getCustomBlockstate()
 * @model
 * @generated
 */
public interface CustomBlockstate extends Blockstate
{
  /**
   * Returns the value of the '<em><b>Json</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json</em>' containment reference.
   * @see #setJson(MCJsonObject)
   * @see com.raptor.mcblockstate.mcblockstate.McblockstatePackage#getCustomBlockstate_Json()
   * @model containment="true"
   * @generated
   */
  MCJsonObject getJson();

  /**
   * Sets the value of the '{@link com.raptor.mcblockstate.mcblockstate.CustomBlockstate#getJson <em>Json</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json</em>' containment reference.
   * @see #getJson()
   * @generated
   */
  void setJson(MCJsonObject value);

} // CustomBlockstate
