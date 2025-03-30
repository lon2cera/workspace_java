package org.joonzis.ex;
class MyThread2 implements Runnable{
	// 1. Thread 클래스를 상속 받아 정의
	// run() 메소드를 재정의하여 스레드가 실행할 코드를 작성
	private String str;
	public MyThread2(String str) {
		this.str=str;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println(str);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex03_multiThread {
	public static void main(String[] args) {
		

		System.out.println("Main Thread Start");
		
		MyThread2 mt1=new MyThread2("*");
		MyThread2 mt2=new MyThread2("-");
		
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread End");
		
		
	}
}
