package com.encapsulation;

public class Employee {

	private int eid;
	private String ename;
	private int age ;
	//The scope of the private is within the class only
	//for Faster access purpose go to source then generate getter and setters
	public void setEid(int eid) {
		this.eid=eid;
		
	}
	public int geEid() {
		return eid;
	}
	public void setEname(String ename) {
		this.ename=ename+"vcube";
		 
	}
	public String getEname() {
		return ename;
	}
	public void setAge(int age) {
		if(age>18) {
			this.age=age;
		}else {
			System.out.println("not Eligible to vote");
		}
	}
	public int getAge() {
		return age;
	}
}
