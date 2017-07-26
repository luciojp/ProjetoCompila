/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_declaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassHerdada <em>Class Herdada</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_declaration#getInterfaceImplementada <em>Interface Implementada</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_declaration#getInterfacesImplementadas <em>Interfaces Implementadas</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_declaration#getFieldsDeclaration <em>Fields Declaration</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_declaration()
 * @model
 * @generated
 */
public interface Class_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_declaration_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_declaration_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Class Herdada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Herdada</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Herdada</em>' attribute.
   * @see #setClassHerdada(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_declaration_ClassHerdada()
   * @model
   * @generated
   */
  String getClassHerdada();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassHerdada <em>Class Herdada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Herdada</em>' attribute.
   * @see #getClassHerdada()
   * @generated
   */
  void setClassHerdada(String value);

  /**
   * Returns the value of the '<em><b>Interface Implementada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Implementada</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Implementada</em>' attribute.
   * @see #setInterfaceImplementada(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_declaration_InterfaceImplementada()
   * @model
   * @generated
   */
  String getInterfaceImplementada();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getInterfaceImplementada <em>Interface Implementada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Implementada</em>' attribute.
   * @see #getInterfaceImplementada()
   * @generated
   */
  void setInterfaceImplementada(String value);

  /**
   * Returns the value of the '<em><b>Interfaces Implementadas</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces Implementadas</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces Implementadas</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_declaration_InterfacesImplementadas()
   * @model unique="false"
   * @generated
   */
  EList<String> getInterfacesImplementadas();

  /**
   * Returns the value of the '<em><b>Fields Declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Field_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields Declaration</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_declaration_FieldsDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<Field_declaration> getFieldsDeclaration();

} // Class_declaration
