package org.joonzis.ex;

public class Ex03_Person {
	
	int age;
	String name;
	double height;
	char gender;
	
	//기본 생성자 full생성자 두개 생성해놓기
	
	public Ex03_Person() {}
	public Ex03_Person(int age, String name, double height, char gender) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}	// alt+shift+s ->constructor using fields
	
	void output() {
		System.out.println("나이 : "+age);
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("성별 : "+gender);
	}
	
	
}
