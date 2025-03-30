package org.joonzis.test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳 입력");
		char c=sc.next().charAt(0);
		sc.close();
			
			
			int t=(int)c;
			int num1=(int)t-32;
			char ch1=(char)num1;
			int num2=(int)t+32;
			char ch2=(char)num2;

			if (t>122) {
				System.out.println(c);
			}else if(t>96) {
				System.out.println(ch1);
			}else if(t>89) {
				System.out.println(c);
			}else if(t>64) {
				System.out.println(ch2);
			}else {
				System.out.println(c);
			}
			
	}
}



//		if(c>='A'&& c<='Z') {
//			System.out.println(c+=32);
//		}else if (c>='a'&& c<='z') {
//			System.out.println(c-=32);
//		}else {
//			System.out.println(c);
//		}