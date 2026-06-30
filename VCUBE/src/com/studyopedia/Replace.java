package com.studyopedia;
public class Replace{
    int convertfive(int num) {
        // Special case when num is 0
        if (num == 0) {
            return 5;
        }

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 0) {
                digit = 5;
            }

            result += digit * place;
            place *= 10;
            num /= 10;
        }

        System.out.println(result);
    }
}