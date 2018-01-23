package com.example.java;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Map<String, Integer> phonebook = new HashMap<>();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phonebook.get(s)==null){
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+phonebook.get(s));
            }
        }
    }
}
