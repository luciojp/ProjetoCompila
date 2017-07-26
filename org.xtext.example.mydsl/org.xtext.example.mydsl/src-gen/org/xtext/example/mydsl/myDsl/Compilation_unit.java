/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getTypeDeclarations <em>Type Declarations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompilation_unit()
 * @model
 * @generated
 */
public interface Compilation_unit extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Package_statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompilation_unit_Name()
   * @model containment="true"
   * @generated
   */
  Package_statement getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Package_statement value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Import_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompilation_unit_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import_statement> getImports();

  /**
   * Returns the value of the '<em><b>Type Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Type_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Declarations</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompilation_unit_TypeDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<Type_declaration> getTypeDeclarations();

} // Compilation_unit
