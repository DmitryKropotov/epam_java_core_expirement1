package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(triangle(4));
    }

    public static int triangle(int rows) {
        if(rows==0){
            return 0;
        }
        return rows + triangle(rows-1);
    }
}
