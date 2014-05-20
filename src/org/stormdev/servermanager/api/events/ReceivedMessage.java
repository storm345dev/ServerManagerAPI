package org.stormdev.servermanager.api.events;

import org.stormdev.servermanager.api.messaging.MessageRecipient;

/**
 * Represents a message received from another server/from the host
 *
 */
public interface ReceivedMessage {
	/**
	 * Get who sent the message
	 * @return A MessageRecipient for the sender
	 */
	public MessageRecipient getSender();
	/**
	 * Get the title of the message
	 * @return The message's title
	 */
	public String getTitle();
	/**
	 * Get the message body
	 * @return The message's body
	 */
	public String getMessage();
}
