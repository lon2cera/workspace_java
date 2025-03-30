package org.joonzis.test;

import java.util.Scanner;

public class Ex01_CircleMain {
	public static void main(String[] args) {
		
		Ex01_Circle[] circle=new Ex01_Circle[3];
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < circle.length; i++) {
			System.out.println("redius >>");
			double radius=sc.nextDouble();
			circle[i]=new Ex01_Circle(radius);
		}
		sc.close();
		
		for (int i = 0; i < circle.length; i++) {
			if(circle[0].calcArea()<circle[i].calcArea()) {
				circle[0]=circle[i];
			}
		}
		
		circle[0].output();
		
	}
}
