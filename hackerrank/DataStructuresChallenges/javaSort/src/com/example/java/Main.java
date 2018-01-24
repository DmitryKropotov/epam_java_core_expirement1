package com.example.java;

import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student other){
        if(other==null){
            return 1;
        }

        if(this.cgpa<other.cgpa || this.cgpa==other.cgpa && this.fname.compareTo(other.fname)>0 || this.cgpa==other.cgpa && this.fname.compareTo(other.fname)==0 && this.id>other.id){
            return 1;
        } else if(this.cgpa>other.cgpa || this.cgpa==other.cgpa && this.fname.compareTo(other.fname)<0 || this.cgpa==other.cgpa && this.fname.compareTo(other.fname)==0 && this.id<other.id){
            return -1;
        } else{
            return 0;
        }
    }
}

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
