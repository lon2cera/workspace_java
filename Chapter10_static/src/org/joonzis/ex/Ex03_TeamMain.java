package org.joonzis.ex;

public class Ex03_TeamMain {
	public static void main(String[] args) {
		
		Ex03_Team member1=new Ex03_Team("KIM");
		member1.output();
		Ex03_Team member2=new Ex03_Team("KIM2");
		member2.output();
		Ex03_Team member3=new Ex03_Team("KIM3");
		member3.output();		
		
		System.out.println("All : "+Ex03_Team.count+"p");
		
		
		
	}
}
