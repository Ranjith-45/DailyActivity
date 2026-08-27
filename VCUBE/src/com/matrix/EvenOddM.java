package com.matrix;

public class EvenOddM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{5,6,4},{43,5,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					arr[i][j]=0;
				}
				else {
					arr[i][j]=-1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
		
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
