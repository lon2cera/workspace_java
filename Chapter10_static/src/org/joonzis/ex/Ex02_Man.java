package org.joonzis.ex;

public class Ex02_Man {
	// 필드
	String name;
	int age;
	static final char GENDER = '남';
	
	public Ex02_Man(String name, int age) {
		this.name=name;
		this.age=age;
	}
	void output() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+GENDER);
	}
}
