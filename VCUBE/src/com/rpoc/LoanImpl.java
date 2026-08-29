package com.rpoc;

import java.util.Scanner;

public class LoanImpl implements loan {
	static Scanner s = new Scanner(System.in);

	@Override
	public boolean isAadharVaild() {
		System.out.println("Enter the Aadhar No : ");
		String aadhar = s.next();
		return aadhar.matches("[2-9]{1}[0-9]{11}");
	}

	@Override
	public boolean isPhoneVaild() {
		System.out.println("Enter the Phone Number : ");
		String phone = s.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	@Override
	public boolean isPANVaild() {
		System.out.println("Enter the PAN No : ");
		String pan = s.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	@Override
	public double getSalary() {
		System.out.println("Enter the Salary : ");
		return s.nextDouble();
	}

	@Override
	public String getUserName() {
		System.out.println("Enter the UserName : ");
		return s.nextLine();
	}

	@Override
	public int getAge() {
		System.out.println("Enter the Age : ");
		return s.nextInt();
	}

	@Override
	public int getCibilScore() {
		System.out.println("Enter the Cibil Score : ");
		return s.nextInt();
	}

	@Override
	public double getLoneROI() {
		int cibil = getCibilScore();
		double roi = 8.5;
		if (cibil >= 300 && cibil < 550) {
			System.out.println(" Poor credit-- loans are rarely approved");
			return roi + 1;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println("Fair credit-- some lenders may hesitate.");
			return roi;
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("Very good credit--high probability of loan approval.");
			return roi - 2;
		} else if (cibil >= 750 && cibil < 900) {
			System.out.println("Excellent creditworthiness -- best chances for loans and pre-approved offers.");
			return roi - 4;
		} else {
			System.out.println("Invaild Cibil Score ! ");
			return roi + 10;
		}
	}
}