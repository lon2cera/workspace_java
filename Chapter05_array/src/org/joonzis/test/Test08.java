package org.joonzis.test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
//		성적 관리 프로그램 
//		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 입력받아 
//		최대, 최소, 평균 점수를 출력하기


		Scanner sc = new Scanner(System.in);
		String[] names = {"김씨", "이씨", "박씨", "최씨", "정씨"};
		int[] scores = new int[5];
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(names[i]+"의 점수 입력 >>");
			scores[i] =sc.nextInt();
		}
		
		int sum =0;
		int s=scores[0];
		int s1=scores[0];
		
		for (int j = 0; j < scores.length; j++) {
			sum+=scores[j];
			if(scores[j]<s) {
				s=scores[j];
			}
			if(scores[j]>s1) {
				s1=scores[j];
			}
		}
		System.out.println("5명의 평균점수 : "+sum/scores.length);
		System.out.println("최소점수 : "+s);
		System.out.println("최대점수 : "+s1);
		

		sc.close();
	}
}
