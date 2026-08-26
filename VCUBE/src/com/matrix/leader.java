package com.matrix;

public class leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 9, 5,6,2};
		for(int i=0;i<arr.length;i++) {
			boolean status= false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					status=true;
				}
			}
			if(!status) {
				System.out.println(arr[i]);
			}
		}
	}

}
