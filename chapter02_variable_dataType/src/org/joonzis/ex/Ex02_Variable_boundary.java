package org.joonzis.ex;

public class Ex02_Variable_boundary {

	// PI 같은 상수는 이런식으로 사용하지 않으나, 아직 배우지 않았으니 일단 패스
	static double PI =3.14;				
	
	public static void main(String[] args) {
		int value = 10;
		int sum = value + 20;
		
		System.out.println(sum);
//		System.out.println(result);
		System.out.println(PI);
	}
	
	public void local() {
//		int result = 100;
	}
}