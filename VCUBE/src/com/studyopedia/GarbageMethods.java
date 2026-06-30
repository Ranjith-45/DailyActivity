package com.studyopedia;
class Employe{
	Employe e1;
	protected void finalize() {
		System.out.println("THE OBJECT UNREACHED SO GARBAGE COLLLECTER IS COLLECTED.....");
		
	}
	
}

public class GarbageMethods {
	
	protected void finalize() {
		System.out.println("THE OBJECT UNREACHED SO GARBAGE COLLLECTER IS COLLECTED.....");
		
	}
	void hello() {
		System.out.println("hello...");
	}
	void display() {
		GarbageMethods b =new GarbageMethods();
		System.out.println("Object created inside the method but here object will be Collect by the garabge collector ");
		System.out.println("b:"+b);// this as not reachable so it eligble for garbage collection
	}
	public static void main(String[] args) {
		System.out.println("Main method Started");
		GarbageMethods ktm=new GarbageMethods();
		System.out.println(ktm);
		GarbageMethods bmw=new GarbageMethods();
		System.out.println(bmw);
		GarbageMethods tvs=new GarbageMethods();
		System.out.println(tvs);
		
		//method 1 to garbage to collect the garbage collection 
		//NULLIFIYING
		//______________
		ktm=null;
		System.out.println(ktm);
		
		
		//method 2 RE-Assigning...
		//______________________
		GarbageMethods hero=new GarbageMethods();
		hero=bmw;
		System.out.println(bmw);
		System.out.println(hero);// in place of bmw replace with hero 
		//so address of the bmw stored in place of hero....
		
		
		
		//Method 3 Anonymus data collection...
		//_________________________________
		new GarbageMethods().hello();
		
		
		
		
		
		//method 4 Object created  inside the Method........
		//_________________________________________
		GarbageMethods gm= new GarbageMethods();
		gm.display();
		System.out.println("gm:"+ gm);
		
		
		
		
		// Method 5 Island of isolation.....
		
		Employe E1= new Employe();
		Employe E2= new Employe();
		E1.e1=E2;
		E2.e1=E1;
		E1 = null;
	    E2 = null;
	    
	    System.out.println(E1);
	    System.out.println(E2);
	  
		
		System.gc();
	}
}
