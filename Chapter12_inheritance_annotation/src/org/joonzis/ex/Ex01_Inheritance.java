package org.joonzis.ex;
// 부모 클래스
class Parent{
	int number;
	void doParent(){
		System.out.println("doParent() call");
	}
}
// 자식 클래스
class Child extends Parent{
	void doChild() {
		System.out.println("Child call");
	}
}
public class Ex01_Inheritance {
	public static void main(String[] args) {
		Child child=new Child();
		child.number=10;
		System.out.println(child.number);
		
		child.doParent();
		child.doChild();
		
	}
}
