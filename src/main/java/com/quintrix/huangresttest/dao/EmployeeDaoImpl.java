package com.quintrix.huangresttest.dao;

import com.quintrix.huangresttest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public Employee postEmployee() {
        return null;
    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public void putEmployee(Employee employee) {

    }
}
