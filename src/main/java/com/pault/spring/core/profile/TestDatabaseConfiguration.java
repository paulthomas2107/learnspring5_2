package com.pault.spring.core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Test")
public class TestDatabaseConfiguration implements DatabaseConfiguration {

	public void doSetUp() {
		System.out.println("[Test] database configuration set up done");
		
	}

}
