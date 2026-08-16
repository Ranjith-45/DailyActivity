package com.methods;
import java.util.*;
//with return type and with arguments......
public class withreturn {
		 double calculateInteres(double p,double r,int t) {
			
					double intr=(p*r*t)/100;
					return intr;
		}
		 double rectangleArea(double l,double b) {
			 return l*b;
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principal Amount:");
		double p=sc.nextDouble();
		System.out.println("Enter the Rate of intrest:");
		double r=sc.nextDouble();
		System.out.println("Enter the Time:");
		int t=sc.nextInt();
		withreturn t1=new withreturn();
		double simInt=t1.calculateInteres(p,r,t);
		System.out.println("total Interest :"+simInt);
		
		System.out.println("**********************************************");
		System.out.println("**********Rectangle Area****************");
		System.out.println("Enter the length:");
		double l=sc.nextDouble();
		System.out.println("Enter the breath:");
		double b=sc.nextDouble();
		double recArea= t1.rectangleArea( l,b);
		System.out.println("Area of rectangle:"+recArea);
		System.out.println("**********************************************");
		System.out.println("**********Square Area****************");
		System.out.println("Enter the Side:");
		double s=sc.nextDouble();
		
	}
	

}
