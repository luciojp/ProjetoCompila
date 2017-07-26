/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Do_Statement;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.For_Statement;
import org.xtext.example.mydsl.myDsl.If_statement;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Statement_block;
import org.xtext.example.mydsl.myDsl.Switch_statement;
import org.xtext.example.mydsl.myDsl.Try_statement;
import org.xtext.example.mydsl.myDsl.Variable_declaration;
import org.xtext.example.mydsl.myDsl.While_Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getExpressionStatement <em>Expression Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getG <em>G</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getDoStatement <em>Do Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getWhileStatement <em>While Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getForStatement <em>For Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getSwitchStatement <em>Switch Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getSyncStatement <em>Sync Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getRet <em>Ret</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getStatementBlock <em>Statement Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getNameStatement <em>Name Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The cached value of the '{@link #getVariableDeclaration() <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclaration()
   * @generated
   * @ordered
   */
  protected Variable_declaration variableDeclaration;

  /**
   * The cached value of the '{@link #getExpressionStatement() <em>Expression Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionStatement()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressionStatement;

  /**
   * The default value of the '{@link #getG() <em>G</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected static final String G_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getG() <em>G</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected String g = G_EDEFAULT;

  /**
   * The cached value of the '{@link #getIfStatement() <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStatement()
   * @generated
   * @ordered
   */
  protected If_statement ifStatement;

  /**
   * The cached value of the '{@link #getDoStatement() <em>Do Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoStatement()
   * @generated
   * @ordered
   */
  protected Do_Statement doStatement;

  /**
   * The cached value of the '{@link #getWhileStatement() <em>While Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileStatement()
   * @generated
   * @ordered
   */
  protected While_Statement whileStatement;

  /**
   * The cached value of the '{@link #getForStatement() <em>For Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForStatement()
   * @generated
   * @ordered
   */
  protected For_Statement forStatement;

  /**
   * The cached value of the '{@link #getSwitchStatement() <em>Switch Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchStatement()
   * @generated
   * @ordered
   */
  protected Switch_statement switchStatement;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The default value of the '{@link #getRparent() <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRparent()
   * @generated
   * @ordered
   */
  protected static final String RPARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRparent() <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRparent()
   * @generated
   * @ordered
   */
  protected String rparent = RPARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSyncStatement() <em>Sync Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyncStatement()
   * @generated
   * @ordered
   */
  protected Statement syncStatement;

  /**
   * The default value of the '{@link #getRet() <em>Ret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRet()
   * @generated
   * @ordered
   */
  protected static final String RET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRet() <em>Ret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRet()
   * @generated
   * @ordered
   */
  protected String ret = RET_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatementBlock() <em>Statement Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementBlock()
   * @generated
   * @ordered
   */
  protected Statement_block statementBlock;

  /**
   * The cached value of the '{@link #getTryStatement() <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTryStatement()
   * @generated
   * @ordered
   */
  protected Try_statement tryStatement;

  /**
   * The default value of the '{@link #getNameStatement() <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStatement()
   * @generated
   * @ordered
   */
  protected static final String NAME_STATEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameStatement() <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStatement()
   * @generated
   * @ordered
   */
  protected String nameStatement = NAME_STATEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declaration getVariableDeclaration()
  {
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDeclaration(Variable_declaration newVariableDeclaration, NotificationChain msgs)
  {
    Variable_declaration oldVariableDeclaration = variableDeclaration;
    variableDeclaration = newVariableDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__VARIABLE_DECLARATION, oldVariableDeclaration, newVariableDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDeclaration(Variable_declaration newVariableDeclaration)
  {
    if (newVariableDeclaration != variableDeclaration)
    {
      NotificationChain msgs = null;
      if (variableDeclaration != null)
        msgs = ((InternalEObject)variableDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__VARIABLE_DECLARATION, null, msgs);
      if (newVariableDeclaration != null)
        msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__VARIABLE_DECLARATION, null, msgs);
      msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressionStatement()
  {
    if (expressionStatement == null)
    {
      expressionStatement = new EObjectContainmentEList<Expression>(Expression.class, this, MyDslPackage.STATEMENT__EXPRESSION_STATEMENT);
    }
    return expressionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getG()
  {
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setG(String newG)
  {
    String oldG = g;
    g = newG;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__G, oldG, g));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If_statement getIfStatement()
  {
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStatement(If_statement newIfStatement, NotificationChain msgs)
  {
    If_statement oldIfStatement = ifStatement;
    ifStatement = newIfStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__IF_STATEMENT, oldIfStatement, newIfStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStatement(If_statement newIfStatement)
  {
    if (newIfStatement != ifStatement)
    {
      NotificationChain msgs = null;
      if (ifStatement != null)
        msgs = ((InternalEObject)ifStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__IF_STATEMENT, null, msgs);
      if (newIfStatement != null)
        msgs = ((InternalEObject)newIfStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__IF_STATEMENT, null, msgs);
      msgs = basicSetIfStatement(newIfStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__IF_STATEMENT, newIfStatement, newIfStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do_Statement getDoStatement()
  {
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoStatement(Do_Statement newDoStatement, NotificationChain msgs)
  {
    Do_Statement oldDoStatement = doStatement;
    doStatement = newDoStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__DO_STATEMENT, oldDoStatement, newDoStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoStatement(Do_Statement newDoStatement)
  {
    if (newDoStatement != doStatement)
    {
      NotificationChain msgs = null;
      if (doStatement != null)
        msgs = ((InternalEObject)doStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__DO_STATEMENT, null, msgs);
      if (newDoStatement != null)
        msgs = ((InternalEObject)newDoStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__DO_STATEMENT, null, msgs);
      msgs = basicSetDoStatement(newDoStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__DO_STATEMENT, newDoStatement, newDoStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While_Statement getWhileStatement()
  {
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileStatement(While_Statement newWhileStatement, NotificationChain msgs)
  {
    While_Statement oldWhileStatement = whileStatement;
    whileStatement = newWhileStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__WHILE_STATEMENT, oldWhileStatement, newWhileStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileStatement(While_Statement newWhileStatement)
  {
    if (newWhileStatement != whileStatement)
    {
      NotificationChain msgs = null;
      if (whileStatement != null)
        msgs = ((InternalEObject)whileStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      if (newWhileStatement != null)
        msgs = ((InternalEObject)newWhileStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      msgs = basicSetWhileStatement(newWhileStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__WHILE_STATEMENT, newWhileStatement, newWhileStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_Statement getForStatement()
  {
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForStatement(For_Statement newForStatement, NotificationChain msgs)
  {
    For_Statement oldForStatement = forStatement;
    forStatement = newForStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__FOR_STATEMENT, oldForStatement, newForStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForStatement(For_Statement newForStatement)
  {
    if (newForStatement != forStatement)
    {
      NotificationChain msgs = null;
      if (forStatement != null)
        msgs = ((InternalEObject)forStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      if (newForStatement != null)
        msgs = ((InternalEObject)newForStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      msgs = basicSetForStatement(newForStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__FOR_STATEMENT, newForStatement, newForStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch_statement getSwitchStatement()
  {
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitchStatement(Switch_statement newSwitchStatement, NotificationChain msgs)
  {
    Switch_statement oldSwitchStatement = switchStatement;
    switchStatement = newSwitchStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__SWITCH_STATEMENT, oldSwitchStatement, newSwitchStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitchStatement(Switch_statement newSwitchStatement)
  {
    if (newSwitchStatement != switchStatement)
    {
      NotificationChain msgs = null;
      if (switchStatement != null)
        msgs = ((InternalEObject)switchStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__SWITCH_STATEMENT, null, msgs);
      if (newSwitchStatement != null)
        msgs = ((InternalEObject)newSwitchStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__SWITCH_STATEMENT, null, msgs);
      msgs = basicSetSwitchStatement(newSwitchStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__SWITCH_STATEMENT, newSwitchStatement, newSwitchStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRparent()
  {
    return rparent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRparent(String newRparent)
  {
    String oldRparent = rparent;
    rparent = newRparent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getSyncStatement()
  {
    return syncStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSyncStatement(Statement newSyncStatement, NotificationChain msgs)
  {
    Statement oldSyncStatement = syncStatement;
    syncStatement = newSyncStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__SYNC_STATEMENT, oldSyncStatement, newSyncStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSyncStatement(Statement newSyncStatement)
  {
    if (newSyncStatement != syncStatement)
    {
      NotificationChain msgs = null;
      if (syncStatement != null)
        msgs = ((InternalEObject)syncStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__SYNC_STATEMENT, null, msgs);
      if (newSyncStatement != null)
        msgs = ((InternalEObject)newSyncStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__SYNC_STATEMENT, null, msgs);
      msgs = basicSetSyncStatement(newSyncStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__SYNC_STATEMENT, newSyncStatement, newSyncStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRet()
  {
    return ret;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRet(String newRet)
  {
    String oldRet = ret;
    ret = newRet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__RET, oldRet, ret));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_block getStatementBlock()
  {
    return statementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementBlock(Statement_block newStatementBlock, NotificationChain msgs)
  {
    Statement_block oldStatementBlock = statementBlock;
    statementBlock = newStatementBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT_BLOCK, oldStatementBlock, newStatementBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementBlock(Statement_block newStatementBlock)
  {
    if (newStatementBlock != statementBlock)
    {
      NotificationChain msgs = null;
      if (statementBlock != null)
        msgs = ((InternalEObject)statementBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT_BLOCK, null, msgs);
      if (newStatementBlock != null)
        msgs = ((InternalEObject)newStatementBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT_BLOCK, null, msgs);
      msgs = basicSetStatementBlock(newStatementBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT_BLOCK, newStatementBlock, newStatementBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try_statement getTryStatement()
  {
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTryStatement(Try_statement newTryStatement, NotificationChain msgs)
  {
    Try_statement oldTryStatement = tryStatement;
    tryStatement = newTryStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__TRY_STATEMENT, oldTryStatement, newTryStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTryStatement(Try_statement newTryStatement)
  {
    if (newTryStatement != tryStatement)
    {
      NotificationChain msgs = null;
      if (tryStatement != null)
        msgs = ((InternalEObject)tryStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTryStatement != null)
        msgs = ((InternalEObject)newTryStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTryStatement(newTryStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__TRY_STATEMENT, newTryStatement, newTryStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameStatement()
  {
    return nameStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameStatement(String newNameStatement)
  {
    String oldNameStatement = nameStatement;
    nameStatement = newNameStatement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__NAME_STATEMENT, oldNameStatement, nameStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        return basicSetVariableDeclaration(null, msgs);
      case MyDslPackage.STATEMENT__EXPRESSION_STATEMENT:
        return ((InternalEList<?>)getExpressionStatement()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        return basicSetIfStatement(null, msgs);
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        return basicSetDoStatement(null, msgs);
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        return basicSetWhileStatement(null, msgs);
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        return basicSetForStatement(null, msgs);
      case MyDslPackage.STATEMENT__SWITCH_STATEMENT:
        return basicSetSwitchStatement(null, msgs);
      case MyDslPackage.STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        return basicSetSyncStatement(null, msgs);
      case MyDslPackage.STATEMENT__STATEMENT_BLOCK:
        return basicSetStatementBlock(null, msgs);
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return basicSetTryStatement(null, msgs);
      case MyDslPackage.STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        return getVariableDeclaration();
      case MyDslPackage.STATEMENT__EXPRESSION_STATEMENT:
        return getExpressionStatement();
      case MyDslPackage.STATEMENT__G:
        return getG();
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        return getIfStatement();
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        return getDoStatement();
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        return getWhileStatement();
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        return getForStatement();
      case MyDslPackage.STATEMENT__SWITCH_STATEMENT:
        return getSwitchStatement();
      case MyDslPackage.STATEMENT__EXPRESSION:
        return getExpression();
      case MyDslPackage.STATEMENT__RPARENT:
        return getRparent();
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        return getSyncStatement();
      case MyDslPackage.STATEMENT__RET:
        return getRet();
      case MyDslPackage.STATEMENT__STATEMENT_BLOCK:
        return getStatementBlock();
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return getTryStatement();
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        return getNameStatement();
      case MyDslPackage.STATEMENT__STATEMENT:
        return getStatement();
      case MyDslPackage.STATEMENT__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        setVariableDeclaration((Variable_declaration)newValue);
        return;
      case MyDslPackage.STATEMENT__EXPRESSION_STATEMENT:
        getExpressionStatement().clear();
        getExpressionStatement().addAll((Collection<? extends Expression>)newValue);
        return;
      case MyDslPackage.STATEMENT__G:
        setG((String)newValue);
        return;
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        setIfStatement((If_statement)newValue);
        return;
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        setDoStatement((Do_Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        setWhileStatement((While_Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        setForStatement((For_Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__SWITCH_STATEMENT:
        setSwitchStatement((Switch_statement)newValue);
        return;
      case MyDslPackage.STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.STATEMENT__RPARENT:
        setRparent((String)newValue);
        return;
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        setSyncStatement((Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__RET:
        setRet((String)newValue);
        return;
      case MyDslPackage.STATEMENT__STATEMENT_BLOCK:
        setStatementBlock((Statement_block)newValue);
        return;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        setTryStatement((Try_statement)newValue);
        return;
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        setNameStatement((String)newValue);
        return;
      case MyDslPackage.STATEMENT__STATEMENT:
        setStatement((Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        setVariableDeclaration((Variable_declaration)null);
        return;
      case MyDslPackage.STATEMENT__EXPRESSION_STATEMENT:
        getExpressionStatement().clear();
        return;
      case MyDslPackage.STATEMENT__G:
        setG(G_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        setIfStatement((If_statement)null);
        return;
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        setDoStatement((Do_Statement)null);
        return;
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        setWhileStatement((While_Statement)null);
        return;
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        setForStatement((For_Statement)null);
        return;
      case MyDslPackage.STATEMENT__SWITCH_STATEMENT:
        setSwitchStatement((Switch_statement)null);
        return;
      case MyDslPackage.STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        setSyncStatement((Statement)null);
        return;
      case MyDslPackage.STATEMENT__RET:
        setRet(RET_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__STATEMENT_BLOCK:
        setStatementBlock((Statement_block)null);
        return;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        setTryStatement((Try_statement)null);
        return;
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        setNameStatement(NAME_STATEMENT_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__STATEMENT:
        setStatement((Statement)null);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        return variableDeclaration != null;
      case MyDslPackage.STATEMENT__EXPRESSION_STATEMENT:
        return expressionStatement != null && !expressionStatement.isEmpty();
      case MyDslPackage.STATEMENT__G:
        return G_EDEFAULT == null ? g != null : !G_EDEFAULT.equals(g);
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        return ifStatement != null;
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        return doStatement != null;
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        return whileStatement != null;
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        return forStatement != null;
      case MyDslPackage.STATEMENT__SWITCH_STATEMENT:
        return switchStatement != null;
      case MyDslPackage.STATEMENT__EXPRESSION:
        return expression != null;
      case MyDslPackage.STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        return syncStatement != null;
      case MyDslPackage.STATEMENT__RET:
        return RET_EDEFAULT == null ? ret != null : !RET_EDEFAULT.equals(ret);
      case MyDslPackage.STATEMENT__STATEMENT_BLOCK:
        return statementBlock != null;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return tryStatement != null;
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        return NAME_STATEMENT_EDEFAULT == null ? nameStatement != null : !NAME_STATEMENT_EDEFAULT.equals(nameStatement);
      case MyDslPackage.STATEMENT__STATEMENT:
        return statement != null;
      case MyDslPackage.STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (g: ");
    result.append(g);
    result.append(", rparent: ");
    result.append(rparent);
    result.append(", ret: ");
    result.append(ret);
    result.append(", nameStatement: ");
    result.append(nameStatement);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
