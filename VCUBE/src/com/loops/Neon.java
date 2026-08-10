package com.loops;
import java.util.*;
public class Neon {
//	1.Write a Java program to check whether a given number is a Neon Number.
//	A Neon Number is a number where the sum of the digits of its square is equal to the original number.
//	Sample Input 1
//	Enter a number: 9
//	Sample Output 1
//	9 is a Neon Number.
//	Explanation:
//	9² = 81
//	8 + 1 = 9
//	Sample Input 2
//	Enter a number: 10
//	Sample Output 2
//	10 is not a Neon Number.
//	Explanation:
//	10² = 100
//	1 + 0 + 0 = 1 ≠ 10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=9;
		
		
		long p=(long) Math.pow(n, 2);
		long dig = p;
		long sum=0;
		
		while(p>0) {
		 dig = dig%10;
		 sum=  (sum+dig);
		 p=p/10;
		 dig=p;
		 
		}
		if(sum==n) {
			System.out.println("neon  number");
		}
		else {
			System.out.println(" Not neon  number");
		}

	}

}
