package org.joonzis.ex;

import java.util.Scanner;

public class Ex03_String_array {
	public static void main(String[] args) {
		
		// 크기 3의 문자열 배열 names를 생성
		// 스캐너로부터 이름을 입력받아"입력한 이름:OO"출력
		// 일반 for, 향상for
		
		Scanner sc=new Scanner(System.in);
		String[] arr1=new String[3];
		
		
		// 입력 for문
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("이름 한글자씩 입력");
			arr1[i]=sc.next();
		}
		
		// 출력 for문
		for (String str : arr1) {
			System.out.print("입력한 이름 : "+str);
		}
		
		
		//사용은 가능하나 for-each문 사용
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
				
		sc.close();
	}
}
