package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(front3("Exit"));
    }

    public static String front3(String str) {
        String front;
        if(str.length()<3){
            front=str;
        }
        else{
            front=str.substring(0, 3);
        }
        return front+front+front;
    }
}
