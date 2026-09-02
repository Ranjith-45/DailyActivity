package com.hospital;
import java.util.*;



public class PatientImpl implements Patient{
	Scanner sc=new Scanner(System.in);
	protected String name;
	protected String gender;
	protected int age;
	protected String pid;
	protected String phone;
	protected String address;
	public String disease;
	
//	public PatientImpl() {
//		this.name=name;
//		this.age=age;
//		this.address=address;
//		this.gender=gender;
//		this.pid=pid;
//		this.phone=phone;
//	}
	
	
	@Override
	public String getName() {
		System.out.println("Enter patient name:");
		String name=sc.nextLine();
		return name;
	}
	@Override
	public int getAge() {
		System.out.println("Enter Patient Age:");
		int age=sc.nextInt();
		return age;
	}
	@Override
	public String getGender() {
		System.out.println("Enter Gender");
		String gender=sc.next();
		return gender;
	}
	@Override
	public String getPatientId() {
		Random random = new Random();

        int number = random.nextInt(100000); // 0 to 99999

        String pid = String.valueOf(number);

        System.out.println("PID: " + pid);
        return pid;
	}
	@Override
	public String getDisease() {
		System.out.println("What kind of disease are yo suffering with:");
		String disease =sc.next();
		return disease;
	}
	@Override
	public String getPhone() {
		System.out.println("Enter phone Number:");
		String phone=sc.next();
		return phone;
	}
	@Override
	public String getAddress() {
		System.out.println("Enter your address :");
		String address= sc.nextLine();
		return address;
	}

}
