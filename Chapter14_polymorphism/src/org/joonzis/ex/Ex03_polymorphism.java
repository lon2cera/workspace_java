package org.joonzis.ex;
class Animal{
	public void move() {}
}
class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("강아지 산책한다.");
	}
}
class Dolphin extends Animal{
	@Override
	public void move() {
		System.out.println("돌고래 헤엄친다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리 움직이고");
	}
	public void fly() {
		System.out.println("난다.");
	}
}
public class Ex03_polymorphism {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		// 업캐스팅
		animals[0] = new Dog();
		animals[1] = new Dolphin();
		animals[2] = new Eagle();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		
		//animals[2].fly() 
		// 부모 클래스에 fly() 메소드가 없기 때문에 호출할 수 없다.
//		((Eagle)animals[2]).fly();
		
		if(animals[2] instanceof Eagle) {
			// 다운 캐스팅
			// 1. Eagle 객체 생성 
			Eagle eagle = (Eagle)animals[2];
			eagle.fly();
			
			// 2. 객체 생성 없이 사용
			((Eagle)animals[2]).fly();
		}
		
		
		
	}
}








