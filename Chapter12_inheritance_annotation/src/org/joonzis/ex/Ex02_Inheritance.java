package org.joonzis.ex;
class Person{
	void sleep() {
		System.out.println("sleep");
	}
	void eat(String food) {
		System.out.println(food+"eat");
	}
}
class Student extends Person{
	void study() {
		System.out.println("study");
	}
}
class Worker extends Person{
	void work() {
		System.out.println("work");
	}
}
public class Ex02_Inheritance {
	public static void main(String[] args) {
		
		Student stu=new Student();				
		stu.eat("banana");
		stu.study();
		stu.sleep();
		
		System.out.println();
		
		Worker work=new Worker();
		work.eat("apple");
		work.work();
		work.sleep();
		
	}
}
