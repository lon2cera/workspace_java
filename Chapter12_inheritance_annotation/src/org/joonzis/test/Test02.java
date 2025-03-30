package org.joonzis.test;
//Notebook.java				- 필드 : String model, int price, int battery
//- 메소드 : Constructor, output()	
//Tablet.java					- 필드 : String model, int price, int battery, String pen
//- 메소드 : Constructor, output()
//→ 부모클래스는 알아서 만들어보자!(Computer)
//**** Computer는 	battery 가 없다 ******

class Computer{
	String model;
	int price;
	public Computer() {}
	public Computer(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	void output() {
		System.out.println("model : "+model+", price : "+price);
	}
	
}
class Notebook extends Computer{
	int battery;			// 배터리까지 Computer클래스로 올리면 상속받을 필요가 없음	Notebook 클래스가 존재할 필요가 없으니 배터리는 올리지 않음
	public Notebook() {}	// 서브클래스에는 다 쓰지만 슈퍼클래스에는 필요가 없을 때 슈퍼클래스와 서브클래스가 동일시 변수를 전부 슈퍼클래스에 넣지 않음
	public Notebook(int battery, String model, int price) {
		super(model, price);
		this.battery = battery;
	}
	@Override
	void output() {
		super.output();
		System.out.println("battery : "+battery);
	}
}

class Tablet extends Computer{
	int battery;
	String pen;
	public Tablet() {}
	public Tablet(int battery, String pen, String model, int price) {
		super(model, price);
		this.battery = battery;
		this.pen = pen;
	}
	@Override
	void output() {
		super.output();
		System.out.println("battery : "+battery+", pen : "+pen);
	}
}

public class Test02 {
	public static void main(String[] args) {
	
		Notebook note=new Notebook(70,"galxy book4",400000);
		note.output();
		
		Tablet tab=new Tablet(90,"galxy pen","galxy tap 2",100000);
		tab.output();
		
	}
}
