package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2, 3}, b={3, 4, 5};
        System.out.println(start1(a, b));
    }

    public static int start1(int[] a, int[] b) {
        int result=0;

        if(a.length!=0 && a[0]==1){
            result++;
        }

        if(b.length!=0 && b[0]==1){
            result++;
        }

        return result;
    }
}
