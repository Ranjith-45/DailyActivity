package com.accessModifiers01;

public class Access02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started Access02");
	//for private constructor	The constructor Access01() is not visible
		//we can use it by default constructor
		Access01 t1=new Access01();
		//we  cannot access the private data members outside of the classes.
//		System.out.println(t1.a1);
//		System.out.println(t1.name1);
//		t1.method1();
		
	////DEFAULT DATA ACCESSING the data ith n the class-*************************
		Access01 t4=new Access01();
		System.out.println(t4.a4);
		System.out.println(t4.name4);
		t4.method4();
		
		
	}

}
