package com.melvault.entity;

import java.sql.Clob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="sensorconfig")
public class SensorConfig {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Lob
	@Column(name="sensor_config")
	private String config;
	
	@Column(name="creation_date")
	private LocalDateTime localdatetime;
	
	
	public SensorConfig(int id, String config, LocalDateTime localdatetime) {
		super();
		this.id = id;
		this.config = config;
		this.localdatetime = localdatetime;
	}

	 public SensorConfig() {
			super();
		}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public LocalDateTime getLocaldatetime() {
	return localdatetime;
	}

	public void setLocaldatetime(LocalDateTime localdatetime) {
		this.localdatetime = localdatetime;
	}
	
	
	

}
