package org.joonzis.test;
//Product 클래스			
//	필드 : String model, int price
//	메소드 : Constructor, getters
//Tv 클래스					
//	필드 : X
//	메소드 : Constructor
//Computer 클래스			
//	필드 : X
//	메소드 : Constructor
//Customer				
//	필드 : int money, int startMoney, Product[] cart, int numOfProduct
//	메소드 : Constructor, buy(Product), output	
//★
//buy() -> 상품 구매(소지 금액보다 구매 금액이 큰 경우 예외처리)/구매한 만큼 금액 차감/카트에 상품 추가
//output() -> 구매상품, 금액/처음 소지 금액/총 구매 금액/남은 금액 출력
//
//== 2명의 Customer가 각각 Tv, Computer를 구매 

class Product{
	private String model;
	private int price;
	
	public Product() {}
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
}
class Tv extends Product{
	public Tv() {}
	public Tv(String model, int price) {
		super(model,price);
	}
	
}
class Computer extends Product{
	public Computer() {}
	public Computer(String model, int price) {
		super(model,price);
	}
}
class Customer{
	private int money, startMoney, numOfProduct;
	Product[] cart =new Product[10];
	
	public Customer() {}

	public Customer(int money) {
		super();
		this.money = money;
		this.startMoney = money;
	}
	//buy() -> 상품 구매(소지 금액보다 구매 금액이 큰 경우 예외처리)/구매한 만큼 금액 차감/카트에 상품 추가
	void buy(Product product) {
		if(numOfProduct==cart.length) {
			return;
		}
		if(money<product.getPrice()) {
			return;
		}
		money-=product.getPrice();
		cart[numOfProduct]=product;
		numOfProduct++;
		
	}
	void output() {
		int total=0;
		for (int i = 0; i < numOfProduct; i++) {
			System.out.println("model : "+cart[i].getModel()+", "+cart[i].getPrice());
			total+=cart[i].getPrice();
		}
		System.out.println("startMoney : "+startMoney);
		System.out.println("total use money : "+total);
		System.out.println("money : "+money);
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		Customer cus=new Customer(1000);
		
		cus.buy(new Tv("tv",200));
		cus.buy(new Computer("pc",500));
		cus.output();
		
	}
}
