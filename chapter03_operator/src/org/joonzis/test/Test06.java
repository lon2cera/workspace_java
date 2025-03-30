package org.joonzis.test;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("몸무게를 입력해주세요(kg)");
		int k= sc.nextInt();
		System.out.println("키를 입력해주세요(cm)");
		int m=sc.nextInt();
		sc.close();
		
		double bmi = (double)k/(m*m)*10000;
		
		if (bmi>=25) {
			System.out.println("과체중");}
		else { 
			System.out.println(bmi>=20?"정상":"저체중");
		}
	}	
}

//	키 몸무게 double 사용
//	double height=150.5;
//	double weight=50.9;
//	height=height/100;
//	double bmi= weight/(height*height);
//	
//	String result= bmi>=25?"과체중":bmi>20?"정상":"저체중";
