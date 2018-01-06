package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        int[] b = {1, 3, 10, 2};
        System.out.println(matchUp(a, b));
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        final int LENGTH_OF_ARRAYS = nums1.length;
        for(int i = 0; i<LENGTH_OF_ARRAYS; i++){
            if(Math.abs(nums1[i]-nums2[i])<=2 && nums1[i]!=nums2[i]){
                counter++;
            }
        }
        return counter;
    }
}
