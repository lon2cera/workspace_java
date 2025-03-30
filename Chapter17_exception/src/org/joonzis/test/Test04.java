package org.joonzis.test;
//1 ~ 100 사이의 난수를 발생시켜 해당 값을 맞출때까지 게임을 진행하시오.
//다음의 경우 예외를 발생시키시오.
//1) 사용자가 1 ~ 100 이외의 값을 입력한 경우 NumberOutOfBoundsException 클래스를 이용하여 예외 처리
//2) 정수대신 다른 데이터 (예: 실수, 문자) 등을 입력한 경우

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Updown{
	private int num;
	private int count;
	private Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	public Updown() {
		num=ran.nextInt(100)+1;
	}
	public void play() {
		while(true) {
			try {
				int selNum=challenge();
				if (selNum>num) {
					System.out.println("down");
				}else if (selNum<num) {
					System.out.println("up");
				}else {
					System.out.println("정답"+count+"회");
					break;
				}
			} catch (NumberOutOfBoundsException e) {
					System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력해라!!!");
				sc.next();
			}
				
			}

	}
	public int challenge() throws NumberOutOfBoundsException ,InputMismatchException{
		count++;
		System.out.println("정수 입력");
		int selNum=sc.nextInt();
		if(selNum<1||selNum>100) {
			throw new NumberOutOfBoundsException("1~100");
		}
		return selNum;
	}
}
class NumberOutOfBoundsException extends Exception{
	private static final long serialVersionUID = 1L;
	public NumberOutOfBoundsException() {}
	public NumberOutOfBoundsException(String msg) {
		super(msg);
	}
	

}
public class Test04 {
	public static void main(String[] args) {
		Updown ud=new Updown();
		ud.play();
		
		
	}
}
