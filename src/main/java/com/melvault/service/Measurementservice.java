package com.melvault.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.melvault.entity.MeasurementEntity;
import com.melvault.repository.MeasurementRepository;

@Service
public class Measurementservice {
	
	@Autowired
	public MeasurementRepository measurementrepository;

	public List<MeasurementEntity> findAll() {
		return measurementrepository.findAll();
	}

	public void save(MeasurementEntity measurementEntity) {
		measurementrepository.save(measurementEntity);
	}

	
	public List<MeasurementEntity> findAllByTimeBetweenhoursandminutes(LocalDateTime datetime) {
		return measurementrepository.findAllByTimeBetweenhoursandminutes(datetime);
	}
	


		
}
