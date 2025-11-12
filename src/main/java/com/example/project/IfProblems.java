package com.example.project;

public class IfProblems {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday) { speed -= 5; }
        if(speed > 80) { return 2; }
        if(speed > 60) { return 1; }
        return 0;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        return ((n > 0) && (n < 11)) != outsideMode;
    }

    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}
