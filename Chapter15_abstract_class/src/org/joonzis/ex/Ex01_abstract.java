package org.joonzis.ex;
// 추상클래스 - 일반 메소드, 추상메소드 둘다 가질 수 있다.
abstract class Animal{
	public void eat(String food) {
		System.out.println(food+"eat");
	}
	abstract public void move();
}

class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("산책");
	}
}
public class Ex01_abstract {
	public static void main(String[] args) {
		 
		// 추상클래스는 new할 수 없다
//		Animal animal=new Animal();

		Animal animal=new Dog();
		animal.eat("apple");
		animal.move();
		
	}
}
