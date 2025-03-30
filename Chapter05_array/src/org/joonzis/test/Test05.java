package org.joonzis.test;

import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) {
		// int[] arr = {13, 22, -3, 92, 55, 5}
		// 배열에서 값을 바꾸고 싶은 인덱스 2개를 선택하여
		// 서로 값을 바꾸어 값들을 출력
		
		int[] arr = {13, 22, -3, 92, 55, 5};
		
		int c =arr[1];
		arr[1]=arr[4];
		arr[4]=c;
		
			System.out.print(Arrays.toString(arr));
		
		
		
	}
}
