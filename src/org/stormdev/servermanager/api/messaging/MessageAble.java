package org.stormdev.servermanager.api.messaging;

/**
 * Something, such as a server, which you can send plugin messages to
 *
 */
public interface MessageAble {
	/**
	 * Get it as a MessageRecipient to send messages to, etc
	 * @return A MessageRecipient object
	 */
	public MessageRecipient getAsMessageRecipient();
	/**
	 * Send a plugin message to this server (For you to handle with an event, etc?)
	 * 
	 * @param title The title of the message to send
	 * @param message The message to send
	 */
	public void sendMessage(String title, String message) throws InvalidRecipientException, MessagingUnavailableException, MessageSendFailedException;
}
