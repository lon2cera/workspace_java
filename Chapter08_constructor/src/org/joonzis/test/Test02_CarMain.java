package org.joonzis.test;

public class Test02_CarMain {
	public static void main(String[] args) {
		
		Test01_Car car1=new Test01_Car();
		Test01_Car car2=new Test01_Car("소나타", "검은색");
		Test01_Car car3=new Test01_Car("그랜져", "회색", 2021);
		
		car1.output();
		System.out.println();
		car2.output();
		System.out.println();
		car3.output();
		
		
		
	}
}
