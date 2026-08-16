package com.methods.constructors;

public class test1 {
	
		int id;
		String name;
		int age;
		 test1() {
		        id = 1;
		        name = null;
		        age = 21;
		    }
		 test1(int id,String name) {
		        this.id=id ;
		        this.name=name;
		        age = 21;
		    }

		test1(int id,String name,int age){
			this.id=id;
			this.name=name;
			this.age=age;
		}
		void show() {
			System.out.println("Id:"+id);
			System.out.println("Name:"+name);
			System.out.println("age:"+age);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			test1 t=new test1();
			test1 t1=new test1(2,"Shiva",20);
			test1 t2=new test1(3,"sai");
			t.show();
			t1.show();
			t2.show();
			
		}

}


