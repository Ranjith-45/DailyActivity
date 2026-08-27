package com.accessModifiers02;
import com.accessModifiers01.Access01;
public class Access03 extends Access01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started in Access03");
     	Access01 t1=new Access01();
		
		//Even though, your class is public ,constructor is public ,you imported class is public 
		//but your data members are default so we cannot access outside of the packages.
//		System.out.println(t1.a2);
//		System.out.println(t1.name2);
//		t1.method2();

		//Accessing the public data outside of the class out side of the packages
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();
		
	////DEFAULT DATA ACCESSING the data ith n the class-*************************
	/// //accesing 
			Access03 t4=new Access03();
			System.out.println(t4.a4);
			System.out.println(t4.name4);
			t4.method4();
	}

}
