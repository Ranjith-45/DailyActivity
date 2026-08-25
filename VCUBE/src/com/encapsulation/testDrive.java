package com.encapsulation;

public class testDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.setEid(1);
		emp1.setEname("KL rahul");
		emp1.setAge(19);
		System.out.println("Eid:"+emp1.geEid());
		System.out.println("Ename:"+emp1.getEname());
		System.out.println("Age:"+emp1.getAge());

	}

}
