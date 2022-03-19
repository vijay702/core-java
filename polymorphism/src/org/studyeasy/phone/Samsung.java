package org.studyeasy.phone;

public class Samsung extends Phone  {
	
	public String model;
	

	public Samsung(String model) {
		super(model);
		
	}


	public String getModel() {
		return model;
	}
	
public void features () {
	System.out.println("android");
}
}
