package com.company.Kyu6Easy.SumOfDigit;

public class Main {
    public static int digital_root(int n) {
        int sum=0;
        int digit=0;

        while(n>0 || sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
            digit=n%10;
            sum=sum+digit;
            n/=10;
        }
        return sum;
    }
}