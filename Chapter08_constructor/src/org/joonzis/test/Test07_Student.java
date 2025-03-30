package org.joonzis.test;
//Student.java			필드 - String name, String dept, Grade grade
//메소드 - Constructor, output

public class Test07_Student {
	String name, dept;
	Test06_Grade grade;
	
	public Test07_Student() {}
	public Test07_Student(String name, String dept, Test06_Grade grade) {
		this.name=name;
		this.dept=dept;
		this.grade=grade;
	}
	void output() {
		System.out.println("Name : "+name);
		System.out.println("Dept : "+dept);
		System.out.println("Average : "+grade.getAverage());
		System.out.println("Grade : "+grade.getGrade());
	}
	
}
