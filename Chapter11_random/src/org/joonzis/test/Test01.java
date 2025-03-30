package org.joonzis.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		int[] arr=new int[6];
		int[] arr2=new int[6];
		int count=0;
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=random.nextInt(45)+1;
			for (int j =0; j <i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}	
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("1~45 번호입력");
			arr2[i]=sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);								// 정수 배열 오름차순 정렬
		Arrays.sort(arr2);	
		
		
		
		System.out.println("로또번호");
		for (int i : arr) {
			System.out.print(+i+"\t");
		}
		System.out.println();
		System.out.println("선택번호");
		for (int i : arr2) {
			System.out.print(+i+"\t");
		}
		System.out.println();
		
		System.out.print("맞은 번호 : ");
		
		
//		String resultStr="";
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr[i]==arr2[j]) {
					count++;
					System.out.print(arr2[j]+"\t");
//					resultStr+=arr[i]+"";		//맞은 값 저장
					
				}
			}
		}
		System.out.println();
		System.out.println("맞은 횟수 : "+count);
	}
}
