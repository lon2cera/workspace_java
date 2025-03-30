package org.joonzis.test;
//Song.java				필드 - String title, String country
//메소드 - Constructor, output
//Singer.java				필드 - String name, Song song 
//메소드 - Constructor, setSong(s), output
//SingerSongMain.java										

public class Test03_Song {

	String title, country;
	
	public Test03_Song() {}
	public Test03_Song(String title, String country) {
		this.title=title;
		this.country=country;
	}
	void output() {
		System.out.println("노래 제목 : "+title);
		System.out.println("노래 국가 : "+country);
	}
	
	
	
	
	
	
}
