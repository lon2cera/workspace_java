package org.joonzis.ex;
interface Animal{
	public void walk();
}
class Dog implements Animal{
	@Override
	public void walk() {
		System.out.println("산책");
	}
	public void sleepTogether() {
		System.out.println("같이 잠");
	}
}
class Crocodile implements Animal{
	@Override
	public void walk() {
		System.out.println("악어 피해 도망");
	}
}
public class Ex05_exception {
	public static void main(String[] args) {
		verifyDog(new Dog());
		verifyDog(new Crocodile());
	}
	public static void verifyDog(Animal animal) {
		//예외 처리
		// 1. try - catch
		try {
			animal.walk();
			((Dog)animal).sleepTogether();
		} catch (ClassCastException e) {
			System.out.println("같이 잘 수 없다");
			e.printStackTrace();
		}
		
		// 2. instanceof 연산자를 이용한 예외처리 
		if(animal instanceof Dog) {
			animal.walk();
			((Dog)animal).sleepTogether();
		}else {
			System.out.println("같이 잘 수 없다");
		}
		
		
		
		
		
	}
}
