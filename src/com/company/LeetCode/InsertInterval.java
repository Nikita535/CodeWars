package com.company.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
        System.out.println(Arrays.deepToString(insert(new int[][]{{1, 2}, {3,5},{6,7},{8,10},{12,16}}, new int[]{4,8})));
//        System.out.println(Arrays.deepToString(insert(new int[][]{{1,5}}, new int[]{2,3})));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        merged.add(newInterval);

        while (i < n) {
            merged.add(intervals[i]);
            i++;
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
