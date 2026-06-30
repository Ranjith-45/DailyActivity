package com.studyopedia;

public class Employee {
	static String companyName;
	static String location;
	String employeeName;
	int salary;
	public static void main(String[] args) {
		
		
		Employee e1=new Employee();
		System.out.println(e1.employeeName);
		e1.employeeName="B.raju";
		e1.salary=2000000;
		e1.display();
		
		Employee e2=new Employee();
		e2.employeeName="U.Ranjith kumar";
		e2.salary=3000000;
		e2.display();
		
	}
	static {
		companyName="TCS";
		location="hydrabad";
	}
	void display() {
		System.out.println("Company name:"+ companyName);
		System.out.println("Location:"+ location);
		System.out.println("Employee name:"+ employeeName);
		System.out.println("Salary:"+ salary);
		
	}

}
