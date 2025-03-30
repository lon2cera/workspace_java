package org.joonzis.test;
//Coordinate.java			필드 - int x, int y
//메소드 - Constructor, output

public class Test09_Coordinate {

	int x, y;
	
	public Test09_Coordinate() {}
	public Test09_Coordinate(int x, int y) {
		this.x=x;
		this.y=y;
	}
	void output() {
		System.out.println("[X,Y] : ["+x+","+y+"]");
	}
	
	
	
}
