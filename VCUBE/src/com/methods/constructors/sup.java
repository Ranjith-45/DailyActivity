package com.methods.constructors;

class Vechile extends Object {
	String model;
	String brand;
	double price;
	
	public Vechile() {
		
		System.out.println("No argument Constructor called in Vechile!");
	}
	
	public Vechile(String model,String brand, double price) {
		System.out.println("Parameter constructor called in Vechile !!");
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	void VechileIfo(){
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);
		System.out.println("---------------------------------------");
	}
	
}
public class Car extends Vechile {
	
	public Car() {
		// default there will be "super()" ;
		
		System.out.println("No argument Constructor called in car!");
	}

	public Car(String model,String brand, double price) {
		super( model,brand, price);
	}
	public static void main(String[] args) {
		System.out.println(" -- main method started -- ");
		Car c1 = new Car(); 
		c1.VechileIfo();
		
		Car c2 = new Car("Ra","GA",856000.0);
		c2.VechileIfo();
		System.out.println(" -- main method ended -- ");
	}

}