package com.company.LeetCode.ArraysAndHashing.Easy.ValidAnagram;

public class ValidAnagramOptimized {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] arr = new int[26];//число английских букв

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for (int j : arr) {
            if (j != 0) return false;
        }

        return true;
    }
}
