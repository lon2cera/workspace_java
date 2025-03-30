package org.joonzis.test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		
		char c ;
		Scanner sc=new Scanner(System.in);
		System.out.println("-를 제외한 주민등록번호를 입력");
		c=sc.next().charAt(6);
		sc.close();
		int a= (int)c%2;
		
		System.out.println(a==1?"남자":"여자");

	}
}

//	문자열
//	String sn = "0000001000000";
//	String gender=sn.charAt(6)=='1'?"남자":"여자";
//	String gender=(sn.charAt(6)=='1'||sn.charAt(6)=='3')?"남자":"여자";

//	정수
//	long sn =0000001000000L;
//	System.out.println(sn/1000000 % 10);
//	int point=(int)(sn/1000000%10);					강제 형변환int 말고 long 사용가능
//	String gender=(point==1||point==3)?"남자":"여자";
//	System.out.println("성별 : "+gender);