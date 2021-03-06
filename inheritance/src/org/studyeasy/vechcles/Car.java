package org.studyeasy.vechcles;

import org.studyeasy.parent.vechicle;

public class Car extends vechicle {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	public Car() {
		super();
		this.steering ="black";
		this.musicSystem ="mp3";
		this.airConditioner ="lg";
		this.fridge="samsug";
		this.entertainmentSystem="cd";
		}
	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getFridge() {
		return fridge;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getLights()=" + getLights()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + "]";
	}

}




