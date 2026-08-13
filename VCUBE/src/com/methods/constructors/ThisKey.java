package com.methods.constructors;

public class ThisKey {
	int num;
	String name;
	int age;
	static int count =0;
	ThisKey(int roll,String name,int age){
//		int roll,String name,int age .........these variable are local variable
		// assign the values to the instance variable and the local variable names and
		//instance variable names are  same then we use "this" key word
		count++;
		System.out.println("Constructor called:"+count);
		num=roll;
		this.name=name;
		this.age=age;
		
	}
	
	void display() {
		System.out.println("rollno:"+num);
		System.out.println("Name :"+name);
		System.out.println("Age:"+age);
	}
	public static void main(String[] arg) {
		ThisKey t1=new ThisKey(1,"ranjith",22);
		t1.display();
		ThisKey t2=new ThisKey(2,"mahi",21);
		t2.display();
	}
	
}
