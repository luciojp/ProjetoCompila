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
import org.xtext.example.mydsl.myDsl.Variable_declarator;
import org.xtext.example.mydsl.myDsl.Variable_initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl#getNameVariable <em>Name Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl#getLenVector <em>Len Vector</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl#getVari <em>Vari</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Variable_declaratorImpl extends MinimalEObjectImpl.Container implements Variable_declarator
{
  /**
   * The default value of the '{@link #getNameVariable() <em>Name Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameVariable()
   * @generated
   * @ordered
   */
  protected static final String NAME_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameVariable() <em>Name Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameVariable()
   * @generated
   * @ordered
   */
  protected String nameVariable = NAME_VARIABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLenVector() <em>Len Vector</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLenVector()
   * @generated
   * @ordered
   */
  protected EList<String> lenVector;

  /**
   * The cached value of the '{@link #getVari() <em>Vari</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVari()
   * @generated
   * @ordered
   */
  protected Variable_initializer vari;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Variable_declaratorImpl()
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
    return MyDslPackage.Literals.VARIABLE_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameVariable()
  {
    return nameVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameVariable(String newNameVariable)
  {
    String oldNameVariable = nameVariable;
    nameVariable = newNameVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_DECLARATOR__NAME_VARIABLE, oldNameVariable, nameVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLenVector()
  {
    if (lenVector == null)
    {
      lenVector = new EDataTypeEList<String>(String.class, this, MyDslPackage.VARIABLE_DECLARATOR__LEN_VECTOR);
    }
    return lenVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_initializer getVari()
  {
    return vari;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVari(Variable_initializer newVari, NotificationChain msgs)
  {
    Variable_initializer oldVari = vari;
    vari = newVari;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_DECLARATOR__VARI, oldVari, newVari);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVari(Variable_initializer newVari)
  {
    if (newVari != vari)
    {
      NotificationChain msgs = null;
      if (vari != null)
        msgs = ((InternalEObject)vari).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_DECLARATOR__VARI, null, msgs);
      if (newVari != null)
        msgs = ((InternalEObject)newVari).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VARIABLE_DECLARATOR__VARI, null, msgs);
      msgs = basicSetVari(newVari, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VARIABLE_DECLARATOR__VARI, newVari, newVari));
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
      case MyDslPackage.VARIABLE_DECLARATOR__VARI:
        return basicSetVari(null, msgs);
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
      case MyDslPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        return getNameVariable();
      case MyDslPackage.VARIABLE_DECLARATOR__LEN_VECTOR:
        return getLenVector();
      case MyDslPackage.VARIABLE_DECLARATOR__VARI:
        return getVari();
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
      case MyDslPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        setNameVariable((String)newValue);
        return;
      case MyDslPackage.VARIABLE_DECLARATOR__LEN_VECTOR:
        getLenVector().clear();
        getLenVector().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.VARIABLE_DECLARATOR__VARI:
        setVari((Variable_initializer)newValue);
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
      case MyDslPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        setNameVariable(NAME_VARIABLE_EDEFAULT);
        return;
      case MyDslPackage.VARIABLE_DECLARATOR__LEN_VECTOR:
        getLenVector().clear();
        return;
      case MyDslPackage.VARIABLE_DECLARATOR__VARI:
        setVari((Variable_initializer)null);
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
      case MyDslPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        return NAME_VARIABLE_EDEFAULT == null ? nameVariable != null : !NAME_VARIABLE_EDEFAULT.equals(nameVariable);
      case MyDslPackage.VARIABLE_DECLARATOR__LEN_VECTOR:
        return lenVector != null && !lenVector.isEmpty();
      case MyDslPackage.VARIABLE_DECLARATOR__VARI:
        return vari != null;
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
    result.append(" (nameVariable: ");
    result.append(nameVariable);
    result.append(", lenVector: ");
    result.append(lenVector);
    result.append(')');
    return result.toString();
  }

} //Variable_declaratorImpl
