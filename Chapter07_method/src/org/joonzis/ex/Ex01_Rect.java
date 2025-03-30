package org.joonzis.ex;

public class Ex01_Rect {
	// 필드
	int width, height;	// 너비, 높이
	boolean isSquare ;	// 정사각형 유무
	
	// 메소드
	// 1. 필드 초기화 메소드
	void setFields(int w, int h) {
		width=w;
		height=h;
		isSquare=(w==h);
	}
	void setFields(int side) {
		width=height=side;
		isSquare=true;
	}

	// 2. 사각형 크기 계산 메소드
	int calcArea() {
		int result=width*height;
		return result;
	}
	
	// 3. 정보 출력 메소드
	void output() {
		// 너비, 높이, 정사각형or직사각형, 크기 출력
		System.out.println("너비 : "+width);
		System.out.println("높이 : "+height);
		System.out.println("정사각형 유무 : "+(isSquare?"정사각형":"직사각형"));
		System.out.println("크기 : "+ calcArea());
	}
	
}
