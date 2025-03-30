package org.joonzis.ex;

// 국내에 거주하는 사람
public class Ex02_local {
	String name;
	int age;
	String sn;	// 주민등록번호
	boolean isKorean;	// 한국인 유무
	
	// 메소드
	// setLocalInfo
	// 이름, 나이, 주민등록번호를 전달 받아 필드 초기화
	// 주민등록번호 뒷자리의 첫 번째 값이 1~4일 경우 한국인
	
	// setLocalInfo
	// 이름, 나이를 전달 받아 필드 초기화
	
	// output
	// 이름, 나이, 주민등록번호, 한국인or외국인 출력
	// 주민등록번호가 없으면 "없음"으로 출력
	
	void setLocalInfo(String name, int age, String sn) {
		
		this.name=name;
		this.age=age;
		this.sn=sn;
		
		// 1. charAt()
		isKorean=sn.charAt(7) <='4'?true : false;
		
		// 2. substring()
//		int tmp=Integer.parseInt(sn.substring(7, 8));
//		isKorean=tmp<=4?true:false;
		
	}
	void setLocalInfo(String name, int age) {
		this.name=name;
		this.age=age;
	}
	void output() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		if(sn.equals(null)) {
			System.out.println("주민등록번호 : "+"없음");
		}else {
			System.out.println("주민등록번호 : "+sn);
		}
//		System.out.println(sn==null?"없음":sn);
		System.out.println(isKorean?"한국인":"외국인");
	}
	
	
}
