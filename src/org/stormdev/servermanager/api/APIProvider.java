package org.stormdev.servermanager.api;

public class APIProvider {
	private static volatile ServerManagerAPI api = null;
	
	@SuppressWarnings("unused")
	private static void setAPI(ServerManagerAPI ap){
		if(api != null){
			return;
		}
		api = ap;
	}
	
	/** Returns the API for you to use
	 * 
	 */
	public static ServerManagerAPI getAPI(){
		return api;
	}
}
