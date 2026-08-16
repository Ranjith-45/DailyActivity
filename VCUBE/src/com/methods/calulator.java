package com.methods;
import java.util.*;
public class calulator {
	void add(int a,int b) {
		System.out.println("ADD:"+ (a+b));
	}
	void sub(int a,int b) {
		System.out.println("SUB:"+ (a-b));
	}
	void Mult(int a,int b) {
		System.out.println("MUL:"+ a*b);
	}
	void Div(int a,int b) {
		System.out.println("Div:"+ a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number A:");
		int a=sc.nextInt();
		System.out.println("Enter a number B:");
		int b=sc.nextInt();
		calulator cal=new calulator();
		cal.add(a, b);
		cal.sub(a, b);
		cal.Mult(a, b);
		cal.Div(a, b);
		
	}

}
