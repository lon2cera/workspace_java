package org.joonzis.test;
//Circle.java				필드 - Coordinate center, double radius
//메소드 - Constructor, output

public class Test10_Circle {
	Test09_Coordinate center;
	double radius;
	
	public Test10_Circle() {}
	public Test10_Circle(Test09_Coordinate center, double radius) {
		this.center=center;
		this.radius=radius;
	}
	void output() {
		System.out.println("Radius : "+radius);
		center.output();
	}
	
}
