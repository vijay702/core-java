package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
	
		Person pooja = new Person("pooja",25,"female");
		System.out.println(pooja);
		pooja.setAge(-30);
		System.out.println(pooja);
	}

}
