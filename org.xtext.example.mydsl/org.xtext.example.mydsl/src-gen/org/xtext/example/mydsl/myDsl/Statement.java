/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getExpressionStatement <em>Expression Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getG <em>G</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getDoStatement <em>Do Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getWhileStatement <em>While Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getForStatement <em>For Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getSwitchStatement <em>Switch Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getSyncStatement <em>Sync Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getRet <em>Ret</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getStatementBlock <em>Statement Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getNameStatement <em>Name Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  Variable_declaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Declaration</em>' containment reference.
   * @see #getVariableDeclaration()
   * @generated
   */
  void setVariableDeclaration(Variable_declaration value);

  /**
   * Returns the value of the '<em><b>Expression Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Statement</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_ExpressionStatement()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressionStatement();

  /**
   * Returns the value of the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>G</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>G</em>' attribute.
   * @see #setG(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_G()
   * @model
   * @generated
   */
  String getG();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getG <em>G</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>G</em>' attribute.
   * @see #getG()
   * @generated
   */
  void setG(String value);

  /**
   * Returns the value of the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Statement</em>' containment reference.
   * @see #setIfStatement(If_statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_IfStatement()
   * @model containment="true"
   * @generated
   */
  If_statement getIfStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getIfStatement <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Statement</em>' containment reference.
   * @see #getIfStatement()
   * @generated
   */
  void setIfStatement(If_statement value);

  /**
   * Returns the value of the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Statement</em>' containment reference.
   * @see #setDoStatement(Do_Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_DoStatement()
   * @model containment="true"
   * @generated
   */
  Do_Statement getDoStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getDoStatement <em>Do Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Statement</em>' containment reference.
   * @see #getDoStatement()
   * @generated
   */
  void setDoStatement(Do_Statement value);

  /**
   * Returns the value of the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Statement</em>' containment reference.
   * @see #setWhileStatement(While_Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_WhileStatement()
   * @model containment="true"
   * @generated
   */
  While_Statement getWhileStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getWhileStatement <em>While Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Statement</em>' containment reference.
   * @see #getWhileStatement()
   * @generated
   */
  void setWhileStatement(While_Statement value);

  /**
   * Returns the value of the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Statement</em>' containment reference.
   * @see #setForStatement(For_Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_ForStatement()
   * @model containment="true"
   * @generated
   */
  For_Statement getForStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getForStatement <em>For Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Statement</em>' containment reference.
   * @see #getForStatement()
   * @generated
   */
  void setForStatement(For_Statement value);

  /**
   * Returns the value of the '<em><b>Switch Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Statement</em>' containment reference.
   * @see #setSwitchStatement(Switch_statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_SwitchStatement()
   * @model containment="true"
   * @generated
   */
  Switch_statement getSwitchStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getSwitchStatement <em>Switch Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Statement</em>' containment reference.
   * @see #getSwitchStatement()
   * @generated
   */
  void setSwitchStatement(Switch_statement value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>Sync Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sync Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync Statement</em>' containment reference.
   * @see #setSyncStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_SyncStatement()
   * @model containment="true"
   * @generated
   */
  Statement getSyncStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getSyncStatement <em>Sync Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sync Statement</em>' containment reference.
   * @see #getSyncStatement()
   * @generated
   */
  void setSyncStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Ret</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ret</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret</em>' attribute.
   * @see #setRet(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Ret()
   * @model
   * @generated
   */
  String getRet();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getRet <em>Ret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret</em>' attribute.
   * @see #getRet()
   * @generated
   */
  void setRet(String value);

  /**
   * Returns the value of the '<em><b>Statement Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Block</em>' containment reference.
   * @see #setStatementBlock(Statement_block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_StatementBlock()
   * @model containment="true"
   * @generated
   */
  Statement_block getStatementBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getStatementBlock <em>Statement Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Block</em>' containment reference.
   * @see #getStatementBlock()
   * @generated
   */
  void setStatementBlock(Statement_block value);

  /**
   * Returns the value of the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try Statement</em>' containment reference.
   * @see #setTryStatement(Try_statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_TryStatement()
   * @model containment="true"
   * @generated
   */
  Try_statement getTryStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getTryStatement <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try Statement</em>' containment reference.
   * @see #getTryStatement()
   * @generated
   */
  void setTryStatement(Try_statement value);

  /**
   * Returns the value of the '<em><b>Name Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Statement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Statement</em>' attribute.
   * @see #setNameStatement(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_NameStatement()
   * @model
   * @generated
   */
  String getNameStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getNameStatement <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Statement</em>' attribute.
   * @see #getNameStatement()
   * @generated
   */
  void setNameStatement(String value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Statement
