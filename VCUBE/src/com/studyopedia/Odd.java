package com.studyopedia;
import java.util.*;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		//number is even or odd
		if(num%2==0) {
			System.out.println(num+ "is Even number");
			
		}
		else {
			System.out.println(num+"is odd number");
		}
		//now check weather the number is negative or positive 
		if(num<0) {
			System.out.println(num +" is negative");
			
		}
		else {
			System.out.println(num + " is positive");
		}
	}

}
