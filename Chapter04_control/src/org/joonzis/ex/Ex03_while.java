package org.joonzis.ex;

public class Ex03_while {
	public static void main(String[] args) {

		int num=0;
		
		while(num<10) {
			System.out.println(num);
			num++;
		}
		
		while(true) {
			System.out.println(num);
			num++;
			
			if(num==10) {
				break;
			}
		}		
	}
}
