package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        SingletonChecker checker = SingletonChecker.getSingleInstance();
        outer:
        while (sc.hasNext()) {
            stack.clear();
            String input=sc.next();
            //Complete the code
            for(int i=0; i<input.length(); i++){
                char symbol = input.charAt(i);
                if(symbol=='(' || symbol=='{' || symbol=='['){
                    stack.push(symbol);
                } else if(symbol==')' || symbol=='}' || symbol==']') {
                    if(stack.empty()){
                        System.out.println("false");
                        continue outer;
                    }
                    if (checker.checkCouple(symbol, stack.peek())) {
                        stack.pop();
                    }
                }
            }
            System.out.println(stack.isEmpty());
        }
        sc.close();
    }

    static class SingletonChecker {

        private HashMap<Character, Character> brackets = new HashMap<>();

        private SingletonChecker(){
            brackets.put('(', ')');
            brackets.put('{', '}');
            brackets.put('[', ']');
        };

        private static final SingletonChecker INSTANCE = new SingletonChecker();

        public boolean checkCouple(char symbol1, char symbol2){
            return symbol1 == brackets.get(symbol2);
        }

        public static SingletonChecker getSingleInstance() {
            return INSTANCE;
        }

    }
}