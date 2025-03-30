package org.joonzis.test;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("삼각형의 밑변을 입력해주세요");
		int c=sc.nextInt();
		System.out.println("삼각형의 밑변을 입력해주세요");
		int t=sc.nextInt();
		sc.close();
		
		int m=(c*t)/2;
		System.out.println("삼각형의 넓이는 "+m+"입니다.");

	
	
	
	
	
	}
}

// double a=sc.nextdouble();
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("밑변");
//	String w=sc.next();
//	System.out.println("높이");
//	String h=sc.next();
//	sc.close();
//	
//	double w1 = Double.parseDouble(w);		문자열 변환
//	double h1 = Double.parseDouble(h);
//	
//	double a=(w1*h1)/2;
//	System.out.println(a);

