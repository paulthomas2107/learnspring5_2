package com.pault.spring.core.instance.factory.instancefactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ReaderConfiguration.class);
		
		appContext.getBean("fileReader", FileReader.class).read();
		
		appContext.getBean("socketReader", SocketReader.class).read();
		
		appContext.getBean("dbReader", DBReader.class).read();
		
		appContext.close(); // destroy method is called

	}

}
