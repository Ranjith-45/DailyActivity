package com.studyopedia;
import java.util.*;

public class AgeConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		
		if(age>=18) {
			
			System.out.println("You are eligible for Voting and driving");
		}
		else {
			System.out.println("You are not eligible for voting and driving");
		}
		//Here only execute one statement after ,condition is true false
		if(age>=18) 
			System.out.println("You are eligible for Voting and driving");
			System.out.println(" Hello after one Ststement it  will not considered the another statement , it only consider after condition one statement..");//it cannot be considered
		//if i write the else condition then i get else token error

			if(age>=18) 
				
				System.out.println("You are eligible for Voting and driving");
			
			else 
				System.out.println("You are not eligible for voting and driving");
				System.out.println("This statement will not be considered in else situtation");
			
	}

}
