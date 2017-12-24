package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(roundSum(12, 13, 8));
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public static int round10(int num){
        final int LAST_DIGiT_OF_NUM = num%10;
        if(LAST_DIGiT_OF_NUM>=5){
            return num+(10-LAST_DIGiT_OF_NUM);
        }
        else{
            return num-LAST_DIGiT_OF_NUM;
        }
    }
}
