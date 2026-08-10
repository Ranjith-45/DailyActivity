package com.operators;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************&&****************");
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		System.out.println(false&&true);//false-->2nd condition dead code
		System.out.println(false&&false);//false-->2nd condition dead code
		int a=10;
		int b=20;
		int c=5;
		System.out.println(a<b && b>c );//true
		System.out.println(a<b && b<c );//false
		System.out.println(a>b&& b>c);//false-->b>c its cannot check because its dead code
		System.out.println(a>b&& b<c);//false-->b>c its cannot check because its dead code
		System.out.println("*************||****************");
		System.out.println(true||true);//true-->2nd condition dead code
		System.out.println(true||false);//true-->2nd condition dead code
		System.out.println(false||true);//true
		System.out.println(false||false);//false
		
		System.out.println(a<b || b>c );//true--> 2nd its cannot check because its dead code
		System.out.println(a<b || b<c );//true-->2nd its cannot check because its dead code
		System.out.println(a>b || b>c);//true
		System.out.println(a>b ||b<c);//false
		System.out.println("*************!****************");
		System.out.println(!true);//false
		System.out.println(!(a<b));//false
		
	}

}
