package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String nameOfState = sc.nextLine();
        State state = new State();
        switch (nameOfState){
            case "State": state = new State();
                  break;
            case "WestBengal": state = new WestBengal();
                break;
            case "Karnataka": state = new Karnataka();
                break;
            case "AndhraPradesh": state = new AndhraPradesh();
                break;
            default:
                System.out.println("Wrong state");
        }
        Flower flower = state.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

class Flower{
    String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    @Override
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatsYourName(){
        return "Lily";
    }
}

class Lotus extends Flower{
    @Override
    String whatsYourName(){
        return "Lotus";
    }
}

class State{
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends State{
    @Override
    Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}

class Karnataka extends State{
    @Override
    Lotus yourNationalFlower(){
        return new Lotus();
    }
}

class AndhraPradesh extends State{
    @Override
    Lily yourNationalFlower(){
        return new Lily();
    }
}
