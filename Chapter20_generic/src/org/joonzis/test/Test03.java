package org.joonzis.test;
//1. 메인클래스를 보고 알맞은 클래스들을 구현하시오.
//2. Product 클래스를 구현하시오.
//	필드 : T1 category, T2 model
//	적절한 메소드 구현하기

class Product<T1,T2>{
	private T1 category;
	private T2 model;
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(category).append(", ").append(model);
		return sb.toString();
	}
	public void setCategory(T1 category) {
		this.category = category;
	}
	public void setModel(T2 model) {
		this.model = model;
	}
}
class Elec{
	@Override
	public String toString() {
		return "전자제품";
	}
}
class Life{
	@Override
	public String toString() {
		return "생활용품";
	}
}
class Tv{
	private String str;
	public Tv() {}
	public Tv(String str) { this.str=str; }
	@Override
	public String toString() {
		return str+" Tv";
	}
}
class Cup{
	private String str;
	public Cup() {}
	public Cup(String str) { this.str=str; }
	@Override
	public String toString() {
		return str+" 컵";
	}
}
public class Test03 {
	public static void main(String[] args) {
		Product<Elec, Tv> product1 = new Product<>();
		Product<Life, Cup> product2 = new Product<>();
	
		product1.setCategory(new Elec());
		product1.setModel(new Tv("LG"));
		
		product2.setCategory(new Life());
		product2.setModel(new Cup("머그"));
		
		
		System.out.println(product1);			// 출력 예시) 전자제품, LG TV
		System.out.println(product2);
		
		
	}
}
