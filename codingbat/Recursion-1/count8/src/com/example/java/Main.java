package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(count8(88182));
    }

    public static int count8(int n) {
        if(n==8){
            return 1;
        }
        if(n<10 && n!=8){
            return 0;
        }
        if(n%10==8){
            if(n%100==88){
                return 2+count8(n/10);
            } else {
                return 1+count8(n/10);
            }
        }
        return count8(n/10);
    }
}
