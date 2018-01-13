package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] words = {"ss", "dsfds", "12", "dssd"};
        System.out.println(wordsCount(words, 2));
    }

    public static int wordsCount(String[] words, int len) {
        int counter = 0;
        for(String i: words){
            if(i.length()==len){
                counter++;
            }
        }
        return counter;
    }
}
