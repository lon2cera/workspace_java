package org.joonzis.ex;
interface Shape{
	public double PI=Math.PI;
	public double calcArea();
	public void output();
}
class Rect implements Shape{
	private int width, height;
	public Rect() {}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return width*height;
	}
	@Override
	public void output() {
		System.out.println("width : "+width);
		System.out.println("height : "+height);
		System.out.println(calcArea());
	}
}
class Circle implements Shape{
	private double redius;
	public Circle() {}
	public Circle(double redius) {
		this.redius=redius;
	}
	@Override
	public double calcArea() {
		return PI*Math.pow(redius, 2);
	}

	@Override
	public void output() {
		System.out.println("redius : "+redius);
		System.out.println(calcArea());
	}
}
public class Ex02_interfave {
	public static void main(String[] args) {
		Shape[] arr=new Shape[2];
		arr[0]=new Rect(2,3);
		arr[1]=new Circle(4);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].output();
		}
	}
}
