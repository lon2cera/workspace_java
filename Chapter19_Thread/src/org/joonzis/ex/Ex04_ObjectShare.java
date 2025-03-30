package org.joonzis.ex;
/*
 *  synchronized (동기화)
 *  1. 메소드에 붙여서 사용
 *   - 여러개의 Tread들이 공유 객체의 메소드를 사용할 때 메소드에 synchronized가 붙어 있을 경우 먼저 호출한 메소드가 객체의 사용권(Monitoring Lock)을 얻는다
 *   - 메소드가 길어지게 될 경어 대기 시간이 증가 할 수 있다
 *  2. synchronized 블럭 사용
 */

class MusicBox{
	public synchronized void rock() {
		for (int i = 0; i < 5; i++) {
			System.out.println("play the rock");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void ballad() {
		for (int i = 0; i < 5; i++) {
			System.out.println("play the ballad");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void dance() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("play the dance");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
}
}
class MusicPlayer extends Thread{
	private int type;
	private MusicBox box;
	public MusicPlayer(int type, MusicBox box) {
		this.type = type;
		this.box = box;
	}
	@Override
	public void run() {
		switch(type) {
		case 1:box.rock();
			break;
		case 2:box.ballad();
			break;
		case 3:box.dance();
			break;
		}
	}
}
public class Ex04_ObjectShare {
	public static void main(String[] args) {
		MusicBox box=new MusicBox();
		MusicPlayer p1=new MusicPlayer(1, box);
		MusicPlayer p2=new MusicPlayer(2, box);
		MusicPlayer p3=new MusicPlayer(3, box);
		
		p1.start();
		p2.start();
		p3.start();
		
		
		
	}
}
