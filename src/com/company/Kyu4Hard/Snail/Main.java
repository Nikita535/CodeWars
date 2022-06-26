package com.company.Kyu4Hard.Snail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(snail(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}})));
    }
    public static int[] snail(int[][] array) {
        int w=array[0].length;
        int h=array.length;
        int startCol=0;
        int endCol=w-1;
        int startRow=0;
        int endRow=h-1;

        List<Integer> res=new ArrayList<>();

        while(startCol<=endCol && startRow<=endRow){
            for (int i = startCol; i <=endCol ; i++) {
                res.add(array[startRow][i]);
            }
            startRow++;
            for (int j = startRow; j <=endRow ; j++) {
                res.add(array[j][endCol]);
            }
            endCol--;
            for (int i = endCol; i >=startCol ; i--) {
                res.add(array[endRow][i]);
            }
            endRow--;
            for (int i = endRow; i >=startRow ; i--) {
                res.add(array[i][startCol]);
            }
            startCol++;
        }
        return  res.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
