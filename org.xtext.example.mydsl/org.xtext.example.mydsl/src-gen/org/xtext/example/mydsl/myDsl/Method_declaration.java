/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getModifiersMethod <em>Modifiers Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getTypeMethod <em>Type Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getNameMethod <em>Name Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getParameterListMethod <em>Parameter List Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getStatementMethod <em>Statement Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Method_declaration#getDebug <em>Debug</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration()
 * @model
 * @generated
 */
public interface Method_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers Method</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers Method</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers Method</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_ModifiersMethod()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiersMethod();

  /**
   * Returns the value of the '<em><b>Type Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Method</em>' containment reference.
   * @see #setTypeMethod(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_TypeMethod()
   * @model containment="true"
   * @generated
   */
  Type getTypeMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getTypeMethod <em>Type Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Method</em>' containment reference.
   * @see #getTypeMethod()
   * @generated
   */
  void setTypeMethod(Type value);

  /**
   * Returns the value of the '<em><b>Name Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Method</em>' attribute.
   * @see #setNameMethod(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_NameMethod()
   * @model
   * @generated
   */
  String getNameMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getNameMethod <em>Name Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Method</em>' attribute.
   * @see #getNameMethod()
   * @generated
   */
  void setNameMethod(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_LParen()
   * @model
   * @generated
   */
  String getLParen();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getLParen <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LParen</em>' attribute.
   * @see #getLParen()
   * @generated
   */
  void setLParen(String value);

  /**
   * Returns the value of the '<em><b>Parameter List Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List Method</em>' containment reference.
   * @see #setParameterListMethod(Parameter_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_ParameterListMethod()
   * @model containment="true"
   * @generated
   */
  Parameter_list getParameterListMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getParameterListMethod <em>Parameter List Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List Method</em>' containment reference.
   * @see #getParameterListMethod()
   * @generated
   */
  void setParameterListMethod(Parameter_list value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>Statement Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Method</em>' containment reference.
   * @see #setStatementMethod(Statement_block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_StatementMethod()
   * @model containment="true"
   * @generated
   */
  Statement_block getStatementMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getStatementMethod <em>Statement Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Method</em>' containment reference.
   * @see #getStatementMethod()
   * @generated
   */
  void setStatementMethod(Statement_block value);

  /**
   * Returns the value of the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' attribute.
   * @see #setDebug(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethod_declaration_Debug()
   * @model
   * @generated
   */
  String getDebug();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' attribute.
   * @see #getDebug()
   * @generated
   */
  void setDebug(String value);

} // Method_declaration
