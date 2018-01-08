package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumNumbers("12xz13 100"));
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        final int LENGTH_OF_STR = str.length();
        for(int i=0; i<LENGTH_OF_STR; i++) {
            if(Character.isDigit(str.charAt(i))){
                int j = i+1;
                while(j<LENGTH_OF_STR && Character.isDigit(str.charAt(j))){
                    j++;
                }
                sum = sum+Integer.parseInt(str.substring(i, j));
                i=j;
            }
        }
        return sum;
    }
}
