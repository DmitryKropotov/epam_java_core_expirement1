package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(parrotTrouble(true, 1));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour<7 || hour>20);
    }
}
