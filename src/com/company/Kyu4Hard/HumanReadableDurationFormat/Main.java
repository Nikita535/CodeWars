package com.company.Kyu4Hard.HumanReadableDurationFormat;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(formatDuration(32423432));
    }

    public static String formatDuration(int seconds) {
        return seconds == 0 ? "now" :
                Arrays.stream(
                                new String[]{
                                        formatTime("year",  (seconds / 31536000)),
                                        formatTime("day",   (seconds / 86400)%365),
                                        formatTime("hour",  (seconds / 3600)%24),
                                        formatTime("minute",(seconds / 60)%60),
                                        formatTime("second",(seconds%3600)%60)})
                        .filter(e-> !Objects.equals(e, ""))
                        .collect(Collectors.joining(", "))
                        .replaceAll(", (?!.+,)", " and ");
    }
    public static String formatTime(String s, int time){
        return time==0 ? "" : Integer.toString(time)+ " " + s + (time==1?"" : "s");
    }
}
