package org.stormdev.servermanager.api.messaging;

/**
 * Messaging is unavilable, most likely is that we could not connect to the intended recipient
 *
 */
public class MessagingUnavailableException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MessagingUnavailableException(){
		super("Messaging unavailable! Are we connected?");
	}
}
