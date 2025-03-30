package org.joonzis.test2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("양수 입력");
			int a=sc.nextInt();
			int t=0;
			
			
			if(a>=2) {
				for(int i=0;i<=a;i++) {
					t=t+i;
					if(i==a) {
						System.out.println(t);
					}
				}
				break;
			}else {
				System.out.println("다시 입력");
			}
		}		
		sc.close();
	}
}
