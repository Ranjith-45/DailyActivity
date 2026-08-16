package com.methods.constructors;

public class Laptop {
	
		int id;
		String companyName;
		long price;
		
		
		public Laptop() {
			id = 101;
			companyName = "HP";
			price = 20000;
		}


		public Laptop(int id, String companyName) {
			this.id = id;
			this.companyName = companyName;
			
		}
		public Laptop(int id, String companyName, long price) {
			this.id = id;
			this.companyName = companyName;
			this.price = price;
		}

		void show() {
			System.out.println("Laptop ID :"+id);
			System.out.println("Laptop CompanyName :"+companyName);
			System.out.println("Laptop Price :"+price);
			System.out.println("***********");
		}

		public static void main(String[] args) {
			Laptop l1 = new Laptop();
			l1.show();
			
			Laptop l2 = new Laptop(102,"DELL");
			l2.show();
			
			Laptop l3 = new Laptop(1049,"Apple",185000);
			l3.show();
		}

	}

