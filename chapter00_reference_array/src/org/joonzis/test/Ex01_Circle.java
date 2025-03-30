package org.joonzis.test;
//- 필드 : double radius
//- 메소드 : Constructor, calcArea, output

public class Ex01_Circle {
	double radius;
	
	public Ex01_Circle() {}
	public Ex01_Circle(double radius) {
		this.radius = radius;
	}
	
	double calcArea() {
		return Math.PI *Math.pow(radius, 2);
	}
	void output() {
		System.out.println(calcArea());
	}
	
}
