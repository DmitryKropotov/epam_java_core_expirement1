package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 3, 100, 92, 4};
        int[] result = copyEndy(nums, 4);
        for (int i: result){
            System.out.println(i);
        }
    }

    public static int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int numberOfElementToAddToResult = 0;
        for(int i: nums){
            if(isEndy(i)){
                result[numberOfElementToAddToResult] = i;
                numberOfElementToAddToResult++;
            }
            if(numberOfElementToAddToResult==count){
                break;
            }
        }
        return result;
    }

    static boolean isEndy(int n){
        return (n>=0 && n<=10) || (n>=90 && n<=100);
    }
}
