package com.methods.constructors;

public class SuperAnimal {
	String name="Browny";
	String colour="Brown";
	int age=12;
//	SuperAnimal(String name,String colour,int age){
//		this.name=name;
//		this.colour=colour;
//		this.age=age;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	void show4() {
		System.out.println("Name:"+name);
		System.out.println("Colour:"+colour);
		System.out.println("Age:"+age);
	}

}
class Dog extends SuperAnimal{ 
	String name="tommy";
	String colour="black";
	int age=11;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.show();//this or child
		d.show1();//this or child
		
		d.show2();//super or parent
		d.show4();//super or parent
	}
	void show() {
		System.out.println("Name:"+name);
		System.out.println("Colour:"+colour);
		System.out.println("Age:"+age);
	}
	void show1() {
		System.out.println("Name:"+this.name);
		System.out.println("Colour:"+this.colour);
		System.out.println("Age:"+this.age);
	}
	void show2() {
		System.out.println("Name:"+super.name);
		System.out.println("Colour:"+super.colour);
		System.out.println("Age:"+super.age);
	}
}
