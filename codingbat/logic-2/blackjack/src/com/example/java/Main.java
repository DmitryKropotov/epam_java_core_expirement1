package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(blackjack(22, 20));
    }

    public static int blackjack(int a, int b) {
        if(a<=21 && (a>=b || b>21)){
            return a;
        }
        else if(b<=21 && (b>=a || a>21)){
            return b;
        }
        else{
            return 0;
        }
    }
}
