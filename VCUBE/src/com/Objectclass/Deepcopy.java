package com.Objectclass;



	

	class Student1 {
		int sid;
		String sname;
		Address1 address1;

		public Student1(int sid, String sname, Address1 address1) {
			this.sid = sid;
			this.sname = sname;
			this.address1 = address1;
		}
		
		public Student1(Student1 st1) {
			this.sid = st1.sid;
			this.sname = st1.sname;
			this.address1 = new Address1(st1.address1);
		}

	}

	class Address1 {
		String city;
		
		public Address1(Address1 address1) {
			this.city = address1.city;
		}

		public Address1(String city) {
			this.city = city;
		}

	}

	public class Deepcopy {

		public static void main(String[] args) {

			Address1 address1 = new Address1("Vijayawada");
			Student1 st1 = new Student1(101, "Srikanth", address1);
			
			System.out.println(st1.sid);
			System.out.println(st1.sname);
			System.out.println(st1.address1.city);
			System.out.println("-----------------------------");
			Student1 s2 = new Student1(st1);
			System.out.println(s2.sid);
			System.out.println(s2.sname);
			System.out.println(s2.address1.city);
			System.out.println("-----------------------------");
			
			System.out.println("**************************************");
			s2.address1.city = "Guntur";
			
			System.out.println(st1.sid);
			System.out.println(st1.sname);
			System.out.println(st1.address1.city);//Guntur
			System.out.println("-----------------------------");
			System.out.println(s2.sid);
			System.out.println(s2.sname);
			System.out.println(s2.address1.city);//Guntur
			System.out.println("-----------------------------");
			
			
			
			

		}

	}
