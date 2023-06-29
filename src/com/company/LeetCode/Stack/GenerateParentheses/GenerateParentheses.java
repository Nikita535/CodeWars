package com.company.LeetCode.Stack.GenerateParentheses;

import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();

        generate(res,"",0,0,n);

        return res;
    }

    public static void generate(List<String> res, String curr,int open,int close,int n){
        if (curr.length() == 2*n){
            res.add(curr);
            return;
        }

        if (close<open){
            generate(res,curr+')',open,close+1,n);
        }

        if (open<n){
            generate(res,curr+'(',open+1,close,n);
        }

    }
}
