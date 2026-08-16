package com.methods.constructors;
import java.util.*;

public class Hospital {
	String PatientName;
	int age;
	double CPR;
	int NDA;
	

	public Hospital(String patientName, int age, double cPR, int nDA) {
		
		PatientName = patientName;
		this.age = age;
		CPR = cPR;
		NDA = nDA;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name :");
		String patientName=sc.next();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter Room charge per day:");
		double cPR=sc.nextDouble();
		System.out.println("Enter no of days admitted");
		int nDA=sc.nextInt();
		Hospital p1= new Hospital(patientName, age,  cPR,  nDA);
		p1.show();
	}
	void show() {
		System.out.println("Patient name:"+PatientName);
		System.out.println("Age:"+age);
		System.out.println("Room charge per day:"+CPR);
		System.out.println("Days Admitted:"+NDA);
		double t= CPR*NDA;
		System.out.println("total charge :"+t);
	}
}
