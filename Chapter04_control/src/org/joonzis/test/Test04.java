package org.joonzis.test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("문자를 입력해주세요");
		char c=sc.nextLine().charAt(0);
		sc.close();
		
		int t = (int)c;
	
		
		if(122<t) {
			System.out.println(c+"는 일반문자");
		}else if(96<t) {
			System.out.println(c+"는 소문자");
		}else if(90<t) {
			System.out.println(c+"는 일반문자");
		}else if(64<t) {
			System.out.println(c+"는 대문자");
		}else if(57<t) {
			System.out.println(c+"는 일반문자");
		}else if(47<t) {
			System.out.println(c+"는 숫자");
		}else if(48>t) {
			System.out.println(c+"는 일반문자");	
		}	
	}
}


//if(c>='A'&&c<='Z') {
//	System.out.println("대문자");
//}else if (c>='a'&&c<='z') {
//	System.out.println("소문자");
//}else if (c>='0'&&c<='9') {
//	System.out.println("아라비아 숫자");
//}else {
//	System.out.println("일반 문자");
//}