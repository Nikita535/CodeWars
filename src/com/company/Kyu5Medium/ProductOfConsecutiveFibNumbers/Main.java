package com.company.Kyu5Medium.ProductOfConsecutiveFibNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));
    }

    public static long[] productFib(long prod) {
        long n = 0;
        long nPlus = 1;
        while(n*nPlus < prod) {
            nPlus = n + nPlus;
            n = nPlus - n;
        }
        return n*nPlus==prod ? new long[]{n,nPlus,1}:new long[]{n,nPlus,0};
    }
}
