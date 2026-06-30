package com.studyopedia;

public class Garbage {
	protected void finalize() {
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.gc
		Garbage e1 =new Garbage();//com.studyopedia.Garbage@5ca881b5<-- address of this object
		//address of the referenced variable are in hexaDesimal number Ex -> 5ca881b5
		System.out.println(e1);
		Garbage e2 =new Garbage();
		System.out.println(e2);
		Garbage e3 =new Garbage();
		System.out.println(e3);
		//hashCode() will convert the hexadecimal to number..
		// also same hashcode 0x worked as well
		System.out.println(e1.hashCode());
		int a= 0x5ca881b5;
		
		System.out.println(a);
		System.out.println("------------------------");
		e1=null;
		e2=null;
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.gc();
		
		
	}

}
