/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Try_statement#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Try_statement#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Try_statement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Try_statement#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Try_statement#getCatchStatement <em>Catch Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Try_statement#getFinallyStatement <em>Finally Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTry_statement()
 * @model
 * @generated
 */
public interface Try_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try Statement</em>' containment reference.
   * @see #setTryStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTry_statement_TryStatement()
   * @model containment="true"
   * @generated
   */
  Statement getTryStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Try_statement#getTryStatement <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try Statement</em>' containment reference.
   * @see #getTryStatement()
   * @generated
   */
  void setTryStatement(Statement value);

  /**
   * Returns the value of the '<em><b>LParen</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LParen</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LParen</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTry_statement_LParen()
   * @model unique="false"
   * @generated
   */
  EList<String> getLParen();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTry_statement_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Rparent</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rparent</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rparent</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTry_statement_Rparent()
   * @model unique="false"
   * @generated
   */
  EList<String> getRparent();

  /**
   * Returns the value of the '<em><b>Catch Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch Statement</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTry_statement_CatchStatement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getCatchStatement();

  /**
   * Returns the value of the '<em><b>Finally Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally Statement</em>' containment reference.
   * @see #setFinallyStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTry_statement_FinallyStatement()
   * @model containment="true"
   * @generated
   */
  Statement getFinallyStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Try_statement#getFinallyStatement <em>Finally Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally Statement</em>' containment reference.
   * @see #getFinallyStatement()
   * @generated
   */
  void setFinallyStatement(Statement value);

} // Try_statement
