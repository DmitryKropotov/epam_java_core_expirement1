package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 3}, b = {10, 11};
        int[] result = front11(a, b);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] front11(int[] a, int[] b) {
        if(a.length==0 && b.length==0){
            int[] result = new int[0];
            return result;
        }

        if(a.length!=0 && b.length==0){
            int[] result = {a[0]};
            return result;
        }

        if(a.length==0 && b.length!=0){
            int[] result = {b[0]};
            return result;
        }

        int[] result = {a[0], b[0]};
        return result;
    }
}
