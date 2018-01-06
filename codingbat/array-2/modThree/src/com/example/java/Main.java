package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {2, 4, 2, 5};
        System.out.println(modThree(a));
    }

    public static boolean modThree(int[] nums) {
        final int LENGTH_OF_NUMS = nums.length;
        if(LENGTH_OF_NUMS<3){
            return false;
        }
        boolean even = nums[0]%2==0 ? true: false;
        int counter = 1;
        for(int i = 1; i<LENGTH_OF_NUMS; i++){
            switch (nums[i]%2){
                case 0:
                    if(even){
                        counter++;
                    } else {
                        even = true;
                        counter = 1;
                    }
                    break;
                case 1:
                    if(!even){
                        counter++;
                    } else {
                        even = false;
                        counter = 1;
                    }
                    break;
            }
            if(counter==3){
                return true;
            }
        }
        return false;
    }

}
