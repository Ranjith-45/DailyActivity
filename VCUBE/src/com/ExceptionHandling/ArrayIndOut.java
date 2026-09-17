package com.ExceptionHandling;

//Create an integer array containing 5 elements.
//Ask the user to enter an array index and display the element at that index.
//Handle ArrayIndexOutOfBoundsException if the index is invalid.
//If the user enters an invalid number while converting the String to an integer, handle NumberFormatException.
//Use separate catch blocks for all three exceptions.

public class ArrayIndOut {

	public static void main(String[] args) {
		int[] arr= new int[5];
		try {
			
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			arr[4]=50;
			arr[5]=60;
			
		}catch(ArrayIndexOutOfBoundsException oe) {
			System.err.println("ArrayIndexOutOfBoundsException"+oe.getMessage());
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
