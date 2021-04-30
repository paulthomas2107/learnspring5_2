package com.pault.spring.core.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(FileConfiguration.class);
		
		appContext.getBean(FileContext.class).readFile();
	
		appContext.close(); // destroy method is called

	}

}
