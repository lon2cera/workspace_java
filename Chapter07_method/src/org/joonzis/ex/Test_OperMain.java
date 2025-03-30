package org.joonzis.ex;

public class Test_OperMain {
	public static void main(String[] args) {
		
		Test_Oper o=new Test_Oper();
		
		o.val1=10;
		o.val2=3.3;
		
		
		o.plus(10, 20);
		o.minus();
		o.multi();
//		o.div();
//		o.output();
		System.out.println(o.div());
		
	}
}
