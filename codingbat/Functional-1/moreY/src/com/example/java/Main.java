package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        System.out.println(moreY(strings));
    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(n->"y"+n+"y");
        return strings;
    }

}
