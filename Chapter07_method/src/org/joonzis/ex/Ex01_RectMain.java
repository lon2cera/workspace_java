package org.joonzis.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		
		Ex01_Rect r=new Ex01_Rect();
		r.setFields(10, 20);
		r.output();
		
		System.out.println();
		
		Ex01_Rect r2=new Ex01_Rect();
		r2.setFields(15);
		r2.output();
	}
}
