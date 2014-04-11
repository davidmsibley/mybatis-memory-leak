package com.example;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author dmsibley
 */
public class WebAppBase extends ResourceConfig {
	
	public WebAppBase() {
		packages(this.getClass().getPackage().getName());
		register(JacksonFeature.class);
	}
}
