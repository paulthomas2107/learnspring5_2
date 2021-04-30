package com.pault.spring.core.javaconfig.depends.on;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);
		
		appContext.getBean(Initialization.class).print();
	
		((AbstractApplicationContext)appContext).close();

	}

}
