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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Statement_block;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl#getRCurly <em>RCurly</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl#getStatments <em>Statments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl#getLCurly <em>LCurly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Statement_blockImpl extends MinimalEObjectImpl.Container implements Statement_block
{
  /**
   * The default value of the '{@link #getRCurly() <em>RCurly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRCurly()
   * @generated
   * @ordered
   */
  protected static final String RCURLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRCurly() <em>RCurly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRCurly()
   * @generated
   * @ordered
   */
  protected String rCurly = RCURLY_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatments() <em>Statments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatments()
   * @generated
   * @ordered
   */
  protected EList<Statement> statments;

  /**
   * The default value of the '{@link #getLCurly() <em>LCurly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLCurly()
   * @generated
   * @ordered
   */
  protected static final String LCURLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLCurly() <em>LCurly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLCurly()
   * @generated
   * @ordered
   */
  protected String lCurly = LCURLY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Statement_blockImpl()
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
    return MyDslPackage.Literals.STATEMENT_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRCurly()
  {
    return rCurly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRCurly(String newRCurly)
  {
    String oldRCurly = rCurly;
    rCurly = newRCurly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT_BLOCK__RCURLY, oldRCurly, rCurly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatments()
  {
    if (statments == null)
    {
      statments = new EObjectContainmentEList<Statement>(Statement.class, this, MyDslPackage.STATEMENT_BLOCK__STATMENTS);
    }
    return statments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLCurly()
  {
    return lCurly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLCurly(String newLCurly)
  {
    String oldLCurly = lCurly;
    lCurly = newLCurly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT_BLOCK__LCURLY, oldLCurly, lCurly));
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
      case MyDslPackage.STATEMENT_BLOCK__STATMENTS:
        return ((InternalEList<?>)getStatments()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.STATEMENT_BLOCK__RCURLY:
        return getRCurly();
      case MyDslPackage.STATEMENT_BLOCK__STATMENTS:
        return getStatments();
      case MyDslPackage.STATEMENT_BLOCK__LCURLY:
        return getLCurly();
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
      case MyDslPackage.STATEMENT_BLOCK__RCURLY:
        setRCurly((String)newValue);
        return;
      case MyDslPackage.STATEMENT_BLOCK__STATMENTS:
        getStatments().clear();
        getStatments().addAll((Collection<? extends Statement>)newValue);
        return;
      case MyDslPackage.STATEMENT_BLOCK__LCURLY:
        setLCurly((String)newValue);
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
      case MyDslPackage.STATEMENT_BLOCK__RCURLY:
        setRCurly(RCURLY_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT_BLOCK__STATMENTS:
        getStatments().clear();
        return;
      case MyDslPackage.STATEMENT_BLOCK__LCURLY:
        setLCurly(LCURLY_EDEFAULT);
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
      case MyDslPackage.STATEMENT_BLOCK__RCURLY:
        return RCURLY_EDEFAULT == null ? rCurly != null : !RCURLY_EDEFAULT.equals(rCurly);
      case MyDslPackage.STATEMENT_BLOCK__STATMENTS:
        return statments != null && !statments.isEmpty();
      case MyDslPackage.STATEMENT_BLOCK__LCURLY:
        return LCURLY_EDEFAULT == null ? lCurly != null : !LCURLY_EDEFAULT.equals(lCurly);
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
    result.append(" (rCurly: ");
    result.append(rCurly);
    result.append(", lCurly: ");
    result.append(lCurly);
    result.append(')');
    return result.toString();
  }

} //Statement_blockImpl
