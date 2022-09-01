package com.quintrix.huangresttest.service;

import com.quintrix.huangresttest.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee postEmployee();
    public void deleteEmployee();
    public void putEmployee(Employee employee);
}
