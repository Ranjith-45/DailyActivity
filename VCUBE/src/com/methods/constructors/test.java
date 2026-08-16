package com.methods.constructors;

public class test {
	int id;
	String name;
	int age;
	test(){
		
	}
	test(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void show() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test(1,"ran",21);
		t.show();
		test t1=new test();
		t1.id=2;
		t1.name="ranjith";
		t1.age=22;
		t1.show();
		
	}

}
