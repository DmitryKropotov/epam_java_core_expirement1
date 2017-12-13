package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(caughtSpeeding(60, true));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if(!isBirthday && speed<=60 || isBirthday && speed<=65){
            return 0;
        }
        else if(!isBirthday && speed>=61 && speed<=80 || isBirthday && speed>=66 && speed<=85){
            return 1;
        }
        else return 2;
    }
}
