package com.ExceptionHandling;


import java.util.Scanner;

public class TestAgeExDemo {

	public static void main(String[] args) throws AkashException {
		System.out.println("main method staretd ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Congrtulations !! you are eligible for voting or Driving ");
		}else {
			throw new AkashException("Babu niku inka time undi ra !!");
		}

		System.out.println("main method ended ");

	}

}
