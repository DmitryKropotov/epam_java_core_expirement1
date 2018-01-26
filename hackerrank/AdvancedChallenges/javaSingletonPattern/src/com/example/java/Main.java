package com.example.java;

import java.util.Scanner;

class Singleton{
    public String str;

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getSingleInstance(){
        return INSTANCE;
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String fromOutsideWorld = sc.nextLine();
        Singleton INSTANCE = Singleton.getSingleInstance();
        INSTANCE.str = fromOutsideWorld;
        System.out.println("Hello I am a singleton! Let me say " + INSTANCE.str + " to you");
    }
}
