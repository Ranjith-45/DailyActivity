package com.accessModifiers01;


// private is Illegal modifier for the class Access01;
//only public,<default>, abstract & final are permitted

//Floating-point expressions are always strictly evaluated from source level 17. Keyword 'strictfp' is not required.
 public class Access01 {
	 
	 
	 {
		 System.out.println("hello i am INSTABNCE block my scope is class scope Access03 ");
	 }
	 static {
		 System.out.println("hello iam static block my scope is class scope from Access01");
	 }
	 ////------------------------PRIVATE--------------------------------
	 private int a1=18;
	 private String name1="Ranjith";
	 private void method1() {
		 System.out.println("method1 called");
		 
	 }
//	private   Access01() {
//		 System.out.println("no-arg Constructor called");
//	 }
	   
	   
	   
	 //----------------DEFAULT DATA------------------------
	   int a2=1;
	   String name2="KL rahul";
	   void method2() {
		   System.out.println("method2 called");
	   }
	   //block scope is always class scope 
//	   Access01() {
//			 System.out.println("no-arg Constructor called");
//		 }
	   //-------------- public -----------------------
	   public int a3=4;
	   public String name3="Abhishek sharma";
	   public void method3() {
		   System.out.println("method3 called");
	   }
	  public Access01() {
			 System.out.println("no-arg Constructor public called");
		 }
	  
	 //--------------------------PROTECTED DATA MEMBERS-------------------------
	  protected int a4=7;
	  protected String name4="Thala for a reason";
	  protected void method4() {
		   System.out.println("method4 called");
	   }
//	  protected Access01() {
//			 System.out.println("no-arg Constructor called");
//		 }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method Access01 method called");
		
		////PRIVATE DATA ACCESSING the data ith n the class-*************************
		//Accessing the private data members with in the class .
		Access01 t1=new Access01();
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();
	////DEFAULT DATA ACCESSING the data ith n the class-*************************
		Access01 t2=new Access01();
		System.out.println(t2.a2);
		System.out.println(t2.name2);
		
	////protected DATA ACCESSING the data ith n the class-*************************
		Access01 t4=new Access01();
		System.out.println(t4.a4);
		System.out.println(t4.name4);
		t4.method4();
		
	}

}
