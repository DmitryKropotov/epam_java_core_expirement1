package com.example.java;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime{
    void checkPrime(int... numbers){
        boolean noPreviousPrimes = true;
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] == 2) {//2 is prime and it can't be checked in general loop
                System.out.print(noPreviousPrimes ? numbers[i] : " " + numbers[i]);
                noPreviousPrimes = false;
            }
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    break;
                } else if (j == numbers[i] - 1) {
                    System.out.print(noPreviousPrimes ? numbers[i] : " " + numbers[i]);
                    noPreviousPrimes = false;
                }
            }
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System in = new System.in;
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
