package org.joonzis.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_for_each {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		
		// 1. 개별적으로 한 개씩 삽입
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		// 2. 반복문 이용
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i=1)+"번 값 입력");
			arr[i] = sc.nextInt();
		}
		for (int i= 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for-each문(향상 for문)
		// arr 배열이 각 요소를 num이라는 임시 변수로 전달해서 처리 
		// 위에서 입력한 arr 데이터가 순차적으로 num으로 넘어옴
		for(int num:arr) {
			System.out.println(num);
		}
		sc.close();
		
		//주의사항   
		//for-each문은 배열의 크기는 알필요가 없고 값을 쓰긴 편하나 값을 삽입할 수 없음
		
/*		int[] arr2= new int[3];
		for (int num : arr2) {
			System.out.println("입력>>");
			num= sc.nextInt();
			}
		for(int num:arr2) {
			System.out.println(arr2[num]);
		}
 */		
		
		
		
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
