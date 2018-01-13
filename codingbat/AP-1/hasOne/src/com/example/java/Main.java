package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasOne(24));
    }

    public static boolean hasOne(int n) {
        do{
            if(n%10==1){
                return true;
            }
            n=n/10;
        }while(n!=0);
        return false;
    }
}
