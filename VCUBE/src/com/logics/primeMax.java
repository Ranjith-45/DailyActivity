package com.logics;

public class primeMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				int count=0;
				for(int k=1;k<sum;k++) {
					if(sum%k==0) {
						count++;
					}
					
				}
				if(count< 2) {
					if(max<sum) {
						max=sum;
					}
				}
			}
		}
		System.out.println(max);

	}

}
