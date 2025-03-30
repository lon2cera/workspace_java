package org.joonzis.test;

import java.util.Random;

//Student 클래스				
//필드 : 	String no(학번), String name, int[] scores(국,영,수)
//      double average, char grade, 상수 int COURSE_COUNT(과목수)
//메소드 :Student(String no, String name)
//	    setter{
//		setScores(int kor, int eng, int mat) - 직접 입력
//		setScores(int[] scores) - 랜덤 입력
//		setAverage()
//		setGrade()
//		}
//	   toString() 학번, 성명, 평균, 학점 출력
//	   equals() 학번이 같으면 같은 학생으로 비교   
class Student{
	private String no,name;
	private int[] scores;
	private double average;
	private char grade;
	public static final int COURSE_COUNT=3;
	Random ran=new Random();
	
	public Student() {}
	public Student(String no, String name) {
		scores=new int[COURSE_COUNT];
		this.no = no;
		this.name = name;
	}
	public void setScores(int kor, int eng, int mat) {
		scores[0]=kor;
		scores[1]=eng;
		scores[2]=mat;
		setAverage();
		setGrade();
	}
	public void setScores(int[] scores) {
		this.scores = scores;
		setAverage();
		setGrade();
		
	}
	public void setAverage() {
		int total=0;
		for (int i = 0; i < scores.length; i++) {
			total+=scores[i];
		}
		this.average=(double)total/scores.length;
	}
	public void setGrade() {
		if(average >= 90) {grade = 'A';}
		else if(average >= 80) {grade = 'B';}
		else if(average >= 70) {grade = 'C';}
		else if(average >= 60) {grade = 'D';}
		else {grade = 'F';}
	}
	public String toString() {
		return no+name+average+grade;
	}
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Student) {
			Student stu=(Student)obj;
			return no.equals(stu.no);
		}else {
			return false;
		}
	}
}
public class Test04 {
	public static void main(String[] args) {

		Student stu1=new Student("1234","aa");
		Student stu2=new Student("1234","bb");
		
		stu1.setScores(70, 80, 90);
		System.out.println(stu1.toString());
		
		int []sco=new int [Student.COURSE_COUNT];
		Random ran=new Random();
		for (int i = 0; i < sco.length; i++) {
			sco[i]=ran.nextInt(100)+1;
		}
		stu2.setScores(sco);
		System.out.println(stu2.toString());
		
		
		if (stu1.equals(stu2)) {
			System.out.println("같음");
		}
		
		
		
	}
}
