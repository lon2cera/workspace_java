package org.joonzis.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//게시물을 저장하는 Board 클래스를 정의하고, ArrayList를 이용하여 3개의 게시물을 저장하시오.
//1~3번 게시물번호 중 하나를 입력 받아 해당 게시물을 삭제하시오.
//
//class Board			필드 : String title, String content, Date register
//							register -> 현재 날짜 자동 삽입
//					메소드 : 생성자, toString()
class Board{
	private String title, content;
	private Date register=new Date();
	public Board() {}
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "title : "+title+", content : "+content+", register : "+register;
	}
	
	
}	
public class Test01 {
	public static void main(String[] args) {
	
		List<Board> list=new ArrayList<Board>();
		Scanner sc=new Scanner(System.in);
		list.add(new Board("aa","bb"));
		list.add(new Board("cc","dd"));
		list.add(new Board("ee","ff"));
		
		System.out.println("0~2 정수 입력");
		list.remove(sc.nextInt());
		
		System.out.println(list);
		sc.close();
		
	}
}
