package org.joonzis.test;

import java.util.Scanner;

//나이를 입력 받아 출력하시오. 
//나이가 0 ~ 150 사이의 범위를벗어나면 AgeException 클래스를 이용하여 예외를 처리하시오.
//나이를 입력 받기 위해 int getAge() 메소드를 이용하시오.
class Age{
	private int age;
	Scanner sc=new Scanner(System.in);
	
	public Age() {}
	public Age(int age) {
		this.age = age;
	}

	public int getAge() {
		age=sc.nextInt();
		return age;
	}
	public void ageBounds() throws AgeException {
		if(0<=getAge()&&age<=150) {
			System.out.println(age);
		} else {
			throw new AgeException("0~150 사이 정수 입력");
		}
	}
}

class AgeException extends Exception{
	private static final long serialVersionUID = 1L;
	public AgeException(String msg) {
		super(msg);
	}
}
public class Test02 {
	public static void main(String[] args) {
		
		Age a=new Age();
		try {
			a.ageBounds();
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
//	public static int getAge() {
//		
//	}
}