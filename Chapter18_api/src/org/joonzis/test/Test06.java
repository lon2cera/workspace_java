package org.joonzis.test;

import java.math.BigInteger;

public class Test06 {
	public static void main(String[] args) {
		
		BigInteger sum=new BigInteger("1");
		for (int i = 1; i < 100; i++) {
			sum=sum.multiply(BigInteger.valueOf(i));
			System.out.println(sum);
		}
		
		
		
		
		
		
		
		
	}
}
