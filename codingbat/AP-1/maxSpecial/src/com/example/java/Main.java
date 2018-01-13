package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {10, 3, 100};
        int[] b = {20, 42,30};
        System.out.println(scoresSpecial(a, b));
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return findMaxSpecial(a)+findMaxSpecial(b);
    }

    static int findMaxSpecial(int[] a){
        int maxSpecial = 0;
        for(int i: a){
            if(i%10==0 && i>maxSpecial){
                maxSpecial = i;
            }
        }
        return maxSpecial;
    }
}
