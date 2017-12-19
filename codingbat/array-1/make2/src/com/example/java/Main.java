package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1}, b = {4, 5};
        int[]  result=make2(a, b);
        for (int i: result){
            System.out.println(i);
        }
    }

    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        switch(a.length){

            case(0): result[0] = b[0];
            result[1] = b[1];
                break;

            case(1): result[0] = a[0];
            result[1] = b[0];
            break;

            default: result[0] = a[0];
             result[1] = a[1];
        }
        return result;
    }
}
