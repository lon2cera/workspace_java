package org.joonzis.test;
//Ring.java				필드 - Circle inner, Circle outer
//메소드 - Constructor, output

public class Test11_Ring {
	Test10_Circle inner, outer;
	
	public Test11_Ring() {}
	public Test11_Ring(Test10_Circle inner, Test10_Circle outer) {
		this.inner=inner;
		this.outer=outer;
	}
	void output() {
		System.out.println("Inner Circle");
		inner.output();
		System.out.println();
		System.out.println("Outer Circle");
		outer.output();
	}
	
}
