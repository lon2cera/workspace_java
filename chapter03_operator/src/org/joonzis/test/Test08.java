package org.joonzis.test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("년도를 입력해주세요");
		int y=sc.nextInt();
		sc.close();
		
		int y1 = y%4;
		int y2 = y%100;
		int y3 = y%400;
		
		boolean yy=	((y1==0)&&(y2==0)&&(y3==0))||
					((y1!=0)&&(y2!=0)&&(y3==0))||
					((y1==0)&&(y2!=0)&&(y3!=0));
		
		System.out.println(yy==true?"윤년입니다":"윤년이 아닙니다.");
		
		
	}
}



//	int year=2025;
//	boolean result=(year%4==0&&year%100!=0||year%400==0)?true:false;
//	System.out.println(result?year+"윤년":year+"평년");
