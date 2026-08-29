package com.loanApplication;

import java.util.Scanner;

public class loanImpl implements loan {

    Scanner sc = new Scanner(System.in);

   

    @Override
    public String getName() {

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        return name;
    }

    @Override
    public int getAge() {

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        return age;
    }

    @Override
    public double getSalary() {

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        return salary;
    }

    @Override
    public double getROI() {
    		int cibil=getCibil() ;
        
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
    

    @Override
    public int getCibil() {

        System.out.println("Enter your CIBIL score:");
        int cibil = sc.nextInt();

        return cibil;
    }

    @Override
    public String getPhone() {

        System.out.println("Enter your phone number:");
        String phone = sc.next();

        return phone;
    }

    @Override
    public String getPancard() {

        System.out.println("Enter your PAN card:");
        String pan = sc.next();

        return pan;
    }

    @Override
    public String getAaadharCard() {

        System.out.println("Enter your Aadhaar card:");
        String aadhaar = sc.next();

        return aadhaar;
    }
}