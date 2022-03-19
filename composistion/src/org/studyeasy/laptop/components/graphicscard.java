package org.studyeasy.laptop.components;

public class graphicscard {
 private String brand;
 private int series;
 private String memory;
public graphicscard() {
	this.brand = "vijay";
	this.series = 940;
	this.memory = "1gb";
}

@Override
public String toString() {
	return "graphicscard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
}

public graphicscard(String brand, int series, String memory) {
	super();
	this.brand = brand;
	this.series = series;
	this.memory = memory;
}
 
 
 
}
