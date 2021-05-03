package com.pault.spring.core.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext =  new AnnotationConfigApplicationContext(MessageConfiguration.class);
		
		//appContext.getBean(MessagePublisher.class).publishMessage();
		
		appContext.start();
		appContext.stop();
		appContext.close();
		
		//appContext.close();
		
	}

}
