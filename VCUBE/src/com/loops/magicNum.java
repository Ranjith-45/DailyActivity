package com.loops;
import java.util.*;
public class magicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		int sum=0;
		int r=0;
		int sum1=n;
		while(sum1>9) {
			sum=0;
			while (n>0) {
				r=n%10;
				n=n/10;
				sum=sum+r;
			}
			sum1=sum;
			n=sum;
		}
		System.out.println("Sum:"+sum1);
		if(sum1==1) {
			System.out.println("the given numberis a magic number ");
		}
		else {
			System.out.println("the given number is not a magic number");
		}
	}

}
