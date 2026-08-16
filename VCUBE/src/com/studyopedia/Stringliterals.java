package com.studyopedia;

public class Stringliterals {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ranjith";//it creates one object in String Constant pool(SCP)
		String st1= new String("java");//it create 1st object in String Heap and also in SCP........
		
		String s2="ranjith";//it creates one object in String Constant pool(SCP) s1 and s2 both in SCP so both asign with same name Ranith
		String st2= new String("java");//it create 2st object in String Heap and also in SCP........
		System.out.println(s1==s2);//true 
		// in this checks the  value 
		System.out.println(st1==st2);//false
		//here it will checks the address of the object
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
		System.out.println("st1: "+st1);
		System.out.println("st2: "+st2);
		
		// so we use the .equals() or .equalsIgnoreCase()
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		byte b= (byte)200;
		
	}

}

