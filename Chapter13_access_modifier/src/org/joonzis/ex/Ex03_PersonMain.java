package org.joonzis.ex;

public class Ex03_PersonMain {
	public static void main(String[] args) {
		
		Ex03_Person person=new Ex03_Person();
		person.setName("Kim");
		person.setAge(34);
		person.setGender('M');
		person.setHeight(167.9);
		
		System.out.println(person.getName());
		
		
		
	}
}
