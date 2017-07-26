/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Array_initializer;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Variable_initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl#getArray_init <em>Array init</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Variable_initializerImpl extends MinimalEObjectImpl.Container implements Variable_initializer
{
  /**
   * The cached value of the '{@link #getArray_init() <em>Array init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray_init()
   * @generated
   * @ordered
   */
  protected Array_initializer array_init;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Variable_initializerImpl()
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
    return MyDslPackage.Literals.VARIABLE_INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_initializer getArray_init()
  {
    return array_init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray_init(Array_initializer newArray_init, NotificationChain msgs)
  {
    Array_initializer oldArray_init = array_init;
    array_init = newArray_init;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT, oldArray_init, newArray_init);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray_init(Array_initializer newArray_init)
  {
    if (newArray_init != array_init)
    {
      NotificationChain msgs = null;
      if (array_init != null)
        msgs = ((InternalEObject)array_init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT, null, msgs);
      if (newArray_init != null)
        msgs = ((InternalEObject)newArray_init).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT, null, msgs);
      msgs = basicSetArray_init(newArray_init, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT, newArray_init, newArray_init));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION, newExpression, newExpression));
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
      case MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT:
        return basicSetArray_init(null, msgs);
      case MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION:
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
      case MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT:
        return getArray_init();
      case MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION:
        return getExpression();
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
      case MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT:
        setArray_init((Array_initializer)newValue);
        return;
      case MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION:
        setExpression((Expression)newValue);
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
      case MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT:
        setArray_init((Array_initializer)null);
        return;
      case MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION:
        setExpression((Expression)null);
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
      case MyDslPackage.VARIABLE_INITIALIZER__ARRAY_INIT:
        return array_init != null;
      case MyDslPackage.VARIABLE_INITIALIZER__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //Variable_initializerImpl
