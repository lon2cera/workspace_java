package org.joonzis.test;
interface Car{					
	public void info();
	
}
class Bus implements Car{
	public Bus() {}
	@Override
	public void info() {
		System.out.println("Bus");
	}
}
class CityTourBus extends Bus{

	@Override
	public void info() {
		System.out.println("CityTourBus");
	}
}
class SeoulBus extends Bus{

	@Override
	public void info() {
		System.out.println("SeoulBus");
	}
}
class Taxi implements Car{
	@Override
	public void info() {
		System.out.println("Taxi");
	}
}
class Bicycle{}
 
public class Test04 {
	static <T extends Car> void onlyCar(T car) {
//	- CityTourBus, SeoulBus, Taxi 정보 출력
		car.info();
		
	}
	public static void main(String[] args) {
		
		Car car1=new CityTourBus();
		Car car2=new SeoulBus();
		Car car3=new Taxi();
		
		onlyCar(car1);
		onlyCar(car2);
		onlyCar(car3);
		
	}
}
