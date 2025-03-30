package org.joonzis.test;
//Coordinate 클래스				
//필드 : int x, int y;
//메소드 : Constructor, equals()							
//Circle 클래스					
//필드 : Coordinate center, double radius	
//메소드 : Constructor, equals()	
//new Circle(0, 0, 1.5) // 중심 좌표[0,0], 반지름 : 1.5										
class Coordinate{
	private int x, y;
	public Coordinate() {}
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Coordinate) {
			Coordinate another=(Coordinate)obj;
			return x==another.x&&y==another.y;
		}else {
		return false;
		}
	}
}
class Circle {
	private Coordinate center;
	private double radius;
	public Circle() {}
	public Circle(Coordinate center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	@Override
	public boolean equals(Object object) {
		if(object!=null&&object instanceof Circle) {
			Circle circle=(Circle)object;
			return center.equals(circle.center)&&radius==circle.radius;
		}else {
			return false;
		}
	}
}
public class Test03 {
	public static void main(String[] args) {
	
		Circle circle1=new Circle(new Coordinate(0,0),1.5); 
		Circle circle2=new Circle(new Coordinate(0,0),1.5); 
		
		if(circle1.equals(circle2)) {
			System.out.println("동등");
		}
		
		
		
	}
}
