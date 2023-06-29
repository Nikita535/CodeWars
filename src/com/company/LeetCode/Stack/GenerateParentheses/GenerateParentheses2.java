package com.company.LeetCode.Stack.GenerateParentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GenerateParentheses2 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        if(n==1){
            return List.of("()");
        }
        List<String> res = generateParenthesis(n-1);

        Set<String> set = new HashSet<>();

        for(String str:res){
            set.add("("+str+")");
            set.add("()"+str);
            set.add(str+"()");
        }


        return new ArrayList<>(set);
    }

}
