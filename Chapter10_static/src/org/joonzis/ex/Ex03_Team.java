package org.joonzis.ex;

public class Ex03_Team {
	// 필드
	String name;
	static int count=0;	// 모든 팀원들이 공유하는 자원
	
	public Ex03_Team(String name) {
		this.name=name;
		count++;
	}
	void output() {
		System.out.println("Name : "+name);
		System.out.println("Now team : "+count+"p");
	}
	
	
	
}
