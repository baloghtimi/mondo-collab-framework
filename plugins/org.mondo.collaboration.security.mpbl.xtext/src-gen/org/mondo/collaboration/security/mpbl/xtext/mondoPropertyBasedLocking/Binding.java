/**
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.viatra.query.patternlanguage.emf.vql.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding#getParam <em>Param</em>}</li>
 *   <li>{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(Variable)
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getBinding_Param()
   * @model
   * @generated
   */
  Variable getParam();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Variable value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Bind)
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getBinding_Value()
   * @model containment="true"
   * @generated
   */
  Bind getValue();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Bind value);

} // Binding
