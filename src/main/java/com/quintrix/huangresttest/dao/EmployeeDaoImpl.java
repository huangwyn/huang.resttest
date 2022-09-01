package com.quintrix.huangresttest.dao;

import com.quintrix.huangresttest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> getEmployees() {
        String sql = "SELECT * FROM employees";
        List<Employee> output = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
        System.out.println(output);
        return output;
    }

    @Override
    public Employee postEmployee(Employee employee) {
        Employee one = new Employee();
        one.setName(employee.getName());
        one.setEmployee_id(employee.getEmployee_id());
        String sql = "INSERT INTO employees (name, employee_id) VALUES ('" + one.getName() + "', " + one.getEmployee_id() + ");";
        jdbcTemplate.update(sql);
        return one;
    }

    @Override
    public void deleteEmployee(String name, int id) {
        String sql = "DELETE FROM employees WHERE employee_id = " + id + " AND name = '" + name + "';";

        jdbcTemplate.update(sql);

    }

    @Override
    public void putEmployee(Employee employee) {
        String sql = "UPDATE employee SET name = '" + employee.getName() + "' WHERE employee_id = " + employee.getEmployee_id() + ";";

        jdbcTemplate.update(sql);

    }
}
