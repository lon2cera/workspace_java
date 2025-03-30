package org.joonzis.ex;

// ArrayIndexOutOfBounsException
public class Ex02_exception {
	public static void main(String[] args) {
		
		/*
		 *  크기 3짜리 정수형 배열 arr 선언
		 *  각 인덱스 순서대로 1, 2, 3 데이터 삽입
		 *  항상 for문을 이용하여 배열 내 데이터 출력
		 *  
		 *  **예외처리**
		 *  위 실행 결과 확인 후 강제로 arr[3] 위치에 데이터 삽입
		 *  에러 발생시 "인덱스 가용 범위를 벗어났습니다" 출력
		 */
		
		int [] arr;
		
		try {
			arr=new int[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=i+1;
			}
			for (int i : arr) {
				System.out.println(i);
			}
			arr[3]=4;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 가용 범위를 벗어났습니다");
		}
		
	}
}
