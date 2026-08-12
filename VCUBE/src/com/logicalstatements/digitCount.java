package com.logicalstatements;

public class digitCount {
//	.Write a Java program to check whether a given number is a two-digit, three-digit, or more than three digits using if-else if statements.
//	1.The program should:
//	Accept an integer as input.
//	Display:
//	2.Two-Digit Number if the number has 2 digits.
//	3.Three-Digit Number if the number has 3 digits.
//	4.More Than Three Digits if the number has more than 3 digits.
//	5.Less Than Two Digits if the number has only 1 digit.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=4980;
		if(n>0 && n<10) {
			System.out.println("1 Digit ");
		}
		else if(n>=10 && n<=99) {
			System.out.println("2 Digit ");
		}
		else {
			System.out.println("3 Digit ");
		}
		
		int count=0;
		while(n>0) {
			count=count+1;
			n=n/10;
		}
		System.out.println(count +" digit");
	}

}
