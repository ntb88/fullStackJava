package com.student;

import java.io.*;

import static java.lang.System.in;

public class Student implements StudentInt, Serializable {
    private int rollNo;
    private String name;
    private int subject1;
    private int subject2;
    private int subject3;
    private int totalMarks;

    public Student(int rollNo, String name, int subject1, int subject2, int subject3) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        totalMarks = calcTotal();
    }

    Student student1;
    @Override
    public void readStudInfo() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/ntb88/Documents/1 Student/Alltec/Day 4 Alltech/src/com/student/student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        student1  = (Student) ois.readObject();
    }

    @Override
    public int calcTotal() {
        return totalMarks = subject1+subject2+subject3;
    }

    @Override
    public void printStudInfo() {
        System.out.println("Roll no: "+ student1.rollNo);
        System.out.println("Name: "+ student1.name);
        System.out.println("Subj 1: "+ student1.subject1);
        System.out.println("Subj 2: "+ student1.subject2);
        System.out.println("Subj 3: "+ student1.subject3);
        System.out.println("Total marks : "+ student1.totalMarks);

    }
}
