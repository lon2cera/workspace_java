package org.joonzis.test;

import java.util.Scanner;

public class Student {
//	클래스 Student
//	- 필드 :
//	String name, String dept, String score1, String score2
//	double average
//	boolean isPass(합격 유무) : 평균 점수가 80점 이상 true, 80점 미만 false
//	- 메소드 : 
//	input : name, dept, score1, score2 콘솔입력, 평균 및 패스 유무 확인
//	output : name, dept, average, isPass ("합격","불합격")


	String name;
	String dept;
	String score1;
	String score2;
	double average;
	boolean isPass;
	
	Scanner sc=new Scanner(System.in);
	
	void input() {
		System.out.println("name 입력 >>");
		name=sc.next();
		System.out.println("dept 입력 >>");
		dept=sc.next();
		System.out.println("score1 입력 >>");
		score1=sc.next();
		System.out.println("score2 입력 >>");
		score2=sc.next();
		double sc1 = Double.parseDouble(score1);
		double sc2 = Double.parseDouble(score2);
		average=(sc1+sc2)/2.0;
		isPass= average>=80;
	}

	
	
	void output() {
		System.out.println("name : "+name);
		System.out.println("dept : "+dept);
		System.out.println("average : "+average);
		System.out.println("isPass : "+(isPass?"합격":"불합격"));
	}
}
