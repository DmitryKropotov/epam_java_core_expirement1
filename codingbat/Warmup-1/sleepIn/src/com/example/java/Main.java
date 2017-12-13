package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sleepIn(true, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }
}
