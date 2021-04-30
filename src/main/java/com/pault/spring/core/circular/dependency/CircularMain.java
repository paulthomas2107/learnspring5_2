package com.pault.spring.core.circular.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CircularMain {

	public static void main(String[] args) {
		
		// Instantiate
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-circular.xml");
				
				
		// Get Bean Info
		applicationContext.getBean(Department.class);
		
				
		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
