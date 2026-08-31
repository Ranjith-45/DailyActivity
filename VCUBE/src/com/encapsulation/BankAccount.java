package com.encapsulation;

public class BankAccount {
//	Java-
//	1.Create a BankAccount class using Encapsulation.
//	Declare accountNumber, holderName, and balance as private.
//	Initialize the balance with ₹5000 using a constructor or directly.
//	Create a deposit(double amount) method to add money to the account.
//	Create a withdraw(double amount) method that allows withdrawal only if the balance is sufficient.
//	In main(), create an object, perform deposit and withdrawal operations, and display the final balance.

	private String accountNumber;
	private String holderName;
	private int balance=5000;
	public void setAccountNo(String accountNumber) { 
		this.accountNumber=accountNumber;
	}
	public void setHolderName(String holderName) {
		this.holderName=holderName;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public String getAccountNo() {
		return accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public int getBalance() {
		return balance;
	}
	public void Deposite(int dep) {
		
		this.balance=dep;
		
	}
	public void Withdrawal(int with) {
		
		this.balance=with;
	}

}
