package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(bunnyEars(4));
    }

    public static int bunnyEars(int bunnies) {
        if(bunnies==0){
            return 0;
        }
        return bunnyEars(bunnies-1)+2;
    }
}
