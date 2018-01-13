package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] key = {"a", "a", "b", "b"};
        String[] answers = {"a", "c", "b", "c"};
        System.out.println(scoreUp(key, answers));
    }

    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for(int i=0; i<key.length; i++){
            if(key[i].equals(answers[i])){
                score+=4;
            } else if(!answers[i].equals("?")){
                score--;
            }
        }
        return score;
    }
}
