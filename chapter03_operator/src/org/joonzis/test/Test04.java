package org.joonzis.test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("1~4까지 입력해주세요");
		int a = sc.nextInt();
		sc.close();
		
		int b=a%2;
		System.out.println(b==1?"남자":"여자");
		
	}
}



//	int num=1 ;
//	String gender = (num==1||num3)?"남자":"여자";
//
//gender=(num%2==0)?"여자":"남자"