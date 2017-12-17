package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(startWord("Hello", "H"));
    }

    public static String startWord(String str, String word) {
        if(str.length()==0){//preventing stringOutOfRangeExeption
            return "";
        }

        if(str.charAt(0)!=word.charAt(0)){//putting first char from the string in the front of
            word=str.substring(0, 1)+word.substring(1, word.length());//word in case of
        }//their variance

        if(str.startsWith(word)){
            return word;
        }
        else{
            return "";
        }
    }

}
