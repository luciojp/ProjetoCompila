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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl#getClassHerdada <em>Class Herdada</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl#getInterfaceImplementada <em>Interface Implementada</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl#getInterfacesImplementadas <em>Interfaces Implementadas</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl#getFieldsDeclaration <em>Fields Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Class_declarationImpl extends MinimalEObjectImpl.Container implements Class_declaration
{
  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<String> modifiers;

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
   * The default value of the '{@link #getClassHerdada() <em>Class Herdada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassHerdada()
   * @generated
   * @ordered
   */
  protected static final String CLASS_HERDADA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassHerdada() <em>Class Herdada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassHerdada()
   * @generated
   * @ordered
   */
  protected String classHerdada = CLASS_HERDADA_EDEFAULT;

  /**
   * The default value of the '{@link #getInterfaceImplementada() <em>Interface Implementada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceImplementada()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_IMPLEMENTADA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfaceImplementada() <em>Interface Implementada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceImplementada()
   * @generated
   * @ordered
   */
  protected String interfaceImplementada = INTERFACE_IMPLEMENTADA_EDEFAULT;

  /**
   * The cached value of the '{@link #getInterfacesImplementadas() <em>Interfaces Implementadas</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfacesImplementadas()
   * @generated
   * @ordered
   */
  protected EList<String> interfacesImplementadas;

  /**
   * The cached value of the '{@link #getFieldsDeclaration() <em>Fields Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldsDeclaration()
   * @generated
   * @ordered
   */
  protected EList<Field_declaration> fieldsDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Class_declarationImpl()
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
    return MyDslPackage.Literals.CLASS_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EDataTypeEList<String>(String.class, this, MyDslPackage.CLASS_DECLARATION__MODIFIERS);
    }
    return modifiers;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS_DECLARATION__CLASS_NAME, oldClassName, className));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassHerdada()
  {
    return classHerdada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassHerdada(String newClassHerdada)
  {
    String oldClassHerdada = classHerdada;
    classHerdada = newClassHerdada;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS_DECLARATION__CLASS_HERDADA, oldClassHerdada, classHerdada));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfaceImplementada()
  {
    return interfaceImplementada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceImplementada(String newInterfaceImplementada)
  {
    String oldInterfaceImplementada = interfaceImplementada;
    interfaceImplementada = newInterfaceImplementada;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS_DECLARATION__INTERFACE_IMPLEMENTADA, oldInterfaceImplementada, interfaceImplementada));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInterfacesImplementadas()
  {
    if (interfacesImplementadas == null)
    {
      interfacesImplementadas = new EDataTypeEList<String>(String.class, this, MyDslPackage.CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS);
    }
    return interfacesImplementadas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field_declaration> getFieldsDeclaration()
  {
    if (fieldsDeclaration == null)
    {
      fieldsDeclaration = new EObjectContainmentEList<Field_declaration>(Field_declaration.class, this, MyDslPackage.CLASS_DECLARATION__FIELDS_DECLARATION);
    }
    return fieldsDeclaration;
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
      case MyDslPackage.CLASS_DECLARATION__FIELDS_DECLARATION:
        return ((InternalEList<?>)getFieldsDeclaration()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CLASS_DECLARATION__MODIFIERS:
        return getModifiers();
      case MyDslPackage.CLASS_DECLARATION__CLASS_NAME:
        return getClassName();
      case MyDslPackage.CLASS_DECLARATION__CLASS_HERDADA:
        return getClassHerdada();
      case MyDslPackage.CLASS_DECLARATION__INTERFACE_IMPLEMENTADA:
        return getInterfaceImplementada();
      case MyDslPackage.CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS:
        return getInterfacesImplementadas();
      case MyDslPackage.CLASS_DECLARATION__FIELDS_DECLARATION:
        return getFieldsDeclaration();
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
      case MyDslPackage.CLASS_DECLARATION__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.CLASS_DECLARATION__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case MyDslPackage.CLASS_DECLARATION__CLASS_HERDADA:
        setClassHerdada((String)newValue);
        return;
      case MyDslPackage.CLASS_DECLARATION__INTERFACE_IMPLEMENTADA:
        setInterfaceImplementada((String)newValue);
        return;
      case MyDslPackage.CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS:
        getInterfacesImplementadas().clear();
        getInterfacesImplementadas().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.CLASS_DECLARATION__FIELDS_DECLARATION:
        getFieldsDeclaration().clear();
        getFieldsDeclaration().addAll((Collection<? extends Field_declaration>)newValue);
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
      case MyDslPackage.CLASS_DECLARATION__MODIFIERS:
        getModifiers().clear();
        return;
      case MyDslPackage.CLASS_DECLARATION__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case MyDslPackage.CLASS_DECLARATION__CLASS_HERDADA:
        setClassHerdada(CLASS_HERDADA_EDEFAULT);
        return;
      case MyDslPackage.CLASS_DECLARATION__INTERFACE_IMPLEMENTADA:
        setInterfaceImplementada(INTERFACE_IMPLEMENTADA_EDEFAULT);
        return;
      case MyDslPackage.CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS:
        getInterfacesImplementadas().clear();
        return;
      case MyDslPackage.CLASS_DECLARATION__FIELDS_DECLARATION:
        getFieldsDeclaration().clear();
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
      case MyDslPackage.CLASS_DECLARATION__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case MyDslPackage.CLASS_DECLARATION__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case MyDslPackage.CLASS_DECLARATION__CLASS_HERDADA:
        return CLASS_HERDADA_EDEFAULT == null ? classHerdada != null : !CLASS_HERDADA_EDEFAULT.equals(classHerdada);
      case MyDslPackage.CLASS_DECLARATION__INTERFACE_IMPLEMENTADA:
        return INTERFACE_IMPLEMENTADA_EDEFAULT == null ? interfaceImplementada != null : !INTERFACE_IMPLEMENTADA_EDEFAULT.equals(interfaceImplementada);
      case MyDslPackage.CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS:
        return interfacesImplementadas != null && !interfacesImplementadas.isEmpty();
      case MyDslPackage.CLASS_DECLARATION__FIELDS_DECLARATION:
        return fieldsDeclaration != null && !fieldsDeclaration.isEmpty();
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
    result.append(" (modifiers: ");
    result.append(modifiers);
    result.append(", className: ");
    result.append(className);
    result.append(", classHerdada: ");
    result.append(classHerdada);
    result.append(", interfaceImplementada: ");
    result.append(interfaceImplementada);
    result.append(", interfacesImplementadas: ");
    result.append(interfacesImplementadas);
    result.append(')');
    return result.toString();
  }

} //Class_declarationImpl
