package org.joonzis.test;
//주민등록 번호 (하이픈 포함)를 입력 받아 출력하시오.
//주민등록번호가 14글자가 아니면 PerIDException 클래스를 이용하여 예외를 처리하시오.
//주민등록번호를 입력받기 위해 String getPerID() 메소드를 이용하시오.		

import java.util.Scanner;

class Number {
	String perID;
	Scanner sc=new Scanner(System.in);
	public Number() {}
	public Number(String perID) {
		this.perID = perID;
	}
	public String getPerID() {
		perID=sc.next();
		return perID;
	}
	public void numBounds() throws PerIDException{
		if(perID.length()==14) {
			System.out.println(perID);
		}else {
			throw new PerIDException("-포함 다시 입력");
		}
	}

}
class PerIDException extends Exception {
	private static final long serialVersionUID = 1L;
	public PerIDException() {}
	public PerIDException(String msg) {
		super(msg);
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Number num=new Number();
		try {
			num.getPerID();
			num.numBounds();
			
		} catch (PerIDException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
