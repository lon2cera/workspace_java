package org.joonzis.test2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 입력");
		int a=sc.nextInt();
		sc.close();
		
		
		for(int i=1;i<10;i++) {
			System.out.println(a+"X"+i+"="+a*i);
		}
	}
}


//		int b=1;
//		while (b<10) {
//			System.out.println(a+"X"+b+"="+a*b);
//			b++;
//		}