package com.pault.spring.core.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;

@Data
public class CollectionHolder {
	
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	private List<Player> myPlayers;
	private Properties properties;
  
}
