package com.melvault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melvault.entity.MeasurementEntity;
import com.melvault.entity.SensorConfig;
import com.melvault.repository.SensorConfigRepository;
import com.melvault.service.SensorConfigService;

@RestController
@RequestMapping("api/ecoren")
public class SensorConfigController {

	@Autowired
	private SensorConfigService sensorconfigservice;



	@PostMapping("/sensorconfig")
	public ResponseEntity<SensorConfig> createSensorConfig(@RequestBody SensorConfig sensorconfig)
	{
		SensorConfig updated = sensorconfigservice.save(sensorconfig);

		sensorconfigservice.save(sensorconfig);

		return new ResponseEntity<SensorConfig>(HttpStatus.OK);
	}

	

	@GetMapping("/sensorconfig")
	public ResponseEntity<List<SensorConfig>> getAllsensorconfig() {

		List<SensorConfig> list = sensorconfigservice.findAll();

		return new ResponseEntity<List<SensorConfig>>(list,HttpStatus.OK);
	}
}
