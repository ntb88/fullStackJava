package com.Employee;

import java.io.*;
import java.util.Scanner;



public class StoreEmployee{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //create an employee object
        Employee emp = new Employee();
        //create a scanner instance
        Scanner sc = new Scanner(System.in);

        //get id value from the user and assign it to emp object
        System.out.println("Please enter an id: ");
        emp.setEmpId(sc.nextInt());

        //get name  from the user and assign it to emp object
        System.out.println("Please enter an employee name: ");
        emp.setEmpName(sc.next());

        //get dept number from the user and assign it to emp object
        System.out.println("Please enter a dept number : ");
        emp.setDeptNo(sc.nextInt());
        //Print the object
        System.out.println("Employee object created : "+emp.toString());

        //serialization
        // create File output stream and Object outputstream instances
        FileOutputStream fos;
        ObjectOutputStream oos;
        String path = "/Users/ntb88/Documents/1 Student/Alltec/Day5/src/com/Employee/employee.ser";
        fos = new FileOutputStream(path);
        oos = new ObjectOutputStream(fos);
        //write the employee object
        oos.writeObject(emp);

        System.out.println("Object successfully written into a file");

        //deserialization
        //read data from the file
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);

        //convert into employee object
        Employee emp1 = (Employee) ois.readObject();

        //print the Employee object
        System.out.println("Employee object after deserialization: "+emp1.toString());



    }
}
