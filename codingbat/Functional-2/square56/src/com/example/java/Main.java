package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(5);
        nums.add(6);
        System.out.println(square56(nums));
    }

    public static List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> n*n+10);
        nums.removeIf(n -> n%10==5 || n%10==6);
        return nums;
    }
}
