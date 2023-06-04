package com.company.CodeWars.Kyu7SoEasy.TwoToOne;

import java.util.*;
public class Main{

    public static String longest (String s1, String s2) {
        Set<Character> set1=new TreeSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }
        Set<Character> set2=new TreeSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        set1.addAll(set2);

        String res="";
        for(Character ch:set1){
            res=res+ch;
        }

        return res;
    }
}