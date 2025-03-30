package org.joonzis.test;

public class Ex02_Song {
	String title, country;
	 
	public Ex02_Song() {}
	public Ex02_Song(String title, String country) {
		this.title = title;
		this.country = country;
	}

	void output() {
		 System.out.println("title : "+title);
		 System.out.println("country : "+country);
	}

}
