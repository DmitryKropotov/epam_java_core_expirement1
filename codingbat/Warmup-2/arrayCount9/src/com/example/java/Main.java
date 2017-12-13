package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1, 2, 9, 8, 9};
        System.out.println(arrayCount9(nums));
    }

    public static int arrayCount9(int[] nums) {
        int counterOf9=0;
        for(int i:nums){
            if(i==9){
                counterOf9++;
            }
        }
        return counterOf9;
    }
}
