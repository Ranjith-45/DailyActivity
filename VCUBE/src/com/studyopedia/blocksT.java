package com.studyopedia;

public class blocksT {
	static int i=0;
	static {
		System.out.println(++i +".static block loaded");//#1
		blocksT bt=new blocksT();//#2,3
	}
	static blocksT bt=new blocksT();//4,5
	{
		System.out.println(++i +".Instace block loaded");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(++i +".Main method started...");//10
		blocksT bt=new blocksT();//11,12
		
	}
	static {
		System.out.println(++i +"static block loaded");//6
		blocksT bt=new blocksT();//7,8
	}
	{
		System.out.println(++i +".Instace block loaded");
		
		
	}
	static {
		System.out.println(++i +".static block loaded");//9
	}
}
