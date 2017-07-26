/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Array_initializer#getVariableinitializer <em>Variableinitializer</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArray_initializer()
 * @model
 * @generated
 */
public interface Array_initializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Variableinitializer</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Variable_initializer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variableinitializer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variableinitializer</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArray_initializer_Variableinitializer()
   * @model containment="true"
   * @generated
   */
  EList<Variable_initializer> getVariableinitializer();

} // Array_initializer
