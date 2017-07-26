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

import org.xtext.example.mydsl.myDsl.Constructor_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Parameter_list;
import org.xtext.example.mydsl.myDsl.Statement_block;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl#getModifiersConstructor <em>Modifiers Constructor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl#getNameConstructor <em>Name Constructor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl#getParameterListConstructor <em>Parameter List Constructor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl#getStatementConstructor <em>Statement Constructor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Constructor_declarationImpl extends MinimalEObjectImpl.Container implements Constructor_declaration
{
  /**
   * The cached value of the '{@link #getModifiersConstructor() <em>Modifiers Constructor</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiersConstructor()
   * @generated
   * @ordered
   */
  protected EList<String> modifiersConstructor;

  /**
   * The default value of the '{@link #getNameConstructor() <em>Name Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameConstructor()
   * @generated
   * @ordered
   */
  protected static final String NAME_CONSTRUCTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameConstructor() <em>Name Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameConstructor()
   * @generated
   * @ordered
   */
  protected String nameConstructor = NAME_CONSTRUCTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getLParen() <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLParen()
   * @generated
   * @ordered
   */
  protected static final String LPAREN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLParen() <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLParen()
   * @generated
   * @ordered
   */
  protected String lParen = LPAREN_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterListConstructor() <em>Parameter List Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterListConstructor()
   * @generated
   * @ordered
   */
  protected Parameter_list parameterListConstructor;

  /**
   * The default value of the '{@link #getRparent() <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRparent()
   * @generated
   * @ordered
   */
  protected static final String RPARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRparent() <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRparent()
   * @generated
   * @ordered
   */
  protected String rparent = RPARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatementConstructor() <em>Statement Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementConstructor()
   * @generated
   * @ordered
   */
  protected Statement_block statementConstructor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Constructor_declarationImpl()
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
    return MyDslPackage.Literals.CONSTRUCTOR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModifiersConstructor()
  {
    if (modifiersConstructor == null)
    {
      modifiersConstructor = new EDataTypeEList<String>(String.class, this, MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR);
    }
    return modifiersConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameConstructor()
  {
    return nameConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameConstructor(String newNameConstructor)
  {
    String oldNameConstructor = nameConstructor;
    nameConstructor = newNameConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR, oldNameConstructor, nameConstructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLParen()
  {
    return lParen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLParen(String newLParen)
  {
    String oldLParen = lParen;
    lParen = newLParen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__LPAREN, oldLParen, lParen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter_list getParameterListConstructor()
  {
    return parameterListConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterListConstructor(Parameter_list newParameterListConstructor, NotificationChain msgs)
  {
    Parameter_list oldParameterListConstructor = parameterListConstructor;
    parameterListConstructor = newParameterListConstructor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, oldParameterListConstructor, newParameterListConstructor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterListConstructor(Parameter_list newParameterListConstructor)
  {
    if (newParameterListConstructor != parameterListConstructor)
    {
      NotificationChain msgs = null;
      if (parameterListConstructor != null)
        msgs = ((InternalEObject)parameterListConstructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, null, msgs);
      if (newParameterListConstructor != null)
        msgs = ((InternalEObject)newParameterListConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, null, msgs);
      msgs = basicSetParameterListConstructor(newParameterListConstructor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, newParameterListConstructor, newParameterListConstructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRparent()
  {
    return rparent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRparent(String newRparent)
  {
    String oldRparent = rparent;
    rparent = newRparent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_block getStatementConstructor()
  {
    return statementConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementConstructor(Statement_block newStatementConstructor, NotificationChain msgs)
  {
    Statement_block oldStatementConstructor = statementConstructor;
    statementConstructor = newStatementConstructor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR, oldStatementConstructor, newStatementConstructor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementConstructor(Statement_block newStatementConstructor)
  {
    if (newStatementConstructor != statementConstructor)
    {
      NotificationChain msgs = null;
      if (statementConstructor != null)
        msgs = ((InternalEObject)statementConstructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR, null, msgs);
      if (newStatementConstructor != null)
        msgs = ((InternalEObject)newStatementConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR, null, msgs);
      msgs = basicSetStatementConstructor(newStatementConstructor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR, newStatementConstructor, newStatementConstructor));
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        return basicSetParameterListConstructor(null, msgs);
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        return basicSetStatementConstructor(null, msgs);
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        return getModifiersConstructor();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        return getNameConstructor();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__LPAREN:
        return getLParen();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        return getParameterListConstructor();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__RPARENT:
        return getRparent();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        return getStatementConstructor();
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        getModifiersConstructor().clear();
        getModifiersConstructor().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        setNameConstructor((String)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__LPAREN:
        setLParen((String)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        setParameterListConstructor((Parameter_list)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__RPARENT:
        setRparent((String)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        setStatementConstructor((Statement_block)newValue);
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        getModifiersConstructor().clear();
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        setNameConstructor(NAME_CONSTRUCTOR_EDEFAULT);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__LPAREN:
        setLParen(LPAREN_EDEFAULT);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        setParameterListConstructor((Parameter_list)null);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        setStatementConstructor((Statement_block)null);
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        return modifiersConstructor != null && !modifiersConstructor.isEmpty();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        return NAME_CONSTRUCTOR_EDEFAULT == null ? nameConstructor != null : !NAME_CONSTRUCTOR_EDEFAULT.equals(nameConstructor);
      case MyDslPackage.CONSTRUCTOR_DECLARATION__LPAREN:
        return LPAREN_EDEFAULT == null ? lParen != null : !LPAREN_EDEFAULT.equals(lParen);
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        return parameterListConstructor != null;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        return statementConstructor != null;
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
    result.append(" (modifiersConstructor: ");
    result.append(modifiersConstructor);
    result.append(", nameConstructor: ");
    result.append(nameConstructor);
    result.append(", lParen: ");
    result.append(lParen);
    result.append(", rparent: ");
    result.append(rparent);
    result.append(')');
    return result.toString();
  }

} //Constructor_declarationImpl
