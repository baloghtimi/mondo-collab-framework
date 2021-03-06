/**
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.policy.delegation.delegation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.Binding;
import org.mondo.collaboration.policy.rules.ModelFact;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.Role;
import org.mondo.collaboration.policy.rules.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getName <em>Name</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getSource <em>Source</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getAccess <em>Access</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation()
 * @model
 * @generated
 */
public interface Delegation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(User)
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Source()
   * @model
   * @generated
   */
  User getSource();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(User value);

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link org.mondo.collaboration.policy.rules.AccessibilityLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.mondo.collaboration.policy.rules.AccessibilityLevel
   * @see #setAccess(AccessibilityLevel)
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Access()
   * @model
   * @generated
   */
  AccessibilityLevel getAccess();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see org.mondo.collaboration.policy.rules.AccessibilityLevel
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessibilityLevel value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The literals are from the enumeration {@link org.mondo.collaboration.policy.rules.OperationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see org.mondo.collaboration.policy.rules.OperationType
   * @see #setOperation(OperationType)
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Operation()
   * @model
   * @generated
   */
  OperationType getOperation();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see org.mondo.collaboration.policy.rules.OperationType
   * @see #getOperation()
   * @generated
   */
  void setOperation(OperationType value);

  /**
   * Returns the value of the '<em><b>Targets</b></em>' reference list.
   * The list contents are of type {@link org.mondo.collaboration.policy.rules.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets</em>' reference list.
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Targets()
   * @model
   * @generated
   */
  EList<Role> getTargets();

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(Pattern)
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Pattern()
   * @model
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asset</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(ModelFact)
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Asset()
   * @model containment="true"
   * @generated
   */
  ModelFact getAsset();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.delegation.delegation.Delegation#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
  void setAsset(ModelFact value);

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.mondo.collaboration.policy.rules.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see org.mondo.collaboration.policy.delegation.delegation.DelegationPackage#getDelegation_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBindings();

} // Delegation
