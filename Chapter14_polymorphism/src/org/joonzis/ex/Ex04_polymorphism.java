package org.joonzis.ex;

class Person{
	public void eat(String food) {
		System.out.println(food + "먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
}
class Student extends Person{
	public void study() {
		System.out.println("공부한다.");
	}
}
class Worker extends Person{
	public void work() {
		System.out.println("일한다.");
	}
}

public class Ex04_polymorphism {
	public static void main(String[] args) {
		
		Person person1 = new Student();	// 업캐스팅
		person1.eat("급식");
		person1.sleep();
		// 다운 캐스팅 : Person -> Student 강제 변환
		if(person1 instanceof Student) {
			Student stu = (Student)person1;
			stu.study();
		}
		
		System.out.println("-------------------");
		Person person2=new Worker();
		person2.eat("aa");
		person2.sleep();
		if(person2 instanceof Worker) {
			Worker work=(Worker)person2;
			work.work();
		}
	}
}









