package com.company.CodeWars.Kyu5Medium.HumanReadableTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeReadable(3900));
//        makeReadable(86399);
    }
    public static String makeReadable(int seconds) {
        long hour = seconds / 3600,
                min = seconds / 60 % 60,
                sec = seconds  % 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
