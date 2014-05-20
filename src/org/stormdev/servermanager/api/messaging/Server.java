package org.stormdev.servermanager.api.messaging;

/**
 * Represents a server with SMCore installed
 *
 */
public interface Server extends MessageAble {
	/**
	 * Get the ID of the server
	 * @return The ID as a string
	 */
	public String getServerID();
	/**
	 * Get the TicksPerSecond of the server
	 * @return The TPS as a double
	 */
	public double getTPS();
	/**
	 * The name to call this server by
	 * @return A user friendly server name
	 */
	public String getServerName();
	/**
	 * A brief description of the server
	 * @return A user friendly server description
	 */
	public String getDescription();
	/**
	 * Find out how many players are online
	 * @return How many players are online
	 */
	public int getOnlinePlayerCount();
	/**
	 * Determine the player limit
	 * @return The player limit
	 */
	public int getMaxPlayers();
	/**
	 * The resource score (TPS, RAM, etc) out of 100
	 * @return Resource Score as an int (percentage of 100)
	 */
	public int getResourceScore();
	/**
	 * Is the server open to more players joining?
	 * @return True if open, false if not
	 */
	public boolean isOpen();
}
