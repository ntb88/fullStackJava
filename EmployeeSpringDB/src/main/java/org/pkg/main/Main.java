package org.pkg.main;

import org.pkg.Employee.model.Employee;
import org.pkg.employeeDAO.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

            ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");



        int choice = 0;
        //BookDAO bd = new BookDAO();
        while(choice!=6){
            System.out.println("\n Please select a choice from below: ");
            System.out.println("1. Add employee");
            System.out.println("2. Update employee name");
            System.out.println("3. Delete employeee");
            System.out.println("4. print employee details by id: ");
            System.out.println("5. print all employee details");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            if(choice ==1 ){
                System.out.println("Enter and id:  ");
                int id = sc.nextInt();
                Employee employee = new Employee(id, "Nick", 100, 2000000 );
                employeeDAO.insert(employee);
                System.out.println("Successfully Inserted!");
            }else if (choice == 2){
                //Employee employee = new Employee();
                System.out.println("Enter an id to update: ");
                int id = sc.nextInt();
                System.out.println("Enter the new name: ");
                String name = sc.next();
                employeeDAO.update(id, name);
            }else if (choice == 3){
                System.out.println("Enter an Employee id to delete: ");
                int id = sc.nextInt();
                employeeDAO.delete(id);
            }else if (choice == 4){
                System.out.println("Enter an Employee id to find records: ");
                int id = sc.nextInt();
                Employee em = employeeDAO.findEmployee(id);
                System.out.println("Employee id: "+em.getEmployeeId());
                System.out.println("Employee name: "+em.getName());
                System.out.println("Employee age: "+em.getAge());
                System.out.println("Employee salary: "+em.getSalary());
            }else if (choice == 5){
                ArrayList<Employee> employeeArrayList = employeeDAO.findAllEmployee();
                for (Employee employee: employeeArrayList) {
                    System.out.println("Id: "+employee.getEmployeeId());
                    System.out.println("name: "+employee.getName());
                    System.out.println("Age: "+employee.getAge());
                    System.out.println("Salary: "+employee.getSalary());
                }
                }

            }
        }

    }
