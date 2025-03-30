package org.joonzis.ex;
interface Animal{
	public void move();
	public void eat(String food);
}
class Dog implements Animal{
	@Override
	public void eat(String food) {
		System.out.println(food+"eat");
	}@Override
	public void move() {
		System.out.println("산책");
	}
}
public class Ex01_interface {
	public static void main(String[] args) {
			
		//클래스가 아니라 안됨
//		Animal animal=new Animal();
		
		Animal animal=new Dog();
		animal.move();
		animal.eat("사료");
	}
}
