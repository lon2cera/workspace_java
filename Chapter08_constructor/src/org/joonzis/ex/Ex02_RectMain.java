package org.joonzis.ex;

public class Ex02_RectMain {
	public static void main(String[] args) {
	
		Ex02_Rect rect=new Ex02_Rect();
		rect.output();
		
		System.out.println();
		
		Ex02_Rect rect2=new Ex02_Rect(7);
		rect2.output();

		System.out.println();
		
		Ex02_Rect rect3=new Ex02_Rect(10, 20);
		rect3.output();
	}
}
