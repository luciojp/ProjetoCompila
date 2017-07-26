/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.If_statement;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl#getLparen <em>Lparen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl#getIdStatement <em>Id Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class If_statementImpl extends MinimalEObjectImpl.Container implements If_statement
{
  /**
   * The default value of the '{@link #getLparen() <em>Lparen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLparen()
   * @generated
   * @ordered
   */
  protected static final String LPAREN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLparen() <em>Lparen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLparen()
   * @generated
   * @ordered
   */
  protected String lparen = LPAREN_EDEFAULT;

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
   * The cached value of the '{@link #getIdStatement() <em>Id Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdStatement()
   * @generated
   * @ordered
   */
  protected Statement idStatement;

  /**
   * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseStatement()
   * @generated
   * @ordered
   */
  protected Statement elseStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected If_statementImpl()
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
    return MyDslPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLparen()
  {
    return lparen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLparen(String newLparen)
  {
    String oldLparen = lparen;
    lparen = newLparen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__LPAREN, oldLparen, lparen));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__EXPRESSION, newExpression, newExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getIdStatement()
  {
    return idStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdStatement(Statement newIdStatement, NotificationChain msgs)
  {
    Statement oldIdStatement = idStatement;
    idStatement = newIdStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__ID_STATEMENT, oldIdStatement, newIdStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdStatement(Statement newIdStatement)
  {
    if (newIdStatement != idStatement)
    {
      NotificationChain msgs = null;
      if (idStatement != null)
        msgs = ((InternalEObject)idStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STATEMENT__ID_STATEMENT, null, msgs);
      if (newIdStatement != null)
        msgs = ((InternalEObject)newIdStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STATEMENT__ID_STATEMENT, null, msgs);
      msgs = basicSetIdStatement(newIdStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__ID_STATEMENT, newIdStatement, newIdStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getElseStatement()
  {
    return elseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs)
  {
    Statement oldElseStatement = elseStatement;
    elseStatement = newElseStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__ELSE_STATEMENT, oldElseStatement, newElseStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseStatement(Statement newElseStatement)
  {
    if (newElseStatement != elseStatement)
    {
      NotificationChain msgs = null;
      if (elseStatement != null)
        msgs = ((InternalEObject)elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
      if (newElseStatement != null)
        msgs = ((InternalEObject)newElseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
      msgs = basicSetElseStatement(newElseStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STATEMENT__ELSE_STATEMENT, newElseStatement, newElseStatement));
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
      case MyDslPackage.IF_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.IF_STATEMENT__ID_STATEMENT:
        return basicSetIdStatement(null, msgs);
      case MyDslPackage.IF_STATEMENT__ELSE_STATEMENT:
        return basicSetElseStatement(null, msgs);
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
      case MyDslPackage.IF_STATEMENT__LPAREN:
        return getLparen();
      case MyDslPackage.IF_STATEMENT__EXPRESSION:
        return getExpression();
      case MyDslPackage.IF_STATEMENT__RPARENT:
        return getRparent();
      case MyDslPackage.IF_STATEMENT__ID_STATEMENT:
        return getIdStatement();
      case MyDslPackage.IF_STATEMENT__ELSE_STATEMENT:
        return getElseStatement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.IF_STATEMENT__LPAREN:
        setLparen((String)newValue);
        return;
      case MyDslPackage.IF_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.IF_STATEMENT__RPARENT:
        setRparent((String)newValue);
        return;
      case MyDslPackage.IF_STATEMENT__ID_STATEMENT:
        setIdStatement((Statement)newValue);
        return;
      case MyDslPackage.IF_STATEMENT__ELSE_STATEMENT:
        setElseStatement((Statement)newValue);
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
      case MyDslPackage.IF_STATEMENT__LPAREN:
        setLparen(LPAREN_EDEFAULT);
        return;
      case MyDslPackage.IF_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.IF_STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyDslPackage.IF_STATEMENT__ID_STATEMENT:
        setIdStatement((Statement)null);
        return;
      case MyDslPackage.IF_STATEMENT__ELSE_STATEMENT:
        setElseStatement((Statement)null);
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
      case MyDslPackage.IF_STATEMENT__LPAREN:
        return LPAREN_EDEFAULT == null ? lparen != null : !LPAREN_EDEFAULT.equals(lparen);
      case MyDslPackage.IF_STATEMENT__EXPRESSION:
        return expression != null;
      case MyDslPackage.IF_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyDslPackage.IF_STATEMENT__ID_STATEMENT:
        return idStatement != null;
      case MyDslPackage.IF_STATEMENT__ELSE_STATEMENT:
        return elseStatement != null;
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
    result.append(" (lparen: ");
    result.append(lparen);
    result.append(", rparent: ");
    result.append(rparent);
    result.append(')');
    return result.toString();
  }

} //If_statementImpl
