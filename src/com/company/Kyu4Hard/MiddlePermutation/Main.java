package com.company.Kyu4Hard.MiddlePermutation;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Set<String> list = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(findMidPerm("ab"));

    }


    static void permutation(String prefix, String str, Set<String> res) {
        int n = str.length();
        if (n == 0) {
            res.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), res);
        }

    }

    static List<String> findMidPerm(String str) {
        permutation("", str, list);
        return new ArrayList<>(list);
    }
}

