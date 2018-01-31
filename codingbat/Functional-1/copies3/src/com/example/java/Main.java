package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        System.out.println(copies3(strings));
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(n->n+n+n);
        return strings;
    }
}
