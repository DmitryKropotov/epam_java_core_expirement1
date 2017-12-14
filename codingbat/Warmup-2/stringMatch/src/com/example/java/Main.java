package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringMatch("aabbxx", "abbbxx"));
    }

    public static int stringMatch(String a, String b) {
        final int LENGTH_OF_MIN_STRING=Math.min(a.length(), b.length());
        int count=0;
        for(int i=0; i<LENGTH_OF_MIN_STRING-1; i++){
            if(a.charAt(i)==b.charAt(i) && a.charAt(i+1)==b.charAt(i+1)){
                count++;
            }
            else if(a.charAt(i+1)!=b.charAt(i+1)){
                i++;
            }
        }
        return count;
    }
}
