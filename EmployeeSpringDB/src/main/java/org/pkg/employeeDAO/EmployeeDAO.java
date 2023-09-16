package org.pkg.employeeDAO;

import org.pkg.Employee.model.Employee;

import java.util.ArrayList;

public interface  EmployeeDAO {
    public void insert(Employee employee);
    public void update(int id, String name);
    public void delete(int id);
    public Employee findEmployee(int id);
    public ArrayList<Employee> findAllEmployee();

}
