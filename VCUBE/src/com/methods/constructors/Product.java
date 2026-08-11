package com.methods.constructors;

public class Product {
	int productId;
	String productName;
	int price;
	Product(int productId,String productName,int price ){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	Product(){
		System.out.println("no arg Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product(1,"Bottle",56);
		Product p2= new Product(2,"phone ",50000);
		Product p3= new Product(3,"Laptop",56000);
		
		int n=4;
		String s="pen";
		int p=10;
		Product p4= new Product(n,s,p);
		p1.show();
		p2.show();
		p3.show();
		p4.show();
		
	}
	void show() {
		System.out.println("Product Details");
		System.out.println("Product id:"+productId);
		System.out.println("Produt name:"+productName);
		System.out.println("Price:"+price);
		
		
	}

}
