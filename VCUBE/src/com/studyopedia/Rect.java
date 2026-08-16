package com.studyopedia;
	
import java.util.*;
public class Rect {
	static void display() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		System.out.println("enter the Breath");
		int b=sc.nextInt();
		int area =l*b;
		int p=2*(l+b);
		System.out.println(area);
		System.out.println(p);
		

		
	}
	public static void main(String[] args) {
		display();
	}

}
