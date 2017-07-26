/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getModifiersVariable <em>Modifiers Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getNameVariable <em>Name Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declaration()
 * @model
 * @generated
 */
public interface Variable_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers Variable</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers Variable</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers Variable</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declaration_ModifiersVariable()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiersVariable();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Variable</em>' containment reference.
   * @see #setNameVariable(Variable_declarator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declaration_NameVariable()
   * @model containment="true"
   * @generated
   */
  Variable_declarator getNameVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getNameVariable <em>Name Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Variable</em>' containment reference.
   * @see #getNameVariable()
   * @generated
   */
  void setNameVariable(Variable_declarator value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Variable_declarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_declaration_Names()
   * @model containment="true"
   * @generated
   */
  EList<Variable_declarator> getNames();

} // Variable_declaration
