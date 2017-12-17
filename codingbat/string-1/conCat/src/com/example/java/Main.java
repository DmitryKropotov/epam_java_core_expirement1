package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(conCat("son", "daughter"));
    }

    public static String conCat(String a, String b) {
        if(a.length()==0){//if there is empty in a, we have to return b and prevent
            return b;//stringOutOfRangeException
        }



        if(b.length()==0){//if there is empty in b, we have to return a and prevent
            return a;//stringOutOfRangeException
        }
//if there is empty in both a and b, "" will be returned, what is their concatenation



        String result=a;
        if(b.charAt(0)==a.charAt(a.length()-1)){
            result=result+b.substring(1, b.length());
        }
        else{
            result=result+b;
        }
        return result;
    }
}
