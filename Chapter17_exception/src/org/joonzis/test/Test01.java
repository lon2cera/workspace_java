package org.joonzis.test;
//사용자로부터 10이상의 정수를 입력 받아 난수 (0 ~ 9)로 나눈결과를 출력하시오.
//위과정을 100번 반복하여 출력하며, 나눌 수없는 경우에는 나눈 결과를 0으로 대신출력한다.

import java.util.Random;
import java.util.Scanner;

class Test{
	int num;
	Random ran=new Random();

	public Test() {}
	public Test(int num) {
		this.num=num;
	}
	public int rt(){
		return (num/ran.nextInt(10));
	}
	public void output() {
		System.out.println(rt());
	}

	

}
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Test test;
		for (int i = 0; i < 100; i++) {
			try {
				test=new Test(sc.nextInt());
				test.rt();
				test.output();
				
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
		
		}
		sc.close();
	}
}
