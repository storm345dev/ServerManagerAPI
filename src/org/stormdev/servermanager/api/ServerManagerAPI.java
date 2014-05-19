package org.stormdev.servermanager.api;

public interface ServerManagerAPI {
	public double getVersion();
	public APIProviderType getProvider();
	public boolean isConnected();
}
