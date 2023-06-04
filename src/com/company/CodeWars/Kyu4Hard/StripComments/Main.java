package com.company.CodeWars.Kyu4Hard.StripComments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        System.out.print(stripComments("a #b\nc\nd $e f g\n", new String[] { "#", "$" }));
//        System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
    }

    public static String stripComments(String text, String[] commentSymbols) {
        List<String> list=Arrays.stream(text.split("\n")).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < commentSymbols.length; j++) {
                if(list.get(i).contains(commentSymbols[j])){
                    list.set(i,list.get(i).substring(0,list.get(i).indexOf(commentSymbols[j])));
                    list.set(i,list.get(i).trim());
                }
            }
        }
        String temp =list.stream().collect(Collectors.joining("\n"));
        return temp;
    }
}