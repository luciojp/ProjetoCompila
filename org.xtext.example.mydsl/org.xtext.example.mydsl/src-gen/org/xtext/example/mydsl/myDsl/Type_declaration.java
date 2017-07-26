/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type_declaration#getComment <em>Comment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type_declaration#getClassDec <em>Class Dec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type_declaration#getInterfaceDec <em>Interface Dec</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_declaration()
 * @model
 * @generated
 */
public interface Type_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_declaration_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Class Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Dec</em>' containment reference.
   * @see #setClassDec(Class_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_declaration_ClassDec()
   * @model containment="true"
   * @generated
   */
  Class_declaration getClassDec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getClassDec <em>Class Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Dec</em>' containment reference.
   * @see #getClassDec()
   * @generated
   */
  void setClassDec(Class_declaration value);

  /**
   * Returns the value of the '<em><b>Interface Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Dec</em>' containment reference.
   * @see #setInterfaceDec(Interface_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_declaration_InterfaceDec()
   * @model containment="true"
   * @generated
   */
  Interface_declaration getInterfaceDec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getInterfaceDec <em>Interface Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Dec</em>' containment reference.
   * @see #getInterfaceDec()
   * @generated
   */
  void setInterfaceDec(Interface_declaration value);

} // Type_declaration
