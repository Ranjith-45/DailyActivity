package com.studyopedia;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In type casting two types of type casting.......
		//--------------------------------------------------
		// 1) Implicit Type casting ...
		//backward  direction
		//byte<-short<-int<-long<-float<-double
		//Implicit type casting is the automatic conversion of a smaller data type into a larger data type by the Java compiler. 
		//Since the larger data type can store all the values of the smaller one, no data is lost
		byte b = 10;
        int i = b;
        System.out.println("Byte value: " + b);
        System.out.println("Int value: " + i);
		
		// Explicit Type casting....
        //--------------------------
        //Forward Direction......
        //byte->short->int->long->float->double
        //Explicit type casting is the manual conversion of a larger data type into a smaller data type using the cast operator (). 
        //It is called narrowing because the destination type has a smaller range, so data loss may occur.
        double d = 12.75;
        int i1 = (int) d;

        System.out.println("Double: " + d);
        System.out.println("Int: " + i1);
        
        
        
		byte b1=127;//In byte it stores the value range -128 to 127
		byte b2=-128; //memory 1-Byte ==> 8-Bits it means 2^7
		// 	1^2=2=> 	2*2=4=> 	4*2=8=> 8^2=16=> 	16^2=32=> 	32^2=64=> 	64^2=>128
		System.out.println("byte range:"+b1);
		System.out.println("byte range: "+b2);
		//in integer for byte short int long in "RHS side it stores the values integer only"
//		int in=128;
		byte b3 = (byte)450;
		System.out.println(b3);
		
		short s=32767;//short range -32768 to 32767 storage 2 bytes(16 bits) 2^15
		short s1= (short) 327985;
		System.out.println(s+" ");
		System.out.println(s1+" ");
		
		 
		
		
		int in2=(int)b3;
		System.out.println(in2);// stores 4-bytes (32-bits) 2^31-1
		int i2=2147483647;//int range -2,147,483,648 to 2,147,483,647 
		long l1 = 10049922909209100l;
		int i3 = (int) l1;
		System.out.println("integer"+i3);
		
		long min = -9223372036854775808L;
        long max = 9223372036854775807L;

        System.out.println("Long min:"+min);//long range from -9223372036854775808L to 9223372036854775807L
        //here all numbers are store the values as integer so we mentioned as L at the last of the table 
        System.out.println("Long max:"+max);
        float f = 123.45f;
	    long l = (long) f;
	    
	    
	    //CHAR
	    char ch = 'A';
        int num = ch;

        System.out.println(ch);   // A
        System.out.println(num);  // 65

	    System.out.println(f);
	    System.out.println(l);
		

	}

}
