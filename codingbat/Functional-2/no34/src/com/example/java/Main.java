package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aza");
        strings.add("aaaa");
        strings.add("sdsdadas");
        System.out.println(no34(strings));
    }

    public static List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length()==3 || n.length()==4);
        return strings;
    }
}
