package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static final int MAXSECOFMIN = 60;
    public static final int MAXSECOFHOUR = 3600;
    public static final int MAXSECOFDAY = 86400;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        seconds = Math.abs(seconds);
        seconds %= MAXSECOFDAY;

        int hour = seconds / MAXSECOFHOUR;
        int min = (seconds - (hour * MAXSECOFHOUR)) / MAXSECOFMIN;
        int sec = seconds - (hour * MAXSECOFHOUR) - (min * MAXSECOFMIN);
        String output = String.format("%d:%02d:%02d", hour,min,sec);
        System.out.println(output);
    }
}
