package org.joonzis.test2;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		int a=56;
		int t=0;

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("입력 >>");
		int num=sc.nextInt();
		t++;
		if(a>num) {
			System.out.println("Up!");
		}else if(a<num) {
			System.out.println("Down!");
		} else {
			System.out.println("Answer!");
			System.out.println("총 "+t+"회만에 성공!");
			break;
		}
		}
		sc.close();
	}
}





//		for(int i=1;;i++) {
//			System.out.println("입력 >>");
//			int num=sc.nextInt();
//			if(a>num) {
//				System.out.println("Up!");
//			}else if(a<num){
//				System.out.println("Down!");
//			} else {
//				System.out.println("Answer!");
//				System.out.println("총 "+i+"회만에 성공!");
//				break;
//				
//			}
//		}