package org.joonzis.ex;

public class Ex03_Person {
	private String name;
	private int age;
	private double height;
	private char gender;
	
	public Ex03_Person() {}

	public Ex03_Person(String name, int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	public String getName() {									//예내들로 예외처리 가능
		return name;
	}

	public void setName(String name) {
		if(name.length()>=2) {
		this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<1) {
			System.out.println("나이는 1보다 큰 정수 값으로 입력");
			return;		//함수 빠져나가는 return
		}
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
}
