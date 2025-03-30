package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_localMain {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	Ex02_local l=new Ex02_local();
	l.setLocalInfo("김씨", 23, "000000-1234567");
	l.output();
	
	Ex02_local l2=new Ex02_local();
	l2.setLocalInfo(sc.next(), sc.nextInt());
	l2.output();
	
	sc.close();
	}

}