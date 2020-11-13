package com.melvault.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.melvault.entity.SensorEntity;
import com.melvault.repository.SensorRepository;
import com.melvault.service.Sensorservice;

@RestController
@RequestMapping("api/ecoren")
public class Sensorcontroller {
	
	@Autowired
	private Sensorservice sensorservice;

    @GetMapping("/sensor")
    public List<SensorEntity> retrieveAllSensors() {
        return sensorservice.findAll();
    }

    @GetMapping("/sensor/{id}")
    public SensorEntity retrieveSensor(@PathVariable long id) {
        return sensorservice.findById(id);
    }

    //creates sensor with unique name
    @PostMapping("/sensor")
    public ResponseEntity createSensor(@RequestParam String name) {
        List<SensorEntity> sensorEntities = sensorservice.findAllByName(name);

        if (sensorEntities.size() > 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("There is already a sensor with the name: " + name);
        }

        SensorEntity sensorEntity = new SensorEntity(name);
        sensorservice.save(sensorEntity);
        return ResponseEntity.ok(sensorEntity);
    }
}