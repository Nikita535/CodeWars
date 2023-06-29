package com.company.LeetCode.ArraysAndHashing.Medium.LongestConsecutiveSequence;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength=-1;
        int currentLength=0;

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i]-1)){
                currentLength=1;
            while (set.contains(nums[i]+1))
            {
                nums[i]+=1;
                currentLength+=1;
            }
            maxLength = Math.max(maxLength,currentLength);
            }
        }
        return maxLength;
    }
}
