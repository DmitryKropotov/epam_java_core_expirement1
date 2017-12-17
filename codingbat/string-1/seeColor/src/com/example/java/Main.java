package com.example.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(seeColor("redxx"));
    }

    public static String seeColor(String str) {
        String result;
        if (str.startsWith("red")) {
            result = "red";
        } else if (str.startsWith("blue")) {
            result = "blue";
        } else {
            result = "";
        }

        return result;
    }
}
