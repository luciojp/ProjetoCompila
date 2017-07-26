/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getNameVariable <em>Name Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getLenVector <em>Len Vector</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getVari <em>Vari</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declarator()
 * @model
 * @generated
 */
public interface Variable_declarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Variable</em>' attribute.
   * @see #setNameVariable(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declarator_NameVariable()
   * @model
   * @generated
   */
  String getNameVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getNameVariable <em>Name Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Variable</em>' attribute.
   * @see #getNameVariable()
   * @generated
   */
  void setNameVariable(String value);

  /**
   * Returns the value of the '<em><b>Len Vector</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Len Vector</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Len Vector</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declarator_LenVector()
   * @model unique="false"
   * @generated
   */
  EList<String> getLenVector();

  /**
   * Returns the value of the '<em><b>Vari</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' containment reference.
   * @see #setVari(Variable_initializer)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declarator_Vari()
   * @model containment="true"
   * @generated
   */
  Variable_initializer getVari();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getVari <em>Vari</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' containment reference.
   * @see #getVari()
   * @generated
   */
  void setVari(Variable_initializer value);

} // Variable_declarator
