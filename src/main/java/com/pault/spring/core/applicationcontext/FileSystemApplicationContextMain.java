package com.pault.spring.core.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemApplicationContextMain {

	private static String url1 = "file:///Users/paulthomas/workspace-spring-tool-suite-4-4.10.0.RELEASE/spring-core-tasks/src/main/resources/applicationContext-album.xml";
	private static String url2 = "file:///Users/paulthomas/workspace-spring-tool-suite-4-4.10.0.RELEASE/spring-core-tasks/src/main/resources/applicationContext-song.xml";

			
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(url1, url2);
		
	    System.out.println(applicationContext.getBean(Album.class));
	    System.out.println(applicationContext.getBean(Song.class));
		
		((AbstractApplicationContext)applicationContext).close();


	}

}
