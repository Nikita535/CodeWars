package com.company.LeetCode.ArraysAndHashing.Medium.ValidSudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
//        System.out.println(isValidSudoku(new char[][]{
//                {'6','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}}));

//        System.out.println(isValidSudoku(new char[][]{
//                {'5','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}}));

        System.out.println(isValidSudoku(new char[][]{
                {'.','.','5','.','.','.','.','.','6'},
                {'.','.','.','.','1','4','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','9','2','.','.'},
                {'5','.','.','.','.','2','.','.','.'},
                {'.','.','.','.','.','.','.','3','.'},
                {'.','.','.','5','4','.','.','.','.'},
                {'3','.','.','.','.','.','4','2','.'},
                {'.','.','.','2','7','.','6','.','.'}}));
    }

    public static boolean isValidSudoku(char[][] board) {
        int columnCount = board.length;
        int rowCount = board[0].length;
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();


        for (int i = 0; i < columnCount; i++) {
            set1.clear();
            char[] currentRow = board[i];
            for (int j = 0; j < currentRow.length; j++) {
                if(board[i][j]=='.') continue;
                if (set1.add(board[i][j])){
                    continue;
                }else{
                    return false;
                }
            }
        }

        set1.clear();

        for (int i = 0; i < rowCount; i++) {
            set1.clear();
            for (int j = 0; j <columnCount; j++) {
                if(board[j][i]=='.') continue;
                if(set1.add(board[j][i])) continue;
                else return false;
            }
        }

        set1.clear();
        for (int i = 0; i < columnCount; i++) {
            if(i%3==0 && i!=0){
                set1.clear();
                set2.clear();
                set3.clear();
            }
            for (int j = 0; j < rowCount; j++) {
                if(board[i][j]=='.') continue;
                if(j<3 && !set1.contains(board[i][j])) {
                    set1.add(board[i][j]);
                    continue;
                }
                if(j>=3 && j<6 && !set2.contains(board[i][j])) {
                    set2.add(board[i][j]);
                    continue;
                }
                if(j>=6 && !set3.contains(board[i][j])) {
                    set3.add(board[i][j]);
                    continue;
                }
                return false;
            }
        }


        return true;
    }
}
