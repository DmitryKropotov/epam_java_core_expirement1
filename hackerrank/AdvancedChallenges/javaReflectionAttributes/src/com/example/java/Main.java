package com.example.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
	// write your code here
        Class student = Student.class;//~~~Complete this line~~~;
        Method[] methods = student.getDeclaredMethods();//~~~Complete this line~~~;

        ArrayList<String> methodList = new ArrayList<>();
        for(Method nextMethod: methods/*~~~Complete this line~~~*/){
            methodList.add(nextMethod.getName()/*~~~Complete this line~~~*/);
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

    class Student{
        private void getName(){}

        private void getID(){}
    }
}
