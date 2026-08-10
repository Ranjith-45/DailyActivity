
package com.loops;
import java.util.*;

public class patn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 2; i < n * n * 3; i++) {   
            int count = 0;

            for (int j = 2; j <= i / 2; j++) {   
                if (i % j == 0) {
                    count++;
                }
            }

            if (count >= 1) {    // composite numbers
                list.add(i);
            }
        }

        int k = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {    // forward rows
                for (int j = 0; j < i; j++) {
                    System.out.print(list.get(k) + " ");
                    k++;
                }
            } else {             // reverse rows
                int temp = k;
                for (int j = temp + i - 1; j >= temp; j--) {
                    System.out.print(list.get(j) + " ");
                }
                k += i;
            }

            System.out.println();
        }
    }
}