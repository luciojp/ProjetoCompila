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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.Type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl#getTypeVector <em>Type Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The cached value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected Type_specifier typeSpecifier;

  /**
   * The cached value of the '{@link #getTypeVector() <em>Type Vector</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeVector()
   * @generated
   * @ordered
   */
  protected EList<String> typeVector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return MyDslPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_specifier getTypeSpecifier()
  {
    return typeSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSpecifier(Type_specifier newTypeSpecifier, NotificationChain msgs)
  {
    Type_specifier oldTypeSpecifier = typeSpecifier;
    typeSpecifier = newTypeSpecifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPE_SPECIFIER, oldTypeSpecifier, newTypeSpecifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSpecifier(Type_specifier newTypeSpecifier)
  {
    if (newTypeSpecifier != typeSpecifier)
    {
      NotificationChain msgs = null;
      if (typeSpecifier != null)
        msgs = ((InternalEObject)typeSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__TYPE_SPECIFIER, null, msgs);
      if (newTypeSpecifier != null)
        msgs = ((InternalEObject)newTypeSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__TYPE_SPECIFIER, null, msgs);
      msgs = basicSetTypeSpecifier(newTypeSpecifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPE_SPECIFIER, newTypeSpecifier, newTypeSpecifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypeVector()
  {
    if (typeVector == null)
    {
      typeVector = new EDataTypeEList<String>(String.class, this, MyDslPackage.TYPE__TYPE_VECTOR);
    }
    return typeVector;
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        return basicSetTypeSpecifier(null, msgs);
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        return getTypeSpecifier();
      case MyDslPackage.TYPE__TYPE_VECTOR:
        return getTypeVector();
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        setTypeSpecifier((Type_specifier)newValue);
        return;
      case MyDslPackage.TYPE__TYPE_VECTOR:
        getTypeVector().clear();
        getTypeVector().addAll((Collection<? extends String>)newValue);
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        setTypeSpecifier((Type_specifier)null);
        return;
      case MyDslPackage.TYPE__TYPE_VECTOR:
        getTypeVector().clear();
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        return typeSpecifier != null;
      case MyDslPackage.TYPE__TYPE_VECTOR:
        return typeVector != null && !typeVector.isEmpty();
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
    result.append(" (typeVector: ");
    result.append(typeVector);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
