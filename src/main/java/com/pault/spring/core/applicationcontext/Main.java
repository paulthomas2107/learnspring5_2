package com.pault.spring.core.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-song.xml", "applicationContext-album.xml");
		
	    System.out.println(applicationContext.getBean(Song.class));
	    System.out.println(applicationContext.getBean(Album.class));
		
		((AbstractApplicationContext)applicationContext).close();


	}

}
