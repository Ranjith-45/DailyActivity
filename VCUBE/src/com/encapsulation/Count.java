package com.encapsulation;

class A{
	private int count;
	void setCount() {
		
		count=count+1;
		this.count=count;
	}
	int getCount() {
		return count;
	}
}

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.setCount();
		a.setCount();
		a.setCount();  
		System.out.println(a.getCount());

	}

}
