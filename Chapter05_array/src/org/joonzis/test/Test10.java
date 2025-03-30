package org.joonzis.test;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
//		5줄로 된 교실이 있다. 각 줄마다 학생 수가 다르다.
//		각 줄마다 존재하는 학생 수를 입력 받아 학생 수 만큼만 공간을 할당하여 2차원 배열을 생성하시오.
//		생성 확인을 위해 할당된 공간에 정수 1을 저장하고 출력하시오.

		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextInt();
			}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print(1+"\t");
				}
			System.out.println();
			}
		sc.close();
		
		
	}
}
