package org.studyeasy1;

import org.studyeasy.vechcles.Bike;
import org.studyeasy.vechcles.Car;

public class demo {

	public static void main(String[] args) {
		
//		Bike bike  = new Car("black","lg","samsug","cd","mp3","disel",4,4,40,"LED");
		
		Car car = new Car("black","lg","samsug","cd","mp3","disel",4,4,40,"LED");
		Bike bike = new Bike("short","disel",4,4,40,"LED");
//		System.out.println(bike.getHandle());
//		System.out.println(bike.getLights());
//		System.out.println(bike.getEngine());
//		System.out.println(bike.getFuelTank());
//		System.out.println(bike.getSeats());
//		System.out.println(bike.getWheels());
//		
		System.out.println(car);
		System.out.println(bike);
		car.run();
		bike.run();

	}

}
