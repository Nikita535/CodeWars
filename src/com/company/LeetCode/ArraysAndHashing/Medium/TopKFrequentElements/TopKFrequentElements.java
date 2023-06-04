package com.company.LeetCode.ArraysAndHashing.Medium.TopKFrequentElements;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res= new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));


        for(Map.Entry<Integer, Integer> entry : entryList){
            if(k>0){
                res[k-1]=entry.getKey();
                k--;
            }
        }

        return res;
    }
}
