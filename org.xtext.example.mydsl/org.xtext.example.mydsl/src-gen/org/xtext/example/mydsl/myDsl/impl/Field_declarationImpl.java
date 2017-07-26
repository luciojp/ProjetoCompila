/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Constructor_declaration;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Static_initializer;
import org.xtext.example.mydsl.myDsl.Variable_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl#getContructorName <em>Contructor Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl#getStaticinitializer <em>Staticinitializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Field_declarationImpl extends MinimalEObjectImpl.Container implements Field_declaration
{
  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

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
   * The cached value of the '{@link #getContructorName() <em>Contructor Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContructorName()
   * @generated
   * @ordered
   */
  protected Constructor_declaration contructorName;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected Method_declaration methodName;

  /**
   * The cached value of the '{@link #getStaticinitializer() <em>Staticinitializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticinitializer()
   * @generated
   * @ordered
   */
  protected Static_initializer staticinitializer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Field_declarationImpl()
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
    return MyDslPackage.Literals.FIELD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__COMMENT, oldComment, comment));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION, oldVariableDeclaration, newVariableDeclaration);
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
        msgs = ((InternalEObject)variableDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION, null, msgs);
      if (newVariableDeclaration != null)
        msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION, null, msgs);
      msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor_declaration getContructorName()
  {
    return contructorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContructorName(Constructor_declaration newContructorName, NotificationChain msgs)
  {
    Constructor_declaration oldContructorName = contructorName;
    contructorName = newContructorName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME, oldContructorName, newContructorName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContructorName(Constructor_declaration newContructorName)
  {
    if (newContructorName != contructorName)
    {
      NotificationChain msgs = null;
      if (contructorName != null)
        msgs = ((InternalEObject)contructorName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME, null, msgs);
      if (newContructorName != null)
        msgs = ((InternalEObject)newContructorName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME, null, msgs);
      msgs = basicSetContructorName(newContructorName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME, newContructorName, newContructorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method_declaration getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodName(Method_declaration newMethodName, NotificationChain msgs)
  {
    Method_declaration oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__METHOD_NAME, oldMethodName, newMethodName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(Method_declaration newMethodName)
  {
    if (newMethodName != methodName)
    {
      NotificationChain msgs = null;
      if (methodName != null)
        msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__METHOD_NAME, null, msgs);
      if (newMethodName != null)
        msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__METHOD_NAME, null, msgs);
      msgs = basicSetMethodName(newMethodName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__METHOD_NAME, newMethodName, newMethodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Static_initializer getStaticinitializer()
  {
    return staticinitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStaticinitializer(Static_initializer newStaticinitializer, NotificationChain msgs)
  {
    Static_initializer oldStaticinitializer = staticinitializer;
    staticinitializer = newStaticinitializer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER, oldStaticinitializer, newStaticinitializer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticinitializer(Static_initializer newStaticinitializer)
  {
    if (newStaticinitializer != staticinitializer)
    {
      NotificationChain msgs = null;
      if (staticinitializer != null)
        msgs = ((InternalEObject)staticinitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER, null, msgs);
      if (newStaticinitializer != null)
        msgs = ((InternalEObject)newStaticinitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER, null, msgs);
      msgs = basicSetStaticinitializer(newStaticinitializer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER, newStaticinitializer, newStaticinitializer));
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
      case MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION:
        return basicSetVariableDeclaration(null, msgs);
      case MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME:
        return basicSetContructorName(null, msgs);
      case MyDslPackage.FIELD_DECLARATION__METHOD_NAME:
        return basicSetMethodName(null, msgs);
      case MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER:
        return basicSetStaticinitializer(null, msgs);
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
      case MyDslPackage.FIELD_DECLARATION__COMMENT:
        return getComment();
      case MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION:
        return getVariableDeclaration();
      case MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME:
        return getContructorName();
      case MyDslPackage.FIELD_DECLARATION__METHOD_NAME:
        return getMethodName();
      case MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER:
        return getStaticinitializer();
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
      case MyDslPackage.FIELD_DECLARATION__COMMENT:
        setComment((String)newValue);
        return;
      case MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION:
        setVariableDeclaration((Variable_declaration)newValue);
        return;
      case MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME:
        setContructorName((Constructor_declaration)newValue);
        return;
      case MyDslPackage.FIELD_DECLARATION__METHOD_NAME:
        setMethodName((Method_declaration)newValue);
        return;
      case MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER:
        setStaticinitializer((Static_initializer)newValue);
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
      case MyDslPackage.FIELD_DECLARATION__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION:
        setVariableDeclaration((Variable_declaration)null);
        return;
      case MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME:
        setContructorName((Constructor_declaration)null);
        return;
      case MyDslPackage.FIELD_DECLARATION__METHOD_NAME:
        setMethodName((Method_declaration)null);
        return;
      case MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER:
        setStaticinitializer((Static_initializer)null);
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
      case MyDslPackage.FIELD_DECLARATION__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case MyDslPackage.FIELD_DECLARATION__VARIABLE_DECLARATION:
        return variableDeclaration != null;
      case MyDslPackage.FIELD_DECLARATION__CONTRUCTOR_NAME:
        return contructorName != null;
      case MyDslPackage.FIELD_DECLARATION__METHOD_NAME:
        return methodName != null;
      case MyDslPackage.FIELD_DECLARATION__STATICINITIALIZER:
        return staticinitializer != null;
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
    result.append(" (comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //Field_declarationImpl
