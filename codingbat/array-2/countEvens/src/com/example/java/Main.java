package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2,4, 10};
        System.out.println(countEvens(a));
    }

    public static int countEvens(int[] nums) {
        int numberOfEvenInts = 0;
        for(int i: nums){
            if(i%2==0){
                numberOfEvenInts++;
            }
        }

        return numberOfEvenInts;
    }
}
