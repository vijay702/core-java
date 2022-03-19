package org.studyeasy;

import org.studyeasy.person.NonVegan;
import org.studyeasy.person.person;
import org.studyeasy.person.vegan;

public class Hello {

	public static void main(String[] args) {
		person john = new vegan ();
		john.speak();
		john.eat();
		
		person mia = new NonVegan();
		mia.speak();
		mia.eat();
		
	
	}

}


