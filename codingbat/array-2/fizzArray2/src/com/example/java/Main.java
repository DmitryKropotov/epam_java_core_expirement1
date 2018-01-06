package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] result = fizzArray2(3);
        for (String i: result) {
            System.out.println(i);
        }
    }

    public static String[] fizzArray2(int n) {
        String[] result = new String[n];
        for(int i=0; i<n; i++){
            result[i]=String.valueOf(i);
        }
        return result;
    }
}
