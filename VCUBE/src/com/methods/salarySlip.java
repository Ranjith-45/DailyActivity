package com.methods;
import java.util.*;
public class salarySlip {
	void salarySlip(String name,double sal) {
		System.out.println("Employee name:"+ name );
		System.out.println("Basic Salary:"+ sal);
		double  HRA=sal*20/100;
		double DA= sal*10/100;
		System.out.println("HRA:"+ HRA);
		System.out.println("DA:"+ DA);
		double gross=sal+HRA+DA;
		System.out.println("Gross Salary:"+ gross);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Salary Info of a Employee");
		String name ="Ranjith";
		double sal= 50000;
		salarySlip s=new salarySlip();
		s.salarySlip( name, sal);
		

	}

}
