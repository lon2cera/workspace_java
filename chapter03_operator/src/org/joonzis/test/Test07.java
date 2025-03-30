package org.joonzis.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("섭씨 온도를 입력해주세요");
		double c=sc.nextDouble();
		sc.close();
		
		double f=(double)c*9/5+32;
		System.out.println("화씨 온도는 "+f+"°F입니다.");
		
	}
}
