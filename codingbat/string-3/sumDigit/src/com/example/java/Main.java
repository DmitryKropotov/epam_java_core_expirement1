package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits("aa1bc2d3"));
    }

    public static int sumDigits(String str) {
        int sum = 0;
        final int LENGTH_OF_STR = str.length();
        for(int i=0; i<LENGTH_OF_STR; i++){
            if(Character.isDigit(str.charAt(i))){
                sum = sum+Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }
}
