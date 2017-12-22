package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(wordEnds("abc", "ab"));
    }

    public static String wordEnds(String str, String word) {
        final int LENGTH_OF_STR=str.length(), LENGTH_OF_WORD=word.length();
        String result="";

        if(str.startsWith(word) && LENGTH_OF_WORD<LENGTH_OF_STR){//If str starts with a word and there is at least one char
            //after the word in the str, we add the char, following the appearance of the word, to result
            result=result.concat(String.valueOf(str.charAt(LENGTH_OF_WORD)));
        }

        for(int i=1; i<LENGTH_OF_STR-LENGTH_OF_WORD; i++){//We check, if word begins since i_th char of str from 1st char
            // before (LENGTH_OF_STR-LENGTH_OF_WORD-1)th char in the loop

            if(str.substring(i, i+LENGTH_OF_WORD).equals(word)){//If word begins, we add one char before and one char after
                //the word to the result
                result=result+String.valueOf(str.charAt(i-1))+String.valueOf(str.charAt(i+LENGTH_OF_WORD));
            }

        }

        if(str.endsWith(word) && LENGTH_OF_WORD<LENGTH_OF_STR){//If str ends with a word and there is at least one char
            //before the word in the str, we add char, followed by the appearance of the word, to result
            result = result.concat(String.valueOf(str.charAt(LENGTH_OF_STR-LENGTH_OF_WORD-1)));
        }

        return result;
    }
}
