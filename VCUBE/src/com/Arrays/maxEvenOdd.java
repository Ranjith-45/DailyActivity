package com.Arrays;

public class maxEvenOdd{

    public static int maxEvenOdd(int[] arr) {

        int max = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            // Check whether current and previous elements
            // have different parity
            if ((arr[i] % 2) != (arr[i - 1] % 2)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
    
//  public static int maxEvenOdd(int[] arr) {

//  int max = 1;

//  for (int i = 0; i < arr.length; i++) {

//      int r = i;
//      int temp;

//      if (arr[r] % 2 == 0) {
//          temp = 1;   // expecting odd next
//      } else {
//          temp = 0;   // expecting even next
//      }

//      int count = 1;

//      r++;

//      while (r < arr.length) {

//          if (arr[r] % 2 == 0 && temp == 0) {
//              temp = 1;
//              count++;
//          }
//          else if (arr[r] % 2 != 0 && temp == 1) {
//              temp = 0;
//              count++;
//          }
//          else {
//              break;
//          }

//          r++;
//      }

//      if (count > max) {
//          max = count;
//      }
//  }

//  return max;
//}
//}

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35, 40};

        int result = maxEvenOdd(arr);

        System.out.println("Longest Even-Odd Subarray: " + result);
    }
}