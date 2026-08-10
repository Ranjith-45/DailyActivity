package com.operators;

public class Bitwise {
	// in bitwise its also consider the numbers 
	//there is no dead code in Bitwise opertator

	public static void main(String[] args) {
		System.out.println("*************&****************");
		
		System.out.println(true&true);//true
		System.out.println(true&false);//false
		System.out.println(false&true);//false
		System.out.println(false&false);//false
		int a=10;
		int b=20;
		int c=5;
		System.out.println(a<b & b>c );//true
		System.out.println(a<b & b<c );//false
		System.out.println(a>b& b>c);//false
		System.out.println(a>b& b<c);//false
		System.out.println(1 & 1);//1
		System.out.println(0 & 1);//0
		System.out.println(1 & 0);//0
		System.out.println(0 & 0);//0
		System.out.println("*************|****************");
		System.out.println(true|true);//true
		System.out.println(true|false);//true
		System.out.println(false|true);//true
		System.out.println(false|false);//false
		
		System.out.println(a<b | b>c );//true 
		System.out.println(a<b | b<c );//true
		System.out.println(a>b | b>c);//true
		System.out.println(a>b |b<c);//false
		System.out.println(1 | 1);//1
		System.out.println(0 | 1);//1
		System.out.println(1 | 0);//1
		System.out.println(0 | 0);//0
		System.out.println("************* ^ ****************");
		System.out.println(true^true);//false
		System.out.println(true^false);//true
		System.out.println(false^true);//true
		System.out.println(false^false);//false
		
		System.out.println(a<b ^ b>c );//false 
		System.out.println(a<b ^ b<c );//true
		System.out.println(a>b ^ b>c);//true
		System.out.println(a>b ^ b<c);//false
		

	}

}
