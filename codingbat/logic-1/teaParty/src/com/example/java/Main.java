package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(teaParty(6, 8));
    }

    public static int teaParty(int tea, int candy) {
        if(tea>=5 && candy>=5 && (tea>=2*candy || candy>=2*tea)){
            return 2;
        }
        else if(tea>=5 && candy>=5){
            return 1;
        }
        else{
            return 0;
        }
    }
}
