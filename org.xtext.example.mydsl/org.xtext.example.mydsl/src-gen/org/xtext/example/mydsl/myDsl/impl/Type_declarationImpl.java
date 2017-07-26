/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Interface_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl#getClassDec <em>Class Dec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl#getInterfaceDec <em>Interface Dec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Type_declarationImpl extends MinimalEObjectImpl.Container implements Type_declaration
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
   * The cached value of the '{@link #getClassDec() <em>Class Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassDec()
   * @generated
   * @ordered
   */
  protected Class_declaration classDec;

  /**
   * The cached value of the '{@link #getInterfaceDec() <em>Interface Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceDec()
   * @generated
   * @ordered
   */
  protected Interface_declaration interfaceDec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Type_declarationImpl()
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
    return MyDslPackage.Literals.TYPE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_DECLARATION__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_declaration getClassDec()
  {
    return classDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassDec(Class_declaration newClassDec, NotificationChain msgs)
  {
    Class_declaration oldClassDec = classDec;
    classDec = newClassDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_DECLARATION__CLASS_DEC, oldClassDec, newClassDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassDec(Class_declaration newClassDec)
  {
    if (newClassDec != classDec)
    {
      NotificationChain msgs = null;
      if (classDec != null)
        msgs = ((InternalEObject)classDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_DECLARATION__CLASS_DEC, null, msgs);
      if (newClassDec != null)
        msgs = ((InternalEObject)newClassDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_DECLARATION__CLASS_DEC, null, msgs);
      msgs = basicSetClassDec(newClassDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_DECLARATION__CLASS_DEC, newClassDec, newClassDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_declaration getInterfaceDec()
  {
    return interfaceDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaceDec(Interface_declaration newInterfaceDec, NotificationChain msgs)
  {
    Interface_declaration oldInterfaceDec = interfaceDec;
    interfaceDec = newInterfaceDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC, oldInterfaceDec, newInterfaceDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceDec(Interface_declaration newInterfaceDec)
  {
    if (newInterfaceDec != interfaceDec)
    {
      NotificationChain msgs = null;
      if (interfaceDec != null)
        msgs = ((InternalEObject)interfaceDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC, null, msgs);
      if (newInterfaceDec != null)
        msgs = ((InternalEObject)newInterfaceDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC, null, msgs);
      msgs = basicSetInterfaceDec(newInterfaceDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC, newInterfaceDec, newInterfaceDec));
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
      case MyDslPackage.TYPE_DECLARATION__CLASS_DEC:
        return basicSetClassDec(null, msgs);
      case MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC:
        return basicSetInterfaceDec(null, msgs);
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
      case MyDslPackage.TYPE_DECLARATION__COMMENT:
        return getComment();
      case MyDslPackage.TYPE_DECLARATION__CLASS_DEC:
        return getClassDec();
      case MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC:
        return getInterfaceDec();
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
      case MyDslPackage.TYPE_DECLARATION__COMMENT:
        setComment((String)newValue);
        return;
      case MyDslPackage.TYPE_DECLARATION__CLASS_DEC:
        setClassDec((Class_declaration)newValue);
        return;
      case MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC:
        setInterfaceDec((Interface_declaration)newValue);
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
      case MyDslPackage.TYPE_DECLARATION__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case MyDslPackage.TYPE_DECLARATION__CLASS_DEC:
        setClassDec((Class_declaration)null);
        return;
      case MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC:
        setInterfaceDec((Interface_declaration)null);
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
      case MyDslPackage.TYPE_DECLARATION__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case MyDslPackage.TYPE_DECLARATION__CLASS_DEC:
        return classDec != null;
      case MyDslPackage.TYPE_DECLARATION__INTERFACE_DEC:
        return interfaceDec != null;
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

} //Type_declarationImpl
