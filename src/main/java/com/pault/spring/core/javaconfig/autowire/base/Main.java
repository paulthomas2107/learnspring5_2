package com.pault.spring.core.javaconfig.autowire.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(UserConfiguration.class);
		
		appContext.getBean(UserService.class).save();
	
		
		((AbstractApplicationContext)appContext).close();

	}

}
