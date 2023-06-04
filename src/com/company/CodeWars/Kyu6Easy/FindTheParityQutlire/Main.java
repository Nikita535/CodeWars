package com.company.CodeWars.Kyu6Easy.FindTheParityQutlire;

import java.util.*;

public class Main{
    static int find(int[] integers){
        List<Integer> result=new ArrayList<>();
        var even= Arrays.stream(integers).filter(x -> x % 2 == 0).boxed().toList();
        var odd = Arrays.stream(integers).filter(x -> x % 2 != 0).boxed().toList();

        return even.size()==1 ? even.get(0):odd.get(0);
    }
}
