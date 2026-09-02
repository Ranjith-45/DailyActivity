package com.oops.Inheritance;
class A{
	void methodA() {
		System.out.println("I am in method A");
	}
	void Hello() {
		System.out.println("Hello From A");
	}
}
class B extends A{
	void methodB() {
		System.out.println("I am in method B");
	}
	@Override
	void Hello() {
		System.out.println("Hello From A");
	}
}
public class Senerios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();//access both A and B..
		b.methodA();
		b.methodB();
		A a=new A();//access only parent class member ....
		a.methodA();
		//a.methodB();not allowed....
		
		A aa=new B();//it allows all the class members from A  because of it is a patent class it also called as 
		
		//but not mention @Override
		aa.methodA();
		aa.Hello();
		
		//B bb=new A();
		
		
		

	}

}
