package org.pkg.employeeDAOImpl;

import org.pkg.Employee.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee em = new Employee(
                rs.getInt(1),
                rs.getString(2),
                rs.getInt(3),
                rs.getInt(4)
        );
        return em;
    }
}
