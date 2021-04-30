package com.pault.spring.core.javaconfig.autowire.base.multi.locations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
		
		System.out.println(appContext.getBean(Artist.class));
		
		((AbstractApplicationContext)appContext).close();

	}

}
