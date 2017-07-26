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
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.While_Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.While_StatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.While_StatementImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.While_StatementImpl#getWhileStatement <em>While Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class While_StatementImpl extends MinimalEObjectImpl.Container implements While_Statement
{
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
   * The cached value of the '{@link #getWhileStatement() <em>While Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileStatement()
   * @generated
   * @ordered
   */
  protected Statement whileStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected While_StatementImpl()
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
    return MyDslPackage.Literals.WHILE_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.WHILE_STATEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.WHILE_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.WHILE_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WHILE_STATEMENT__EXPRESSION, newExpression, newExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WHILE_STATEMENT__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getWhileStatement()
  {
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileStatement(Statement newWhileStatement, NotificationChain msgs)
  {
    Statement oldWhileStatement = whileStatement;
    whileStatement = newWhileStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT, oldWhileStatement, newWhileStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileStatement(Statement newWhileStatement)
  {
    if (newWhileStatement != whileStatement)
    {
      NotificationChain msgs = null;
      if (whileStatement != null)
        msgs = ((InternalEObject)whileStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT, null, msgs);
      if (newWhileStatement != null)
        msgs = ((InternalEObject)newWhileStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT, null, msgs);
      msgs = basicSetWhileStatement(newWhileStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT, newWhileStatement, newWhileStatement));
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
      case MyDslPackage.WHILE_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT:
        return basicSetWhileStatement(null, msgs);
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
      case MyDslPackage.WHILE_STATEMENT__EXPRESSION:
        return getExpression();
      case MyDslPackage.WHILE_STATEMENT__RPARENT:
        return getRparent();
      case MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT:
        return getWhileStatement();
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
      case MyDslPackage.WHILE_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.WHILE_STATEMENT__RPARENT:
        setRparent((String)newValue);
        return;
      case MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT:
        setWhileStatement((Statement)newValue);
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
      case MyDslPackage.WHILE_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.WHILE_STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT:
        setWhileStatement((Statement)null);
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
      case MyDslPackage.WHILE_STATEMENT__EXPRESSION:
        return expression != null;
      case MyDslPackage.WHILE_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyDslPackage.WHILE_STATEMENT__WHILE_STATEMENT:
        return whileStatement != null;
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
    result.append(" (rparent: ");
    result.append(rparent);
    result.append(')');
    return result.toString();
  }

} //While_StatementImpl
