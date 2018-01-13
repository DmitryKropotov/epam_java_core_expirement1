package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] a = {"a", "b", "c", "d"};
        String[] result = wordsFront(a, 3);
        for (String i: result){
            System.out.println(i);
        }
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for(int i=0; i<n; i++){
            result[i] = words[i];
        }
        System.arraycopy(words, 0, result, 0, n);
        return result;
    }
}
