package org.joonzis.ex;

public class Ex02_switch {
	public static void main(String[] args) {
		String gender="남";
		// if 문으로 출력
		// switch 문으로도 출력
		// "저는 OO입니다"
		
		if (gender.equals("남")) {
			System.out.println("저는 남자입니다");
		} else {
			System.out.println("저는 여자입니다");
		}
		
		switch(gender) {
			case "남":System.out.println("저는 남자입니다");
			break;
			case "여":System.out.println("저는 여자입니다");
			break;
		}
		
		
	}
}
