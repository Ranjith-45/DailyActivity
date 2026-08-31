package com.encapsulation;
import java.util.*;
public class teatBank {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		BankAccount bk=new BankAccount();
		System.out.println("Enter the Account Number");
		String accountNo = sc.nextLine();
		bk.setAccountNo(accountNo);
		System.out.println("Enter the Account Number");
		String holderName=sc.nextLine();
		bk.setHolderName(holderName);
		System.out.println("NAME:"+bk.getHolderName());
		System.out.println("Account:"+bk.getAccountNo());
		System.out.println("BALANCE"+bk.getBalance());
		String status="yes";
		while(status.equalsIgnoreCase("yes")) {
		System.out.println("1.Deposit      2.Withdrawl");
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		
		switch(ch) {
			case 1:
				System.out.println("Enter Deposite Amount");
				int dep=sc.nextInt();
				int bal=bk.getBalance();
				bal=bal+dep;
				bk.Deposite(bal);
				
				System.out.println("Balance:"+bk.getBalance());
				break;
			
			case 2:
				System.out.println("Enter withDrawl Amount");
				int with=sc.nextInt();
				int bal1=bk.getBalance();
				if(bal1>with) {
					bal1=bal1-with;
					bk.Withdrawal(bal1);
					System.out.println("Balance:"+bk.getBalance());
				}else {
					System.out.println("Insuffecient Balance");
					System.out.println("Balance:"+bk.getBalance());
					
				}
				break;
				default:
					System.out.println("INVALID");
				
			}
		System.out.println("If you want to continue enter YES");
		status=sc.next();
		}
			
	}

}
