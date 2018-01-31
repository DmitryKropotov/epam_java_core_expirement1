package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(15);
        System.out.println(noTeen(nums));
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n->n>=13 && n<=19);
        return nums;
    }
}
