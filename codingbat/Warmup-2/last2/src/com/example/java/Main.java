package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(last2("hixxhi"));
    }

    public static int last2(String str) {
        if(str.length()<=3){
            return 0;
        }
        String last2Chars=str.substring(str.length()-2, str.length());
        int counter=0;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+2).equals(last2Chars)){
                counter++;
            }
        }
        return counter;
    }
}
