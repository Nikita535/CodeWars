package com.company.LeetCode.Stack.EvaluateReversePolishNotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
//        System.out.println(evalRPN(new String[]{"2","1","+","4","-"}));
//        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        ArrayList<String> list = new ArrayList<>(List.of("+","-","/","*"));
        int a,b;

        for (int i = 0; i < tokens.length; i++) {
            if (!list.contains(tokens[i])){
                stack.push(tokens[i]);
            }else{
               switch (tokens[i]){
                   case "+": {
                       a=Integer.parseInt(stack.pop());
                       b=Integer.parseInt(stack.pop());
                       stack.push(String.valueOf(a+b));
                       break;
                   }
                   case "-": {
                       a=Integer.parseInt(stack.pop());
                       b=Integer.parseInt(stack.pop());
                       stack.push(String.valueOf(b-a));
                       break;
                   }
                   case "*": {
                       a=Integer.parseInt(stack.pop());
                       b=Integer.parseInt(stack.pop());
                       stack.push(String.valueOf(a*b));
                       break;
                   }
                   case "/": {
                       a=Integer.parseInt(stack.pop());
                       b=Integer.parseInt(stack.pop());
                       stack.push(String.valueOf(b/a));
                       break;
                   }
               }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
