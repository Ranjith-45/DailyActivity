package com.methods.constructors;

class C {

    C() {
        System.out.println("Parent Constructor");
    }
}

class B extends A {

    B() {
        super();   // Calls A()
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}