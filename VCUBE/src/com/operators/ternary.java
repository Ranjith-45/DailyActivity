package com.operators;

public class ternary {

	public static void main(String[] args) {
		
// Even or odd
		int e=5;
		String eo=(e%2==0)?"Even":"Odd";
		System.out.println("The Given number:"+eo);
		
//		Assign a grade based on marks using nested ternary operators.
//		Marks >= 90 → A
//		Marks >= 75 → B
//		Marks >= 60 → C
//		Marks >= 40 → D
//		Otherwise → Fail 
		int marks =80;
		String grade=(marks>=90)?"A":(marks>=75)?"B":(marks>=60)?"C":(marks>=40)?"D":"fail";
		System.out.println("Grade:"+grade);
		

//		1.Check whether a number is positive or negative using the ternary operator.
		int m=10;
		String pn= (m>0)?"positive":"negative";
		System.out.println("Given number is :"+pn);
    // Minimum number of given 3 numbers
		int a=100;
		int b=200;
		int c=150;
		int min=(a<b)?
					(a<c?a:c):
					(b<c?b:c);
		int min2=(a<b)?(b<c?b:c):
				(a>c?a:c);
				
		System.out.println(min2);
		int avg=(a+b+c)/3;	
		System.out.println( "Avg:"+avg);
	}

}
