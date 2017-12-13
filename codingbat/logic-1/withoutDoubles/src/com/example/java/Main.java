package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(withoutDoubles(1, 2, false));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1==die2 && die1!=6){
            return die1+die2+1;
        }
        if(noDoubles && die1==die2 && die1==6){
            return 7;
        }
        return die1+die2;
    }
}
