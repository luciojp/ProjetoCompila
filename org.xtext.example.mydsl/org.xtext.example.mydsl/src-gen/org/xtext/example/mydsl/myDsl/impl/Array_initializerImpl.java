/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Array_initializer;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Variable_initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl#getVariableinitializer <em>Variableinitializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Array_initializerImpl extends MinimalEObjectImpl.Container implements Array_initializer
{
  /**
   * The cached value of the '{@link #getVariableinitializer() <em>Variableinitializer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableinitializer()
   * @generated
   * @ordered
   */
  protected EList<Variable_initializer> variableinitializer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Array_initializerImpl()
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
    return MyDslPackage.Literals.ARRAY_INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable_initializer> getVariableinitializer()
  {
    if (variableinitializer == null)
    {
      variableinitializer = new EObjectContainmentEList<Variable_initializer>(Variable_initializer.class, this, MyDslPackage.ARRAY_INITIALIZER__VARIABLEINITIALIZER);
    }
    return variableinitializer;
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
      case MyDslPackage.ARRAY_INITIALIZER__VARIABLEINITIALIZER:
        return ((InternalEList<?>)getVariableinitializer()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ARRAY_INITIALIZER__VARIABLEINITIALIZER:
        return getVariableinitializer();
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
      case MyDslPackage.ARRAY_INITIALIZER__VARIABLEINITIALIZER:
        getVariableinitializer().clear();
        getVariableinitializer().addAll((Collection<? extends Variable_initializer>)newValue);
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
      case MyDslPackage.ARRAY_INITIALIZER__VARIABLEINITIALIZER:
        getVariableinitializer().clear();
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
      case MyDslPackage.ARRAY_INITIALIZER__VARIABLEINITIALIZER:
        return variableinitializer != null && !variableinitializer.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Array_initializerImpl
