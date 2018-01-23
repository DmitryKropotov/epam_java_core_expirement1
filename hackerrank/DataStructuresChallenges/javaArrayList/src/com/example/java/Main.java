package com.example.java;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d;
        List<List<Integer>> datas = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> numbers = new ArrayList<>();
            d = sc.nextInt();
            for(int j=0; j<d; j++){
                numbers.add(j, sc.nextInt());
            }
            datas.add(i, numbers);
        }
        int queries = sc.nextInt();
        int line;
        int position;
        for(int i=0; i<queries; i++){
            line = sc.nextInt();
            position = sc.nextInt();
            if(datas.get(line-1).size()<position){
                System.out.println("ERROR!");
            } else {
                System.out.println(datas.get(line-1).get(position-1));
            }
        }
        sc.close();
    }
}
