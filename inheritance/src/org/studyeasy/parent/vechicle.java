package org.studyeasy.parent;

public class vechicle {
private String engine;
private int wheels;
private int seats;
private int fuelTank;
private String lights;
public vechicle() {

	this.engine = "petrol";
	this.wheels = 4;
	this.seats  =4;
	this.fuelTank=35;
	this.lights = "LED";
	
}
public vechicle(String engine, int wheels, int seats, int fuelTank, String lights) {
	super();
	this.engine = engine;
	this.wheels = wheels;
	this.seats = seats;
	this.fuelTank = fuelTank;
	this.lights = lights;
}
public String getLights() {
	return lights;
}
public void setLights(String lights) {
	this.lights = lights;
}
public String getEngine() {
	return engine;
}
public int getWheels() {
	return wheels;
}
public int getSeats() {
	return seats;
}
public int getFuelTank() {
	return fuelTank;
}

public void run() {
	
	System.out.println("Running vechicle");
	System.out.println(toString());
}

}
