/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Parameter#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Name</em>' attribute.
   * @see #setParameterName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameter_ParameterName()
   * @model
   * @generated
   */
  String getParameterName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Parameter#getParameterName <em>Parameter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Name</em>' attribute.
   * @see #getParameterName()
   * @generated
   */
  void setParameterName(String value);

} // Parameter
