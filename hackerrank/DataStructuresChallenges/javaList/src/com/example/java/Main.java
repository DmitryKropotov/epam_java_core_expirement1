package com.example.java;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(i, sc.nextInt());
        }
        int numberOfQueries = sc.nextInt();
        String command;
        int index;
        int element;
        for(int i = 0; i<numberOfQueries; i++){
            command = sc.next();
            index = sc.nextInt();
            if(command.equals("Insert")){
                element = sc.nextInt();
                list.add(index, element);
            } else if(command.equals("Delete")){
                list.remove(index);
            }
        }
        sc.close();
        for(int i: list){
            System.out.print(i+" ");
        }
    }
}
