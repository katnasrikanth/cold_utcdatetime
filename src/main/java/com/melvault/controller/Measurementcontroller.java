package com.melvault.controller;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.melvault.entity.MeasurementEntity;
import com.melvault.entity.SensorEntity;
import com.melvault.measurementinput.Measurementinput;
import com.melvault.repository.MeasurementRepository;
import com.melvault.repository.SensorRepository;
import com.melvault.service.Measurementservice;
import com.melvault.service.Sensorservice;

@RestController
@RequestMapping("api/ecoren")
public class Measurementcontroller {

	@Autowired
	private Sensorservice sensorservice;

	@Autowired
	private Measurementservice measurementservice;



	//Method retreives default 15minutes data
	@RequestMapping(value = "/measurements", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<MeasurementEntity> retriveByTime(
			@RequestParam(value = "time", required = false, defaultValue = "0") String time) {
		String substring = time.substring(0, 1);

		long i = Long.parseLong(substring);

		LocalDateTime datetime = LocalDateTime.now();
		ZonedDateTime zone = datetime.atZone(ZoneId.systemDefault());
		ZonedDateTime utc = zone.withZoneSameInstant(ZoneId.of("UTC"));
		datetime = utc.toLocalDateTime();
		datetime = time.equals("0") ? datetime.minusMinutes(15) : datetime.minusHours(i);

		return measurementservice.findAllByTimeBetweenhoursandminutes(datetime);
	}

	@GetMapping("/measurements/all")
	public List<SensorEntity> retrieveAllMeasurements() {
		return sensorservice.findAll();
	}

	//creates measurement data based on given valid sensorId
	@RequestMapping(value="/measurements",method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	public ResponseEntity createMeasurement(@RequestBody Measurementinput request) {
		
		Long time = Long.valueOf(new Date().getTime());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		String Date = sdf.format(new Date(time));

		SensorEntity sensorEntity = sensorservice.findById(request.getSensorId());
		if (sensorEntity == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("No sensor defined with the ID: " + request.getSensorId());
		}

		MeasurementEntity measurementEntity = new MeasurementEntity(	
				sensorEntity,Date,new java.util.Date(),request.getKey(),request.getPower(),
				request.getV2(),request.getV3(), request.getI1(),request.getI2(),request.getI3(),request.getCe(),request.getPf2(),
				request.getPf3(),request.getP1(),request.getP2(),request.getP3(),System.currentTimeMillis());
		sensorservice.save(measurementEntity);

		return ResponseEntity.ok().build();
	}
}