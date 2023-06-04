package com.company.CodeWars.Kyu5Medium.NumberOfTrailingZeros;

public class Main {
    public static void main(String[] args) {
        System.out.println(zeros(12));
    }

    public static int zeros(int n) {
        int res=0;
        while(n>0){
            n/=5;
            res+=n;
        }
        return res;
    }
}
