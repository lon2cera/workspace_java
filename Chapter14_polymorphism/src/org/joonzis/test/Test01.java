package org.joonzis.test;
//Employee 클래스			
//필드 : String name, String dept
//메소드 : Constructor, int pay(), void output()
//SalaryWorker 클래스		
//필드 : int salary
//메소드 : Constructor, int pay(), void output()
//SalesWorker 클래스		
//필드 : int salesVolume, double salesIncentive --> 인센티브 비율(1000이상 10%, 500이상 5% 나머지 1%)
//메소드 : Constructor, int pay(), void output(),
//		 int salesPay(),
//		 void setSalesVolume(salesVolume), 
//		 void setSalesIncentive(salesIncentive)
//PartTimeWorker 클래스	
//필드 : int workTime, int payPerHour
//메소드 : Constructor, int pay(), void output()
//★
//필드는 전부 private
//SalaryWorker extends Employee
//SalesWorker extends SalaryWorker
//PartTimeWorker extends Employee

class Employee{
	private String name,dept;
	
	public Employee() {}

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	// pay() 메소드를 오버라이드해서 사용하기 위함 -- 의미가 없는 메소드
	public int pay() {
		return 0;
	}
	public void output() {
		System.out.println("name : "+name);
		System.out.println("dept : "+dept);
	}
}
class SalaryWorker extends Employee{
	private int salary;
	public SalaryWorker() {}
	public SalaryWorker(String name, String dept, int salary) {
		super(name,dept);
		this.salary = salary;
	}
	@Override
	public int pay() {
		return salary;
	}
	@Override
	public void output() {
		super.output();
		System.out.println("pay : "+pay());
	}
	
}
class SalesWorker extends SalaryWorker{
	private double salesIncentive;
	public SalesWorker() {}
	public SalesWorker(String name, String dept,int salary) {
		super(name,dept, salary);
		}
	public int salesPay() {
		return (int)(super.pay()*salesIncentive);
	}
	public void setSalesVolume(int salesVolume) {
		if(salesVolume>=1000) {
			setSalesIncentive(0.1);
		}else if(salesVolume>=500) {
			setSalesIncentive(0.05);
		}else {
			setSalesIncentive(0.01);
		}
	 }
	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive=salesIncentive;
	}
	@Override
	public int pay() {
		return super.pay()+salesPay();
	}
	@Override
	public void output() {
		super.output();
		System.out.println("salesPay : "+salesPay());
	}
	
}
class PartTimeWorker extends Employee{
	private int workTime, payPerHour;
	
	public PartTimeWorker() {}
	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name,dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	@Override
	public int pay() {
		return workTime*payPerHour;
	}
	@Override
	public void output() {
		super.output();
		System.out.println("pay : "+this.pay());
	}
	
}
public class Test01 {
	public static void main(String[] args) {
		
		Employee[] em=new Employee[3];
		
	
		em[0]= new SalaryWorker("aa","bb",10);		
		em[1]= new SalesWorker("cc","dd",1000);		
		em[2]= new PartTimeWorker("ee","ff",20,100);		
		
		Employee e1=new Employee();
		if(e1 instanceof SalesWorker) {
			((SalesWorker)e1).setSalesIncentive(500);
		}
		
		for (int i = 0; i < em.length; i++) {
			em[i].output();
		}
		
		
	}
}
