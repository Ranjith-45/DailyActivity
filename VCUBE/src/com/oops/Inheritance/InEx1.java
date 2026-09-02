package com.oops.Inheritance;
class Parent {
    int x = 10;

    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    int y = 20;

    void show() {
        System.out.println("Child class");
    }
}
public class InEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println(c.x);//accessing the parent class data members
		System.out.println(c.y);//accessing the child class data members
		
		c.display();//accessing the parent class methods 
		
		c.show();//accessing the child class methods 
	}

}
