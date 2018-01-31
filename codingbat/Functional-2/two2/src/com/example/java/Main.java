package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(16);
        nums.add(12);
        System.out.println(two2(nums));
    }

    public static List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> 2*n);
        nums.removeIf(n -> n%10==2);
        return nums;
    }
}
