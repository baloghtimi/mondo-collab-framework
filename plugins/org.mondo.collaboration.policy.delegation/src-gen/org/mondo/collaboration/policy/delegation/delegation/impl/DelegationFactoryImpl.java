/**
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.policy.delegation.delegation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mondo.collaboration.policy.delegation.delegation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelegationFactoryImpl extends EFactoryImpl implements DelegationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DelegationFactory init()
  {
    try
    {
      DelegationFactory theDelegationFactory = (DelegationFactory)EPackage.Registry.INSTANCE.getEFactory(DelegationPackage.eNS_URI);
      if (theDelegationFactory != null)
      {
        return theDelegationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DelegationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelegationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DelegationPackage.DELEGATION_MODEL: return createDelegationModel();
      case DelegationPackage.DELEGATION: return createDelegation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelegationModel createDelegationModel()
  {
    DelegationModelImpl delegationModel = new DelegationModelImpl();
    return delegationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delegation createDelegation()
  {
    DelegationImpl delegation = new DelegationImpl();
    return delegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelegationPackage getDelegationPackage()
  {
    return (DelegationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DelegationPackage getPackage()
  {
    return DelegationPackage.eINSTANCE;
  }

} //DelegationFactoryImpl
