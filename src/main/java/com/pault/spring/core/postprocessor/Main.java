package com.pault.spring.core.postprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		appContext.close(); // destroy method is called
		
		// Added this

	}

}
