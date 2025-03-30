package org.joonzis.ex;

public class Ex05_for {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
		// i가 소멸되는 시점
		// for문을 벗어나면 i는 사용 불가
		
		// for문 마다 동일한 변수를 선언해도 무방(지역변수)
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
	}
}
