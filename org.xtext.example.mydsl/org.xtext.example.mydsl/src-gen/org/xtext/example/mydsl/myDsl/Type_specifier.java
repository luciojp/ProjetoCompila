/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type_specifier#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type_specifier#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_specifier()
 * @model
 * @generated
 */
public interface Type_specifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Type</em>' attribute.
   * @see #setPrimitiveType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_specifier_PrimitiveType()
   * @model
   * @generated
   */
  String getPrimitiveType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type_specifier#getPrimitiveType <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Type</em>' attribute.
   * @see #getPrimitiveType()
   * @generated
   */
  void setPrimitiveType(String value);

  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_specifier_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type_specifier#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

} // Type_specifier
