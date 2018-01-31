package com.example.java;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        System.out.println(addStar(strings));
    }

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(n->n+"*");
        return strings;
    }
}
