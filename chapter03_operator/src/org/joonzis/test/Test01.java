package org.joonzis.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);		
		System.out.println("a");				
		int a = sc.nextInt();
		System.out.println("b");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("a:"+b+", "+"b:"+a);	
	}
}



/*	풀이
 * 임시변수 사용
 * 	int c=a;
 * 	a=b;
 * 	b=c;
 */	