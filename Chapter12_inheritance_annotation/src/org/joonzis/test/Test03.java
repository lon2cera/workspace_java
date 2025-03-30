package org.joonzis.test;
//SalaryWorker.java			
//- 필드 : String name, String dept, int salary
//- 메소드 : Constructor, int pay(), output()	
//SalesWorker.java			
//- 필드 : String name, String dept, int salary , double salesIncentive
//- 메소드 : Constructor, int pay(), output(), int salesPay() : 수당 = 기본급 * 판매인센티브
//PartTimeWorker.java			
//- 필드 : String name, String dept, int workTime, int payPerHour
//- 메소드 : Constructor, int pay(), output()
//
//String name : 이름
//String dept : 부서
//int salary : 기본급(월급)
//double salesIncentive : 판매 인센티브
//int workTime : 근무시간
//int payPerHour : 시급

class Employee{
	String name, dept;
	public Employee() {}
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	int pay() {
		return 0;	//서브클래스를 위해 슈퍼클래스가 선언만 해놓음  리턴 값은 아무거나 대체 
	}
	void output() {
		System.out.println("name : "+name+"\t dept : "+dept);
		System.out.println("pay : "+pay());
	}
}

class SalaryWorker extends Employee{
	int salary;
	public SalaryWorker() {}
	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	@Override
	int pay() {
		return salary;
	}
	@Override
	void output() {
		super.output();
		System.out.println("salary : "+salary);
	}
}

class SalesWorker extends SalaryWorker{
	double salesIncentive;
	public SalesWorker() {}
	public SalesWorker(String name, String dept, int salary, double salesIncentive) {
		super(name, dept, salary);
		this.salesIncentive = salesIncentive;
	}
	int salesPay() {
		return (int)(salary*salesIncentive);
	}
	@Override
	int pay() {
		return super.pay();
	}
	@Override
	void output() {
		super.output();
		System.out.println("salarypay : "+salesPay());
	}
}

class PartTimeWorker extends Employee{
	int workTime, payPerHour;
	public PartTimeWorker() {}
	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	@Override
	int pay() {
		return (workTime*payPerHour);
	}
	@Override
	void output() {
		super.output();
		System.out.println("workTime : "+workTime+"\t payPerHour : "+payPerHour);
	}
	
}

public class Test03 {
	public static void main(String[] args) {
		
		SalaryWorker salWork=new SalaryWorker("Kim","사무직",200);
		salWork.output();
		
		System.out.println();
		
		SalesWorker salesWorker=new SalesWorker("Bak","영업직",190,1.4);
		salesWorker.output();

		System.out.println();
		
		PartTimeWorker partWork=new PartTimeWorker("Kang","계약직",160,3);
		partWork.output();

	}
}
