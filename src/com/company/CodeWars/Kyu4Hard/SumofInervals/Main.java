package com.company.CodeWars.Kyu4Hard.SumofInervals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{1,4},{7,1},{3,5}}));
        System.out.println(sumIntervals(null));
    }
    public static int sumIntervals(int[][] intervals) {
        List<Integer> list=new ArrayList<>();
        if(intervals==null || intervals.length==0){
            return 0;
        }
        Arrays.stream(intervals).forEach(e->{
            for (int i = e[0]; i < e[1]; i++) {
                list.add(i);
            }
        });

        return (int)list.stream().distinct().count();
    }
}
