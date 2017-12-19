package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2, 3};
        int[] b={4, 5, 6};
        int[] result=middleWay(a, b);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] result = {a[1], b[1]};
        return result;
    }
}
