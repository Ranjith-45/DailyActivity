package com.matrix;
import java.util.*;
public class printDig {

	


	    static ArrayList<Integer> diagView(int mat[][]) {
	        ArrayList<Integer> list = new ArrayList<>();

	        int n = mat.length;
	        int m = mat[0].length;

	        for (int d = 0; d < n + m - 1; d++) {

	            int row = (d < m) ? 0 : d - m + 1;
	            int col = (d < m) ? d : m - 1;

	            while (row < n && col >= 0) {
	                list.add(mat[row][col]);

	                row++;
	                col--;
	            }
	        }

	        return list;
	    }

	    public static void main(String[] args) {

	        int mat[][] = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        ArrayList<Integer> result = diagView(mat);

	        System.out.println(result);
	    }
	}
