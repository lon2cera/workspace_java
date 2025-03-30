package org.joonzis.ex;

public class Ex05_BookMain {
	public static void main(String[] args) {
		
		Ex05_Book book1=new Ex05_Book();
		Ex05_Book book2=new Ex05_Book("ㅁㄴㅇㄹ", 2000);
		Ex05_Book book3=new Ex05_Book("ㅂㅈㄷㄱ", 3000, "김김");
		
		book1.output();
		System.out.println();
		book2.output();
		System.out.println();
		book3.output();
		
		
		
	}
}
