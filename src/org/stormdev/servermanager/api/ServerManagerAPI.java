package org.stormdev.servermanager.api;

import org.stormdev.servermanager.api.listeners.ListenerManager;

public interface ServerManagerAPI {
	/**
	 * Retrieve the supported version of the API
	 * @return The supported API version
	 */
	public double getAPIVersion();
	/**
	 * Retrieve the provider for the api, SMHost or SMCore?
	 * 
	 * @return Either APIProviderType.CORE or ..HOST
	 */
	public APIProviderType getProvider();
	/**
	 * Is this server connected to the network?
	 * 
	 * @return True if connected, false if not
	 */
	public boolean isConnected();
	
	/**
	 * Get the event manager for SMEvents
	 * @return The ListenerManager which handles events
	 */
	public ListenerManager getEventManager();
}
