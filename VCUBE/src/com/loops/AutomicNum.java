package com.loops;
import java.util.*;

public class AutomicNum {
//	1.Check if a Number is an Automorphic Number.
//	Definition:
//	A number is called an Automorphic Number if the square of the number ends with the same number.
//	Input:25 =>25 × 25 = 625
//	                   625 ends with 25
//	Output : Automorphic Number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int r=0;
		int n=0;
		int po=1;
		boolean status=false;
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int pow=(num*num);
		System.out.println(pow);
		while(pow>0) {
			r=pow%10;
			pow=pow/10;
			n=r*po+n;
			po=po*10;
			if(n==num) {
				status=true;
				break;
			}
			
		}
		System.out.println(n);
		if(status) {
			System.out.println("the given number is Automarphic number");
		}else {
			System.out.println("the given number is Not Automarphic number");
		}
	}

}
