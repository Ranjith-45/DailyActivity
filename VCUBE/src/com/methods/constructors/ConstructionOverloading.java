package com.methods.constructors;

class Student {
	//Constructor overloading means having multiple constructors
	//in the same class with different parameter lists.
    int id;
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(int id) {
        this.id = id;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(101);
        s2.show();

        Student s3 = new Student(102, "Ranjith");
        s3.show();

        Student s4 = new Student(103, "Rahul", 22);
        s4.show();
    }
}