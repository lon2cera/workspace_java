package org.joonzis.test;

public class Ex02_SingerSongMain {
	public static void main(String[] args) {
		
		Ex02_Singer singer=new Ex02_Singer("아이유",3);
		singer.setSong(new Ex02_Song("aa","bb"));
		singer.setSong(new Ex02_Song("cc","dd"));
		singer.setSong(new Ex02_Song("ee","ff"));
		
		singer.output();
		
		
	}
}
