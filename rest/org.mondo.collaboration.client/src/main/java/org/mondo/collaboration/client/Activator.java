package org.mondo.collaboration.client;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "mondo.collab.client.skeleton"; //$NON-NLS-1$
	static Client client ;

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		plugin = this;

		 client = new Client();
		{
			String url = "http://localhost:9090/services/emfgit";
		
			WebResource resource = client.resource(url);
			try{
				Builder builder = resource.accept("application/json");
				String helloString = builder.get(String.class);
				System.out.println(helloString);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		 IWorkspace workspace = ResourcesPlugin.getWorkspace();
		   IResourceChangeListener listener = new IResourceChangeListener() {
		      public void resourceChanged(IResourceChangeEvent event) {
		         System.out.println("IResourceChangeListener");
		      }
		   };
		   workspace.addResourceChangeListener(listener);
		
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	public static Client getClient() {
		return client;
	}

}
