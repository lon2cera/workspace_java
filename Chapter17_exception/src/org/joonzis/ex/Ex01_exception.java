package org.joonzis.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

// ArithmeticException
// 정수를 0으로 나눌 경우 예외 발생
public class Ex01_exception {
	 public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		int num1, num2;
		
		try {
			System.out.println("1");
			num1=sc.nextInt();
			System.out.println("2");
			num2=sc.nextInt();
			
			System.out.println("+ : "+(num1+num2));
			System.out.println("- : "+(num1-num2));
			System.out.println("* : "+(num1*num2));
			System.out.println("/ : "+(num1/num2));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		} catch (InputMismatchException e) {
			System.out.println("정수 입력");
		}catch (Exception e) {	//에러코드 확인
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
	}
}
