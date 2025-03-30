package org.joonzis.test;

public class Dog {

//	클래스 Dog을 정의하시오.
//	- 필드 : String name, String breed, int age
//	- 메소드 : setDog(name, age) : 품종은 푸들
//			setDog(name, age, breed) 
//			info() - name, age, breed 출력
//	클래스 DogMain을 정의하시오.

	String name;
	String breed;
	int age;
	
	void setDog(String name, int age) {
//		setDog(name, "푸들", age);		밑에 this를 지우고 <-를 사용해 초기화 가능
		this.name=name;
		this.age=age;
	}
	void setDog(String name, String breed, int age) {
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("품종 : "+(breed==null?"푸들":breed));
	}
	
	
	
}
