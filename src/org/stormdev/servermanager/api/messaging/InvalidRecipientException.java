package org.stormdev.servermanager.api.messaging;

/**
 * The recipient is invalid, or not connected
 *
 */
public class InvalidRecipientException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidRecipientException(){
		super("Invalid message recipient!");
	}
}
