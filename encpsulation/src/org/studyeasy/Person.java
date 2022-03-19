package org.studyeasy;

public class Person {

	public String name ;
	public int age ;
	public String gender ;
	
	
	
	


	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}



	public boolean setAge(int age) {
		
		if(age >=0 && age >=100) {
			this.age = age;
			return true;
		}
		return false;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
