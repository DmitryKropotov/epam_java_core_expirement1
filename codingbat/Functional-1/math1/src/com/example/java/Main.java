package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(8);
        System.out.println(math1(nums));
    }

    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n->10*(n+1));
        return nums;
    }
}
