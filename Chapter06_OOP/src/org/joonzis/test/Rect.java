package org.joonzis.test;

import java.util.Scanner;

public class Rect {
//	클래스 Rect
//	- 필드 : width, height
//	- 메소드 : init(너비, 높이 입력), info(너비, 높이), calcArea(w*h, 넓이계산(크기) 출력)

	
	double width;
	double height;

	
	void init() {
		Scanner sc=new Scanner(System.in);
		System.out.println("너비 입력 >>");
		width=sc.nextDouble();
		System.out.println("높이 입력 >>");
		height=sc.nextDouble();
		sc.close();
	}
	void info() {
		System.out.println("너비 : "+width);
		System.out.println("높이 : "+height);
		calcArea();		//info만 실행해도 calcArea까지 실행
	}
	void calcArea() {
		System.out.println("크기 : "+width*height);
	}
	
}
