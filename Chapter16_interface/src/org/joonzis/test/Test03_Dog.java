package org.joonzis.test;

public class Test03_Dog implements Test03_Animal{
	@Override
	public void move() {
		System.out.println("Move");
	}
	public static void main(String[] args) {
		Test03_Dog dog=new Test03_Dog();
		dog.move();
	}
}
