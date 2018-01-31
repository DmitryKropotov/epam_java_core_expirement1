package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(19);
        nums.add(18);
        nums.add(109);
        System.out.println(no9(nums));
    }

    public static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n->n%10==9);
        return nums;
    }
}
