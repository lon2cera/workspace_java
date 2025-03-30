package org.joonzis.test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("필기 점수 입력");
		double r=sc.nextDouble();
		System.out.println("실기 점수 입력");
		double t=sc.nextDouble();
		sc.close();
		
		if(r>=70&&t>=70) {
			System.out.println("합격");
		} else if((r+t)/2>=80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			
		}	
//		if((r>=70 && t>=70||((r+t)/2>=80))) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
		
			
	}
}





