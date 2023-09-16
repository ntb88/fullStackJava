package org.pkg.employeeDAOImpl;

import org.pkg.Employee.model.Employee;
import org.pkg.employeeDAO.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeDaoImpl implements EmployeeDAO {
    //!!!maybe
    @Autowired
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(Employee employee) {
        String AddQUERY = "insert into Employee(employeeId, name, age, salary) values(?,?,?,?)";
        jdbcTemplateObject.update(AddQUERY, new Object[] {
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getAge(),
                        employee.getSalary()
                });
    }

    @Override
    public void update(int id, String name) {

        String updateQuery = "update Employee SET name =? WHERE employeeId =?";

        //only passed in the query and the variables in it
        jdbcTemplateObject.update(updateQuery, new Object[]{name, id});
    }

    @Override
    public void delete(int id) {
        String deleteQuery = "DELETE from Employee WHERE employeeId = ?";

            //only passed in the query and the variables in it
            jdbcTemplateObject.update(deleteQuery, new Object[]{id});
            System.out.println("Deleted!");
    }

    @Override
    public Employee findEmployee(int id) {
        String findQuery = "select * from Employee WHERE employeeId =?";
        Employee employee = jdbcTemplateObject.queryForObject(findQuery, new Object[]{id}, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                Employee employee = new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                );
                return employee;
            }

        });
        return employee;
    }

   // @Override


    @Override
    public ArrayList<Employee> findAllEmployee() {

        String findAllQuery = "select * from Employee";
        ArrayList<Employee> Employeelist = (ArrayList<Employee>) jdbcTemplateObject.query(findAllQuery, new EmployeeMapper());

        return Employeelist;
    }

}
