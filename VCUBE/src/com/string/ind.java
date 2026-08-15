package com.string;
import java.util.*;
public class ind {
//	Write a Java program using the Java Collections Framework to find all unique pairs of numbers from an integer array whose sum equals a given target value.
//	Input: arr[] = {1, 2, 7, 8, 9}, target = 9
//	Output: Pairs: (2, 7), (8, 1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of the array:");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elments:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Entr the Target:");
		int tar=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==tar) {
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}
	}

}
