package com.Arrays;
import java.util.*;
public class printArray {
//	1. Read and print all elements of an array.
//	Input: 10 20 30 40 50
//	Output: 10 20 30 40 50
//	2.Find the sum of all elements in an array.
//	Input: [1, 2, 3, 4, 5]
//	Output: 15
//	3.Find the average of array elements.
//	Input: [10, 20, 30, 40]
//	Output: 25.0
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n= sc.nextInt();
		System.out.println("Enter the Array elements");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		//System.out.println(Arrays.toString(arr));
		int l=0;
		int r=n/2;
		int half=n/2;
		int sum=0;
		while(l<half ||r<n ) {
			sum=sum+arr[l];
			sum=sum+arr[r];
			
			l++;
			r++;
		}
		if(n%2==1) {
			sum=sum-arr[half];
		}
		System.out.println();
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+(sum/n));
	}

}
