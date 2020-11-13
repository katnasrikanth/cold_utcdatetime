package com.melvault.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "MEASUREMENT", uniqueConstraints={@UniqueConstraint(name="UN_MEASUREMENT_ID", columnNames={"ID"})})
public class MeasurementEntity {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "SENSOR_ID", nullable = false, foreignKey = @ForeignKey(name="FK_MEASUREMENT_SENSOR"))
	private SensorEntity sensorEntity;

	@Column(name="unit_key")
	private String key;

	@Column(name="unit_value")
	private double power;



	@Column(name="unit_v1")
	private Double v1;

	@Column(name="unit_v2",nullable=true)
	private Double v2;

	@Column(name="unit_v3")
	private Double v3;

	@Column(name="unit_i1")
	private Double i1;

	@Column(name="unit_i2")
	private Double i2;

	@Column(name="unit_i3")
	private Double i3;

	@Column(name="unit_ce")
	private Double ce;

	@Column(name="unit_pf2")
	private Double pf2;

	@Column(name="unit_pf3")
	private Double pf3;

	@Column(name="unit_p1")
	private Double p1;

	@Column(name="unit_p2")
	private Double p2;

	@Column(name="unit_p3")
	private double p3;

	@Column(name="epochDate")
	private String Date;

	@Column(name = "time")
	private LocalDateTime timestamp1;

	public MeasurementEntity(SensorEntity sensorEntity, String Date,Date date,String key, double power, double v1,double v2,double v3,
			double i1,double i2,double i3,double ce,double pf2,double pf3,double p1,double p2,double p3, long l) {
		this.sensorEntity = sensorEntity;
		this.key = key;
		this.power = power;
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
		this.i1=i1;
		this.i2=i2;
		this.i3=i3;
		this.ce=ce;
		this.pf2=pf2;
		this.pf3=pf3;
		this.p1=p1;
		this.p2=p2;
		this.p3=p3; 
		this.Date = Date;
		LocalDateTime datetime = LocalDateTime.now();
		this.timestamp1 = datetime;
	}

	public MeasurementEntity() {

	}

	public LocalDateTime getTimestamp1() {
		return timestamp1;
	}

	public void setTimestamp1(LocalDateTime timestamp1) {
		this.timestamp1 = timestamp1;
	}@Column(name="unit_p3")

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getV1() {
		return v1;
	}

	public void setV1(Double v1) {
		this.v1 = v1;
	}

	public Double getV2() {
		return v2;
	}

	public void setV2(Double v2) {
		this.v2 = v2;
	}

	public Double getV3() {
		return v3;
	}

	public void setV3(Double v3) {
		this.v3 = v3;
	}

	public Double getI1() {
		return i1;
	}

	public void setI1(Double i1) {
		this.i1 = i1;
	}

	public Double getI2() {
		return i2;
	}

	public void setI2(Double i2) {
		this.i2 = i2;
	}

	public Double getI3() {
		return i3;
	}

	public void setI3(Double i3) {
		this.i3 = i3;
	}

	public Double getCe() {
		return ce;
	}
	
	public void setCe(Double ce) {
		this.ce = ce;
	}

	public Double getPf2() {
		return pf2;
	}

	public void setPf2(Double pf2) {
		this.pf2 = pf2;
	}

	public Double getPf3() {
		return pf3;
	}

	public void setPf3(Double pf3) {
		this.pf3 = pf3;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public double getP3() {
		return p3;
	}

	public void setP3(Double p3) {
		this.p3 = p3;
	}

	@JsonIgnore
	public SensorEntity getSensor() {
		return sensorEntity;
	}

	public void setSensor(SensorEntity sensorEntity) {
		this.sensorEntity = sensorEntity;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}

}
