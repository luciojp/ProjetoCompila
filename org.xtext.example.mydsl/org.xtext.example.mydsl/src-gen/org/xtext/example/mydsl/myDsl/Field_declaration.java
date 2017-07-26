/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Field_declaration#getComment <em>Comment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Field_declaration#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Field_declaration#getContructorName <em>Contructor Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Field_declaration#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Field_declaration#getStaticinitializer <em>Staticinitializer</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getField_declaration()
 * @model
 * @generated
 */
public interface Field_declaration extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getField_declaration_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declaration</em>' containment reference.
   * @see #setVariableDeclaration(Variable_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getField_declaration_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  Variable_declaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Declaration</em>' containment reference.
   * @see #getVariableDeclaration()
   * @generated
   */
  void setVariableDeclaration(Variable_declaration value);

  /**
   * Returns the value of the '<em><b>Contructor Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contructor Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contructor Name</em>' containment reference.
   * @see #setContructorName(Constructor_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getField_declaration_ContructorName()
   * @model containment="true"
   * @generated
   */
  Constructor_declaration getContructorName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getContructorName <em>Contructor Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contructor Name</em>' containment reference.
   * @see #getContructorName()
   * @generated
   */
  void setContructorName(Constructor_declaration value);

  /**
   * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' containment reference.
   * @see #setMethodName(Method_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getField_declaration_MethodName()
   * @model containment="true"
   * @generated
   */
  Method_declaration getMethodName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getMethodName <em>Method Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' containment reference.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(Method_declaration value);

  /**
   * Returns the value of the '<em><b>Staticinitializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Staticinitializer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Staticinitializer</em>' containment reference.
   * @see #setStaticinitializer(Static_initializer)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getField_declaration_Staticinitializer()
   * @model containment="true"
   * @generated
   */
  Static_initializer getStaticinitializer();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getStaticinitializer <em>Staticinitializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Staticinitializer</em>' containment reference.
   * @see #getStaticinitializer()
   * @generated
   */
  void setStaticinitializer(Static_initializer value);

} // Field_declaration
