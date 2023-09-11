package com.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student st= null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the the following details one by one: \n" +
                "Student roll number, \n" +
                "Student name, \n" +
                "subject 1's marks, \n" +
                "subject 2' marks , \n" +
                "subject 3's marks \n");
        int rolln = sc.nextInt();
        String name = sc.next();
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();


        FileOutputStream fos;
        ObjectOutputStream oos;
        try{
            fos = new FileOutputStream("/Users/ntb88/Documents/1 Student/Alltec/Day 4 Alltech/src/com/student/student.ser");
            oos = new ObjectOutputStream(fos);
            st = new Student(rolln, name, mark1,mark2, mark3);
            oos.writeObject(st);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Object saved into file!");

        // Deserialization
        st.readStudInfo();
        //Print
        st.printStudInfo();

    }
}
