package com.pault.spring.core.aware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomResourceLoader implements ResourceLoaderAware {

	public void setResourceLoader(ResourceLoader resourceLoader)  	{
		
		Resource logo = resourceLoader.getResource("file:///Users/paulthomas/learnspring5_2/logo.txt");
	
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(logo.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e ) {
			throw new RuntimeException(e.getLocalizedMessage());
		}
	}

}
	