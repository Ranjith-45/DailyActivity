package com.Abstraction;

import java.util.*;

public class testDriveStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();
		System.out.println("1.EngineeringStudent  2.Medical Student 3. Management Student");
		System.out.println("Enter Your Choice :");
		int ch = sc.nextInt();
		Student es;
		switch (ch) {
		case 1:

			es = new EngineeringStudent();
			es.calculateGrade(name, marks);
			break;
		case 2:
			es = new MedicalStudent();
			es.calculateGrade(name, marks);
			break;
		case 3:
			es = new ManagementStudent();
			es.calculateGrade(name, marks);
			break;
		default:
			System.out.println("Invalid choice");

		}

	}
}

class EngineeringStudent implements Student {

	@Override
	public void calculateGrade(String name, int marks) {

		// TODO Auto-generated method stub
		System.out.println("Name:" + name);
		if (marks > 35 && marks < 50) {
			System.out.println("Just Pass");
		} else if (marks >= 50 && marks <= 75) {
			System.out.println("A Grade");
		} else if (marks > 75) {
			System.out.println("Nice");
		} else {
			System.out.println("Damn brooo");
		}

	}
}

class MedicalStudent implements Student {

	@Override
	public void calculateGrade(String name, int marks) {
		// TODO Auto-generated method stub
		System.out.println("Name:" + name);
		if (marks > 35 && marks < 50) {
			System.out.println("Just Pass");
		} else if (marks >= 50 && marks <= 75) {
			System.out.println("A Grade");
		} else if (marks > 75) {
			System.out.println("Distinction");
		} else {
			System.out.println("fail");
		}

	}
}

class ManagementStudent implements Student {

	@Override
	public void calculateGrade(String name, int marks) {
		// TODO Auto-generated method stub
		System.out.println("Name:" + name);
		if (marks > 35 && marks < 50) {
			System.out.println("Just Pass");
		} else if (marks >= 50 && marks <= 75) {
			System.out.println("1 Grade");
		} else if (marks > 75) {
			System.out.println("Excellent");
		} else {
			System.out.println("Try again ");
		}

	}
}
