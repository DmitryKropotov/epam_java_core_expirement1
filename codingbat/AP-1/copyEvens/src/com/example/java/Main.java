package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 3, 4, 5, 8,10};
        int[] result = copyEvens(nums, 2);
        for (int i: result) {
            System.out.println(i);
        }
    }

    public static int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int numberOfElementToAddToResult = 0;
        for(int i: nums){
            if(i%2==0){
                result[numberOfElementToAddToResult] = i;
                numberOfElementToAddToResult++;
            }
            if(numberOfElementToAddToResult==count){
                break;
            }
        }
        return result;
    }
}
