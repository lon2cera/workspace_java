package org.joonzis.test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력");
		int y=sc.nextInt();
		sc.close();
		
		if(y<8) {
			System.out.println("미취학");
		} else if(y<14) {
			System.out.println("초등학생");
		} else if(y<17) {
			System.out.println("중학생");
		} else if(y<20) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
	}
}
