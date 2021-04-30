package com.pault.spring.core.instance.factory.instancefactory;

import java.util.Map;

import lombok.Data;

@Data
public class ReaderFactory {

	private Map<ReaderType, Reader> readers = null;
	
	public Reader createReader(ReaderType readerType) {
		
		if (readers.containsKey(readerType)) {
			return readers.get(readerType);
		}
		
		throw new IllegalArgumentException("Invalid Reader Type");
				
	}
}
