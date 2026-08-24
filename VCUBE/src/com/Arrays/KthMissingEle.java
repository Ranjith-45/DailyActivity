package com.Arrays;

public class KthMissingEle {

	    public int kthMissing(int[] arr, int k) {
	        int n = 0;

	        // Check missing numbers before first element
	        for (int j = 1; j < arr[0]; j++) {
	            n++;
	            if (n == k) {
	                return j;
	            }
	        }

	        // Check missing numbers between elements
	        for (int i = 1; i < arr.length; i++) {
	            int start = arr[i - 1];
	            int end = arr[i];

	            for (int j = start + 1; j < end; j++) {
	                n++;
	                if (n == k) {
	                    return j;
	                }
	            }
	        }

	        // Check after last element
	        return arr[arr.length - 1] + (k - n);
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 3, 4, 7, 11};
	        int k = 5;

	        KthMissingEle  obj = new KthMissingEle ();

	        int result = obj.kthMissing(arr, k);

	        System.out.println("Kth missing number: " + result);
	    }
	}
