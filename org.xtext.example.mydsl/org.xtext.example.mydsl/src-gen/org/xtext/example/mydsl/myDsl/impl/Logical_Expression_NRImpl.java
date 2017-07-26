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
import org.xtext.example.mydsl.myDsl.Logical_Expression_NR;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Expression NR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl#getExclamation <em>Exclamation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl#getTrue <em>True</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl#getFalse <em>False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Logical_Expression_NRImpl extends MinimalEObjectImpl.Container implements Logical_Expression_NR
{
  /**
   * The default value of the '{@link #getExclamation() <em>Exclamation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclamation()
   * @generated
   * @ordered
   */
  protected static final String EXCLAMATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExclamation() <em>Exclamation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclamation()
   * @generated
   * @ordered
   */
  protected String exclamation = EXCLAMATION_EDEFAULT;

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
   * The default value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected static final String TRUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected String true_ = TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected static final String FALSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected String false_ = FALSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Logical_Expression_NRImpl()
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
    return MyDslPackage.Literals.LOGICAL_EXPRESSION_NR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExclamation()
  {
    return exclamation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclamation(String newExclamation)
  {
    String oldExclamation = exclamation;
    exclamation = newExclamation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_EXPRESSION_NR__EXCLAMATION, oldExclamation, exclamation));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(String newTrue)
  {
    String oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_EXPRESSION_NR__TRUE, oldTrue, true_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFalse()
  {
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse(String newFalse)
  {
    String oldFalse = false_;
    false_ = newFalse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_EXPRESSION_NR__FALSE, oldFalse, false_));
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
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXCLAMATION:
        return getExclamation();
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION:
        return getExpression();
      case MyDslPackage.LOGICAL_EXPRESSION_NR__TRUE:
        return getTrue();
      case MyDslPackage.LOGICAL_EXPRESSION_NR__FALSE:
        return getFalse();
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
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXCLAMATION:
        setExclamation((String)newValue);
        return;
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.LOGICAL_EXPRESSION_NR__TRUE:
        setTrue((String)newValue);
        return;
      case MyDslPackage.LOGICAL_EXPRESSION_NR__FALSE:
        setFalse((String)newValue);
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
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXCLAMATION:
        setExclamation(EXCLAMATION_EDEFAULT);
        return;
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.LOGICAL_EXPRESSION_NR__TRUE:
        setTrue(TRUE_EDEFAULT);
        return;
      case MyDslPackage.LOGICAL_EXPRESSION_NR__FALSE:
        setFalse(FALSE_EDEFAULT);
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
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXCLAMATION:
        return EXCLAMATION_EDEFAULT == null ? exclamation != null : !EXCLAMATION_EDEFAULT.equals(exclamation);
      case MyDslPackage.LOGICAL_EXPRESSION_NR__EXPRESSION:
        return expression != null;
      case MyDslPackage.LOGICAL_EXPRESSION_NR__TRUE:
        return TRUE_EDEFAULT == null ? true_ != null : !TRUE_EDEFAULT.equals(true_);
      case MyDslPackage.LOGICAL_EXPRESSION_NR__FALSE:
        return FALSE_EDEFAULT == null ? false_ != null : !FALSE_EDEFAULT.equals(false_);
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
    result.append(" (exclamation: ");
    result.append(exclamation);
    result.append(", true: ");
    result.append(true_);
    result.append(", false: ");
    result.append(false_);
    result.append(')');
    return result.toString();
  }

} //Logical_Expression_NRImpl
