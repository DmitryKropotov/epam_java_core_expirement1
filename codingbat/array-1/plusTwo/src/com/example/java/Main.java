package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2}, b={3, 5};
        int[] result=plusTwo(a, b);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] result={a[0], a[1], b[0], b[1]};
        return result;
    }
}
