package org.stormdev.servermanager.api;

import org.stormdev.servermanager.api.listeners.ListenerManager;
import org.stormdev.servermanager.api.messaging.Messager;
import org.stormdev.servermanager.api.messaging.Servers;

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
	/**
	 * Get all connected servers
	 * @return The connected servers
	 */
	public Servers getServers();
	/**
	 * Get the messenger to use for sending messages between servers
	 * @return The messenger to use for sending messages between servers
	 */
	public Messager getMessenger();
}
