package com.methods.constructors;

public class CopyConstructor {

    String Name;
    String Director;
    String Hero;
    String Producer;
    double Budget;

    // Constructor
    CopyConstructor(String Name) {
        this.Name = Name;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor c, String Director) {
        this.Name = c.Name;      // Copy data from existing object
        this.Director = Director;
        
        
    }
    CopyConstructor(CopyConstructor c, String Hero,String Producer,double Budget) {
        this.Name = c.Name;      // Copy data from existing object
        this.Director = c.Director;
        this.Hero=Hero;
        this.Producer=Producer;
        this.Budget=Budget;
    }

    void display() {
    	System.out.println("-----------------------");
        System.out.println("Movie Name : " + Name);
        System.out.println("Director   : " + Director);
        System.out.println("Hero : " + Hero);
        System.out.println("Producer : " + Producer);
        System.out.println("Budget : " + Budget);
        
    }

    public static void main(String[] args) {

        CopyConstructor c = new CopyConstructor("Varanasi");
        CopyConstructor c1 = new CopyConstructor(c, "Rajamouli");
        CopyConstructor c2= new CopyConstructor(c1,"Babu","DVV",3000000000.00);

        c.display();
        
        c1.display();
        c2.display();
    }
}