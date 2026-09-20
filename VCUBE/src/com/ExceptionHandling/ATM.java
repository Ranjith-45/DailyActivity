package com.ExceptionHandling;

import java.util.Scanner;

public class ATM {
//	1.Create an ATM program with separate try-catch blocks for:
//		Withdraw amount → handle ArithmeticException
//		Convert entered amount from String to double → handle NumberFormatException
//		Access transaction history using an array → handle ArrayIndexOutOfBoundsException
//		Display account details → handle possible NullPointerException
//		Requirement: If one operation fails, the remaining operations should continue.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int money=100000;
		int[] his=new int[3];
		try {
			for(int i=0;i<4;i++) {
				System.out.println("Enter the withdrawl amount");
				String wd=sc.next();
				int a=Integer.parseInt(wd);
				his[i]=a;
			}
		}catch(NumberFormatException ne){
			System.err.println(ne.getMessage());
		}catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
		System.out.println("Main method Ended");
	}

}
