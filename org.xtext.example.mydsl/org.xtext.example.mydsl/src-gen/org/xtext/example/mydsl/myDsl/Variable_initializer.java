/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_initializer#getArray_init <em>Array init</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Variable_initializer#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_initializer()
 * @model
 * @generated
 */
public interface Variable_initializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Array init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array init</em>' containment reference.
   * @see #setArray_init(Array_initializer)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_initializer_Array_init()
   * @model containment="true"
   * @generated
   */
  Array_initializer getArray_init();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Variable_initializer#getArray_init <em>Array init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array init</em>' containment reference.
   * @see #getArray_init()
   * @generated
   */
  void setArray_init(Array_initializer value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariable_initializer_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Variable_initializer#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Variable_initializer
