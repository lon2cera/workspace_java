package org.joonzis.test;
//Student.java				- 필드 : String name, int age, String school
//							- 메소드 : Constructor, output()
//Worker.java					- 필드 : String name, int age, String job
//							- 메소드 : Constructor, output()
//→ 부모클래스는 알아서 만들어보자!(Human)
class Human{
	String name;
	int age;
	public Human() {}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void output() {
		System.out.println("name : "+name+", age : "+age);
	}
}

class Student extends Human{
	String school;
	public Student() {}
	public Student(String school, String name, int age) {
		super(name, age);
		this.school = school;
	}
	@Override
	void output() {
		super.output();
		System.out.println("school : "+school);
	}
}

class Worker extends Human{
	String job;
	public Worker() {}
	public Worker(String job, String name, int age) {
		super(name, age);
		this.job = job;
	}
	@Override
	void output() {
		super.output();
		System.out.println("job : "+job);
	}
}
public class Test01 {
	public static void main(String[] args) {
		
		Student stu=new Student("middle school","Kim",14);
		stu.output();
		
		Worker work=new Worker("police","Kang",37);
		work.output();
	
	}
}
