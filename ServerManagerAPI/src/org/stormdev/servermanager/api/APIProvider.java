package org.stormdev.servermanager.api;

public class APIProvider {
	private static ServerManagerAPI api = null;
	
	private static void setAPI(ServerManagerAPI api){
		if(api != null){
			return;
		}
		APIProvider.api = api;
	}
	
	public static ServerManagerAPI getAPI(){
		return api;
	}
}
