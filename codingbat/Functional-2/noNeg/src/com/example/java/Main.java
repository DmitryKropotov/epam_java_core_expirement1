package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(-1);
        nums.add(3);
        System.out.println(noNeg(nums));
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n->n<0);
        return nums;
    }
}
