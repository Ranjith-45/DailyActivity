package com.logics;

public class swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("******************************");
		System.out.println("Before swaping A :"+a);
		System.out.println("Before swaping B :"+b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After swaping A :"+a);
		System.out.println("After swaping B :"+b);
		int x=10;
		int y=20;
		System.out.println("******************************");
		System.out.println("Before swaping X :"+x);
		System.out.println("Before swaping Y :"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swaping X :"+x);
		System.out.println("After swaping Y :"+y);
		System.out.println("******************************");
		int x1=10;
		int y1=20;
		System.out.println("Before swaping x1 :"+x1);
		System.out.println("Before swaping Y1 :"+y1);
		x1=x1^y1;
		y1=x1^y1;
		x1=x1^y1;
		System.out.println("After swaping X1 :"+x1);
		System.out.println("After swaping Y1 :"+y1);

	}

}
