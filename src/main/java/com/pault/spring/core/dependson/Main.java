package com.pault.spring.core.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-depends-on.xml");
		
	    applicationContext.getBean(InitializerDependent.class).print();
		
		((AbstractApplicationContext)applicationContext).close();

		

	}

}
