package abstraction;

import java.util.Scanner;

 abstract class main {
	abstract void area();
	

	

}
class Circle extends main{
	Scanner sc = new Scanner(System.in);
	void area() {
		System.out.println("Enter the radius of the circle:");
		int r=sc.nextInt();
		double pi=Math.PI;
		double arear =pi*(Math.pow(r, r));
		System.out.println("Area of Circle is :"+arear);
		
		
	}
}
class Square extends main{
	Scanner sc = new Scanner(System.in);
	void area() {
		System.out.println("Enter the side of the Square:");
		int s=sc.nextInt();
		int area= s*s;
		System.out.println("Area of Square is:"+area);
	}
}
class triangle extends main{
	int base;
	int height;
	
	 /**
	 * @param base
	 * @param height
	 */
	public triangle(int base, int height) {
		
		this.base = base;
		this.height = height;
	}

	 void area() {
		 double area=0.5*base*height;
		 System.out.println("Area of Triangle is "+area);
	 }

	
}
public class main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Stared");
		main t=new triangle(10,30);
		t.area();
		main s=new Square();
		s.area();
		main c=new Circle();
		c.area();
	
	}
}
