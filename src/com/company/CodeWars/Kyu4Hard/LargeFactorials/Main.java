package com.company.CodeWars.Kyu4Hard.LargeFactorials;

import java.math.BigInteger;

public class Main {
    /** Driver method. */
    public static void main(String[] args) {
        int n = 100;
        System.out.println(factorial(n));
        System.out.println(Factorial(n));
    }

    private static String factorial(int n) {
        int res[] = new int[1000];
        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x <= n; x++) {
            res_size = multiply(x, res, res_size);
        }

        StringBuffer buff = new StringBuffer();
        for (int i = res_size - 1; i >= 0; i--) {
            buff.append(res[i]);
        }

        return buff.toString();
    }
    private static int multiply(int x, int res[], int res_size) {
        int carry = 0; // Initialize carry.

        // One by one multiply n with individual digits of res[].
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of 'prod' in res[]
            carry = prod / 10;  // Put rest in carry
        }

        // Put carry in res and increase result size.
        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }

        return res_size;
    }


    //or
    public static String Factorial(int n) {
        if(n < 0)
            return null;
        if(n <= 1)
            return "1";
        BigInteger res = new BigInteger("1");
        for(int i = 2; i <= n; ++i)
            res = res.multiply(new BigInteger(String.valueOf(i)));
        return res.toString();
    }
}