package org.joonzis.test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		System.out.println(age>19?"성인":"미성년자");
		sc.close();
	}
}

/*	
 * 	boolean isAdult = (age>19);
 * 	boolean isAdult = (age>19)? true:false;
 * 	String result= isAdult?"성인":"미성년자";
 */