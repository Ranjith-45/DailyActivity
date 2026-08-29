package com.loanApplication;

import java.util.Scanner;

public class HomeLoan extends loanImpl {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

	        System.out.println("WELCOME to Ranjith's Bank");

	        personalLoan obj = new personalLoan();

	        String name = obj.getName();

	        System.out.println("Name: " + name);
	      
	       
	        	System.out.println("Hiii Mr."+name+"How can i help you!!!!!");

	           	String aadhar=obj.getAaadharCard();
	           	
	           
	            if (aadhar.matches("[2-9][0-9]{11}")) {
	                System.out.println("Valid Aadhaar number");
	                String pan=obj.getPancard();
	                if(pan.matches("[A-Z]{4}[0-9]{4}")) {
	                	System.out.println("Your pan card is verified");
	                	String phone=obj.getPhone();
	                	if(phone.matches("[6-9]{1}[0-9]{9}")) {
	                		System.out.println("Your phone number is verified ");
	                		int age = obj.getAge();
	                		if(age>18) {
	                			System.out.println("OK !!!!!!");
	                			double sal=obj.getSalary();
	                			if(sal>20000) {
	                				
	                				double roi=obj.getROI();
	                				System.out.println("Congratulations! Your bank loan has been successfully approved with");
	                				System.out.println("RATE OF INTEREST :"+roi);
	                			}
	                			else {
	                				System.out.println("Sorry sir Your bank loan application has been rejected.");
	                			}
	                		}
	                		else {
	                			System.err.println("Our bank does not provide loans to underage applicants");
	                			System.out.println("After 18 meet my bank");
	                		}
	                		
	                }else {
	                	System.err.println("Invaild Pan Card Number");
	                }
	               
	            } else {
	                System.err.println("Invalid Aadhaar number");
	               
	            }
	        
	    }
	}
	  @Override
	    public double getROI() {
	    		int cibil=getCibil() ;
	        
	        double roi = 6.5;
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
