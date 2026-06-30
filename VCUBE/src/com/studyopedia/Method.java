package com.studyopedia;

public class Method {
//in method we can call then only it will execute 
	
	static int a=10;
	int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		method1();
		
	}
	static void method1() {
		method2();
		System.out.println("hello method1");
		System.out.println(a);//static method can access only static variable but not 
		//System.out.println(b);//access the instance variables and blocks
	}
	static void method2() {
		Method t =new Method();
		t.method3();
		System.out.println("hello method2");
	}
	void method3() {
//		Method t =new Method();
//      In instance method don't need any object to call the instance method
//      instance method ---->  calling instance method ==> Don' need any object.....
		method4();
		
		System.out.println("hello method3");
	}
	void method4() {
		System.out.println("hello method4");
		System.out.println("hello method1");
		System.out.println(a);
		//instance method can access both static variable and blocks and instance variables and blocks 
		System.out.println(b);
	}
}
// debugging first click on debug symbol then down arrow  
