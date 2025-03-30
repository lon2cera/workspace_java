package org.joonzis.test;

public class Test06 {
	public static void main(String[] args) {
		//Test05의 배열을 이용하여 배열 내 값들의 최소, 최대값을 출력

		int[] arr = {13, 22, -3, 92, 55, 5};
		
		int s = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<s) {
				s=arr[i];
			}
		}
		System.out.println("최솟값 : "+s);

		for (int j = 0; j < arr.length; j++) {
			if(arr[j]>s) {
				s=arr[j];
			}
		}
		System.out.println("최대값 : "+s);
		
		
	}	
}	

