package org.joonzis.test;

public class Test12_CoordinateCircleRingMain {
	public static void main(String[] args) {
		
		Test11_Ring ring =new Test11_Ring(new Test10_Circle(new Test09_Coordinate(1,2),5), new Test10_Circle(new Test09_Coordinate(1,2),7));
		
		ring.output();
			
	}
}
