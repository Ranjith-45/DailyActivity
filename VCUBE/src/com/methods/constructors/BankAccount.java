package com.methods.constructors;
import java.util.*;

public class BankAccount {
	String AccountHolder;
	long AccountNumber;
	double balance;
	

	public BankAccount() {
		
		this("Unknown");
		System.out.println("no arg constructor called");
	}
	


	public BankAccount(String accountHolder) {
	
		this(accountHolder,0);
		System.out.println("1 arg constructor called");
	}

	

	/**
	 * @param accountHolder
	 * @param accountNumber
	 */
	public BankAccount(String accountHolder, long accountNumber) {
	
		this(accountHolder,accountNumber,0.0);
		System.out.println("2 arg constructor called");
		
	}
	


	/**
	 * @param accountHolder
	 * @param accountNumber
	 * @param balance
	 */
	public BankAccount(String accountHolder, long accountNumber, double balance) {
		this.AccountHolder=accountHolder;
		this.AccountNumber=accountNumber;
		this.balance=balance;
		System.out.println("3 arg constructor called");
	}
	void show() {
		System.out.println(AccountHolder);
		System.out.println(AccountNumber);
		System.out.println(balance);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account holder name:");
		String accountHolder=sc.next();
		System.out.println("Enter the Account Number:");
		long accountNumber=sc.nextLong();
		System.out.println("Enter the balance:");
		double balance=sc.nextDouble();
		BankAccount b1=new BankAccount();
		b1.show();
		BankAccount b2=new BankAccount(accountHolder);
		b2.show();
		BankAccount b3=new BankAccount(accountHolder,accountNumber);
		b3.show();
		BankAccount b=new BankAccount(accountHolder,accountNumber,balance);
		b.show();
	}
}
