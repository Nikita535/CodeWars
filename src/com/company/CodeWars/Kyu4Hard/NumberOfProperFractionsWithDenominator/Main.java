package com.company.CodeWars.Kyu4Hard.NumberOfProperFractionsWithDenominator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(properFractions(1));
        System.out.println(properFractions(2));
        System.out.println(properFractions(5));
        System.out.println(properFractions(15));
        System.out.println(properFractions(25));
        //without opt....
    }


    public static long properFractions(long n){
        double sqrt = Math.sqrt(n);
        long currentValue = n;
        long multiplier = 2;
        ArrayList<Long> arr=new ArrayList<>();
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                arr.add(multiplier);
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            arr.add(currentValue);
        }

        Set<Long> set=new HashSet<>(arr);
        long res=0;

        for(Long s: set){
            res+=(n/s)-1;
        }
        return n-res-1;
    }




//opt not mine
//    public static long properFractions(long n) {
//        if (n==1) return 0;
//        long r=n;
//        for(long d=2;d*d<=n;d++)
//            if(n%d<1){
//                while(n%d<1)
//                    n/=d;
//                r-=r/d;
//            }
//        if(n>1) r-=r/n;
//        return r;
//    }

}
