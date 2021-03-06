/**
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Group#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Role
{
  /**
   * Returns the value of the '<em><b>Users</b></em>' reference list.
   * The list contents are of type {@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.User}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Users</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Users</em>' reference list.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage#getGroup_Users()
   * @model
   * @generated
   */
  EList<User> getUsers();

} // Group
