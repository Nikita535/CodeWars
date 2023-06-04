package com.company.CodeWars.Kyu4Hard.PyramidLongestSlideDown;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestSlideDown(new int[][]{{3},{7,4},{2,4,6},{8,5,9,3}}));
    }

    public static int longestSlideDown(int[][] pyramid) {
        int[][] max = pyramid;

        //идем с предпоследней строки и сравниваем с диагональными числами нижней
        for (int y = pyramid.length-2; y >= 0; y--) {
            //идём по строкам справа налево
            for (int x = 0; x < pyramid[y].length; x++) {
                //менчем значения ячеек на максимальный из суммы с диагональными элементами
                //тем самым в вершине пирамиды образуется максимальная длина
                max[y][x] = pyramid[y][x] + Math.max(pyramid[y + 1][x], pyramid[y + 1][x + 1]);
            }
        }

        return max[0][0];
    }
}
