/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy State Loot Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.CopyStateLootFunction#getBlock <em>Block</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.CopyStateLootFunction#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getCopyStateLootFunction()
 * @model
 * @generated
 */
public interface CopyStateLootFunction extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' attribute.
   * @see #setBlock(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getCopyStateLootFunction_Block()
   * @model
   * @generated
   */
  String getBlock();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.CopyStateLootFunction#getBlock <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' attribute.
   * @see #getBlock()
   * @generated
   */
  void setBlock(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' attribute list.
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getCopyStateLootFunction_Properties()
   * @model unique="false"
   * @generated
   */
  EList<String> getProperties();

} // CopyStateLootFunction
