package org.joonzis.test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("매출액을 입력해주세요");
		int a=sc.nextInt();
		System.out.println("등급을 입력해주세요");
		String r=sc.next();
		sc.close();
		
		System.out.println(r.equals("VIP")?a/5*4:a/20*19);
			System.out.println();
	}		
}

/*	sc.nextline(); 개행씹힐때 추가해서 입력값 받기
 * 	String r=sc.nextline();
 * 
 * 	int result=int(r.equals("VIP")?a*0.8:a*0.95);
 * 	.equalsIgnorCase 대소문자구별
 * 
 * 	System.out.println("등급 : "+r);
 * 	System.out.println("기존 매출액 : "+a);
 * 	System.out.println("할인 매출액 : "+result);
 */
 