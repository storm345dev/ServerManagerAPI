package org.stormdev.servermanager.api;

public class APIProvider {
	private static ServerManagerAPI api = null;
	
	@SuppressWarnings("unused")
	private static void setAPI(ServerManagerAPI api){
		if(api != null){
			return;
		}
		APIProvider.api = api;
	}
	
	/** Returns the API for you to use
	 * 
	 */
	public static ServerManagerAPI getAPI(){
		return api;
	}
}
