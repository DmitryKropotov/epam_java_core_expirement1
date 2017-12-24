package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(makeChocolate(2, 4, 16));
    }

    public static int makeChocolate(int small, int big, int goal) {
        if(5*big+small<goal) {//total kilos of big and small are not enough
            return -1;
        }

        if(small<goal%5) {//total kilos of big and small is enough, but remainder of the division goal by 5 is big
            return -1;
        }

        if(5*big>=goal) {//total kilos of big is more, than goal
            return goal%5;
        }

        return goal-5*big;

    }

}
