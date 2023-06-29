package com.company.LeetCode.Stack.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }

    public static boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','{');
        map.put(']','{');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }else if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.pop() != map.get(s.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}

/**
 *System.out.println(isValid("([])"));
 *
 *
 * [
 * (
 *
 * )
 * ]
 *
 */