package com.matrix;
import java.util.*;
public class SnakeMat {

	
//  1 → 2 → 3
//          ↓
//  6 ← 5 ← 4
//  ↓
//  7 → 8 → 9
//	

	    static ArrayList<Integer> snakePattern(int matrix[][]) {

	        ArrayList<Integer> list = new ArrayList<>();

	        for (int i = 0; i < matrix.length; i++) {

	            if (i % 2 == 0) {

	                // Left to right
	                for (int j = 0; j < matrix[i].length; j++) {
	                    list.add(matrix[i][j]);
	                }

	            } else {

	                // Right to left
	                for (int j = matrix[i].length - 1; j >= 0; j--) {
	                    list.add(matrix[i][j]);
	                }
	            }
	        }

	        return list;
	    }

	    public static void main(String[] args) {

	        int matrix[][] = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        ArrayList<Integer> result = snakePattern(matrix);

	        System.out.println(result);
	    }
	}


