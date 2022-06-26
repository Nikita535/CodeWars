package com.company.Kyu6Easy.SortTheOdd;

import java.util.*;
public class Main {
    public static int[] sortArray(int[] array) {
        Queue<Integer> chet = new LinkedList<>();
        Queue<Integer> nechet = new PriorityQueue<Integer>();
        List<Integer> res = new ArrayList<>();

        for (Integer ch : array) {
            if (ch % 2 == 0) {
                chet.add(ch);
            }
        }

        for (Integer ch : array) {
            if (ch % 2 != 0) {
                nechet.add(ch);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                res.add(chet.remove());
            }else {
                res.add(nechet.remove());
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
