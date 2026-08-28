package com.string;

import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        int temp = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                System.out.print(s.substring(temp, i) + " -> (" + temp + "," + (i - 1) + ") ");
                temp = i + 1;
            }
        }

        
        System.out.print(s.substring(temp,s.length()) + " -> (" + temp + "," + (s.length() - 1) + ")");
    }
}