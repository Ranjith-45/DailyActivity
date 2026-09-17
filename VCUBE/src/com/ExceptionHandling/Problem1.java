package com.ExceptionHandling;

import java.util.*;

//1.Create a Java program that performs the following operations:
//Ask the user to enter two numbers as Strings.
//Convert the Strings into integers using Integer.parseInt().
//Divide the first number by the second number.
//Handle ArithmeticException if the second number is 0.

public class Problem1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			String n1=sc.nextLine();                  //exception at here so after this remaining will not execute....
			System.out.println("Enter another number");
			String n2=sc.nextLine();
			int a=Integer.parseInt(n1);
			int b=Integer.parseInt(n2);  // 1st part
			System.out.println(a/b);   //2nd part     2nd part always depend on 1st part.....
		}catch(NumberFormatException ne) {
			System.err.println("In catch of NE");
			System.out.println(ne.toString());
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		System.out.println("main method ended");
		
	}

}
