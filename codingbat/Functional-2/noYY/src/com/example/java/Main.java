package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abs");
        strings.add("yya");
        strings.add("aay");
        System.out.println(noYY(strings));
    }

    public static List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n+"y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }
}
