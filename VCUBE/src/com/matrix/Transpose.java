package com.matrix;
import java.util.*;

public class Transpose {
	

	

	    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {

	        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

	        for (int i = 0; i < mat[0].length; i++) {

	            ArrayList<Integer> map = new ArrayList<>();

	            for (int j = 0; j < mat.length; j++) {

	                map.add(mat[j][i]);
	            }

	            list.add(map);
	        }

	        return list;
	    }

	    public static void main(String[] args) {

	        int[][] mat = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        Transpose obj = new Transpose();

	        ArrayList<ArrayList<Integer>> result = obj.transpose(mat);

	        System.out.println(result);
	    }
	}
