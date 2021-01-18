package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static  Properties ps;		
	
	
	public ConfigurationReader() throws IOException {
		
		File f = new File("src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
		FileInputStream fi = new FileInputStream(f);
		 ps = new Properties();
		 ps.load(fi);
	}
	
	public String BrowserName() {
		String browsername = ps.getProperty("BrowserName");
		//System.out.println(browsername);
		return browsername;
		
	}
	
	public String getUrl() {
		String url = ps.getProperty("Url");
		//System.out.println(url);
		return url;
		
	}
	
	public static void main(String[] args) throws IOException {
		ConfigurationReader confile = new ConfigurationReader();
		confile.BrowserName();
		confile.getUrl();
	}

}
  