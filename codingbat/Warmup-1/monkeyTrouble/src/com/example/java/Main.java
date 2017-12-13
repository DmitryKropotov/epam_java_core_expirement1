package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(monkeyTrouble(true, true));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

}
