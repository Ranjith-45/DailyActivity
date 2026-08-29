package com.rpoc;

public class personalLoan extends LoanImpl {

	

		void PersnalLoanDocInfo() {
			System.out.println("Person Loan document have been receive Successfully !");
		} 
		
		

		public static void main(String[] args) {
			System.out.println("Welcome to V-Cube Personal Loan Banking : ");

			personalLoan pl = new personalLoan();
			String name = pl.getUserName();
			System.out.println("Hello !,"+name+" How can, I help you ?");
			
			if (pl.isAadharVaild() && pl.isPhoneVaild() && pl.isPANVaild()) {
				System.out.println("Given Information are Vaild, We can Continue for their information ! ");
				double sal = pl.getSalary();
				int age = pl.getAge();
				int cibil = pl.getCibilScore();
				double roi = pl.getLoneROI();
				if (sal >= 900000.0 && age >= 27 && (cibil >= 300 && cibil <= 900)) {
					System.out.println("Congratulations , Your Eligible for Personal Loan !");
					System.out.println("Your Rate of Interest : "+roi);
					pl.PersnalLoanDocInfo();
				}
			}else {
				System.out.println("Something Invaild in Given Info !");
			}
		}

	}
