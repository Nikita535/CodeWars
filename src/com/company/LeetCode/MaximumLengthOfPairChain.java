package com.company.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {
    public static void main(String[] args) {
//        System.out.println(findLongestChain(new int[][]{{1,2},{2,3},{3,4}}));
//        System.out.println(findLongestChain(new int[][]{{1,2},{7,8},{4,5}}));
        System.out.println(findLongestChain(new int[][]{{-10,-8},{8,9},{-5,0},{6,10},{-6,-4},{1,7},{9,10},{-4,7}}));
    }


    public static int findLongestChain(int[][] pairs) {
        int max=0,cur=Integer.MIN_VALUE;

        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });


        for (int i = 0; i < pairs.length; i++) {
            if(cur<pairs[i][0]){
                cur=pairs[i][1];
                max++;
            }
        }
        return max;
    }

}
