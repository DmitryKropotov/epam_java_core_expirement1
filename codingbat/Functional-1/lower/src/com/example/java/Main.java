package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Zenit");
        strings.add("AAdddaadsa");
        strings.add("dfDDsd");
        System.out.println(lower(strings));
    }

    public static List<String> lower(List<String> strings) {
        strings.replaceAll(n->n.toLowerCase());
        return strings;
    }
}
