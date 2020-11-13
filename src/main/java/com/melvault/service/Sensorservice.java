package com.melvault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.melvault.entity.MeasurementEntity;
import com.melvault.entity.SensorEntity;
import com.melvault.repository.SensorRepository;

@Service
public class Sensorservice {
	
	@Autowired
	public SensorRepository sensorrepository;


	public List<SensorEntity> findAll() {
		return sensorrepository.findAll();
	}

	public SensorEntity findById(long id) {
		return sensorrepository.findById(id);
	}

	public List<SensorEntity> findAllByName(String name) {
		return sensorrepository.findAllByName(name);
	}

	public void save(MeasurementEntity measurementEntity) {
		sensorrepository.save(measurementEntity);	
	}
	
	public void save(SensorEntity sensorEntity) {
		sensorrepository.save(sensorEntity);	
	}
			
}
	    
