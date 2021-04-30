package com.pault.spring.core.instance.factory.instancefactory;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfiguration {
	
	@Bean
	public ReaderFactory readerFactory() {
		
		Map<ReaderType, Reader> readers = new LinkedHashMap<ReaderType, Reader>();
		readers.put(ReaderType.FILE_READER, new FileReader());
		readers.put(ReaderType.SOCKET_READER, new SocketReader());
		readers.put(ReaderType.DB_READER, new DBReader());
		
		ReaderFactory readerFactory = new ReaderFactory();
		readerFactory.setReaders(readers);
		
		return readerFactory;
	}
	
	@Bean
	public Reader fileReader() {
		return readerFactory().createReader(ReaderType.FILE_READER);
	}
	
	@Bean
	public Reader socketReader() {
		return readerFactory().createReader(ReaderType.SOCKET_READER);
		
	}
	
	@Bean
	public Reader dbReader() {
		return readerFactory().createReader(ReaderType.DB_READER);
		
	}
}

