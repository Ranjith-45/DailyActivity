package com.matrix;
import java.util.*;
public class palindrom {




	    public String palindromeRowOrCol(int[][] arr) {

	        // Check rows first
	        for (int i = 0; i < arr.length; i++) {

	            int l = 0;
	            int r = arr[i].length - 1;
	            boolean status = true;

	            while (l < r) {

	                if (arr[i][l] != arr[i][r]) {
	                    status = false;
	                    break;
	                }

	                l++;
	                r--;
	            }

	            if (status) {
	                return i + "r";
	            }
	        }

	        // Check columns
	        for (int j = 0; j < arr[0].length; j++) {

	            int l = 0;
	            int r = arr.length - 1;
	            boolean status = true;

	            while (l < r) {

	                if (arr[l][j] != arr[r][j]) {
	                    status = false;
	                    break;
	                }

	                l++;
	                r--;
	            }

	            if (status) {
	                return j + "c";
	            }
	        }

	        return "-1";
	    }

	    public static void main(String[] args) {

	        int[][] arr = {
	            {1, 0, 0},
	            {0, 1, 0},
	            {1, 1, 0}
	        };

	        palindrom obj = new palindrom();

	        String result = obj.palindromeRowOrCol(arr);

	        System.out.println(result);
	    }
	}
