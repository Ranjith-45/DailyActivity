package com.loops;
import java.util.*;
public class SecondNum {
	//1. Find the Second Largest Digit in a Number.
//	Definition:
//	Given a number, find the second largest distinct digit present in it.
//	Input : 987654
//	Output : 8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int o=sc.nextInt();
		int n=o;
		int max=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			if(r>max) {
				max=r;
			}
		}
		int smax=0;
		while(o>0) {
			r=o%10;
			o=o/10;
			if(max>r &&smax<r) {
				smax=r;
			}
		}
		System.out.println("Second max "+smax);

	}

}
