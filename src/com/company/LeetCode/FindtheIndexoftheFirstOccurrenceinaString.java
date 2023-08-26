package com.company.LeetCode;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
        System.out.println(strStr("leetcode","code"));
        System.out.println(strStr("leetcode","leeto"));
        System.out.println(strStr("mississippi","issip"));
    }

    public static int strStr(String haystack, String needle) {
        int count=0;
        int j=0;
        if (needle.length()>haystack.length()) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                count++;
                j++;
            }else {
                i-=j;
                j=0;
                count=0;
                continue;
            }

            if(count == needle.length())
            {
                return i-(needle.length()-1);
            }
        }
        return -1;
    }
}
