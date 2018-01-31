package com.example.java;

import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        final Locale INDIA = new Locale("en", "IN");

        final NumberFormat AMERICAN = NumberFormat.getCurrencyInstance(Locale.US);
        final NumberFormat CHINESE = NumberFormat.getCurrencyInstance(Locale.CHINA);
        final NumberFormat FRENCH = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        final NumberFormat INDIAN = NumberFormat.getCurrencyInstance(INDIA);
        String us = AMERICAN.format(payment);
        String india = INDIAN.format(payment);
        String china = CHINESE.format(payment);
        String france = FRENCH.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
