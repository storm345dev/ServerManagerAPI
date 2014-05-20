package org.stormdev.servermanager.api.messaging;

/**
 * Utility for sending messages between servers
 *
 */
public interface Messager {
	/**
	 * Check if messaging is available, eg. in SMCore; is the server connected to SMHost
	 * @return
	 */
	public boolean isMessagingAvailable();
	/**
	 * Sends a message to the intended recipient
	 * 
	 * @param recipient Who to send the message to
	 * @param title The title of the message
	 * @param message The message to send
	 */
	public void sendMessage(MessageRecipient recipient, String title, String message) throws InvalidRecipientException, MessagingUnavailableException, MessageSendFailedException;
}
