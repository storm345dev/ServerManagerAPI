package org.stormdev.servermanager.api.events;

import org.stormdev.servermanager.api.listeners.SMEvent;

/**
 * SMEvent for when a message is received
 *
 */
public interface MessageReceiveEvent extends SMEvent {
	/**
	 * Get the message that was received
	 * @return The message received
	 */
	public ReceivedMessage getMessage();
}
