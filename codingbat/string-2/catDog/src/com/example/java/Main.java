package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(catDog("dogandcat"));
    }

    public static boolean catDog(String str) {
        int cat=0, dog=0;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+3).equals("cat")){
                cat++;
                i=i+2;
                continue;//preventing StringIndexOutOfBoundsException
            }
            if(str.substring(i, i+3).equals("dog")){
                dog++;
                i=i+2;
            }
        }

        return cat==dog;
    }
}
