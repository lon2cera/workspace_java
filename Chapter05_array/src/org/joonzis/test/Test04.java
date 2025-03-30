package org.joonzis.test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 길이가 5인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 
		// 해당 데이터 값을 모두 더해서 합을 출력하기 

		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수 입력 ("+(arr.length-i)+"회)");
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("모든 데이터를 더한 값 : "+sum);
		
		sc.close();
	}
}
