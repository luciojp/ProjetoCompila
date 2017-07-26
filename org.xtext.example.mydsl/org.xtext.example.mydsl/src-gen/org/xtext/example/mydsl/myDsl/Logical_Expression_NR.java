/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Expression NR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExclamation <em>Exclamation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getTrue <em>True</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getFalse <em>False</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogical_Expression_NR()
 * @model
 * @generated
 */
public interface Logical_Expression_NR extends EObject
{
  /**
   * Returns the value of the '<em><b>Exclamation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclamation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclamation</em>' attribute.
   * @see #setExclamation(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogical_Expression_NR_Exclamation()
   * @model
   * @generated
   */
  String getExclamation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExclamation <em>Exclamation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclamation</em>' attribute.
   * @see #getExclamation()
   * @generated
   */
  void setExclamation(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogical_Expression_NR_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogical_Expression_NR_True()
   * @model
   * @generated
   */
  String getTrue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #getTrue()
   * @generated
   */
  void setTrue(String value);

  /**
   * Returns the value of the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' attribute.
   * @see #setFalse(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogical_Expression_NR_False()
   * @model
   * @generated
   */
  String getFalse();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getFalse <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' attribute.
   * @see #getFalse()
   * @generated
   */
  void setFalse(String value);

} // Logical_Expression_NR
