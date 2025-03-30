package org.joonzis.test;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("수준 입력");
		int t=sc.nextInt();
		sc.close();
		
		switch (t) {
		case 3:
			System.out.println("3수준 : "+"실행, 쓰기, 읽기");
			break;
		case 2:
			System.out.println("2수준 : "+"쓰기, 읽기");
			break;
//		case 1:
//			System.out.println("1수준 : "+"읽기");			
		default:
			System.out.println("1수준 : "+"읽기");			
		}
	}
}


//	switch (t) {
//	case 3:System.out.print("실행, ");
//	case 2:System.out.print("쓰기, ");
//	case 1:System.out.println("읽기");
//	}