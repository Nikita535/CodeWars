package com.company.LeetCode.ArraysAndHashing.Easy.ValidAnagram;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (Character c : s.toCharArray()) {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for (Character c : t.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        for(Character c: map1.keySet()){
            if (!map2.containsKey(c) || !map1.get(c).equals(map2.get(c))){
                return false;
            }
        }

        return true;
    }
}
