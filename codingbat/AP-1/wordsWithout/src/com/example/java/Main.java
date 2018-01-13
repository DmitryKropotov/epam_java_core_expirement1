package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] words = {"aa", "c", "aa", "d"};
        String[] result = wordsWithout(words, "aa");
        for(String i: result){
            System.out.println(i);
        }
    }

    public static String[] wordsWithout(String[] words, String target) {
        int amountOfTargets = 0;
        for(String i: words){
            if(i.equals(target)){
                amountOfTargets++;
            }
        }
        String[] result = new String[words.length-amountOfTargets];
        int numberOfElementToAdd = 0;
        for(String i: words){
            if(!i.equals(target)){
                result[numberOfElementToAdd] = i;
                numberOfElementToAdd++;
            }
        }
        return result;
    }
}
