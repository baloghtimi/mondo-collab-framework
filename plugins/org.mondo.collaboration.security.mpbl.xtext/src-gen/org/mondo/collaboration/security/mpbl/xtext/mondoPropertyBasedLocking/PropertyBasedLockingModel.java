/**
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Based Locking Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel#getLocks <em>Locks</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getPropertyBasedLockingModel()
 * @model
 * @generated
 */
public interface PropertyBasedLockingModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getPropertyBasedLockingModel_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Locks</b></em>' containment reference list.
   * The list contents are of type {@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locks</em>' containment reference list.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getPropertyBasedLockingModel_Locks()
   * @model containment="true"
   * @generated
   */
  EList<Lock> getLocks();

} // PropertyBasedLockingModel
