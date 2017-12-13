package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(cigarParty(40, true));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (!isWeekend && cigars>=40 && cigars<=60) || (isWeekend && cigars>=40);
    }
}
