package com.methods.constructors;

class A {
    int id;
    String name;

    A() {
    }

    A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
}

class Student2 extends A {

    Student2(int id, String name) {
        super(id, name);    // Calls A(int, String)
    }

    public static void main(String[] args) {
        Student2 s = new Student2(21, "Ranjith");
        s.show();
    }
}