package com.Arrays;
public class Dublicate{
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10,10, 50};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            // Check whether the element appeared before
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate)
                continue;

            // Check whether duplicate exists after it
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}