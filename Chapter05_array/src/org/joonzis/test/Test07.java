package org.joonzis.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		// 길이가 10인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 값을 저장한 뒤
		// 배열에 있는 정수 중에서 3의 배수만 출력해보자. 
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수 입력");
			arr[i]=sc.nextInt();
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]%3==0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		//일반 for문에서는 증가하는 변수의 값이지만
		//향상 for문에서는 int 변수 값에 arr배열의 인덱스 값 자체를 저장
		
		
		for(int i : arr) {					
			if(i % 3==0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}
}
