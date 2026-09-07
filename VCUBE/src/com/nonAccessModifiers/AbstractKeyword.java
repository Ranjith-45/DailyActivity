package com.nonAccessModifiers;
//Abstract class
abstract class Animal {

 // Abstract method
 abstract void sound();

 // Normal method
 void eat() {
     System.out.println("Animal is eating");
 }

 // Normal method
 void sleep() {
     System.out.println("Animal is sleeping");
 }
}

//Child class
class Dog extends Animal {

 // Implementing abstract method
 @Override
 void sound() {
     System.out.println("Dog is barking");
 }
}

//Another child class
class Cat extends Animal {

 // Implementing abstract method
 @Override
 void sound() {
     System.out.println("Cat is meowing");
 }
}

//Main class
public class AbstractKeyword {



 public static void main(String[] args) {
	 //Animal an= new Animal();  -->It gives compile time error....
	 //an Abstract class cannot be instantiated directly.....

     // Creating Dog object
     Dog d = new Dog();

     d.sound();
     d.eat();
     d.sleep();

     System.out.println("----------------");

     // Creating Cat object
     Cat c = new Cat();

     c.sound();
     c.eat();
     c.sleep();
 }
}


