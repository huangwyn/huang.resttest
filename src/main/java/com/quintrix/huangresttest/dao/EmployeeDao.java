package com.quintrix.huangresttest.dao;

import com.quintrix.huangresttest.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getEmployees();
    public Employee getEmployeeId();
}