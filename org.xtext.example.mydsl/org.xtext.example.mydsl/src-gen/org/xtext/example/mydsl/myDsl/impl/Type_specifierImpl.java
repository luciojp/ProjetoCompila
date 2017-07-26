/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Type_specifierImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Type_specifierImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Type_specifierImpl extends MinimalEObjectImpl.Container implements Type_specifier
{
  /**
   * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected static final String PRIMITIVE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected String primitiveType = PRIMITIVE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Type_specifierImpl()
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
    return MyDslPackage.Literals.TYPE_SPECIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimitiveType()
  {
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitiveType(String newPrimitiveType)
  {
    String oldPrimitiveType = primitiveType;
    primitiveType = newPrimitiveType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_SPECIFIER__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(String newClassName)
  {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_SPECIFIER__CLASS_NAME, oldClassName, className));
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
      case MyDslPackage.TYPE_SPECIFIER__PRIMITIVE_TYPE:
        return getPrimitiveType();
      case MyDslPackage.TYPE_SPECIFIER__CLASS_NAME:
        return getClassName();
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
      case MyDslPackage.TYPE_SPECIFIER__PRIMITIVE_TYPE:
        setPrimitiveType((String)newValue);
        return;
      case MyDslPackage.TYPE_SPECIFIER__CLASS_NAME:
        setClassName((String)newValue);
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
      case MyDslPackage.TYPE_SPECIFIER__PRIMITIVE_TYPE:
        setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
        return;
      case MyDslPackage.TYPE_SPECIFIER__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
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
      case MyDslPackage.TYPE_SPECIFIER__PRIMITIVE_TYPE:
        return PRIMITIVE_TYPE_EDEFAULT == null ? primitiveType != null : !PRIMITIVE_TYPE_EDEFAULT.equals(primitiveType);
      case MyDslPackage.TYPE_SPECIFIER__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
    result.append(" (primitiveType: ");
    result.append(primitiveType);
    result.append(", className: ");
    result.append(className);
    result.append(')');
    return result.toString();
  }

} //Type_specifierImpl
