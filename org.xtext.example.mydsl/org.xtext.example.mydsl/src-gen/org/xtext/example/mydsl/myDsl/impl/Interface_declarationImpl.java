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

import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Interface_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl#getInterfaceHerdada <em>Interface Herdada</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl#getInterfacesHerdadas <em>Interfaces Herdadas</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl#getFieldsDeclaration <em>Fields Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_declarationImpl extends MinimalEObjectImpl.Container implements Interface_declaration
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
   * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
  protected String interfaceName = INTERFACE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getInterfaceHerdada() <em>Interface Herdada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceHerdada()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_HERDADA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfaceHerdada() <em>Interface Herdada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceHerdada()
   * @generated
   * @ordered
   */
  protected String interfaceHerdada = INTERFACE_HERDADA_EDEFAULT;

  /**
   * The cached value of the '{@link #getInterfacesHerdadas() <em>Interfaces Herdadas</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfacesHerdadas()
   * @generated
   * @ordered
   */
  protected EList<String> interfacesHerdadas;

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
  protected Interface_declarationImpl()
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
    return MyDslPackage.Literals.INTERFACE_DECLARATION;
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
      modifiers = new EDataTypeEList<String>(String.class, this, MyDslPackage.INTERFACE_DECLARATION__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfaceName()
  {
    return interfaceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceName(String newInterfaceName)
  {
    String oldInterfaceName = interfaceName;
    interfaceName = newInterfaceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERFACE_DECLARATION__INTERFACE_NAME, oldInterfaceName, interfaceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfaceHerdada()
  {
    return interfaceHerdada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceHerdada(String newInterfaceHerdada)
  {
    String oldInterfaceHerdada = interfaceHerdada;
    interfaceHerdada = newInterfaceHerdada;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERFACE_DECLARATION__INTERFACE_HERDADA, oldInterfaceHerdada, interfaceHerdada));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInterfacesHerdadas()
  {
    if (interfacesHerdadas == null)
    {
      interfacesHerdadas = new EDataTypeEList<String>(String.class, this, MyDslPackage.INTERFACE_DECLARATION__INTERFACES_HERDADAS);
    }
    return interfacesHerdadas;
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
      fieldsDeclaration = new EObjectContainmentEList<Field_declaration>(Field_declaration.class, this, MyDslPackage.INTERFACE_DECLARATION__FIELDS_DECLARATION);
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
      case MyDslPackage.INTERFACE_DECLARATION__FIELDS_DECLARATION:
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
      case MyDslPackage.INTERFACE_DECLARATION__MODIFIERS:
        return getModifiers();
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        return getInterfaceName();
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_HERDADA:
        return getInterfaceHerdada();
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACES_HERDADAS:
        return getInterfacesHerdadas();
      case MyDslPackage.INTERFACE_DECLARATION__FIELDS_DECLARATION:
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
      case MyDslPackage.INTERFACE_DECLARATION__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        setInterfaceName((String)newValue);
        return;
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_HERDADA:
        setInterfaceHerdada((String)newValue);
        return;
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACES_HERDADAS:
        getInterfacesHerdadas().clear();
        getInterfacesHerdadas().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.INTERFACE_DECLARATION__FIELDS_DECLARATION:
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
      case MyDslPackage.INTERFACE_DECLARATION__MODIFIERS:
        getModifiers().clear();
        return;
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        setInterfaceName(INTERFACE_NAME_EDEFAULT);
        return;
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_HERDADA:
        setInterfaceHerdada(INTERFACE_HERDADA_EDEFAULT);
        return;
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACES_HERDADAS:
        getInterfacesHerdadas().clear();
        return;
      case MyDslPackage.INTERFACE_DECLARATION__FIELDS_DECLARATION:
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
      case MyDslPackage.INTERFACE_DECLARATION__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACE_HERDADA:
        return INTERFACE_HERDADA_EDEFAULT == null ? interfaceHerdada != null : !INTERFACE_HERDADA_EDEFAULT.equals(interfaceHerdada);
      case MyDslPackage.INTERFACE_DECLARATION__INTERFACES_HERDADAS:
        return interfacesHerdadas != null && !interfacesHerdadas.isEmpty();
      case MyDslPackage.INTERFACE_DECLARATION__FIELDS_DECLARATION:
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
    result.append(", interfaceName: ");
    result.append(interfaceName);
    result.append(", interfaceHerdada: ");
    result.append(interfaceHerdada);
    result.append(", interfacesHerdadas: ");
    result.append(interfacesHerdadas);
    result.append(')');
    return result.toString();
  }

} //Interface_declarationImpl
