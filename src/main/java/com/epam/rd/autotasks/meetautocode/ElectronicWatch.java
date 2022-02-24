package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static final int SEC_OF_MIN = 60;
    public static final int SEC_OF_HOUR = 3600;
    public static final int SEC_OF_DAY = 86400;
    public static final String OUTPUT_FORMAT = "%d:%02d:%02d";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        seconds = Math.abs(seconds);
        seconds %= SEC_OF_DAY;

        int hour = seconds / SEC_OF_HOUR;
        int min = (seconds - (hour * SEC_OF_HOUR)) / SEC_OF_MIN;
        int sec = seconds - (hour * SEC_OF_HOUR) - (min * SEC_OF_MIN);
        String output = String.format(OUTPUT_FORMAT, hour,min,sec);
        System.out.println(output);
    }
}
