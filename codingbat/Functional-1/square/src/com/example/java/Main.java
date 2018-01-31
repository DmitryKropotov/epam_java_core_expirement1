package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(10);
        System.out.println(square(nums));
    }

    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n->n*n);
        return nums;
    }
}
