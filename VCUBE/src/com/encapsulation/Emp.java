package com.encapsulation;

public class Emp {
//	1.Create an encapsulated class Employee with private fields: id, name, salary, password.
//	Requirements:
//	1. Make all fields private (Data Hiding).
//	2. Create public setters and getters.
//	3. Access and modify the data
	private int id;
	private String name;
	private double salary;
	public void setId(int id) {
		this.id=id;
		
	}
	public void setName(String name) { 
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name ;
		
	}
	public double getSalary() {
		return salary;
	}

}
