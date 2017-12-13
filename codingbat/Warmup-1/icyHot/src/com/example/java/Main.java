package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(icyHot(1, 1));
    }

    public static boolean icyHot(int temp1, int temp2) {
        return(temp1<0 && temp2>100 || temp1>100 && temp2<0);
    }
}
