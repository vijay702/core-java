package org.studyeasy1;

import org.studyeasy.phone.Phone;
import org.studyeasy.phone.Samsung;

public class Hello1 {

	public static void main(String[] args) {
	
//		Phone phone = new Phone ("nokia 1100");
//		System.out.println(phone.getModel());
//		phone.features();
//		
//		Samsungnote8 note8 = new Samsungnote8("samsung note 8");
//		System.out.println(note8.getModel());
//		note8.features();

		Phone note8 = new Samsung("note8");
		System.out.println(note8.getModel());
		note8.features();
	}
 
}
