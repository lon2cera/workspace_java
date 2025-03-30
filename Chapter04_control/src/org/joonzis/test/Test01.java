package org.joonzis.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력");
		int a=sc.nextInt();
		sc.close();
		
		if(a%3==0) {
			System.out.println(a+"는 3의배수");
		}else if(a%2==0) {
			System.out.println(a+"는 짝수");
		}else {
			System.out.println(a+"는 홀수");
		}
	}
}
