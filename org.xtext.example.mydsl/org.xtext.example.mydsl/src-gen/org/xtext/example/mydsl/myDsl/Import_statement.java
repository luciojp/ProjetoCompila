/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Import_statement#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Import_statement#getPacName <em>Pac Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImport_statement()
 * @model
 * @generated
 */
public interface Import_statement extends EObject
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImport_statement_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Import_statement#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Pac Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pac Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pac Name</em>' attribute.
   * @see #setPacName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImport_statement_PacName()
   * @model
   * @generated
   */
  String getPacName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Import_statement#getPacName <em>Pac Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pac Name</em>' attribute.
   * @see #getPacName()
   * @generated
   */
  void setPacName(String value);

} // Import_statement
