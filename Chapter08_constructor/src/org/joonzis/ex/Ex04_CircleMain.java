package org.joonzis.ex;

public class Ex04_CircleMain {
	public static void main(String[] args) {
		
		Ex04_Circle circle=new Ex04_Circle();
		circle.output();
		
		System.out.println();
		
		Ex04_Circle circle2=new Ex04_Circle(10);
		circle2.output();
		
		System.out.println();
		
		Ex04_Circle circle3=new Ex04_Circle(1, 2, 5);
		circle3.output();		
	}
}
