package org.stormdev.servermanager.api.listeners;

/**
 * Manages events to do with SM
 *
 */
public interface ListenerManager {
	/**
	 * Register your listener, and events
	 * @param listener Your listener to register
	 */
	public void registerListener(SMListener listener);
	/**
	 * Call an event
	 * 
	 * @param event The event to call
	 */
	public void callEvent(SMEvent event);
}
