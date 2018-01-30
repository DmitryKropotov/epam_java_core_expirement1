package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            //putting num to HashMap or increasing its value (amount in the subarray) to 1
            if(!counter.containsKey(num)){
                counter.put(num, 1);
            } else {
                int amountOfNum = counter.get(num);
                counter.put(num, amountOfNum+1);
            }
        }

        int maxAmountOfUniqueElementsInSubarray = counter.size();
        for(int i = 0; i < n-m; i++){
            int removedElement = deque.removeFirst();//removing first element
            //removing removed element from HashMap or decreasing its value (amount in the subarray) to 1
            int oldAmountOfRemovedElement = counter.get(removedElement);
            if(oldAmountOfRemovedElement!=1){
                counter.put(removedElement, oldAmountOfRemovedElement-1);
            } else {
                counter.remove(removedElement);
            }
            int num = in.nextInt();
            deque.addLast(num);
            //putting num to HashMap or increasing its value (amount in the subarray) to 1
            if(!counter.containsKey(num)){
                counter.put(num, 1);
            } else {
                int amountOfNum = counter.get(num);
                counter.put(num, amountOfNum+1);
            }
            //redefining of amountOfUniqueElementsInSubarray
            if(maxAmountOfUniqueElementsInSubarray<counter.size()){
                maxAmountOfUniqueElementsInSubarray = counter.size();
            }
        }
        in.close();
        //printing result
        System.out.println(maxAmountOfUniqueElementsInSubarray);
    }
}
