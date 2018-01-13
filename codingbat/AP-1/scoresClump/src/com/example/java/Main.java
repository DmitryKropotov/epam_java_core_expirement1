package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 100, 3};
        System.out.println(scoresClump(a));
    }

    public static boolean scoresClump(int[] scores) {
        final int LENGTH_OF_ARRAY = scores.length;
        for(int i=0; i<LENGTH_OF_ARRAY-2; i++){
            if(Math.abs(scores[i]-scores[i+1])<=2 && Math.abs(scores[i]-scores[i+2])<=2 && Math.abs(scores[i+1]-scores[i+2])<=2){
                return true;
            }
        }
        return false;
    }
}


