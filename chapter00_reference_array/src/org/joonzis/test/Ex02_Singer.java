package org.joonzis.test;

//Constructor : 이름, 배열 크기 선언,
//Song[] songList : Song의 객체 n개를 메인으로부터 받아서 처리,
	
public class Ex02_Singer {
	String name;
	int idx;						
	Ex02_Song[] songList;
	Ex02_Song song;

	public Ex02_Singer() {}
	public Ex02_Singer(String name, int x) {
		this.name=name;
		songList=new Ex02_Song[x];
	}
	void setSong(Ex02_Song song) {
			songList[idx]=song;
			idx++;
	}
	void output() {
		System.out.println("name : "+name);
		for (int i = 0; i < songList.length; i++) {
			songList[i].output();
		}	
	}
}
