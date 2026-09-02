package com.oops.Inheritance;
class Parent1 {
	static {
		System.out.println("Hello parent  static block");
	}
	
	
	 {
			System.out.println("Hello parent Instance block");
		}
	 
    Parent1() {
        System.out.println("Parent Constructor");
    }
    
    
}

class Child1 extends Parent1 {
	
	static {
		System.out.println("Hello Child  static block");
	}
	
	 {
			System.out.println("Hello Child instance block");
	}
	 
    Child1() {
        System.out.println("Child Constructor");
    }
}

public class Const {
	static int count;
	static {
		System.out.println("Hello Main static block"+ (++count));
	}
	
	 {
			System.out.println("Hello Main instance block"+ (++count));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method Started");
		 Const cn=new  Const();
		Child1 c=new Child1();
	}

}
