package org.joonzis.test;
//interface Providable		메소드: sightseeing(), leisure(), food()
//class KoreaTour				메소드 : Providable 구현을 통해생성
//class GuamTour				메소드 : Providable 구현을 통해생성
//class TourGuide				필드 : Providable tour
//							메소드 : Constructor, sightseeing(), leisure(), food()
//★ KoreaTour / GuamTour -  Providable 구현			

interface Providable{
	public void sightseeing();
	public void leisure();
	public void food();
}
class KoreaTour implements Providable{
	@Override
	public void food() {
		System.out.println("kimch");
	}
	@Override
	public void leisure() {
		System.out.println("hanok");
	}
	@Override
	public void sightseeing() {
		System.out.println("jeju");
	}
}
class GuamTour implements Providable{
	@Override
	public void food() {
		System.out.println("bab");
	}
	@Override
	public void leisure() {
		System.out.println("running");
	}
	@Override
	public void sightseeing() {
		System.out.println("sea");
	}
}
class TourGuide{
	private Providable tour;
	public TourGuide() {}
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	public void sightseeing(){
		tour.sightseeing();
	}
	public void leisure(){
		tour.leisure();
	}
	public void food(){
		tour.food();
	}
}


public class Test02 {
	public static void main(String[] args) {
		
		TourGuide tour1=new TourGuide(new KoreaTour());
		TourGuide tour2=new TourGuide(new GuamTour());
		
		tour1.sightseeing();
		tour1.leisure();
		tour1.food();
		
		tour2.sightseeing();
		tour2.leisure();
		tour2.food();
		
		
		
	}
}
