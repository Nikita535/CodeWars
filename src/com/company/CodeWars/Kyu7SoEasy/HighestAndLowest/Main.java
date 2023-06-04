package com.company.CodeWars.Kyu7SoEasy.HighestAndLowest;

import java.util.*;

public class Main {
    public static String highAndLow(String numbers) {

        String[] array =numbers.split(" ");
        Integer max = Arrays.stream(array).mapToInt(Integer::valueOf).max().getAsInt();
        Integer min = Arrays.stream(array).mapToInt(Integer::valueOf).min().getAsInt();
        return (max+" "+min);
    }
}
