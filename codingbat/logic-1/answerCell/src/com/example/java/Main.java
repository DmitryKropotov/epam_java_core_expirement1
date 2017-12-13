package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(answerCell(true, false, true));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isAsleep && !isMorning || !isAsleep && isMorning && isMom);
    }
}
