package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(dateFashion(10, 20));
    }

    public static int dateFashion(int you, int date) {
        if(you<=2 || date<=2) return 0;

        if(you>=8 || date>=8) return 2;

        return 1;
    }
}
