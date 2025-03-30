package org.joonzis.test;

public class CarMain {
	public static void main(String[] args) {
		
		Car c=new Car();
		c.setFields("sonata", "gray");
		c.output();
		
		Car c2=new Car();
		c2.setFields("마티즈", "황금", 2021);
		c2.output();
	}
}
