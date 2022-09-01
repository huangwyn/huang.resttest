package com.quintrix.huangresttest.dao;

import com.quintrix.huangresttest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> getEmployees() {
        return Arrays.asList(new Employee("billly", 5), new Employee("one", 2));
    }

    @Override
    public Employee postEmployee(Employee employee) {
        Employee one = new Employee();
        one.setName(employee.getName());
        one.setIdNumber(employee.getIdNumber());
        return one;
    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public void putEmployee(Employee employee) {

    }
}
