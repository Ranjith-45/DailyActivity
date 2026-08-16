package com.methods.constructors;

public class Student {
	int id;
	String name;
	String course;
	

	


	public Student() {
		this(1);
	}



	public Student(int id) {
		this(id,"Ranjith");
		
	}
	public Student(int id, String name) {
		this(id,name,"cse");
		
	}
	


	public Student(int id, String name, String course) {
		
		this.id = id;
		this.name = name;
		this.course = course;
	}

	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sc=new Student();
		Student sc1=new Student(2,"sai" ,"cse");
		sc1.show();
		sc.show();
	}

}
