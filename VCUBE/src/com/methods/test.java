package com.methods;

public class test {
	void showPlanDetails() {
		System.out.println("current");
		double planName= 299.0;
		recharge(planName);
	}
	void recharge(double amount) {
		System.out.println(amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		t.showPlanDetails();
	}
	

}
