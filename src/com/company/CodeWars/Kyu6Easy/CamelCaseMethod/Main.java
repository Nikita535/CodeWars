package com.company.CodeWars.Kyu6Easy.CamelCaseMethod;

import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static String camelCase(String str) {
        if (str.isEmpty()){
            return "";
        }
        return Arrays.stream(str.replaceAll(" +", " ").trim().split(" ")).
                map(x->Character.toUpperCase(x.charAt(0))+x.substring(1).toLowerCase()).
                collect(Collectors.joining());
    }

}