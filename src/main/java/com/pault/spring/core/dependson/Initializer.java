package com.pault.spring.core.dependson;

import lombok.Data;

@Data
public class Initializer {
	
	static {
		System.out.println("001 " +Initializer.class.getName());
	}

}
