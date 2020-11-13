package com.melvault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melvault.entity.SensorConfig;
import com.melvault.repository.SensorConfigRepository;

@Service
public class SensorConfigService {
	
	@Autowired
	private SensorConfigRepository sensorconfigservice;

	
	
	public SensorConfig save(SensorConfig sensorconfig) {
		
		return sensorconfigservice.save(sensorconfig);
	}

	
	
	public List<SensorConfig> findAll() {
		
		return sensorconfigservice.findAll();
	}
	
	
	
	

}
