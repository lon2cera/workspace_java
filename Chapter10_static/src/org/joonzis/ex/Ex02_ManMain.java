package org.joonzis.ex;

public class Ex02_ManMain {
	public static void main(String[] args) {
		
		Ex02_Man man=new Ex02_Man("Kim", 57);
		man.output();
		
		System.out.println();
		
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(Ex02_Man.GENDER);
		
	}
}
