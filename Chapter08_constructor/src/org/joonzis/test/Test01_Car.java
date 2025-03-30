package org.joonzis.test;

import java.util.Calendar;

//Car.java				필드 -String model, String color, int year, booleans isNewCar
//메소드 - Constructor, output
//CarMain.java
//★
//생성자(모델, 색상, 연식) / 생성자(모델, 색상)
//Calendar calendar = Calendar.getInstance();
//calendar.get(Calendar.YEAR);

public class Test01_Car {
	String model, color;
	int year;
	boolean isNewCar;
	
	Calendar calendar =Calendar.getInstance();
	
	public Test01_Car() {}
	public Test01_Car(String model, String color) {
		this.model=model;
		this.color=color;
		year=calendar.get(Calendar.YEAR);
		isNewCar=true;
	}
	public Test01_Car(String model, String color, int year) {
		this.model=model;
		this.color=color;
		this.year=year;
		isNewCar=(calendar.get(Calendar.YEAR)==year);
	}
	void output() {
		System.out.println("모델 : "+model);
		System.out.println("색상 : "+color);
		System.out.println("연식 : "+year);
		System.out.println(isNewCar?"신차":"신차가 아님");
	}
	
}
