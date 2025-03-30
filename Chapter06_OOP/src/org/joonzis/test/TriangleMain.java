package org.joonzis.test;

import java.util.Scanner;

class Triangle{
	//클래스 Triangle 
	//- 필드 : width, height
	//- 메소드 : init(너비, 높이 입력), info(너비, 높이, 크기 출력), calcArea(w*h/2 넓이계산 후 리턴)
	
	Scanner sc=new Scanner(System.in);
	double width;
	double height;	
	
		void init() {
			System.out.println("너비 입력 >>");
			width=sc.nextDouble();
			System.out.println("높이 입력 >>");
			height=sc.nextDouble();
			sc.close();
		}
		void info() {
			System.out.println("너비 : "+width);
			System.out.println("높이 : "+height);
			System.out.println("크기 : "+ calcArea() );
		}
		double calcArea() {
			return(width*height/2);
		}
	
	
	
}

public class TriangleMain {
	public static void main(String[] args) {
		
		Triangle tr=new Triangle();
		tr.init();
		tr.info();
		tr.calcArea();
		
	}	
}
