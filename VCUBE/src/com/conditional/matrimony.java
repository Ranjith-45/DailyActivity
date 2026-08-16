package com.conditional;
import java.util.*;
public class matrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you name:");
		String name= sc.nextLine();
		System.out.println("nice to meet you mr."+ name);
		System.out.println("Enter your salary:");
		int sal= sc.nextInt();
		System.out.println("Enter your assects:");
		int ass= sc.nextInt();
		if(ass>=100000000 ||sal>25000000) {
			System.out.println("good to go!");
			System.out.println("Enter your age");
			int age= sc.nextInt();
			if(age>25&&age<30) {
				System.out.println("nice match");
				System.out.println("Enter your heigth ");
				double hei= sc.nextDouble();
				System.out.println("Enter your weight ");
				int wei= sc.nextInt();
				if(wei>60&&hei>160)
				{
					System.out.println("Nice match ");
					System.out.println("do you have any siblings ");
					boolean b=sc.nextBoolean();
					if(!b) {
						System.out.println("OK!!!! ");
						System.out.println("Do you have smoking habit yes or no ");
						String habit=sc.next();
						if(habit=="yes") {
							System.out.println("go to hospital");
						}
						else {
							System.out.println("Ok for marriage");
						}
						
					}
					else {
						System.out.println("Goo to wines");
					}
				}
				else {
					System.out.println("Go to gym ");
				}
			}
			else {
				System.out.println("Your age is mismatch to our profile");
			}
			
		
		}
		else {
			System.out.println(" you can leave for the day!");
		}
		
		
	}

}
