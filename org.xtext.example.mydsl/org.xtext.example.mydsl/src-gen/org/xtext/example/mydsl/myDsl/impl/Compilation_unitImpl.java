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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Compilation_unit;
import org.xtext.example.mydsl.myDsl.Import_statement;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Package_statement;
import org.xtext.example.mydsl.myDsl.Type_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl#getTypeDeclarations <em>Type Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Compilation_unitImpl extends MinimalEObjectImpl.Container implements Compilation_unit
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Package_statement name;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import_statement> imports;

  /**
   * The cached value of the '{@link #getTypeDeclarations() <em>Type Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Type_declaration> typeDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Compilation_unitImpl()
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
    return MyDslPackage.Literals.COMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Package_statement getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Package_statement newName, NotificationChain msgs)
  {
    Package_statement oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMPILATION_UNIT__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Package_statement newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMPILATION_UNIT__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMPILATION_UNIT__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMPILATION_UNIT__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import_statement> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import_statement>(Import_statement.class, this, MyDslPackage.COMPILATION_UNIT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type_declaration> getTypeDeclarations()
  {
    if (typeDeclarations == null)
    {
      typeDeclarations = new EObjectContainmentEList<Type_declaration>(Type_declaration.class, this, MyDslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS);
    }
    return typeDeclarations;
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
      case MyDslPackage.COMPILATION_UNIT__NAME:
        return basicSetName(null, msgs);
      case MyDslPackage.COMPILATION_UNIT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MyDslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return ((InternalEList<?>)getTypeDeclarations()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.COMPILATION_UNIT__NAME:
        return getName();
      case MyDslPackage.COMPILATION_UNIT__IMPORTS:
        return getImports();
      case MyDslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return getTypeDeclarations();
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
      case MyDslPackage.COMPILATION_UNIT__NAME:
        setName((Package_statement)newValue);
        return;
      case MyDslPackage.COMPILATION_UNIT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import_statement>)newValue);
        return;
      case MyDslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        getTypeDeclarations().clear();
        getTypeDeclarations().addAll((Collection<? extends Type_declaration>)newValue);
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
      case MyDslPackage.COMPILATION_UNIT__NAME:
        setName((Package_statement)null);
        return;
      case MyDslPackage.COMPILATION_UNIT__IMPORTS:
        getImports().clear();
        return;
      case MyDslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        getTypeDeclarations().clear();
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
      case MyDslPackage.COMPILATION_UNIT__NAME:
        return name != null;
      case MyDslPackage.COMPILATION_UNIT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MyDslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return typeDeclarations != null && !typeDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Compilation_unitImpl
