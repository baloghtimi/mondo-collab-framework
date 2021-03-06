package eu.mondo.collaboration.collabFramework;

import java.util.Set;

import javax.management.Query;

public interface IModelCollaboration<T> {

	public T checkoutModel(ILoginData loginData, IVersion version,
			IModel selectedModel);

	public T checkoutModel(ILoginData loginData, IVersion version,
			IModel selectedModel, Query query);

	public T merge(T rootModel, T modelA, T modelB);

	public T update(ILoginData loginData, IVersion version, Query query,
			T rootModel, T modelA, T modelB);

	public int commit(ILoginData loginData, T editedModel, String commitMessage);

	public int lock(ILoginData loginData, ILockQuery lockQuery);

	public int unlock(ILoginData loginData, int lockID);

	public Set<Integer> listLock(ILoginData loginData);

	public Set<String> log();

	public int setPermission(ILoginData loginData, IPermissionRule permissionRule);

	public int removePermission(ILoginData loginData, int permissionID);

	public Set<Integer> listPermissions(ILoginData loginData);
}
