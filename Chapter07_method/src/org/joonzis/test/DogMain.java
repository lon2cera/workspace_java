package org.joonzis.test;

public class DogMain {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.setDog("뽀삐", 7);
		dog.info();
		
		Dog dog2=new Dog();
		dog2.setDog("멍멍", "치와와", 3);
		dog2.info();
		
		
	}
}
