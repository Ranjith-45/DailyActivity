package com.studyopedia;

public class Objcount {
	static int count =0;
	{
		count=count+1;
	}
	
	
	public static void main(String[] args) {
		
		Objcount obj=new Objcount();
		Objcount obj1=new Objcount();
		Objcount obj2=new Objcount();
		Objcount obj3=new Objcount();
		Objcount obj4=new Objcount();
		System.out.println("Count: "+ count);
	}

}
