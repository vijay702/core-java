package org.studyeasy;

import org.studyeasy.phone.Iphone8;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.oneplus5;

public class Hello {

	public static void main(String[] args) {
		
		Phone phone = new Iphone8();
		System.out.println(phone.processor());
		System.out.println(phone.spaceInGb());

	}

}
