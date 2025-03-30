package org.joonzis.test;

public class Test03 {
	public static void main(String[] args) {
		// Test02.java 의 값들을 모두 더하고, 총점과 평균을 출력
		// 10, 20, 50, 60, 13, 25, 97
		
		int[] arr = {10, 20, 50, 60, 13, 25, 97};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		double avg=sum/7.0;					//double avg=(double)sum/arr.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
	}
}
