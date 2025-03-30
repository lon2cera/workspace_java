package org.joonzis.ex;
/*
 * int x, y :좌표
 * double radius : 반지름
 * 
 * 메소드
 * - 생성자() : 좌표 0,0 radius 값 1로 고정
 * -생성자(radius) : 좌표 0,0
 * -풀생성자
 * -calcArea() : 원의 크기 리턴(PI*r*r)
 * -clacCircum() : 원의 둘레 리턴 (2*PI*r)
 * - output() : 원의 중심 좌표, 반지름, 크기, 둘레 출력
 * 
 * ***PI구하기 ->Math.PI
 */


public class Ex04_Circle {
	int x, y;
	double radius;
	
	public Ex04_Circle() {
		radius=1;
	}
	public Ex04_Circle(double radius) {
		this.radius = radius;
	}
	public Ex04_Circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	double calcArea() {
		return Math.PI*radius*radius;
	}
	double calcCircum() {
		return Math.PI*2*radius;
	}
	void output() {
		System.out.println("중심좌표 : "+x+","+y);
		System.out.println("반지름 : "+radius);
		System.out.println("크기 : "+calcArea());
		System.out.println("둘레 : "+calcCircum());
	}
	
	
}
