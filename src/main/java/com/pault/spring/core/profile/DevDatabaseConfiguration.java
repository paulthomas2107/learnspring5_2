package com.pault.spring.core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Dev")
public class DevDatabaseConfiguration implements DatabaseConfiguration {

	public void doSetUp() {
		System.out.println("[DEV] database configuration set up done");
		
	}

}
