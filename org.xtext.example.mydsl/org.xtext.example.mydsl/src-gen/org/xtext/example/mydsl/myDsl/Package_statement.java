/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Package_statement#getPacName <em>Pac Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPackage_statement()
 * @model
 * @generated
 */
public interface Package_statement extends EObject
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPackage_statement_PacName()
   * @model
   * @generated
   */
  String getPacName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Package_statement#getPacName <em>Pac Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pac Name</em>' attribute.
   * @see #getPacName()
   * @generated
   */
  void setPacName(String value);

} // Package_statement
