package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(makeBricks(2, 5, 24));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        for(int i=goal/5; i>=0; i--){
            if(big>=i && small>=goal%5+5*(goal/5-i)){
                return true;
            }
        }
        return false;
    }
}
