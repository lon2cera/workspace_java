package org.joonzis.test;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num=sc.nextInt();
		sc.close();
		
		int n1=num%10;
		int n2=num%100-n1;
		int n3=num%1000-n2;
		int n4=num%10000-n3;
		int n5=num%100000-n4;
		int n6=num%1000000-n5;
		
		int nn=n1+n2/10+n3/100+n4/1000+n5/10000+n6/100000;
		System.out.println("숫자의 각 자릿수를 더한 값은"+nn+"입니다.");
	}
}

//	int num=1234
//	int sum=0;
//	
//	sum=sum+num%10;
//	num=num/10;
//	
//	sum+=num%10;
//	num=num/10;
//	sum+=num%10;
//	num=num/10;
//	sum+=num%10;
//	num=num/10;
//	
//	
//	System.out.println(sum);
	