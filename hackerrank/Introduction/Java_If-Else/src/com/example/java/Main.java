package com.example.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1 || n>=6 && n<=20){
            ans = "Weird";
        }
        else{
            //Complete the code
            ans = "Not Weird";
        }
        System.out.println(ans);

    }
}
