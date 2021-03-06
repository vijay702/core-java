package org.studyeasy.vechcles;

import org.studyeasy.parent.vechicle;

public class Bike extends vechicle {
	private String handle;

	public Bike() {
		super();
		this.handle ="short";
	}

	public Bike(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.handle = handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getLights()=" + getLights() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ "]";
	}

	public String getHandle() {
		return handle;
	}
	
	public void run() {
		System.out.println("running bike");
	}
}
