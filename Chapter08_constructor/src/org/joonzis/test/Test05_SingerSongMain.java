package org.joonzis.test;

public class Test05_SingerSongMain {
	public static void main(String[] args) {
		
		Test04_Singer singer1=new Test04_Singer("김");
		singer1.setSong(new Test03_Song("a", "s"));
		
		Test04_Singer singer2=new Test04_Singer("K");
		singer2.setSong(new Test03_Song("ttt","ccc"));
		
		
		singer1.output();
		singer2.output();	
		
	}
}
