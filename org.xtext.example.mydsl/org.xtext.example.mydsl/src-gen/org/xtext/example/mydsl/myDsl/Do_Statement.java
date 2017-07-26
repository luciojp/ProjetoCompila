/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Do_Statement#getDoStatement <em>Do Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Do_Statement#getLparent <em>Lparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Do_Statement#getRparent <em>Rparent</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDo_Statement()
 * @model
 * @generated
 */
public interface Do_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Statement</em>' containment reference.
   * @see #setDoStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDo_Statement_DoStatement()
   * @model containment="true"
   * @generated
   */
  Statement getDoStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getDoStatement <em>Do Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Statement</em>' containment reference.
   * @see #getDoStatement()
   * @generated
   */
  void setDoStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lparent</em>' attribute.
   * @see #setLparent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDo_Statement_Lparent()
   * @model
   * @generated
   */
  String getLparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getLparent <em>Lparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lparent</em>' attribute.
   * @see #getLparent()
   * @generated
   */
  void setLparent(String value);

  /**
   * Returns the value of the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rparent</em>' attribute.
   * @see #setRparent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDo_Statement_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

} // Do_Statement
