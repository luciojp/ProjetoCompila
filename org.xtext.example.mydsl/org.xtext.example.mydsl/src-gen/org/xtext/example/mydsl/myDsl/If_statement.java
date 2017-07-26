/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If_statement#getLparen <em>Lparen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If_statement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If_statement#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If_statement#getIdStatement <em>Id Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If_statement#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_statement()
 * @model
 * @generated
 */
public interface If_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Lparen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lparen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lparen</em>' attribute.
   * @see #setLparen(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_statement_Lparen()
   * @model
   * @generated
   */
  String getLparen();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If_statement#getLparen <em>Lparen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lparen</em>' attribute.
   * @see #getLparen()
   * @generated
   */
  void setLparen(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_statement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If_statement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_statement_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If_statement#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>Id Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Statement</em>' containment reference.
   * @see #setIdStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_statement_IdStatement()
   * @model containment="true"
   * @generated
   */
  Statement getIdStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If_statement#getIdStatement <em>Id Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Statement</em>' containment reference.
   * @see #getIdStatement()
   * @generated
   */
  void setIdStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Statement</em>' containment reference.
   * @see #setElseStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_statement_ElseStatement()
   * @model containment="true"
   * @generated
   */
  Statement getElseStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If_statement#getElseStatement <em>Else Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Statement</em>' containment reference.
   * @see #getElseStatement()
   * @generated
   */
  void setElseStatement(Statement value);

} // If_statement
