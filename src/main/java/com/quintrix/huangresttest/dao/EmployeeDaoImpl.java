package com.quintrix.huangresttest.dao;

import com.quintrix.huangresttest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> getEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    @Override
    public Employee postEmployee(Employee employee) {
        Employee one = new Employee();
        one.setName(employee.getName());
        one.setIdNumber(employee.getIdNumber());
        return one;
    }

    @Override
    public void deleteEmployee(String name, int id) {
        String sql = "DELETE FROM employees WHERE employee_id = " + id + " AND name = " + name;

        jdbcTemplate.update(sql);

    }

    @Override
    public void putEmployee(Employee employee) {

    }
}
