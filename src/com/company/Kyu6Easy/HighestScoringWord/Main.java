package com.company.Kyu6Easy.HighestScoringWord;

import java.util.*;
public class Main {

    public static String high(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(a -> a.chars().map(i->i-96).sum()
                )).get();
    }

}
