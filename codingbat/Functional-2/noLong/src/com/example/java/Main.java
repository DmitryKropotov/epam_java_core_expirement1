package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaaaaa");
        strings.add("asa");
        System.out.println(noLong(strings));
    }

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length()>=4);
        return strings;
    }
}
