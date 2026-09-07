package com.logics;
import java.util.*;

public class GCD {

	

	

	    // Method to find GCD
	    static int findGCD(int a, int b) {

	        while (b != 0) {
	            int temp = a % b;
	            a = b;
	            b = temp;
	        }

	        return a;
	    }

	    // Method to find minimum insertions
	    static int minInsertions(int[] arr) {

	        int count = 0;

	        // Check every adjacent pair
	        for (int i = 0; i < arr.length - 1; i++) {

	            int gcd = findGCD(arr[i], arr[i + 1]);

	            // If GCD is not 1, they are not co-prime
	            if (gcd != 1) {
	                count++;
	            }
	        }

	        return count;
	    }

	    // Main method
	    public static void main(String[] args) {

	        int[] arr = {2, 7, 28};

	        int result = minInsertions(arr);

	        System.out.println("Minimum insertions = " + result);
	    }
	}
