package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(toRoman(12));
        System.out.println(fromRoman("XIV"));
    }

    public static String toRoman(int n) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(n >= values[i]) {
                n -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    public static int fromRoman(String romanNumeral) {

        Map<Character,Integer> roman = new HashMap<Character, Integer>()
        {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};


        int sum = 0;
        int n = romanNumeral.length();

        for(int i = 0; i < n; i++)
        {
            if (i != n - 1 && roman.get(romanNumeral.charAt(i)) <
                    roman.get(romanNumeral.charAt(i + 1)))
            {
                sum += roman.get(romanNumeral.charAt(i + 1)) -
                        roman.get(romanNumeral.charAt(i));
                i++;
            }
            else
            {
                sum += roman.get(romanNumeral.charAt(i));
            }
        }
        return sum;
    }
}