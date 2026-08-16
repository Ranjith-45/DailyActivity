package com.conditional;
import java.util.*;
public class switch1 {
//	Day of Week
//	Take a number 1–7 and print the corresponding day.
//
//	1 → Monday
//	2 → Tuesday
//	...
//	7 → Sunday

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number:");
		int ran= sc.nextInt();
		switch(ran) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thusday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invaild number!!!!!!! ");
		}
		
	}

}
