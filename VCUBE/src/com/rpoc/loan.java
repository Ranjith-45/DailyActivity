package com.rpoc;

public interface loan {

	public abstract boolean isAadharVaild();

	public abstract boolean isPhoneVaild();

	public abstract boolean isPANVaild();

	public abstract double getSalary();

	public abstract String getUserName();

	public abstract int getAge();

	public abstract int getCibilScore();

	double getLoneROI(); //by default is contain public, abstract 

}