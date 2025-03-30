package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_break {
	public static void main(String[] args) {
		
		// id를 입력받아서id가 "admin"이면
		// "ID 일치" 출력 후 반복문 종료
		// 일치하지 않으면 "다시 입력하세요" 출력 후 반복
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("id를 입력해주세요");
			String id= sc.next();
			

			if(id.equals("admin")) {
				System.out.println("ID일치");
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();
	}
}
