package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] a = {"a", "c", "z"};
        String[] b = {"b", "f", "z"};
        String[] result = mergeTwo(a, b, 3);
        for (String i : result) {
            System.out.println(i);
        }
    }

    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int index = 0;
        while(index<n && a[index].equals(b[index])){
            result[index] = a[index];
            index++;
        }
        if(index==n){
            return result;
        }

        List savedChars = new LinkedList();//Elements of the list of "String" will consist of one char
        if(a[index].compareTo(b[index])>0) {
            result[index] = b[index];
            savedChars.add(a[index]);
        } else if(a[index].compareTo(b[index])<0) {
            result[index] = a[index];
            savedChars.add(b[index]);
        }

        String[] CharsFromArrays = new String[2];
        for(int i=index; i<n; i++){
            if(a[i].compareTo(b[i])<0) {//determination, what char of two arrays is more and what char is less
                CharsFromArrays[0] = a[i];
                CharsFromArrays[1] = b[i];
            }
            else{
                CharsFromArrays[0] = b[i];
                CharsFromArrays[1] = a[i];
            }
            if(CharsFromArrays[0].compareTo(savedChars.get(0).toString())<0){//determination, what char of  CharsFromArray[0] and savedChars[0] is coming to result
                result[i] = CharsFromArrays[0];
                savedChars = addElementsToSortedList(savedChars, CharsFromArrays[1]);
            } else{
                result[i] = savedChars.get(0).toString();
                savedChars.remove(0);
                if(CharsFromArrays[0]==result[i] && CharsFromArrays[1]!=result[i]){
                    savedChars = addElementsToSortedList(savedChars, CharsFromArrays[1]);
                } else if(CharsFromArrays[0]!=result[i] && CharsFromArrays[1]==result[i]){
                    savedChars = addElementsToSortedList(savedChars, CharsFromArrays[0]);
                } else if(CharsFromArrays[0]!=result[i] && CharsFromArrays[1]!=result[i]){
                    savedChars = addElementsToSortedList(savedChars, CharsFromArrays);
                }
            }
        }
        return result;
    }

    static List addElementsToSortedList(List sortedList, String... elements){
        int beginningOfNewCircle = 0;
        for(String elementToAdd: elements){
            if(beginningOfNewCircle==sortedList.size()){
                sortedList.add(sortedList.size(), elementToAdd);
                continue;
            }
            for(int i=beginningOfNewCircle; i<sortedList.size(); i++){
                if(sortedList.get(i).toString().compareTo(elementToAdd)>0){
                    sortedList.add(i, elementToAdd);
                }
                if(i==sortedList.size()-1 && elementToAdd.compareTo(sortedList.get(i).toString())!=0){
                    sortedList.add(++i, elementToAdd);
                }
                if(elementToAdd.compareTo(sortedList.get(i).toString())==0){
                    beginningOfNewCircle = i+1;
                    break;
                }
            }
        }
        return sortedList;
    }
}

