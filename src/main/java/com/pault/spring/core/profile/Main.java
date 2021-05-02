package com.pault.spring.core.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		
		//appContext.getEnvironment().setActiveProfiles("Dev");
		appContext.getEnvironment().setDefaultProfiles("Test");
		// -Dspring.profiles.active=Test ---> Can be set in arguments
		
		appContext.scan("com.pault.spring.core.profile");
		appContext.refresh();
		
		appContext.getBean("databaseConfigurationHandler", DatabaseConfigurationHandler.class).print();
		
		((AbstractApplicationContext)appContext).close(); // destroy method is called
		
		

	}

}
