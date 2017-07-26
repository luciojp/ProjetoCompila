/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getModifiersConstructor <em>Modifiers Constructor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getNameConstructor <em>Name Constructor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getParameterListConstructor <em>Parameter List Constructor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getStatementConstructor <em>Statement Constructor</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstructor_declaration()
 * @model
 * @generated
 */
public interface Constructor_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers Constructor</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers Constructor</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers Constructor</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstructor_declaration_ModifiersConstructor()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiersConstructor();

  /**
   * Returns the value of the '<em><b>Name Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Constructor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Constructor</em>' attribute.
   * @see #setNameConstructor(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstructor_declaration_NameConstructor()
   * @model
   * @generated
   */
  String getNameConstructor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getNameConstructor <em>Name Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Constructor</em>' attribute.
   * @see #getNameConstructor()
   * @generated
   */
  void setNameConstructor(String value);

  /**
   * Returns the value of the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LParen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LParen</em>' attribute.
   * @see #setLParen(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstructor_declaration_LParen()
   * @model
   * @generated
   */
  String getLParen();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getLParen <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LParen</em>' attribute.
   * @see #getLParen()
   * @generated
   */
  void setLParen(String value);

  /**
   * Returns the value of the '<em><b>Parameter List Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List Constructor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List Constructor</em>' containment reference.
   * @see #setParameterListConstructor(Parameter_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstructor_declaration_ParameterListConstructor()
   * @model containment="true"
   * @generated
   */
  Parameter_list getParameterListConstructor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getParameterListConstructor <em>Parameter List Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List Constructor</em>' containment reference.
   * @see #getParameterListConstructor()
   * @generated
   */
  void setParameterListConstructor(Parameter_list value);

  /**
   * Returns the value of the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rparent</em>' attribute.
   * @see #setRparent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstructor_declaration_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>Statement Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Constructor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Constructor</em>' containment reference.
   * @see #setStatementConstructor(Statement_block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstructor_declaration_StatementConstructor()
   * @model containment="true"
   * @generated
   */
  Statement_block getStatementConstructor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getStatementConstructor <em>Statement Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Constructor</em>' containment reference.
   * @see #getStatementConstructor()
   * @generated
   */
  void setStatementConstructor(Statement_block value);

} // Constructor_declaration
