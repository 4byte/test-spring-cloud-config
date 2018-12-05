package com.ex.microservices.lab.statistics.statisticsservice.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NameService {
	private Map<String,Long> namesMap;

	public NameService() {
		namesMap = new HashMap<>();
	}

	public Map<String, Long> getNamesMap() {
		return namesMap;
	}

	public void setNamesMap(Map<String, Long> namesMap) {
		this.namesMap = namesMap;
	}

	public void addName(String name){
		Long v = namesMap.getOrDefault(name, 0L);
		namesMap.put(name, v + 1);
	}
}
