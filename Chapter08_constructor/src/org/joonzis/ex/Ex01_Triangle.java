package org.joonzis.ex;

public class Ex01_Triangle {
	// 필드
	int width, height;
	
	// 메소드
	
	//초기화 메소드, 크기 계산 메소드, 출력 메소드
	public Ex01_Triangle() {
		width=height=1;
	}
	public Ex01_Triangle(int w, int h) {
		width=w;
		height=h;
	}
	double calcArea() {
		return width*height/2;
	}
	void output() {
		System.out.println("너비 : "+width);
		System.out.println("높이 : "+height);
		System.out.println("크기 : "+calcArea());
	}
	
	
}
