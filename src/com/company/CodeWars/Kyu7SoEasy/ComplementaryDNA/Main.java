package com.company.CodeWars.Kyu7SoEasy.ComplementaryDNA;

import java.util.*;
public class Main {
    public static String makeComplement(String dna) {
        Map<Character,Character> dict=new HashMap<>();
        dict.put('A','T');
        dict.put('T','A');
        dict.put('C','G');
        dict.put('G','C');

        String[] array= dna.split("");

        for (int i = 0; i < dna.length(); i++) {
            array[i] = Character.toString(dict.get(dna.charAt(i)));
        }


        StringBuilder res= new StringBuilder();

        for (String s : array) {
            res.append(s);
        }
        return res.toString();
    }
}