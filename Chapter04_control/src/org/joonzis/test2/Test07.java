package org.joonzis.test2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int a=sc.nextInt();
		System.out.println("두번째 수 입력");
		int b=sc.nextInt();
		
		sc.close();
		
		if(a>b) {
			int c=b;
			for(int i=0;b<=a;b++) {
				i+=b;
				if(b==a) {
					System.out.println(c+"부터 "+a+"까지 모든 정수의 합은 "+i+"입니다.");
				}
			}
		} else {
			int c=a;
			for(int i=0;b>=a;a++) {
				i+=a;
				if(a==b) {
					System.out.println(c+"부터 "+b+"까지 모든 정수의 합은 "+i+"입니다.");
				
}}}}}




//		int c=0;
//		if(a>b) {
//			int x=b;
//			while(b<=a) {
//				c=c+b;
//				b++;
//				if(b>a) {
//					System.out.println(x+"부터 "+a+"까지 모든 정수의 합은 "+c+"입니다.");
//				}
//			}
//		} else {
//			int x=a;
//			while(b>=a) {
//				c=c+a;
//				a++;
//				if(a>b) {
//					System.out.println(x+"부터 "+b+"까지 모든 정수의 합은 "+c+"입니다.");
//		}}}