package com.adactin.utility;

import java.io.IOException;

public class Filereadermanager {
	
	private  Filereadermanager() {
		
	}
	
	
	public static Filereadermanager getfileinstance() {
		Filereadermanager fil = new Filereadermanager();
		return fil;
		
	}
	
	public ConfigurationReader getconinstance() throws IOException {
		ConfigurationReader config = new ConfigurationReader();
		return config; 
	}

}
