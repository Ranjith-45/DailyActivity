package com.Objectclass;



	class Student implements Cloneable{

		int sid;
		String sname;
		Address address;

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		//super.clone() is the Object class's clone() method.

		public Student(int sid, String sname, Address address) {
			this.sid = sid;
			this.sname = sname;
			this.address = address;
		}

	}

	class Address {

		String city;

		public Address(String city) {
			this.city = city;
		}

	}

	public class shallow {

		public static void main(String[] args) throws CloneNotSupportedException {
			System.out.println("main method started ");

			Address address = new Address("Hyderabad");
			Student s1 = new Student(101, "Srikanth", address);

			System.out.println(s1.sid);
			System.out.println(s1.sname);
			System.out.println(s1.address.city);
			System.out.println("---------------------------------");

			Student s2 = (Student) s1.clone();
			System.out.println(s2.sid);
			System.out.println(s2.sname);
			System.out.println(s2.address.city);
			System.out.println("---------------------------------");
			System.out.println("**************************************");
			
			
			s2.sid=102;
			s2.sname="ranjith";
			
			s2.address.city = "Banglore";
			System.out.println(s1.sid);//101
			System.out.println(s1.sname);//Srikanth
			System.out.println(s1.address.city);//Banglore
			System.out.println("---------------------------------");
			
			
			System.out.println(s2.sid);//102
			System.out.println(s2.sname);//Vinod
			System.out.println(s2.address.city);//Banglore
			System.out.println("---------------------------------");
			
			
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(address);//it is same for both objects
			

			System.out.println("main method ended  ");
		}

	}