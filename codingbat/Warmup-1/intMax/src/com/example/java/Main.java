package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(intMax(9, 3, 3));
    }

    public static int intMax(int a, int b, int c) {
        int[] arrayOfNumbers={a, b, c};
        int maxNumber=a;
        for (int i:arrayOfNumbers) {
            if(i>maxNumber){
                maxNumber=i;
            }
        }
        return maxNumber;
    }
}
