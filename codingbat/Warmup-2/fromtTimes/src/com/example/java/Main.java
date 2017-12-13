package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(frontTimes("Chocolate", 2));
    }

    public static String frontTimes(String str, int n) {
        String front;
        String result="";
        if(str.length()<3){
            front=str;
        }
        else{
            front=str.substring(0, 3);
        }
        for(int i=0; i<n; i++){
            result=result+front;
        }
        return result;
    }
}
