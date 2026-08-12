package com.methods.constructors;

public class bank {
	static String bank="RBI";
	String name;
	long ifsc;
	static long accno=100125601l;
	
	public bank(String name, long ifsc) {
		accno++;
		this.name = name;
		this.ifsc = ifsc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 bank b1=new bank("Ranjith",503125);
		 b1.bankinfo();
		 bank b2=new bank("Rakesh",503125);
		 b2.bankinfo();
		 bank b3=new bank("Venky",503156);
		 b3.bankinfo();
	}
	void bankinfo() {
		System.out.println("****************************************");
		System.out.println("Bank Name :"+bank);
		System.out.println("Accont number:"+accno);
		System.out.println("User name:"+name);
		System.out.println("IFSC Number:"+ifsc);
	}
	

}
