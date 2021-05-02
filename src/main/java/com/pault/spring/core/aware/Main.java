package com.pault.spring.core.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AwareConfiguration.class);
		
		((AbstractApplicationContext)appContext).close(); // destroy method is called

	}

}
