package org.joonzis.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//임의의 정수값 5개를 저장한 배열 중에서 인덱스가 1인 곳의 값을 출력
		Scanner sc=new Scanner(System.in);
		int[] arr =new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("임의의 정수값 입력 ("+(arr.length-i)+")");
			arr[i]=sc.nextInt();
		}
		System.out.println("인덱스가 1인 곳의 값 : "+arr[1]);
		
		
		sc.close();
	}
}
