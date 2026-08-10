package com.operators;

public class unary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(a++);//10 -->11
		System.out.println(++a);//12
		System.out.println(b++);//20-->21
		System.out.println(++b);//22
		System.out.println(a--);//12-->11
		System.out.println(a--);//11-->10
		System.out.println(--b);//21
		System.out.println(--a);//9
		System.out.println(--b);//20
		System.out.println(a++);//9-->10
		System.out.println(++a);//11
		System.out.println(--a);//10
		System.out.println(++b);//21
		System.out.println(a++);//10-->11
		System.out.println(++a);//12
	
		System.out.println(--b);//20
		System.out.println(a++ + b++ - --a - --b);//0
//							12 +20 -   12 -20= 0
//							|   |        
//							13  21      
		
	}

}
