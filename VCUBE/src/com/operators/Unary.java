package com.operators;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Unary operators operate on a single operand.
//		Common unary operators:
//		+ (positive)
//		- (negative)
//		++ (increment)
//		-- (decrement)
//		! (logical NOT)
//		~ (bitwise complement)
		int a=10;
		int b=20;
		boolean flag=true;
//		+ (positive)
		System.out.println("+ (positive):"+a);//10
//		- (negative)
		System.out.println("- (negative):"+ -a);//-10
//		++ (increment)
		//preIncrement and Post Increment
		System.out.println("++preIncrement:"+ ++a);//11
		System.out.println("PostIncrement++:"+ a++);//11-->12
//		-- (decrement)
		//-- predecrement and post Decrement--
		System.out.println("-- pre decrement:"+ (--a));//11
		System.out.println("Post decrement--"+ a--);//11-->10
		//! (logical NOT)
		System.out.println(!flag);//false
		
		
	}

}
