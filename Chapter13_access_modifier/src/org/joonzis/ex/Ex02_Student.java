package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_Student {
	
	private String name, dept, score1, score2;
	private double average;
	private boolean isPass;
	
	
	public Ex02_Student() {}

	public Ex02_Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	public void input(Scanner sc){
		System.out.println("score1 >>");
		score1=sc.next();
		System.out.println("score2 >>");
		score2=sc.next();
		average=getAverage();	//선택 여기서 바로 파싱해서 초기화 해도 됨
		isPass=isPass();
 	}
	private double getAverage(){
		return (Double.parseDouble(score1) + Double.parseDouble(score2))/2;
	}
	private boolean isPass() {
		return average>=80?true:false;
	}
	void output() {
		System.out.println("name : "+name);
		System.out.println("dept : "+dept);
		System.out.println("average : "+getAverage());
		System.out.println(isPass?"합격":"불합격");
	}
}
