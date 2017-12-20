package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(mixString("hi", "hello"));
    }

    public static String mixString(String a, String b) {
        final int MAX_LENGTH=Math.max(a.length(), b.length());
        final int MIN_LENGTH=Math.min(a.length(), b.length());
        String result="";

        for(int i = 0; i<MAX_LENGTH; i++){
            if(i<MIN_LENGTH){
                result=result+a.substring(i, i+1)+b.substring(i, i+1);
            }
            else if(a.length()>b.length()){
                result=result+a.substring(i, i+1);
            }
            else{
                result=result+b.substring(i, i+1);
            }
        }

        return result;
    }
}
