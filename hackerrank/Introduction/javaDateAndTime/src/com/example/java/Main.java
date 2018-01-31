package com.example.java;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static String getDay(String day, String month, String year) {
        /*
         * Write your code here.
         */
        LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        String dayOfWeek = localDate.getDayOfWeek().toString();
        return dayOfWeek;
    }


    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}
