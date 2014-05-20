package org.stormdev.servermanager.api.messaging;

/**
 * Preset and ability to create own MessageRecipients, these are who you can send messages to
 *
 */
public class MessageRecipient {
	
	/**
	 * Messages to be sent to SMHost
	 */
	public static final MessageRecipient HOST = create("HOST");
	/**
	 * Messages to be sent to ALL servers
	 */
	public static final MessageRecipient ALL = create("ALL");
	
	/**
	 * Create a new recipient from connectionID (Same as serverID)
	 * 
	 * @param connectionId The connectionID to create a recipient for
	 * @return A MessageRecipient
	 */
	public static MessageRecipient create(String connectionId){ //Use a factory method in case we need to check or register stuff later
		return new MessageRecipient(connectionId);
	}

	private String connectionId;
	private MessageRecipient(String connectionId){
		this.connectionId = connectionId;
	}
	
	/**
	 * Get the connectionID of the recipient
	 * 
	 * @return String containing connection ID
	 */
	public String getConnectionID(){
		return connectionId;
	}
}
