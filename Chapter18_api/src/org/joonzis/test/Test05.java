package org.joonzis.test;

import java.util.Scanner;

//성(lastName), 이름(firstName)을 각각 입력 받아
//하나의 이름(fullName)을 완성하시오. StringBuffer 클래스를 이용하시오.
//위의 방식으로 두 이름을 입력 받아 두 이름(fullName)의 동등 비교를 진행하시오.

public class Test05 {
	public static void main(String[] args) {

		StringBuffer fn1=new StringBuffer();
		StringBuffer fn2=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		
		String n1,n2;
			
		System.out.println("성");
		n1=sc.next();
		System.out.println("이름");
		n2=sc.next();
		fn1.append(n1).append(n2);
		System.out.println("성");
		n1=sc.next();
		System.out.println("이름");
		n2=sc.next();
		fn2.append(n1).append(n2);
			
		if((fn1.toString()).equals(fn2.toString())) {
			System.out.println("같");
		}else {
			System.out.println("다르");
		}
		
		
		sc.close();
	}
}
