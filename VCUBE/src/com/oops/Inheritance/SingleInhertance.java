package com.oops.Inheritance;

//ava-
//1.Create a Java program using inheritance with a parent class Vehicle and a child class Car.
//Requirements:
//Vehicle should have a variable speed = 50 and a method display().
//Car should have its own variable speed = 100 and override the display() method.
//Create a Car object using a parent-class reference.
//Access the speed variable and call the display() method.
//Predict the output before running the program.
//Explain why the variable and method behave differently. 

//Senerio-3

////Why is this allowed?
//
//Because Car is a Vehicle.
//
//Since you wrote:
//
//class Car extends Vehicle
//
//Java understands:
//
//Car → Vehicle
//
//Therefore:
//
//Vehicle ca = new Car();
//
//is valid.
//
//But the reverse is not automatically valid:
//
//Car ca = new Vehicle(); // ❌ Error
class Vehicle{
	int display() {
		int speed=50;
		return speed;
		
	}
}
class Car extends Vehicle{
	@Override
	int display() {
		int speed=100;
		return speed;
	}
	
}



public class SingleInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle ca =new  Car();//Up-Casting
		//Car ca = new Vehicle(); // ❌ Error
		 //here 
		 //The object is actually a Car, but the reference variable is of type Vehicle.
		 
		System.out.println("Vehicle Speed"+ca.display());

	}

}
