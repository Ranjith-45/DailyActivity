package com.operators;

public class Arthamatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Sum of two operators:"+a+b);//1020
		// it follows bodmas ......
		System.out.println("Sum of two operators:"+(a+b));//30
		//String cancatination it allows only + so if we give anything that will consider as a string 
		//System.out.println("Diffrence of two numbers:"+a-b);
		// CE The operator - is undefined for the argument type(s) String, int
		System.out.println("Difference of two numbers:"+(a-b));//-10...
		
		
		//Multiplication
		System.out.println("Multipliation  of two numbers:"+a*b);//200
		
		//Division of two numbers
		System.out.println("division of two numbers:"+a/b);//0
		//20| 10|0
		//	   0
	//----------10
		
		System.out.println("remender of two numbers:"+a%b);//10
		
	}

}
