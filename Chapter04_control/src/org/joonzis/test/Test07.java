package org.joonzis.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("월 입력");
		int m=sc.nextInt();
		sc.close();
		
		switch(m) {
			case 1:
				System.out.println(m+"월은 31일 까지 있습니다.");
				break;
			case 2:
				System.out.println(m+"월은 28일 까지 있습니다.");
				break;
			case 3:
				System.out.println(m+"월은 31일 까지 있습니다.");
				break;
			case 4:
				System.out.println(m+"월은 30일 까지 있습니다.");
				break;
			case 5:
				System.out.println(m+"월은 31일 까지 있습니다.");
				break;
			case 6:
				System.out.println(m+"월은 30일 까지 있습니다.");
				break;
			case 7:
				System.out.println(m+"월은 31일 까지 있습니다.");
				break;
			case 8:
				System.out.println(m+"월은 31일 까지 있습니다.");
				break;
			case 9:
				System.out.println(m+"월은 30일 까지 있습니다.");
				break;
			case 10:
				System.out.println(m+"월은 31일 까지 있습니다.");
				break;
			case 11:
				System.out.println(m+"월은 30일 까지 있습니다.");
				break;
			case 12:
				System.out.println(m+"월은 31일 까지 있습니다.");
				break;
		}	
	}
}


//		switch(m) {
//			case 1:	case 3:	case 5:	case 7:
//			case 8:	case 10: case 12:
//				System.out.println(m+"월은 31일 까지 있습니다.");
//				break;
//			case 4:	case 6: case 9: case 11:
//				System.out.println(m+"월은 30일 까지 있습니다.");
//				break;
//			case 2:
//				System.out.println(m+"월은 28일 까지 있습니다.");
//		}