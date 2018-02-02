package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for(int i=0; i<m; i++){
            String command = in.next();
            int setToChange = in.nextInt();
            int secondParameter = in.nextInt();
            switch(command){
                case("AND"):
                    if(setToChange==1 && secondParameter==2){
                        b1.and(b2);
                    } else if(setToChange==2 && secondParameter==1){
                        b2.and(b1);
                    }
                    break;
                case("OR"):
                    if(setToChange==1 && secondParameter==2){
                        b1.or(b2);
                    } else if(setToChange==2 && secondParameter==1){
                        b2.or(b1);
                    }
                    break;
                case("XOR"):
                    if(setToChange==1 && secondParameter==2){
                        b1.xor(b2);
                    } else if(setToChange==2 && secondParameter==1){
                        b2.xor(b1);
                    }
                    break;
                case("FLIP"):
                    if(secondParameter>n-1){
                        secondParameter=n;
                    }
                    if(setToChange==1){
                        b1.flip(secondParameter);
                    } else{
                        b2.flip(secondParameter);
                    }
                    break;
                case("SET"):
                    if(secondParameter>n-1){
                        secondParameter=n;
                    }
                    if(setToChange==1){
                        b1.set(secondParameter);
                    } else{
                        b2.set(secondParameter);
                    }
            }
            //counting amount of set values in b1 and b2
            int setInB1 = 0;
            int setInB2= 0;
            for(int j=0; j<Math.max(b1.size(), b2.size()); j++){
                if(b1.get(j)){
                    setInB1++;
                }
                if(b2.get(j)){
                    setInB2++;
                }
            }
            System.out.println(setInB1+" "+setInB2);
        }
        in.close();
    }
}
