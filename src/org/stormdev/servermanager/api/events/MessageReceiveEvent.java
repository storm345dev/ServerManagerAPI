package org.stormdev.servermanager.api.events;

import org.stormdev.servermanager.api.listeners.SMEvent;

public class MessageReceiveEvent implements SMEvent {

	private ReceivedMessage msg;
	public MessageReceiveEvent(ReceivedMessage msg){
		this.msg = msg;
	}
	
	public String getEventName() {
		return "Message Receive Event";
	}

	public Class<? extends SMEvent> getEventClass() {
		return MessageReceiveEvent.class;
	}

	public ReceivedMessage getMessage() {
		return msg;
	}
	
}
