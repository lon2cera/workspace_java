package org.joonzis.test;
//스마트폰 => 전화기 + 컴퓨터 
//
//class Phone 				필드 : String owner
//							메소드 : Constructor, sendCall(), receiveCall()
//interface Computable		메소드 : connectInternet(), playApp()

class Phone{
	private String owner;
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void sendCall() {
		System.out.println(owner+"sendcall");
	}
	public void receiveCall(){
		System.out.println(owner+"receivecall");
	}
}


interface Computable{
	public void connectInternet();
	public void playApp();
}


class SmartPhone extends Phone implements Computable{
	public SmartPhone() {}
	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void connectInternet() {
		System.out.println("internet connect");
	}
	@Override
	public void playApp() {
		System.out.println("play app");
	}

}


public class Test01 {
	public static void main(String[] args) {
		
		SmartPhone ph=new SmartPhone("aa");
		ph.sendCall();
		ph.receiveCall();
		ph.connectInternet();
		ph.playApp();
		
	}
}
