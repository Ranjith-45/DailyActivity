package com.Arrays;

public class missing {
//	1.Find the Missing Number from 1 to N
//	A sorted array contains numbers from 1 to N, but one number is missing. Write a Java program to find the missing number.
//	Input: 1 2 4 5 6
//	Output: Missing Number = 3
//	2.Remove Duplicate Elements from an Array
//	Write a Java program to remove duplicate elements from an array and print only the unique elements.
//	Input: 1 2 3 2 4 1 5
//	Output: Unique Elements: 1 2 3 4 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,6,8};
		int mis=0;
		System.out.println("Missing Numbers");
		for(int i=0;i<arr.length;i++) {
			int st=arr[i];
			if(i+1==arr.length) {
				break;
			}
			int end=arr[i+1];
			for(int j=st+1;j<end;j++) {
				System.out.println(j);
			}
			
		}
	}

}
