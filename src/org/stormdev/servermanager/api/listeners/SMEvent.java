package org.stormdev.servermanager.api.listeners;

/**
 * Events for use with SM
 *
 */
public interface SMEvent {
	/**
	 * The name for this event
	 * @return The name of this event
	 */
	public String getEventName();
	/**
	 * The class that represents this class, normally just 'return this.class;'
	 * @return Normally 'return this.class;'
	 */
	public Class<? extends SMEvent> getEventClass();
}
