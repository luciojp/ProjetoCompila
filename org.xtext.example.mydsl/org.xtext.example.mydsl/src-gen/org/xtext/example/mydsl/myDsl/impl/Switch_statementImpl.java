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

import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Switch_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl#getSwitchStatements <em>Switch Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Switch_statementImpl extends MinimalEObjectImpl.Container implements Switch_statement
{
  /**
   * The default value of the '{@link #getLParen() <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLParen()
   * @generated
   * @ordered
   */
  protected static final String LPAREN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLParen() <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLParen()
   * @generated
   * @ordered
   */
  protected String lParen = LPAREN_EDEFAULT;

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
   * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression2()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression2;

  /**
   * The cached value of the '{@link #getSwitchStatements() <em>Switch Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> switchStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Switch_statementImpl()
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
    return MyDslPackage.Literals.SWITCH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLParen()
  {
    return lParen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLParen(String newLParen)
  {
    String oldLParen = lParen;
    lParen = newLParen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__LPAREN, oldLParen, lParen));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__EXPRESSION, newExpression, newExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpression2()
  {
    if (expression2 == null)
    {
      expression2 = new EObjectContainmentEList<Expression>(Expression.class, this, MyDslPackage.SWITCH_STATEMENT__EXPRESSION2);
    }
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getSwitchStatements()
  {
    if (switchStatements == null)
    {
      switchStatements = new EObjectContainmentEList<Statement>(Statement.class, this, MyDslPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS);
    }
    return switchStatements;
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
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION2:
        return ((InternalEList<?>)getExpression2()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        return ((InternalEList<?>)getSwitchStatements()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.SWITCH_STATEMENT__LPAREN:
        return getLParen();
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
        return getExpression();
      case MyDslPackage.SWITCH_STATEMENT__RPARENT:
        return getRparent();
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION2:
        return getExpression2();
      case MyDslPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        return getSwitchStatements();
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
      case MyDslPackage.SWITCH_STATEMENT__LPAREN:
        setLParen((String)newValue);
        return;
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.SWITCH_STATEMENT__RPARENT:
        setRparent((String)newValue);
        return;
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION2:
        getExpression2().clear();
        getExpression2().addAll((Collection<? extends Expression>)newValue);
        return;
      case MyDslPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        getSwitchStatements().clear();
        getSwitchStatements().addAll((Collection<? extends Statement>)newValue);
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
      case MyDslPackage.SWITCH_STATEMENT__LPAREN:
        setLParen(LPAREN_EDEFAULT);
        return;
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.SWITCH_STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION2:
        getExpression2().clear();
        return;
      case MyDslPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        getSwitchStatements().clear();
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
      case MyDslPackage.SWITCH_STATEMENT__LPAREN:
        return LPAREN_EDEFAULT == null ? lParen != null : !LPAREN_EDEFAULT.equals(lParen);
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
        return expression != null;
      case MyDslPackage.SWITCH_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyDslPackage.SWITCH_STATEMENT__EXPRESSION2:
        return expression2 != null && !expression2.isEmpty();
      case MyDslPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        return switchStatements != null && !switchStatements.isEmpty();
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
    result.append(" (lParen: ");
    result.append(lParen);
    result.append(", rparent: ");
    result.append(rparent);
    result.append(')');
    return result.toString();
  }

} //Switch_statementImpl
