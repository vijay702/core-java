package org.studyeasy.laptop;

import org.studyeasy.laptop.components.Processor;
import org.studyeasy.laptop.components.graphicscard;

public class Laptop {
	
	
	private float screen ;
	private Processor processor;
	private String  ram;
	private String hardDrive ;
	private graphicscard graphicsCard;
	private String  opticalDriver;
	private String keyboard;
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "2tb";
		this.hardDrive = "3tb";
		this.graphicsCard = new graphicscard();
		this.opticalDriver = "MLT LAYER";
		this.keyboard = "dell";
		
	}
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDriver=" + opticalDriver + ", keyboard=" + keyboard
				+ "]";
	}
	public Processor getProcessor() {
		return processor;
	}
	public Laptop(float screen, Processor processor, String ram, String hardDrive, graphicscard graphicsCard,
			String opticalDriver, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDriver = opticalDriver;
		this.keyboard = keyboard;
	}
	public float getScreen() {
		return screen;
	}
	public String getRam() {
		return ram;
	}
	public String getHardDrive() {
		return hardDrive;
	}
	public graphicscard getGraphicsCard() {
		return graphicsCard;
	}
	public String getOpticalDriver() {
		return opticalDriver;
	}
	public String getKeyboard() {
		return keyboard;
	}
	
	
	
	
	

}
