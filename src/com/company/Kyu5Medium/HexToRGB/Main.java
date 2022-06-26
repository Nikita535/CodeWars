package com.company.Kyu5Medium.HexToRGB;

import java.util.*;
public class Main {

    public static int[] hexStringToRGB(String hex) {

        List<Integer> list=new ArrayList<>();
        int[] RGB=new int[3];

        String red=hex.substring(1,3);
        String green=hex.substring(3,5);
        String blue=hex.substring(5);

        list.add(Integer.parseInt(red,16));
        list.add(Integer.parseInt(green,16));
        list.add(Integer.parseInt(blue,16));

        for (int i = 0; i < 3; i++) {
            RGB[i]=list.get(i);
        }

        return RGB;
    }

}