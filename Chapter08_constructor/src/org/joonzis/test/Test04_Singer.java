package org.joonzis.test;
//메소드 - Constructor, setSong(s), output

public class Test04_Singer {

	String name; 
	Test03_Song song;
	
	public Test04_Singer() {}
	public Test04_Singer(String name) {
		this.name=name;
	}
	void setSong(Test03_Song song) {
		this.song=song;
	}
	void output() {
		System.out.println("가수 이름 : "+name);
		song.output();
	}
}
