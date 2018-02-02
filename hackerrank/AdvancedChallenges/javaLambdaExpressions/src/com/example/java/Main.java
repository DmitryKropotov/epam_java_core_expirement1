package com.example.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    PerformOperation isOdd(){
        return n-> n%2==1;
    }

    PerformOperation isPrime(){
        return n-> {
            if(n==2){
                return true;
            }
            for(int i=2; i<n; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        };
    }

    PerformOperation isPalindrome(){
        return n->{
            ArrayList<Integer> numbers = new ArrayList<>();
            do {
                numbers.add(n%10);
                n=n/10;
            }while (n!=0);
            for(int i=0; i<numbers.size()/2; i++){
                if(numbers.get(i)!=numbers.get(numbers.size()-1-i)){
                    return false;
                }
            }
            return true;
        };
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
