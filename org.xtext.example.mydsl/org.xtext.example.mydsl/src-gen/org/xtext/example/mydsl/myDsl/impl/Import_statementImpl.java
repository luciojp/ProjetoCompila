/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Import_statement;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Import_statementImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Import_statementImpl#getPacName <em>Pac Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Import_statementImpl extends MinimalEObjectImpl.Container implements Import_statement
{
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
   * The default value of the '{@link #getPacName() <em>Pac Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacName()
   * @generated
   * @ordered
   */
  protected static final String PAC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPacName() <em>Pac Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacName()
   * @generated
   * @ordered
   */
  protected String pacName = PAC_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Import_statementImpl()
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
    return MyDslPackage.Literals.IMPORT_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMPORT_STATEMENT__CLASS_NAME, oldClassName, className));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPacName()
  {
    return pacName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPacName(String newPacName)
  {
    String oldPacName = pacName;
    pacName = newPacName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMPORT_STATEMENT__PAC_NAME, oldPacName, pacName));
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
      case MyDslPackage.IMPORT_STATEMENT__CLASS_NAME:
        return getClassName();
      case MyDslPackage.IMPORT_STATEMENT__PAC_NAME:
        return getPacName();
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
      case MyDslPackage.IMPORT_STATEMENT__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case MyDslPackage.IMPORT_STATEMENT__PAC_NAME:
        setPacName((String)newValue);
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
      case MyDslPackage.IMPORT_STATEMENT__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case MyDslPackage.IMPORT_STATEMENT__PAC_NAME:
        setPacName(PAC_NAME_EDEFAULT);
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
      case MyDslPackage.IMPORT_STATEMENT__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case MyDslPackage.IMPORT_STATEMENT__PAC_NAME:
        return PAC_NAME_EDEFAULT == null ? pacName != null : !PAC_NAME_EDEFAULT.equals(pacName);
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
    result.append(" (className: ");
    result.append(className);
    result.append(", pacName: ");
    result.append(pacName);
    result.append(')');
    return result.toString();
  }

} //Import_statementImpl
