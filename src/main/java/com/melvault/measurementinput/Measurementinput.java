package com.melvault.measurementinput;

public class Measurementinput {
	
	private long sensorId;
	private String key;
	private double  power;
	//private double  v1;
	private double  v2;
	private double  v3;
    private double i1;
    private double i2;
    private double i3;
    private double p1;
    private double p2;
    private double p3;
    private double ce;
    private double pf2;
    private double pf3;
	private String date;
	
	
	public Measurementinput() {
		super();
	}
	
	public long getSensorId() {
		return sensorId;
	}
	public void setSensorId(long sensorId) {
		this.sensorId = sensorId;
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
//	public double getV1() {
//		return v1;
//	}
//	public void setV1(double v1) {
//		this.v1 = v1;
//	}
	public double getV2() {
		return v2;
	}
	public void setV2(double v2) {
		this.v2 = v2;
	}
	public double getV3() {
		return v3;
	}
	public void setV3(double v3) {
		this.v3 = v3;
	}
	public double getI1() {
		return i1;
	}
	public void setI1(double i1) {
		this.i1 = i1;
	}
	public double getI2() {
		return i2;
	}
	public void setI2(double i2) {
		this.i2 = i2;
	}
	public double getI3() {
		return i3;
	}
	public void setI3(double i3) {
		this.i3 = i3;
	}
	public double getP1() {
		return p1;
	}
	public void setP1(double p1) {
		this.p1 = p1;
	}
	public double getP2() {
		return p2;
	}
	public void setP2(double p2) {
		this.p2 = p2;
	}
	public double getP3() {
		return p3;
	}
	public void setP3(double p3) {
		this.p3 = p3;
	}
	public double getCe() {
		return ce;
	}
	public void setCe(double ce) {
		this.ce = ce;
	}
	public double getPf2() {
		return pf2;
	}
	public void setPf2(double pf2) {
		this.pf2 = pf2;
	}
	public double getPf3() {
		return pf3;
	}
	public void setPf3(double pf3) {
		this.pf3 = pf3;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
