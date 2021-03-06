/**
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingPackage
 * @generated
 */
public class MondoPropertyBasedLockingAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MondoPropertyBasedLockingPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MondoPropertyBasedLockingAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MondoPropertyBasedLockingPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MondoPropertyBasedLockingSwitch<Adapter> modelSwitch =
    new MondoPropertyBasedLockingSwitch<Adapter>()
    {
      @Override
      public Adapter casePropertyBasedLockingModel(PropertyBasedLockingModel object)
      {
        return createPropertyBasedLockingModelAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseUser(User object)
      {
        return createUserAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseLock(Lock object)
      {
        return createLockAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseBind(Bind object)
      {
        return createBindAdapter();
      }
      @Override
      public Adapter caseRoleBind(RoleBind object)
      {
        return createRoleBindAdapter();
      }
      @Override
      public Adapter caseValueBind(ValueBind object)
      {
        return createValueBindAdapter();
      }
      @Override
      public Adapter caseObjectBind(ObjectBind object)
      {
        return createObjectBindAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel <em>Property Based Locking Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel
   * @generated
   */
  public Adapter createPropertyBasedLockingModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock <em>Lock</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock
   * @generated
   */
  public Adapter createLockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Bind
   * @generated
   */
  public Adapter createBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.RoleBind <em>Role Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.RoleBind
   * @generated
   */
  public Adapter createRoleBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.ValueBind <em>Value Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.ValueBind
   * @generated
   */
  public Adapter createValueBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.ObjectBind <em>Object Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.ObjectBind
   * @generated
   */
  public Adapter createObjectBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MondoPropertyBasedLockingAdapterFactory
