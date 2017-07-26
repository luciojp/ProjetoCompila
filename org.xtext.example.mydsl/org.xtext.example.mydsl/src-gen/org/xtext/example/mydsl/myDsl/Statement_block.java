/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement_block#getRCurly <em>RCurly</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement_block#getStatments <em>Statments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement_block#getLCurly <em>LCurly</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_block()
 * @model
 * @generated
 */
public interface Statement_block extends EObject
{
  /**
   * Returns the value of the '<em><b>RCurly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RCurly</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RCurly</em>' attribute.
   * @see #setRCurly(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_block_RCurly()
   * @model
   * @generated
   */
  String getRCurly();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement_block#getRCurly <em>RCurly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RCurly</em>' attribute.
   * @see #getRCurly()
   * @generated
   */
  void setRCurly(String value);

  /**
   * Returns the value of the '<em><b>Statments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statments</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_block_Statments()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatments();

  /**
   * Returns the value of the '<em><b>LCurly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LCurly</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LCurly</em>' attribute.
   * @see #setLCurly(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_block_LCurly()
   * @model
   * @generated
   */
  String getLCurly();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement_block#getLCurly <em>LCurly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LCurly</em>' attribute.
   * @see #getLCurly()
   * @generated
   */
  void setLCurly(String value);

} // Statement_block
