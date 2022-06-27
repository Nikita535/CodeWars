package com.company.Kyu4Hard.NextBiggestNumberWithTheSameDigits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(nextDigit(10405321));
    }

    public static int nextDigit(long n) {
            char[] s = String.valueOf(n).toCharArray();
            for (int i = s.length - 2; i >= 0; i--) {
                for (int j = s.length - 1; j > i; j--) {
                    if (s[i] < s[j]) {
                        char tmp = s[i];
                        s[i] = s[j];
                        s[j] = tmp;
                        Arrays.sort(s, i + 1, s.length);
                        return Math.toIntExact(Long.parseLong(String.valueOf(s)));
                    }
                }
            }
            return -1;
    }
}