package com.hernandez.hibernate.configuration;



public class AppInitializer {
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}
 
	
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
 
	
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
