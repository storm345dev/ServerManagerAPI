package org.stormdev.servermanager.api.messaging;

/**
 * The message sending failed!
 *
 */
public class MessageSendFailedException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MessageSendFailedException(){
		super("Failed to send message! Are we connected?");
	}
}
