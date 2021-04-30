package com.pault.spring.core.dependson;

import lombok.Data;

@Data
public class InitializerDependent {
	
	public  void print() {
		System.out.println("002 " + this.getClass().getName());
	}

}
