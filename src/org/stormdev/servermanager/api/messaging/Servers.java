package org.stormdev.servermanager.api.messaging;

import java.util.Map;

/**
 * Retrieve servers available
 *
 */
public interface Servers {
	/**
	 * Returns a map of serverID|Server
	 * @return All connected servers
	 */
	public Map<String, Server> getServers();
	/**
	 * Check is a server is connected
	 * @param serverID The name of the server to check 
	 * @return True if connected, false if not
	 */
	public boolean isServerConnected(String serverID);
	/**
	 * Get a server by name
	 * 
	 * @param serverID The name of the server to get
	 * @return Null if not found, the server otherwise
	 */
	public Server getServer(String serverID);
}
