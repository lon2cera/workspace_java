package org.joonzis.test;

import java.util.Calendar;

public class Car {

//	클래스 Car 를 정의하시오.
//	- 필드 : String model,String color, int year
//	- 메소드 : setFields(model, color) : 올해를 year로 처리, 
//			 setFields(model, color, year),
//			 output()
//	클래스 CarMain을 정의 하시오.
//	★
//	Calendar calendar = Calendar.getInstance();
//	calendar.get(Calendar.YEAR);	 // 현재 년도

	String model;
	String color;
	int year;
	
	void setFields(String model, String color) {
		Calendar calendar = Calendar.getInstance();
		year=calendar.get(Calendar.YEAR);
		this.model=model;
		this.color=color;
	}
	void setFields(String model, String color, int year) {
		this.model=model;
		this.color=color;
		this.year=year;
	}
	void output() {
		System.out.println("모델 : "+model);
		System.out.println("색상 : "+color);
		System.out.println("연식 : "+year);
	}
		
}
