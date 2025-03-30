package org.joonzis.ex;
class Person{
	// 필드 
	char gender;
	int age;
	double height;
	String name;
	
	// 메소드
	void info() {
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("이름 : "+name);
	}
}
public class Ex02_PersonMain {
	public static void main(String[] args) {
		
		Person ps=new Person();
		ps.gender='남';
		ps.age=35;
		ps.height=171.3;
		ps.name="김민석";
		
		Person ps2=new Person();
		ps2.gender='여';
		ps2.age=27;
		ps2.height=154;
		ps2.name="김민주";
		
		ps.info();
		ps2.info();
		
		
	}
}
