package com.company.Kyu4Hard.MiddlePermutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(findMidPerm("abcd"));

    }


    static void permutation(String prefix, String str, List<String> res) {
        final int count = (int) Math.pow(str.length(), 2);
        int n = str.length();
        if (n == 0) {
            res.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), res);
        }

    }

    static String findMidPerm(String str) {
        permutation("", str, list);
        Collections.sort(list);
        return list.get((list.size() / 2) - 1);
    }
}

