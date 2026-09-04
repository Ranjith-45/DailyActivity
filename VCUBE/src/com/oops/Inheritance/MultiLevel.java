package com.oops.Inheritance;

class Employee{
	void employeeMethod() {
		System.out.println("Employee method called");
	}
}
class Developer extends Employee{
	void developerMethod() {
		System.out.println("Developer Write the code");
	}
}
class javaDeveloper extends Developer{
	void javaDeveloper() {
		System.out.println("Java Developer write the java Code");
	}

}		
		

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaDeveloper jd=new javaDeveloper();
		Employee em=new javaDeveloper();
		jd.employeeMethod();
		jd.developerMethod();
		jd.javaDeveloper();
	}

}
