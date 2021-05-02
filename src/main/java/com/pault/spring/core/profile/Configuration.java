package com.pault.spring.core.profile;

import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.pault.spring.core.profile")
public class Configuration {
	
	public DatabaseConfigurationHandler databaseConfigurationHandler() {
		return new DatabaseConfigurationHandler();
		
	}

}
