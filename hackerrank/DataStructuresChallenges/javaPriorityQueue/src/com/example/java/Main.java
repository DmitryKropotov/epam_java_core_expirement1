package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;


class Student{
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID(){
        return id;
    }

    String getName(){
        return name;
    }

    double getCGPA(){
        return cgpa;
    }
}

class ComparatorOfStudents implements Comparator<Student>{

    public int compare(Student a, Student b){
        if(a.getCGPA()<b.getCGPA() || a.getCGPA()==b.getCGPA() && a.getName().compareTo(b.getName())>0 || a.getName().equals(b.getName()) && a.getName().compareTo(b.getName())>0 && a.getID()<b.getID()){
            return 1;
        } else if(a.getCGPA()>b.getCGPA() || a.getCGPA()==b.getCGPA() && a.getName().compareTo(b.getName())<0 || a.getCGPA()==b.getCGPA() && a.getName().compareTo(b.getName())>0 && a.getID()>b.getID()){
            return -1;
        } else{
            return 0;
        }
    }

}

class Priorities{

    List<Student> getStudents(List<String> events){
        ComparatorOfStudents comparator = new ComparatorOfStudents();
        PriorityQueue<Student> queue = new PriorityQueue<>(1,  comparator);
        for(int i=0; i<events.size(); i++){
            String event = events.get(i);
            if(!event.equals("SERVED")){
                String[] separatedEvent = event.split(" ");
                String name = separatedEvent[1];
                double cgpa = Double.parseDouble(separatedEvent[2]);
                int id = Integer.parseInt(separatedEvent[3]);
                Student student = new Student(id, name, cgpa);
                queue.add(student);
            } else{
                queue.poll();
            }
        }
        List<Student> students = new ArrayList<>();
        int finalCapacityOfStudents = queue.size();
        for(int i=0; i<finalCapacityOfStudents; i++){
            students.add(queue.poll());
        }
        return students;
    }

}


public class Main {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
	// write your code here
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
