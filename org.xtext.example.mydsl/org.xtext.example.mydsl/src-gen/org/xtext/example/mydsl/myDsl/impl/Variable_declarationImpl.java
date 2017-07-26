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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.Variable_declaration;
import org.xtext.example.mydsl.myDsl.Variable_declarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl#getModifiersVariable <em>Modifiers Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl#getNameVariable <em>Name Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Variable_declarationImpl extends MinimalEObjectImpl.Container implements Variable_declaration
{
  /**
   * The cached value of the '{@link #getModifiersVariable() <em>Modifiers Variable</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiersVariable()
   * @generated
   * @ordered
   */
  protected EList<String> modifiersVariable;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getNameVariable() <em>Name Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameVariable()
   * @generated
   * @ordered
   */
  protected Variable_declarator nameVariable;

  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected EList<Variable_declarator> names;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Variable_declarationImpl()
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
    return MyDslPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModifiersVariable()
  {
    if (modifiersVariable == null)
    {
      modifiersVariable = new EDataTypeEList<String>(String.class, this, MyDslPackage.VARIABLE_DECLARATION__MODIFIERS_VARIABLE);
    }
    return modifiersVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declarator getNameVariable()
  {
    return nameVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameVariable(Variable_declarator newNameVariable, NotificationChain msgs)
  {
    Variable_declarator oldNameVariable = nameVariable;
    nameVariable = newNameVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE, oldNameVariable, newNameVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameVariable(Variable_declarator newNameVariable)
  {
    if (newNameVariable != nameVariable)
    {
      NotificationChain msgs = null;
      if (nameVariable != null)
        msgs = ((InternalEObject)nameVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE, null, msgs);
      if (newNameVariable != null)
        msgs = ((InternalEObject)newNameVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE, null, msgs);
      msgs = basicSetNameVariable(newNameVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE, newNameVariable, newNameVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable_declarator> getNames()
  {
    if (names == null)
    {
      names = new EObjectContainmentEList<Variable_declarator>(Variable_declarator.class, this, MyDslPackage.VARIABLE_DECLARATION__NAMES);
    }
    return names;
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
      case MyDslPackage.VARIABLE_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE:
        return basicSetNameVariable(null, msgs);
      case MyDslPackage.VARIABLE_DECLARATION__NAMES:
        return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.VARIABLE_DECLARATION__MODIFIERS_VARIABLE:
        return getModifiersVariable();
      case MyDslPackage.VARIABLE_DECLARATION__TYPE:
        return getType();
      case MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE:
        return getNameVariable();
      case MyDslPackage.VARIABLE_DECLARATION__NAMES:
        return getNames();
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
      case MyDslPackage.VARIABLE_DECLARATION__MODIFIERS_VARIABLE:
        getModifiersVariable().clear();
        getModifiersVariable().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.VARIABLE_DECLARATION__TYPE:
        setType((Type)newValue);
        return;
      case MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE:
        setNameVariable((Variable_declarator)newValue);
        return;
      case MyDslPackage.VARIABLE_DECLARATION__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends Variable_declarator>)newValue);
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
      case MyDslPackage.VARIABLE_DECLARATION__MODIFIERS_VARIABLE:
        getModifiersVariable().clear();
        return;
      case MyDslPackage.VARIABLE_DECLARATION__TYPE:
        setType((Type)null);
        return;
      case MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE:
        setNameVariable((Variable_declarator)null);
        return;
      case MyDslPackage.VARIABLE_DECLARATION__NAMES:
        getNames().clear();
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
      case MyDslPackage.VARIABLE_DECLARATION__MODIFIERS_VARIABLE:
        return modifiersVariable != null && !modifiersVariable.isEmpty();
      case MyDslPackage.VARIABLE_DECLARATION__TYPE:
        return type != null;
      case MyDslPackage.VARIABLE_DECLARATION__NAME_VARIABLE:
        return nameVariable != null;
      case MyDslPackage.VARIABLE_DECLARATION__NAMES:
        return names != null && !names.isEmpty();
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
    result.append(" (modifiersVariable: ");
    result.append(modifiersVariable);
    result.append(')');
    return result.toString();
  }

} //Variable_declarationImpl
