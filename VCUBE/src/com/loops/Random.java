package com.loops;
import java.util.*;
public class Random {
//.Write a Java program that generates a random number between 1 and 100. The user gets 3 chances to guess the number.

//If the user guesses correctly, display "You Won!" and stop the game.
//If all 3 attempts are wrong, display "You Lost!" and show the random number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = (int) (Math.random() * 100);
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Guess the Number in between 0 to 100");
		for(int i=5;i>=1;i--) {
			System.out.println("Guess the number:");
			int n=sc.nextInt();
			if(n==number) {
				System.out.println("Yupp!! brooo  You Win broo damn ...........");
				break;
			}
			else if(number>n) {
				System.out.println("The number is GREATER then your number bro ..");
			}
			else {
				System.out.println("The number is LESS then your number bro..");
			}
			if(i==1) {
			
				System.out.println("Oops Sorry brother you loss the game better luck next time " );
				System.out.println("the number is : "+number);
			}else {
				System.out.println("don't  worry you have more "+ (i -1)+ " chances brother ");
				System.out.println("_______________________________________________________");
			}
		}
		 

	}

}
