package org.joonzis.test;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

//		과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성.
//		무한반복을 하다가 "그만"을 입력 받으면, 프로그램 종료

		
		Scanner sc=new Scanner(System.in);
		String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
		int[] scoreArr = {95, 88, 78, 62, 55};
		
		
		while(true) {
		System.out.println("과목 입력 >>");
		String sub=sc.next();
		for (int i = 0; i < subjectArr.length; i++) {
			if(subjectArr[i].equals(sub)) {							//equalsIgnoreCase()	영어 대소문자 구별 없이 같은걸 물어보는 메소드
				System.out.println(scoreArr[i]);
			}
		}
		if(sub.equals("그만")) {
			break;
		}

		sc.close();		
			
		}	
		
	}
}
